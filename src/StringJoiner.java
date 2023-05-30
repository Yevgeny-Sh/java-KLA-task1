public class StringJoiner {
    private final String input;

    public StringJoiner(String input) {
        System.out.println("input: " + input);
        this.input = input;
    }
    public StringJoiner(String input,String input2) {
        System.out.println("input1: " + input);
        System.out.println("input2: " + input2);

        this.input = input+input2;

    }

    public String joinString() {

        //Using StringBuilder for string concatenation is more efficient than using the + operator repeatedly
        //It helps avoid unnecessary string object creations and provides better performance
        //although in this simple example it may be redundant

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append(input);
        return stringBuilder.toString();
    }



    public static int calculateProduct(int number) {
        return number* number;
    }
}
