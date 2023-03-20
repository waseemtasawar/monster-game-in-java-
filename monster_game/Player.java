/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monster_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zahid Mirza
 */
public class Player extends Character{
Scanner input = new Scanner(System.in);
    public Player() 
    {
        // for the Player Name
        System.out.println("Enter Player Name");
        name =input.nextLine();
        setHit(100);
    
    }
    @Override
    public int Attack()
    {
        
        Random rendom = new Random();
          int value =rendom.nextInt(0,6+1);
          System.out.println(name+ " gives mega attack with Demage : "+value);
          return value;  
    }
   
}
