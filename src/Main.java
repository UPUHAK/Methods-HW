import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }


    public static void task1() {
        System.out.println("task1");

        int year = 2024;
        checkAndPrintLeapYear(year);

    }


    public static void checkAndPrintLeapYear(int year) {
        int introductionLeapYear = 1584;
        if ((year % 4 == 0) && (year % 100 != 0) && (year >= introductionLeapYear)) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }


    public static void task2() {
        System.out.println("task2");

        int clientOS = 1;
        int clientDeviceYear = 2018;
        checkAndPrintVersionAppForOS(clientOS, clientDeviceYear);

    }


    public static void checkAndPrintVersionAppForOS(int clientOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

    }


    public static void task3() {
        System.out.println("task3");

        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            int numberDeliveryDays = calculateNumberDeliveryDays(deliveryDistance);
            System.out.println("Потребуется дней: " + numberDeliveryDays);
        }

    }


    public static int calculateNumberDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days += 1;
        } else days += 2;

        return days;

    }


}