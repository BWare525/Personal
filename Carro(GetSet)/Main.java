package main;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create an instance of Car
    Car car = new Car();

    // Set the values using the setter methods
    Scanner sc=new Scanner(System.in);
    
    System.out.println("ingrese la marca de un auntomovil");
    String a=sc.nextLine();
    car.setCompany_name(a);
    
    System.out.println("Ingrese un modelo de automovil");
    String b=sc.nextLine();
    car.setModel_name(b);
    
    System.out.println("Ingrese el year del modelo");
    int c=sc.nextInt();
    car.setYear(c);
    
    System.out.println("Ingrese el Kilometraje");
    float d=sc.nextFloat();
    car.setMileage(d);
    // mileage is not set using the setter method

    // Get the values using the getter methods
    String company_name = car.getCompany_name();//variables locales
    String model_name = car.getModel_name();
    int year = car.getYear();
    double mileage = car.getMileage();

    // Print the values
    System.out.println("Company Name: " + company_name);
    System.out.println("Model Name: " + model_name);
    System.out.println("Year: " + year);
    System.out.println("Mileage: " + mileage +" Km");
  }
}