import java.util.Scanner;
class Example8 {
    public static void main(String[] argv) {
        int age;
        System.out.println("Enter your age:");
        //Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        age = inputValue.nextInt();
        if (age >= 18) {
            System.out.println("You have the legal age");
        }
    }
}