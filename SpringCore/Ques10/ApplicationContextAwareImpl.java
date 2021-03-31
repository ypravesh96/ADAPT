package beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware{
    private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	
	public void displayEmployeeDetails(){
        Employee employee = (Employee)applicationContext.getBean("employee");
        System.out.println("Name: "+employee.getName());
        System.out.println("Id: "+employee.getId());
    }
}
