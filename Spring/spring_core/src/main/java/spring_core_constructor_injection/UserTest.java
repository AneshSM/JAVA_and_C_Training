package spring_core_constructor_injection;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	public static void main(String[] args) {
		
		try (ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("constructor.xml")) {
			User u=(User)cac.getBean("myConstructor");
			
			System.out.println(u.id+" "+u.name);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
