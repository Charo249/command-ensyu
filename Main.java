import java.util.Scanner;
public class Main{
        public static void main(String args[]) {
                Scanner stdIn = new Scanner(System.in);
             
                System.out.println("BMIの計算");
             
                System.out.print("身長(m)を入力してください：");
                double height = stdIn.nextDouble(); 
                System.out.print("体重(Kg)を入力してください：");
                double weight = stdIn.nextDouble(); 
             
                double bmi = weight / Math.pow(height, 2);        
             
                 System.out.println("BMIの値は" + (Math.floor(bmi*100))/100);
  
              }
            }                       
        


