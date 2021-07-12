class Dog extends Animal {
    private final int RUN = 500;
    private final int SWIM = 10;


    @Override
    void run(int lengthDog) {
        if ((lengthDog >= 0) && (lengthDog <= RUN)) System.out.println("Dog пробежал " + lengthDog );
        else System.out.println("Dog может пробежать 500 м");
    }

    @Override
    void swim(int lengthDog1) {
        if ((lengthDog1 >= 0) && (lengthDog1 <= SWIM)) System.out.println("Dog проплыл " + lengthDog1);
        else System.out.println("Dog может проплыть 10 м");
    }
}
