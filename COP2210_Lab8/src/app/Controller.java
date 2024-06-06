package app;

import toolkit.ArrayProcessor;

import vehicle.Car;

public class Controller {

    public static void main(String [] args){

        yourInfoHeader();

     for(int i = 0; i < 5; i++) {

         System.out.println("================================================");
         System.out.println("displayElementOfIntArray");
         System.out.println("=================================================");
         int[] numbers = ArrayProcessor.createArrayWithInts(10, -100, 1000);
         ArrayProcessor.displayElementsOfIntArray(numbers);
         ArrayProcessor.averageOfIntArray(numbers);
         System.out.println("\n");

     }

         Car[] cars = new Car[15];
         for(int i = 1; i < cars.length + 1; i++) {
             cars[i - 1] = new Car();
             cars[i - 1].displayInfo();
             System.out.println();
         }


             ArrayProcessor.findCarWithBestMPG(cars);
             ArrayProcessor.findCarWithWorstMPG(cars);

             ArrayProcessor.averageOfCarPrices(cars);


        System.out.println();
        System.out.println("============================================");
        System.out.println("2d Arrays");
        System.out.println("==============================================");

        int[][] arrayWithinArrayOfInts = {{1}, {1,2}, {1,2,3}, {1,2,3,4}};
        double sum = 0;
        double averageA = 0;

        for(int i = 0; i < arrayWithinArrayOfInts.length; i++){
            System.out.print("{");
            for(int j = 0; j < arrayWithinArrayOfInts[i].length; j++){
                if(i >= j){
                    if(i ==j){
                        System.out.print(arrayWithinArrayOfInts[i][j]);
                    } else {
                        System.out.print(arrayWithinArrayOfInts[i][j] + ", ");
                    }
                }
                sum += arrayWithinArrayOfInts[i][j];
            }
            averageA = sum/arrayWithinArrayOfInts[i].length;
            System.out.print(" }\t Average of Array Entry: " + averageA);
            averageA = sum = 0;
            System.out.println();
        }

        ArrayProcessor.getEventsProcessed();



        }






    //---------------------------------------------------------
    // beginning of yourInfoHeader () method

    public static void yourInfoHeader (){

        System.out.println("=============================================");
        System.out.println("PROGRAMMER: " + "Joshua Gomez");
        System.out.println("PANTHER ID: " + "6082979");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("CLASSTIME: \t" + "Tuesday/Thursday 5:00PM-7:45PM");
        System.out.println();
        System.out.println("ASSIGNMENT: " + "Lab7");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other program");
        System.out.println("===============================================");
        System.out.println();

        // end yourInfoHeader





    }
}
