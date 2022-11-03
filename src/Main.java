public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");
        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Задача № 2");
        short clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите приложение по ссылке");
        }


        System.out.println("Задача № 3");
        short year = 2021;

        if ((year % 4) == 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 400) == 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 100) != 0) {
            System.out.println(year + " год не является високосным");
        }


        System.out.println("Задача № 4");
        short deliveryDistance = 95;
        short daysForDelivery = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (daysForDelivery + daysForDelivery));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (daysForDelivery + daysForDelivery + daysForDelivery));
        }


        System.out.println("Задача № 5");
        short monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}