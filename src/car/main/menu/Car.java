package car.main.menu;

import java.util.Scanner;

public class Car {

    CarSpecs m3series = new CarSpecs("BMW M3", 2, "coupe", 3.2, 270);
    CarSpecs m5series = new CarSpecs("BMW M5", 4, "saloon", 5.0, 300);
    CarSpecs m6series = new CarSpecs("BMW M6", 2, "coupe", 5.0, 305);

    Scanner userInput = new Scanner(System.in);
    int i;

    void action1() {
        // it must print m3series
        m3series.printCar();
    }

    void action2() {
        // it must print m5series
        m5series.printCar();
    }

    void action3() {
        // it must print m6 series
        m6series.printCar();
    }

    void menu() {
        do {
            System.out.println("");
            System.out.println("Pick an option:");
            System.out.println("1 - The BMW M3");
            System.out.println("2 - The BMW M5");
            System.out.println("3 - The BMW M6");
            System.out.println("4 - Exit.\n");
            i = userInput.nextInt();

            switch (i) {
                case 1:
                    action1();
                    break;
                case 2:
                    action2();
                    break;
                case 3:
                    action3();
                    break;
                default:
                    if (i == 4) {
                        System.out.println("Bye");
                    } else
                        System.out.println(i + " is not in the Menu. Please select from the given options");
            }

        } while (i != 4);
    }

    public static void main(String[] args) {
        Car carObject = new Car();
        carObject.menu();

    }
}