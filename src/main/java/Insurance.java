
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
public class Insurance {
    
    public static Integer Insurances(Integer age) throws InvalidAgeException {
        if(age>=5 && age <= 110){
        int prudvi = (5*age)+300;
        return prudvi;
        }
        else{
           throw new InvalidAgeException("Enter appropriate age"); 
        }
    }

    public static void main(String[] args) throws InvalidAgeException{
    Scanner sc = new Scanner (System.in);
    System.out.print("Please enter age:");
   int n = sc.nextInt();
    int total = Insurances(n);
    System.out.println("The Life Insurance cost is $"+ total);
    sc.close();
    } 
   
}
    

