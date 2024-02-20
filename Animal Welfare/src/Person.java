public abstract class Person {
    private String name;
    private int age;
    private String contactNumber;

    // Constructor
    public Person(String name, int age, String contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void introduce();

    // Getters and setters
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

