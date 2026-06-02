package com.wipro.ReactiveDemo.handler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.wipro.ReactiveDemo.model.User;
import com.wipro.ReactiveDemo.repository.UserRepo;
import com.wipro.ReactiveDemo.service.UserService;

import reactor.core.publisher.Mono;

@Component
public class UserHandler {
	
	@Autowired
	UserRepo repo;
	
	public Mono<ServerResponse> saveUser(ServerRequest req){
		Mono<User> monoUser= req.bodyToMono(User.class);
		return monoUser
				.flatMap(repo::save)
				.flatMap(user->
				ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
                .bodyValue(user));
	}
	
	public Mono<ServerResponse> getAllUsers(ServerRequest request) {

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(repo.findAll(), User.class);
    }
	
	 public Mono<ServerResponse> getUserById(ServerRequest request) {

	        int id = Integer.parseInt(request.pathVariable("id")) ;

	        return repo.findById(id)
	                .flatMap(user -> ServerResponse.ok()
	                        .contentType(MediaType.APPLICATION_JSON)
	                        .bodyValue(user))
	                .onErrorResume(ex -> {
	        			
	        			User errorBook = new User();
	        			errorBook.setName(ex.getMessage());
	        			return (Mono<? extends ServerResponse>) Mono.just(errorBook);

	        		});
	    }
	 
	 public Mono<ServerResponse> updateUser(ServerRequest request) {

	        int id =  Integer.parseInt(request.pathVariable("id")) ;

	        Mono<User> updatedUser = request.bodyToMono(User.class);

	        return repo.findById(id)
	                .flatMap(existingUser ->

	                        updatedUser.flatMap(user -> {

	                        	existingUser.setName(user.getName());
	                        	existingUser.setAge(user.getAge());
	                            

	                            return repo.save(existingUser);
	                        })
	                )
	                .flatMap(book -> ServerResponse.ok()
	                        .contentType(MediaType.APPLICATION_JSON)
	                        .bodyValue("Book updated successfully"))

	                .switchIfEmpty(Mono.error(new RuntimeException("User not found")));
	    }


}
