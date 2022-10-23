import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");

        int year = 2022;
        checkYear(year);

        System.out.println();
        System.out.println("Задание №2");

        int yearOfReleaseDevice = 2015;
        int clientOS = 0;

        checkOS(yearOfReleaseDevice, clientOS);

        System.out.println();
        System.out.println("Задание №3");

        int delDistance = 10;
        calcDelDate(delDistance);

    }
    public static void checkYear(int year) {

        if (year % 4 == 0 && year%100!= 0 || year%400==0) {

            System.out.println(year + " год - високосный");
        }
        else {
            System.out.println(year + " год - не високосный");
        }
    }
    public static void checkOS(int year, int os) {

        int currentYear = LocalDate.now().getYear();

        if (os == 0) {

            if (year<=currentYear){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        else if (os == 1) {

            if (year<=currentYear){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        else {
            System.out.println("Неизвестный тип устройства");
        }
    }

    public static void calcDelDate(int delRange) {

        int delTime;

        if (delRange <= 20) {
            delTime =1;
            System.out.println("Доставка займет " + delTime + " дней.");
        } else if (delRange <= 60) {
            delTime = 2;
            System.out.println("Доставка займет " + delTime + " дней.");
        }
        else {
            delTime = 3;
            System.out.println("Доставка займет " + delTime + " дней.");
        }
    }


}