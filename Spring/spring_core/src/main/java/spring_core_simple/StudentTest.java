package spring_core_simple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("myfriend.xml");
		Student student=(Student) beanFactory.getBean("myStudent");
		student.getStudent();
	}

}
