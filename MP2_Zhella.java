package mp2_zhella;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Zhella
 * 
 */
public class MP2_Zhella {


    public static void main(String[] args) {
       
         String choice;
         double num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Using Math in Java");
        System.out.println("[A] SQUARE ROOT");
        System.out.println("[B] SINE");
        System.out.println("[C] COSINE");
        System.out.println("[D] TANGENT");
        System.out.print("ENTER CHOICE: ");
        choice = scan.nextLine();
        choice = choice.toUpperCase();
        System.out.print("ENTER A NUMBER: ");
        num = scan.nextInt();
        if (choice.equals("A")){
            squareRoot(num);
        }
        if (choice.equals("B")){
            sine(num);
        }
        else if (choice.equals("C")){
            cosine(num);
        }
        else if (choice.equals("D")){
            tangent(num);
        }
        else{
           System.out.println("Invalid input");
        }
        
        
    }
    public static void squareRoot(double a){
        System.out.println("Square Root of " + a +" is: " +Math.sqrt(a)); 
    }
    public static void sine(double a){
         System.out.println("Sine value of " + a +" is: " +Math.sin(a));   
    }
    
    public static void cosine(double a){
         System.out.println("Cosine value of " + a +" is: " +Math.cos(a));  
    }
    public static void tangent(double a){
        System.out.println("Tangent value of " + a +" is: " +Math.tan(a));  
       
    }
    
}