import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYear(2024);
        printDevice(0);
        delivery(80);
    }
    public static void leapYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является высокосным!");
        } else {
            System.out.println("Этот год не являеться высокосным");
        }
    }

    public static void printDevice(int clientOs) {
        System.out.println("Задача 2");
        int versionOs = LocalDate.now().getYear();
        if (clientOs == 1 && versionOs <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && versionOs >= 2015) {
            System.out.println("Установите программу для Android по ссылке");
        }
        if (clientOs == 0 && versionOs >= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && versionOs <= 2105)
            System.out.println("Установите программу для IOS по ссылке");

    }

    private static int delivery(int distance) {
        System.out.println("Задача 3");
        if (distance > 100) {
            System.out.println("Доставка невозможна");
            return -1;
        }
        int deliveryDey = 1;
        if (distance <= 20) {
            System.out.println("Доставка составит " + deliveryDey + " день");
        } else if (distance > 20 && distance <= 60) {
            deliveryDey++;
            System.out.println("Доставка составит " + deliveryDey + " дней");
        } else if (distance > 60 && distance < 100) {
            deliveryDey = deliveryDey + 2;
            System.out.println("Доставка составит " + deliveryDey + " дней");
        } else {
            System.out.println("Доставка невозможна");
        }
        return deliveryDey;
    }
}
