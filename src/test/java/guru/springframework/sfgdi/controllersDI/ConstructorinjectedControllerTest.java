package guru.springframework.sfgdi.controllersDI;

import guru.springframework.sfgdi.servicesDI.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorinjectedControllerTest {

    ConstructorinjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorinjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}