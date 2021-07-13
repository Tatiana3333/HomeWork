import java.util.Scanner;
public class Plate {
    int food;
    Plate(int food) {
        this.food = food;
    }
    boolean reducingFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("plate: " + food);
    }
}
class Cat1 {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.reducingFood(appetite))
            hungry = false;
    }
}
class Main1 {
    public static void main(String[] args) {
        Cat1[] cats = {new Cat1("Барсик", 30), new Cat1("Мурзик", 40), new Cat1("Пушок", 25)};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество еды в миске: ");
        int food = scanner.nextInt();
        Plate plate = new Plate(food);
        System.out.println(food);

        for (Cat1 cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
