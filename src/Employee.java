public class Employee {
     String name;
     String post;
     String email;
     String phoneNumber;
     int salary;
     int age;
    int compareAge() {
        return age;
    }
     Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

     void print() {
        System.out.println("Имя: " + name + " / " + " Должность: " + post + " / " + " e-mail: " + email + " / " +
                " Тел.: " + phoneNumber + " / " + " ЗП: " + salary + " / " + " Возраст: " + age);
    }
}
