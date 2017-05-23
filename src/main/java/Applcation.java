import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pularsight.service.CustomerService;
import com.pularsight.service.CustomerServiceImpl;


public class Applcation {

	public static void main(String[] args) {
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applcationContext.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		System.out.println("Service Object 1 - " + service);
		
		CustomerService service1 = appContext.getBean("customerService",CustomerService.class);
		System.out.println("Service Object 2 - " + service1);
		
		System.out.print(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		
		

	}

}
