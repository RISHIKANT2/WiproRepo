package com.wipro.ReactiveDemo.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import com.wipro.ReactiveDemo.handler.UserHandler;

@Configuration
public class UserRouter {
	@Bean
    public RouterFunction<ServerResponse> routes(UserHandler handler) {

        return route(POST("/user"), handler::saveUser)

                .andRoute(GET("/books"), handler::getAllUsers)

                .andRoute(GET("/books/{id}"), handler::getUserById)

                .andRoute(PUT("/books/{id}"), handler::updateUser);

                
    }



}
