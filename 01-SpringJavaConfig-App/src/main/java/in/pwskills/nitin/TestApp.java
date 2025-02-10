package in.pwskills.nitin;
import in.pwskills.nitin.bean.Employee;
import in.pwskills.nitin.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestApp {
	public static void main(String[] args){
	
	//Starting the container
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	//Ask the container to give the bean with the id as specified
	Employee employee = context.getBean("emp", Employee.class);
	System.out.println(employee);
	
	//Close the container
	((AbstractApplicationContext)  context).close();
	
	}
}
