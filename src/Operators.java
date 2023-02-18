public class Operators {
    public static void main(String[] args) {

        int number1 = 4;
        int number2 = 9;
        // int number3 = number1 * number2;

        String newLine = System.lineSeparator();
        System.out.println("----------------------------------------------------------------");
        System.out.println(newLine);




        System.out.println("Number is 1 equal: " + number1);
        System.out.println("Number is 2 equal: " + number2);
        // System.out.println("Number is 3 equal - number1 * number2: " + number3);
        
        // Is equal to 
        System.out.println(newLine);
        System.out.println("Number1 is equal to Number2:");
        System.out.println("- " + (number1 == number2));
        
        // Is not equal to
        System.out.println(newLine);
        System.out.println("Number1 is not equal to Number2:");
        System.out.println("- " + (number1 != number2));

        // Is greater then
        System.out.println(newLine);
        System.out.println("Number1 is greater than Number2:");
        System.out.println("- " + (number1 > number2));

        // Is less then
        System.out.println(newLine);
        System.out.println("Number1 is less than Number2:");
        System.out.println("- " + (number1 < number2));
        
        // Is greater then or equal to 
        System.out.println(newLine);
        System.out.println("Number1 is greater or equal to Number2:");
        System.out.println("- " + (number1 >= number2));

        // Is less then
        System.out.println(newLine);
        System.out.println("Number1 is less than or equal to Number2:");
        System.out.println("- " + (number1 <= number2));

    }
}
