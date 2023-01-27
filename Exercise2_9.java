import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercise2_9 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          float rate = 35.5f ;
          System.out.println("Please, input amout of Thai baht: ");
          float baht = input.nextFloat();

          //กำหนดรูแบบจำนวนทศนิยมที่ต้องการแสดง
          String pattern = "0.00";
          //สร้างรูปแบบการแสดงผลตัวเลขทศนิยม  
          DecimalFormat df = new DecimalFormat(pattern);

          float us = baht / rate ;
          System.out.println("You got "+us+" $");
          
          //ค่าตัวเลขทศนิยม 
          float value = 5.56789f;

          //กำหนดสตริง
          String output = df.format(value);
          System.out.println("value = "+value + "\npattern is " + pattern + "\noutput is " + output);
          
          
     }
}
