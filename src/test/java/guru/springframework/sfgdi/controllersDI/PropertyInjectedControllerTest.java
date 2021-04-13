package guru.springframework.sfgdi.controllersDI;

import guru.springframework.sfgdi.servicesDI.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.greetingService.sayGreetings());
    }
}