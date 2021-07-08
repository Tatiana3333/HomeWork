public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Егоров Е.", "Engineer", "Engineer@mailbox.com", "892312312", 30000, 39);
        employeeArr[1] = new Employee("Максимов M.", "Engineer", "Engineer@mailbox.com", "892312313", 30000, 49);
        employeeArr[2] = new Employee("Иванов K.", "Engineer", "Engineer@mailbox.com", "892312314", 30000, 23);
        employeeArr[3] = new Employee("Сергеев С.", "Director", "Director@mailbox.com", "892312315", 30000, 59);
        employeeArr[4] = new Employee("Ручьев И.", "Engineer", "Engineer@@mailbox.com", "892312316", 30000, 34);

        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].compareAge() > 40) {
                employeeArr[i].print();
            }
        }
    }
}
