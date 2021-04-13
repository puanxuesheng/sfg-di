package guru.springframework.sfgdi.controllersDI;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.printf("hello world");
        return "hi folks";
    }
}
