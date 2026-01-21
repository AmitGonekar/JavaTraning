package Spring_Day_12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/user/hello")
    public String userApi() {
        return "Hello User";
    }

    @GetMapping("/admin/hello")
    public String adminApi() {
        return "Hello Admin";
    }
}

