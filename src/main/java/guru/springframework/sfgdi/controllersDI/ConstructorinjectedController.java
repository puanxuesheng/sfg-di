package guru.springframework.sfgdi.controllersDI;

import guru.springframework.sfgdi.servicesDI.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorinjectedController {

//    @Autowired Do not need autowire when you use Constructor injected controllers
    private final GreetingService greetingService;

    //you specify the qualifier to tell the app which implementation u want to use
    public ConstructorinjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
