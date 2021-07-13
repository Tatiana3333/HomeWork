class Cat extends Animal {
    private final int RUN = 200;


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= RUN)) System.out.println("Кот пробежал " + length );
        else System.out.println("Кот может пробежать 200 м");
    }

    @Override
    void swim(int length1) {
        System.out.println("Кот не умеет плавать");
    }
}
