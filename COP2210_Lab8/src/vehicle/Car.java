package vehicle;

import toolkit.ArrayProcessor;

import java.util.Random;


public class Car {
    private static final String VIN = "VIN-";
    private static int carID = 1000;
    private static String[] colors = {"White", "Red", "Blue", "Green", "Black"};
    private static int minMPG = 10;
    private static int maxMPG = 50;
    private static int minPrice = 25000;
    private static int maxPrice = 65000;
    //---------------------------------------------------------

    private String vin;
    private String color;
    private double mpg;
    private double price;
    //----------------------------------------------------------

    public Car(){
        Random myRand = new Random();
        mpg = (myRand.nextDouble() * (maxMPG - minMPG)) + minMPG;
        price = (myRand.nextDouble() * (maxPrice - minPrice)) + minPrice;
        color = colors[(int)(Math.random() * colors.length)];
    }

    //getters
    public String[] getColors() {
        return colors;
    }
    public static int getMinMPG(){
        return minMPG;
    }
    public static int getMaxMPG(){
        return maxMPG;
    }
    public static int getMinPrice(){
        return minPrice;
    }
    public static int getMaxPrice(){
        return maxPrice;
    }
    public String getVin(){
        return vin;
    }
    public String getColor(){
        return color;
    }
    public double getMpg(){
        return mpg;
    }
    public double getPrice(){
        return price;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }
    public void setMpg(double mpg){
        this.mpg = mpg;
    }
    public void setPrice(double price){
        this.price = price;
    }


    public void displayInfo(){

        System.out.printf("VIN: " + VIN + (carID++) + "\t" + "Color: " + color + " ");
        System.out.printf("Price: %10.2f\t ", price);
        System.out.printf("MPG: %7.2f\n", mpg);
    }
}
