public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        task3();

    }
    public static void task1() { //name
        System.out.println("Задача 1, 2");
        String firstName = "Ivan " ;
        String middleName = "Ivanovich " ;
        String lastName = "Ivanov";
        String fullName = firstName + middleName + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3() { //average
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }

}
