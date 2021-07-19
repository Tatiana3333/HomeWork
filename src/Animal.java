import java.util.Scanner;

abstract class Animal {
    private final int RUN = 0;
    private final int SWIM = 0;


    abstract void run(int length);
    abstract void swim(int length);

}


class Delivery {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дистанцию для бега кота:");
        int length = scanner.nextInt();
        cat.run(length);
        System.out.println("Как Вы думаете, какую дистанцию может проплыть кот:");
        int length1 = scanner.nextInt();
        cat.swim(length1);

        Dog dog = new Dog();
        System.out.println("Введите дистанцию для бега Dog:");
        int lengthDog = scanner.nextInt();
        dog.run(lengthDog);
        System.out.println("Как Вы думаете, какую дистанцию может проплыть Dog:");
        int lengthDog1 = scanner.nextInt();
        dog.swim(lengthDog1);

    }
}
