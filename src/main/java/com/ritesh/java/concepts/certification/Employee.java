package com.ritesh.java.concepts.certification;

public class Employee extends Person {
	/*public Employee(String nm) {
		super(nm);
		// TODO Auto-generated constructor stub
	}*/

	String empId = "0000";
	public Employee(String eId){
		super(eId);
		empId = eId;
	}

}