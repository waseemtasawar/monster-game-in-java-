/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monster_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zahid Mirza
 */
public class Game extends  Object {
    Scanner input = new Scanner(System.in);
    // create a character Array which tell how many character are in the Game.
    ArrayList<Character> gamer = new  ArrayList<> ();
    Player Player;
    public Game() 
    {
        // Generate Only on Monster 
         Random rendom = new Random();
          int value =rendom.nextInt(1,1+1);
          for (int i = 0; i < value; i++) {
            gamer.add(new Monster());
        }
          gamer.add(new Boss());
          Player = new Player();
    }
    //Cheack who will win.
    public boolean  win()
    {
        boolean cheak = true;
        
        for(var i : gamer)
        {
         if(i.isAlive())
             return false;
        }
         return cheak;
    }
    // to cheack if the Player is Dead then End the Game. 
    public boolean Loss(){
        
        return (!Player.isAlive());
    }
    
    public int chooseWhoToAttack(){
        for (int i = 0; i < gamer.size(); i++) {
            System.out.println(i+ " : "+ gamer.get(i).name);
        }
        int x  = (int)(input.nextInt());
        return x;
    }
    
    public void playRound(){
        Player.displayYourself();
        
        for (int i = 0; i < gamer.size(); i++) {
            if(gamer.get(i).isAlive()){
                Player.takeHit(gamer.get(i).Attack());
            }
        }
        if(Player.isAlive()){
            int x = chooseWhoToAttack();
            gamer.get(x).takeHit(Player.Attack());
        }
        
    }
    
    
}
