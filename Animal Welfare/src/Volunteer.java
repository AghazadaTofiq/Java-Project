public class Volunteer extends Person {
    public Volunteer(String name, int age, String contactNumber) {
        super(name, age, contactNumber);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm a volunteer named " + getName() + ".");
    }
}
