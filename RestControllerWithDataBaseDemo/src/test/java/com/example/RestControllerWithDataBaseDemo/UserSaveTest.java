package com.example.RestControllerWithDataBaseDemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.RestControllerWithDataBaseDemo.entity.User;
import com.example.RestControllerWithDataBaseDemo.repository.UserRepository;
import com.example.RestControllerWithDataBaseDemo.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserSaveTest {

	
	@Mock
    private UserRepository repo;
 
 

    @InjectMocks
    private UserService serve;

    @Test
    void savePersonTest() {

        // Step 1: Create input object
        User user =new User();
        user.setId(1);
        user.setName("Rahul");
        user.setPhone("123442");
       
   
        when(repo.save((user)))
                .thenReturn(user);

        // Step 3: Call service method
        User savedPerson =
                serve.addUser(user);

        // Step 4: Assertions
        assertThat(savedPerson)
                .isNotNull();

        assertThat(savedPerson.getName())
                .isEqualTo("Rahul");

        // Step 5: Verify method call
        verify(repo).save(user);
}
}
