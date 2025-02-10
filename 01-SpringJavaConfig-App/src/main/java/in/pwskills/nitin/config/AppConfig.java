package in.pwskills.nitin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.Employee;

@Configuration
public class AppConfig {
    
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig obj is created...");
	}
	
	@Bean(name="emp")
	public Employee empObj() {
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("sachin");
		employee.setEage(52);
		employee.setEaddress("MI");
		return employee;
	}
}
