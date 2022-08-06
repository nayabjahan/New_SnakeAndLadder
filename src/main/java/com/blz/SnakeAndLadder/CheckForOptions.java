package com.blz.SnakeAndLadder;

public class CheckForOptions {
    public static  final int noPlay = 0;
    public static final int snake = 1;
    public static final int ladder = 2;

    public void CheckForOption(){
        int position = 0;
        int roll_dice = (int)((Math.floor(Math.random() * 10 ) % 6) +1);
             //random check for options like noplay,snake and ladder
        int options = (int)(Math.floor(Math.random() *10) % 3);

        switch (options){
            case noPlay:
                position = 0;
                System.out.println("Its a no play!!!! Stay here ");
                break;
            case ladder:
                position += roll_dice;
                System.out.println("Its a snake !!! move ahead by " + roll_dice);
                break;
            case snake:
                position -= roll_dice;
                System.out.println("Its a snake !!! move behind by " + roll_dice);
                break;
            default:
                System.out.println("try again");
                break;

        }

}

}
