package me.yassix007.sfgdi;

import me.yassix007.sfgdi.beans.MyDaraSource;
import me.yassix007.sfgdi.beans.MyDevDaraSource;
import me.yassix007.sfgdi.beans.MyTestDaraSource;
import me.yassix007.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
/*
		System.out.println("--------------I18Service---------");
		I18nController myI18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(myI18nController.sayHello());

		System.out.println("--------------Primary Bean---------");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());


		System.out.println("--------------Property---------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------------Setter---------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------Constructor---------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
*/
		System.out.println("---------------Prod-------------------");
		MyDaraSource myDaraSource = ctx.getBean(MyDaraSource.class);
		System.out.println(myDaraSource.getIpAddress());
		System.out.println(myDaraSource.getUserName());
		System.out.println(myDaraSource.getPassword());
		System.out.println(myDaraSource.getEnvVariable());

		System.out.println("---------------Test-------------------");
		MyTestDaraSource myTestDaraSource = ctx.getBean(MyTestDaraSource.class);
		System.out.println(myTestDaraSource.getIpAddress());
		System.out.println(myTestDaraSource.getUserName());
		System.out.println(myTestDaraSource.getPassword());

		System.out.println("---------------Dev-------------------");
		MyDevDaraSource myDevDaraSource = ctx.getBean(MyDevDaraSource.class);
		System.out.println(myDevDaraSource.getIpAddress());
		System.out.println(myDevDaraSource.getUserName());
		System.out.println(myDevDaraSource.getPassword());
	}

}
