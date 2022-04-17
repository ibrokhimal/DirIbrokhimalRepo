package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printHelloWorld();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printHelloWorld() {
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign() {
        int a = 5;
        int b = 3;
        int resalt = a + b;

        if (resalt >= 0){
            System.out.println("The amount is positive");
        }
        else {
            System.out.println("The sum is negative");
        }
    }

    private static void printColor() {
        int value = 1;

        if (value <= 0){
            System.out.println("RED");
        }
        else if (0 > value && value>= 100){
            System.out.println("YELLOW");
        }
        else {
            System.out.println("GREEN");
        }
    }

    private static void compareNumbers() {
        int a = 5;
        int b = 3;

        if (a >= b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
