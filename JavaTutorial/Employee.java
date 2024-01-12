package com.JavaTutorial;

public class Employee {//implements Comparable<Employee> {

    private Long id;
    private String name;

    // constructor, getters, setters
    

   

	// override equals and hashCode
//    @Override
//    public int compareTo(Employee employee) {
//        return (int)(this.id - employee.getId());
//    }

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
