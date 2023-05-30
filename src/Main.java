
public class Main {
    public static void main(String[] args) {

        int age = 25;
        double height = 1.75;
        char initial = 'J';
        boolean isStudent = true;
        long population = 789_654_321L;
        byte temperature = 25;
        short distance = 5000;
        float weight = 65.5f;

//        System.out.println("Age: " + age);
//        System.out.println("Height: " + height);
//        System.out.println("Initial: " + initial);
//        System.out.println("Is Student: " + isStudent);
//        System.out.println("Population: " + population);
//        System.out.println("Temperature: " + temperature);
//        System.out.println("Distance: " + distance);
//        System.out.println("Weight: " + weight);




        String input = "Hello";
        StringJoiner stringJoiner = new StringJoiner(input);

        String joinedString = stringJoiner.joinString();
        System.out.println(joinedString);

        StringJoiner x = new StringJoiner(input);

        StringJoiner y = new StringJoiner(input,"hi");


        System.out.println("product of 5 is: " + StringJoiner.calculateProduct(5));

    }
}