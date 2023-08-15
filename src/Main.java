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
        } else  if (operatingSystem == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


  public static int calculateDeliveryDays (int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <=60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
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

        int operatingSystem = 1;
        int clientDeviceYear = 2020;
        determineDevise(operatingSystem, clientDeviceYear);

    }

    public static void task3() {
        System.out.println("Задача 3");
    int deliveryDistance = 150;
    int deliveryDays = calculateDeliveryDays(deliveryDistance);
    if (deliveryDays == -1) {
        System.out.println("Доставка невозможна");
    } else {
        System.out.println("Потребуется дней " + deliveryDays);
    }
    }
}






