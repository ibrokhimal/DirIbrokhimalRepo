package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        trueOrfalse(10,20);
        checkPositive(10);
        checkPositiveOrNegative(20);
        printMyLine(5,"this is line fo printing");
        checkYear4(1998);
    }

    private static boolean checkYear4(int i) {
        if(i % 400 == 0){
            return true;
        }
        if(i % 100 == 0){
            return false;
        }
        if(i % 4 == 0){
            return true;
        }
        return false;
    }

    private static void printMyLine(int i, String line_printing) {
        for (int j= 0; j < i; j++){
            System.out.println(line_printing);
        }
    }

    private static boolean checkPositiveOrNegative(int i) {
        if (i < 0){
            return true;
        }
        else {
            return false;
        }
    }

    private static void checkPositive(int i) {
        if (i >= 0){
            System.out.println(i + ", positive");
        }
        else {
            System.out.println(i + ", negative");
        }
    }

    private static boolean trueOrfalse(int a, int b) {
        if (a + b <= 20 && a + b >= 10){
            return true;
        }
        else {
            return false;
        }
    }
}
