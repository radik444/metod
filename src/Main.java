import java.time.LocalDate;

public class Main {
    //Задание 1
    private static void printeYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //Задание 2
    private static void printeYear(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear) {
            System.out.print(" Установите lite версию для ");
        } else {
            System.out.print(" Установите версию для ");
        }
        if (clientOS == 1) {
            System.out.print("Android");
        } else {
            System.out.print("iOS");
        }
    }

    // Задание 3
    private static int getDistance(int deliveryDistance) {
        int daYs = 0;
        if (deliveryDistance <= 20) {
            daYs = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daYs = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            daYs = 3;
        }
        return daYs;
    }

        public static void main (String[]args) {
            // Задание 1
            int year = 100;
            printeYear(year);


            // Задание 2
            int clientOS = 1;
            int clientDeviceYear = 2023;
            printeYear(clientOS, clientDeviceYear);

             System.out.println("\n");

            // Задание 3
            int deliveryDistance = 95;
            int printDistance = getDistance(deliveryDistance);
            {
                System.out.println("Потребуется дней " + printDistance);
            }

        }
    }





