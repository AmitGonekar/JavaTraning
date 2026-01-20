package Spring_day_11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger =
            LoggerFactory.getLogger(UserController.class);

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        logger.info("Fetching user with id: {}", id);

        if (id <= 0) {
            logger.warn("Invalid user id received: {}", id);
            return "Invalid ID";
        }

        logger.debug("User fetched successfully");
        return "User " + id;
    }
}

