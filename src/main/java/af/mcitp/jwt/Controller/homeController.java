package af.mcitp.jwt.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class homeController {

    @GetMapping(value = "home")
    public String home() {
        return "welcome";
    }

}
