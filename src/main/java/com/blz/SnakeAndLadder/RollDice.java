package com.blz.SnakeAndLadder;

public class RollDice {
public void rollDice(){
//getting random number on rolling dies from 1 to6
    System.out.println(Math.floor((Math.random() * 10 % 6) + 1));
}
}
