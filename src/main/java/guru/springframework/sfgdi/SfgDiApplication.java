package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllersProfile.ControllerProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		ControllerProfile CP = (ControllerProfile)ctx.getBean("controllerProfile");
		System.out.println(CP.sayHello());

//		MyController controller = (MyController)ctx.getBean("myController");
//		String greetings = controller.sayHello();
//		System.out.println("\n"+greetings);
//
//		System.out.println("-------Property");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("---------setter");
//		SetterinjectedController setterinjectedController = (SetterinjectedController) ctx.getBean("setterinjectedController");
//		System.out.println(setterinjectedController.getGreeting());
//
//		System.out.println("--------constructor");
//		ConstructorinjectedController constructorinjectedController = (ConstructorinjectedController) ctx.getBean("constructorinjectedController");
//		System.out.println(constructorinjectedController.getGreetings());
	}

}
