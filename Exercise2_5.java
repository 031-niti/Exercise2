import java.util.Scanner;
public class Exercise2_5 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          //รับค่าน้ำหนัก
          System.out.println("Please, enter your weight(kg) :");
          float weight = input.nextFloat();
          //รับค่าส่วนสูง
          System.out.println("Please, enter your height(cm) :");
          float height = input.nextFloat() / 100;
          
          float BMI = weight / (height * height);
          System.out.println("Your BMI is "+ BMI);
          if(BMI <=18.5){
               System.out.println("Underweight");
          }
          else if(BMI <=24.9){
              System.out.println("Normal"); 
          } 
          else {
               System.out.println("Obese");
          }         
     }     
}
