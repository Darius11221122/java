package question 2;

public class TestPerson {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Alice", 75000);
        people[1] = new Student("Bob", "Computer Science");

        for (Person person : people) {
            System.out.println(person.getName() + ": " + person.getDescription());
        }
    }
}
