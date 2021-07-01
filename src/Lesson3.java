public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        returningArray(6, 2);
        Array();
        }




    //Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]);
        }
    }

    // Задание 2. Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        System.out.println();
        int[] arr = new int[100];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);

        }
    }

// Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArray() {
        System.out.println();
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
// Задание 4.
//Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];


    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == j || (i + j) == 3) arr[i][j] = 1;
                else arr[i][j] = 0;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
 // Задание 5.   Написать метод, принимающий на вход два аргумента:
    // len и initialValue, и возвращающий одномерный массив типа int
    //  длиной len, каждая ячейка которого равна initialValue;

    public static void returningArray(int len, int initialValue) {
        System.out.println();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
//Задание 6.Задать одномерный массив
// и найти в нем минимальный и максимальный элементы ;
public static void Array() {
    System.out.println();
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
}




}



