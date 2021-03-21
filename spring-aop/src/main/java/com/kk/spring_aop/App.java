package com.kk.spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.spring_aop.model.CustomerService;

/**
 * Spring AOP Example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        
        CustomerService customerService = (CustomerService) ctx.getBean("customerServiceProxy");
        customerService.printName();
        customerService.printUrl();
        try {
        	customerService.printThrowException();
        }catch (Exception e) {
			// TODO: handle exception
		}
        
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) ctx;
        context.close();
    }
}
