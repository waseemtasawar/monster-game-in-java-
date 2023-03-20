/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package monster_game;

//import java.util.Scanner;

/**
 *
 * @author PROGRAMMER
 */
public  class Character {    
 
   
 protected int startHit;
 protected int currentHit;
 protected boolean alive=true;
 protected String name;
 protected int health = 100;
 
   public Character() {
   this.alive =true;
   }
   
   // the Method is used  set the hits 
    public void setHit(int strt) {
        this.startHit = strt;
         this.currentHit = strt;
    }
    
    // display the Demage given by Monser, Boss and Player 
   public void takeHit(int damage){
       
       System.out.println(name+ " has been hit with "+ damage + " demage");
       this.currentHit = this.currentHit-damage;
       
       if(this.currentHit <=0){
           alive =false;
           System.out.println(name+ " has been dead");
       }else{
             System.out.println(name+ " had now health of "+Health());
       }
   }
   // for checking the health
   public int Health(){
       int x = ((currentHit)*100)/startHit;
       if(x==100){
           return x;
       }else{
           x =100-x;
           return 100-x;
       }
   }
   public boolean isAlive(){
       
       return alive;
   }
   
   // display the health and name of Boss, Monster and Palyer
   
    public void displayYourself()
    {
        System.out.println(name+ " Health: "+Health());
        System.out.println(name +":");
        int Hp =Health()/10;
        for (int i = 0; i < 10; i++)
        {
            
            if (i< Hp) {
                System.out.print("=");
            }else{
              System.out.print("-");  
            }
        }
    }
// Am Attack Methos Which is Used for onerriden in the All the Child Classes 
 public int Attack(){
     System.out.println();
     return 0;
 }    
}
