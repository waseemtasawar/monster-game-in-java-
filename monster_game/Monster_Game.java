/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monster_game;

/**
 *
 * @author PROGRAMMER
 */
public class Monster_Game {

    public static void main(String[] args) {
     Game game = new Game();
     
     while((!game.win()) && (!game.Loss())){
         
         game.playRound();
         System.out.println();
     }
    }
    
}
