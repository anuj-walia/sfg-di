package com.digitextra.sfgdi;

import com.digitextra.sfgdi.controllers.ConstructorInjectedController;
import com.digitextra.sfgdi.controllers.MyController;
import com.digitextra.sfgdi.controllers.PropertyInjectedController;
import com.digitextra.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController controller = context.getBean("myController",MyController.class);
		System.out.println(controller.sayHello());
		System.out.println("Property Based");
		PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController",PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("Setter Based");
		SetterInjectedController setterInjectedController =  context.getBean("setterInjectedController",SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("Constructor Based");
		ConstructorInjectedController constructorInjectedController =  context.getBean("constructorInjectedController",ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
