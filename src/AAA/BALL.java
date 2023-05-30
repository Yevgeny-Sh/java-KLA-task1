package AAA;

import BBB.CAR;

public class BALL {

        //In Java, executable code must be placed within a method, constructor, or initializer block
        // this is why we must use the createAndGreetCar method, we cant call these statements at the top level of a class
        //because they are executable code, execution starts from the main method
        // or other entry points of the program, such as constructors.
        //to ensure proper control flow and maintain the integrity of the program's execution.
        public void createAndGreetCar() {
                CAR car = new CAR();
                car.greet();
        }


        // difference between dot net namespace and java packages:

        //In .NET, namespaces are purely logical
        // and do not necessarily correspond to the physical folder structure of the files.
        //In Java, packages directly correspond to the physical folder structure
        //Java packages use the "package-private" access level as the default,
        //which restricts access to the package itself and its classes


}
