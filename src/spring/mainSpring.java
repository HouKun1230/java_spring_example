package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");

	      sender obj = (sender) context.getBean("sender");

	      obj.getMsg();
	}

}
