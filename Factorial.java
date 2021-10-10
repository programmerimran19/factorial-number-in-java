/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner f=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int i, fact=1,num;
        num=f.nextInt();
        for(i=1;i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial is " +fact);
        
        
        
    }
    
}
