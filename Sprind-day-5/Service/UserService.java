package Service;

import Entity.User;

public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public UserDTO getById(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return new UserDTO(user.getId(), user.getName());

    }
}

//-> Service Layer
//Contains business logic
//Acts as a bridge between Controller & Repository
