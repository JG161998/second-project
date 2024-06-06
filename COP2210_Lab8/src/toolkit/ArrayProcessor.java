package toolkit;

import java.util.Random;

import vehicle.Car;

public class ArrayProcessor {

    private static int eventsProcessed = 0;
    public static int getEventsProcessed(){
        eventsProcessed++;
        System.out.println("=======================================");
        System.out.println("ArrayProcessor Events");
        System.out.println("=======================================");
        int getEventsProcessed = eventsProcessed++;
        System.out.println("Array Processor Events: " + getEventsProcessed);
    return 0;
    }

    public static int[] createArrayWithInts(int sizeofArray, int min, int max) {
        eventsProcessed++;

        Random rndGen = new Random();

        int[] array = new int[sizeofArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = rndGen.nextInt((max+1-min)+min);
        }

        return array;
    }//end

        public static double averageOfIntArray(int[] array) {
            eventsProcessed++;
            double sum = 0;

            for (int i = 0; i < array.length; i++){
                sum+= array[i];
        }
        double average = sum / array.length;
        System.out.print("Array Average: " + average + "\t");
        return average;
    }

    public static void displayElementsOfIntArray(int [] array){
        eventsProcessed++;
        for(int i = 0; i<array.length; i++){
            if(i == array.length - 1){
                System.out.print(array[i] + "\n");
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }

    public static void findCarWithBestMPG(Car[] cars){
        eventsProcessed++;
        System.out.println();
        System.out.println("============================================");
        System.out.println("FindCarWithBestMPG");
        System.out.println("=============================================");

        double bestMPG = 0;
        Car max = null;

        for(int i = 1; i < cars.length; i++){
            Car current = cars[i];

            if(cars[i].getMpg() > bestMPG){
                bestMPG = cars[i].getMpg();
                max = cars[i];
            }
        }
        max.displayInfo();

    }

    public static void findCarWithWorstMPG(Car[] cars){
        eventsProcessed++;

        Car carWorstMPG = cars[0];

        for(int i = 1; i <cars.length; i++) {
            Car current = cars[i];

            if(current.getMpg() < carWorstMPG.getMpg()) {
                carWorstMPG = current;
            }
        }
        System.out.println();
        System.out.println("==================================================");
        System.out.println("FindCarWithWorstMPG");
        System.out.println("==================================================");
        carWorstMPG.displayInfo();
    }

    public static double averageOfCarPrices(Car[] cars){
        eventsProcessed++;

        double sum = 0;
        for(int i = 1; i< cars.length; i++){
            sum += cars[i].getPrice();
        }
        double averageprice = sum / cars.length;
        System.out.printf("Car Average Price: %10.2f \n", averageprice);


    return averageprice;
    }

}
