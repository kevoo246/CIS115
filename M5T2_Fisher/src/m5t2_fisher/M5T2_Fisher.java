/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5t2_fisher;

import java.util.Scanner;

/**
 *
 * @author fisherk6930
 */
public class M5T2_Fisher {

// this method will greet the user
public static void showMessage() {
    System.out.println("Hello!");
}
    
    
    public static void myMethod() {
    int value = 5;
    System.out.println(value);
}
public static void displayValue(int num)
{
    System.out.println("The value is" + num);
}        
    
// the main program
    public static void main(String[] args) {
        // This program will say hello to the user
        showMessage();
        
        myMethod();
        // do it again
        showMessage();
        
        int age =45;
        displayValue(age);
        displayValue(100);        
        displayValue(7);
        
        System.out.println("Hello!");
        
        // then ask for their name 
        String name; 
        Scanner keyb = new Scanner (System.in);
        System.out.println("what's your name ?");
        name= keyb.next();
        
        // then ask for their age 
        System.out.println("How old are you ?" );
        
        //int age =keyb.nextInt();
        
        //int age = 2;
        displayValue(age);
       
        
        
        // finally, it will repeat those back
        System.out.println("nice to meet you " + name);
        System.out.println("i'm much younger than " + age);
        
        
    }//main()ends
    
}// class ends      
