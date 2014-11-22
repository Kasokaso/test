package test.kaso.parameters;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		Person person = new Person("Darko", 29);
		test.testParameter(person);
		person.printPerson();
		for (long i = 0; i < 1000000; i++) {
			person.printPerson();
		}

	}

	public void testParameter(Person person) {
		person.printPerson();
		person = null;
	}

}
