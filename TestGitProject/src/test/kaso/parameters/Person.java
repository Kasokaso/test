package test.kaso.parameters;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printPerson() {
		System.out.println(name + " " + age);
	}

}
