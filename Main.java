/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;


/**
 *
 * @author PET.Com
 */
public class Main {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String userInput = "";
         Patterns pattern = new Patterns();
         
         System.out.println("Type patterns or end to break:");
         
         while(true){
           
             userInput = in.nextLine();
             
             if(userInput.equals("end")) break;
             
             else if(pattern.carPlate(userInput))
                 System.out.println("this is a car plate!");
             
             else if(pattern.phoneNumber(userInput))
                 System.out.println("this is a phone number!");
             
             else if(pattern.cpf(userInput))
                 System.out.println("this is a CPF!");
             
             else
                 System.out.println("You do not typed a valid pattern!");
         }
     }
}
