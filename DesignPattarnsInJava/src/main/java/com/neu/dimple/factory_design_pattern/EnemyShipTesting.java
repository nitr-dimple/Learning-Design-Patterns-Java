package com.neu.dimple.factory_design_pattern;

import java.util.Scanner;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class EnemyShipTesting {

    public static void main(String args[]){

//        This is simple code without using factory design pattern
//        EnemyShip ufoShip = new UFOEnemyShip();
//        EnemyShip theEnemy;
//
//        Scanner userInput = new Scanner(System.in);
//        String enemyShipOption = "";
//        System.out.println("What type of ship ? (U/R)");
//        if(userInput.hasNext()){
//            enemyShipOption = userInput.nextLine();
//        }
//        if(enemyShipOption.equals("U"))
//            theEnemy = new UFOEnemyShip();
//        else
//            theEnemy = new RocketEnemyShip();

//        Using Factory Design Pattern

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship ? (U/R)");
        if(userInput.hasNext()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }else{
            System.out.println("Enter only U, R or B");
        }

    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {

        anEnemyShip.displayEnemyShhip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}
