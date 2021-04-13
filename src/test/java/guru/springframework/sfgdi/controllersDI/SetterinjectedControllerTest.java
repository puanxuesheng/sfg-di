package guru.springframework.sfgdi.controllersDI;

import guru.springframework.sfgdi.servicesDI.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterinjectedControllerTest {
    SetterinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterinjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}