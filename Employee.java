package org.javaexpress;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	public Employee()
	{	System.out.println("Const");
	}
	public void display()
	{
		System.out.println("Display");
	}
	

}
