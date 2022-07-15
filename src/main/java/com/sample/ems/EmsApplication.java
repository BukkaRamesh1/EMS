package com.sample.ems;

import com.sample.ems.entity.Employee;

public class EmsApplication {

	public static void main(String[] args) {
		Employee e = new Employee("Manisha","disilva","India","Development",20000);
		System.out.println(e.name);

	}

}
