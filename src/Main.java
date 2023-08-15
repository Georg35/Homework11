public class Main {


    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void determineDevise (int operatingSystem, int clientDeviceYear) {
        if (operatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operatingSystem == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (operatingSystem == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static void calculateDeliveryDays (int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println ("Потребуется дней " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println ("Потребуется дней " + (day + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println ("Потребуется дней " + (day + 2));
        } else {
            System.out.println ("К сожалению, мы не можем доставить Вам карту.");
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");

        int operatingSystem = 0;
        int clientDeviceYear = 2010;
        determineDevise(operatingSystem, clientDeviceYear);

    }

    public static void task3() {
        System.out.println("Задача 3");
    int deliveryDistance = 20;
    calculateDeliveryDays(deliveryDistance);
    }
}






