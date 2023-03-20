/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monster_game;
//import java.io. * ;
import java.util. *;
//import java.util.Scanner;
//import java.io.FileReader;  
/**
 *
 * @author PROGRAMMER
 */
 class Boss extends Character{

     Scanner input = new Scanner(System.in); 
     int maxAttack =6;
    public Boss()
    {
        System.out.println("Enter Boss Name");
        name =input.nextLine();
        setHit(100);
    }
    
      @Override
      public  int Attack(){
         Random rendom = new Random();    
          int value =rendom.nextInt(0,maxAttack);
          System.out.println(name+ " gives mega attack with Demage : "+value);
          return value;  
      };
 }

