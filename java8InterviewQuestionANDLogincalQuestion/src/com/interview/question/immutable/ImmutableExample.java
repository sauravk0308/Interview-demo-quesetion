package com.interview.question.immutable;

//make this class final, no one can extend this class
public final class ImmutableExample {

	private final String name;

	ImmutableExample (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//no setter

	public static void main(String[] args) {

		ImmutableExample obj = new ImmutableExample("mkyong");
		System.out.println(obj.getName());
		System.out.println(obj.getName());
		
		Integer i = new Integer(10);
		// there is no way to update the name after the object is created.
		// obj.setName("new mkyong");
		// System.out.println(obj.getName());

	}
}