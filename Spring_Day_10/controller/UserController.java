package Spring_Day_10.controller;


import Spring_Day_10.execption.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable int id) {

        if (id <= 0) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }

        return "User found with id: " + id;
    }
}

