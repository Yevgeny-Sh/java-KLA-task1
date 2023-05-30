public class MyFactoryClass {
    private MyFactoryClass() {
        // Private constructor to prevent direct instantiation
    }


//By using the create() method, the creation of MyRunnable objects is encapsulated within the MyFactoryClass.
// This allows for a centralized point of object creation
// and provides flexibility in case additional logic or customization is required during the object creation process.
    public static MyRunnable create() {
        return new MyRunnable();
    }


    //why factories??
    // The calling code only needs to interact with the factory method.  this has several adventages like:
    // encapsulation and abstraction,
    //flexibility and interchangeable object creation.
    //Code Organization: centralize object creation logic in a single location
    //Decoupling: reduces the dependency of the calling code on concrete class implementations,
    // making it easier to modify or extend the code in the future.
    //Additional Functionality: The factory method can include additional logic or pre-processing steps
    // before creating an object,allows to perform operations or apply customizations during the creation process
}
