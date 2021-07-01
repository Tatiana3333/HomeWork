public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    public static void checkSumSign() {
        int a = 8;
        int b = -15;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println(" Сумма положительная ");
        } else {
            System.out.println(" Сумма отрицательная ");
        }
    }
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println(" Красный ");
        }
        if (value > 0 && value <= 100) {
            System.out.println(" Желтый ");
        }
        if (value > 100) {
            System.out.println(" Зеленый ");
        }

    }
    public static void compareNumbers() {
        int a = 14;
        int b = -3;

        if (a >= b) {
            System.out.println(" а >= b ");
        } else {
            System.out.println(" а < b ");
        }
    }
}
