package com.springcore.dependencyInjection;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//@Autowired annotation can be used on property itself also can be used over setter method or the constructor
	//In annotation the auto wiring takes place by type.
	
    private Address address;

    public Address getAddress() {
        return address;
    }
    
    @Autowired
    @Qualifier("address1")
    //by @Qualifier annotation we can specify a particular reference bean for injection 
    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Address address) {
        super();
        this.address = address;
    }
    

    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
