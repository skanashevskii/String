public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }



    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "";
        fullName = firstName+ " " + middleName+ " " + lastName;
        System.out.println("ФИО сотрудника - "+fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Пишем код для задачи 2
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "";
        fullName = firstName+ " " + middleName+ " " + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    private static void task3() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = "";
        fullName = firstName+ " " + middleName+ " " + lastName;
        System.out.println("Данные ФИО сотрудника  — "+fullName.replace("ё","e"));
    }
}