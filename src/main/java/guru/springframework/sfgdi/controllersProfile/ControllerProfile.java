package guru.springframework.sfgdi.controllersProfile;


import guru.springframework.sfgdi.servicesDI.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerProfile {

    private final GreetingService greetingService;

    public ControllerProfile(@Qualifier("greetings-in-dif-lang") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
