package com.blz.SnakeAndLadder;

public class WinPosition {
    public static final int noplay = 0;
    public static final int ladder = 1;
    public static final int snake = 2;

    public void winPosition() {
        int position = 0, final_position = 100, count = 0;
        while (position < final_position) {
            count++;
            System.out.println("player position is :" + position);

//generating random number from 1 to 6
            int roll_dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            //check for options like noplay,ladder,snake
            switch (option) {
                case noplay:
                    //position = 0;
                    System.out.println("its a noplay! stays here in the same place");
                    break;
                case ladder:
                    position += roll_dice;
                    System.out.println("its a ladder! player moves ahead by" + roll_dice);
                    break;
                case snake:
                    if ((position != 0) && (position > roll_dice)) {
                        position -= roll_dice;
                        System.out.println("ita a snake! player moves behind by" + roll_dice);
                    } else {
                        position = 0;
                        System.out.println("its snake ! player moves behind by" + roll_dice);
                    }
                    break;
                default:
                    System.out.println("Error! please check");
                    break;
            }
        }
        System.out.println("current position of the player in the game is :" + position);

    }
}
