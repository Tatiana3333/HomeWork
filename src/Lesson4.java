import java.util.Random;
import java.util.Scanner;

    public class Lesson4 {
        public static char[][] map;
        public static final int SIZE = 3;// размер поля
        public static final int DOTS_TO_WIN = 3;//длина одинаковых символов

        public static final char DOT_EMPTY = '.'; //пустое место
        public static final char DOT_X = '1';
        public static final char DOT_O = '0';


        public static void main(String[] args) {
            initMap();
            printMap();
            isMapFull();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWinn(DOT_O)) {
                    System.out.println("Победил компьютер");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static void initMap() { //Заполнение поля .
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static Scanner sc = new Scanner(System.in);

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y));
            map[y][x] = DOT_X;
        }

        public static void aiTurn() {
            Random random = new Random();
            int x;
            int y;

            do {
                System.out.println("Введите координаты в формате X Y");
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Ход компьютера в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;

        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                return false;
            }
            if (map[y][x] == DOT_EMPTY) {
                return true;
            }
            return false;
        }

        public static boolean checkWin(char DOT_X) {
            for (int i = 0; i < SIZE; i++)
                if ((map[i][0] == DOT_X && map[i][1] == DOT_X &&
                        map[i][2] == DOT_X) ||
                        (map[0][i] == DOT_X && map[1][i] == DOT_X &&
                                map[2][i] == DOT_X))
                    return true;
            if ((map[0][0] == DOT_X && map[1][1] == DOT_X &&
                    map[2][2] == DOT_X) ||
                    (map[2][0] == DOT_X && map[1][1] == DOT_X &&
                            map[0][2] == DOT_X))
                return true;
            return false;
        }
        public static boolean checkWinn(char DOT_O) {
            for (int i = 0; i < SIZE; i++)
                if ((map[i][0] == DOT_O && map[i][1] == DOT_O &&
                        map[i][2] == DOT_O) ||
                        (map[0][i] == DOT_O && map[1][i] == DOT_O &&
                                map[2][i] == DOT_O))
                    return true;
            if ((map[0][0] == DOT_O && map[1][1] == DOT_O &&
                    map[2][2] == DOT_O) ||
                    (map[2][0] == DOT_O && map[1][1] == DOT_O &&
                            map[0][2] == DOT_O))
                return true;
            return false;
        }
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++)
                    if (map[i][j] == DOT_EMPTY) {
                        return false;
                    }
            }
            return true;
        }
    }

