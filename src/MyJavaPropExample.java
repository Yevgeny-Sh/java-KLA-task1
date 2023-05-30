public class MyJavaPropExample {

    //the equivalent concept to C# properties is achieved through the use of getter and setter methods.
    //in Java, you typically create separate methods to get and set the values of fields



    private String name;
    private int age;

    // Getter for the "name" field
    public String getName() {
        return name;
    }

    // Setter for the "name" field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the "age" field
    public int getAge() {
        return age;
    }

    // Setter for the "age" field
    public void setAge(int age) {
        this.age = age;
    }
}
