package Spring_day_11;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@ Service
public class UserService {

    private static final Logger logger =
            LoggerFactory.getLogger(UserService.class);

    public void processUser() {
        logger.info("Processing user");
        logger.error("Error while processing user");
    }
}
