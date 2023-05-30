public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("running");
    }
    //The @Override annotation is used in Java to indicate that a method is intended to override a method
    // from a superclass or interface
    //it is considered a good practice to use @Override when overriding methods, it is not mandatory

    //The @Override annotation helps to catch potential errors at compile-time,
    // as it ensures that the method you are intending to override actually exists in the superclass or interface
    // It also improves code readability and makes it clear that the method is an override
}