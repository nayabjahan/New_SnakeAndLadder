package com.blz.SnakeAndLadder;

public class WinPosition {
    final int ladder = 2;
    final int snake = 1;

    public void winPosition() {
        int position = 0;
        while (position <= 100) {
            int roll_dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            //check for options like ladder,snake
            switch (option) {
                case ladder:
                    System.out.println("rolling dice ...... " + roll_dice);
                    System.out.println("Option is ...... " + option);
                    position = position + roll_dice;
                    if (position > 100) {
                        position = 100;
                    }
                    System.out.println("Its a Ladder & Your Position Goes to " + position);
                    break;
                case snake:
                    System.out.println("rolling dice ...... " + roll_dice);
                    System.out.println("Option is ...... " + option);
                    position = position - roll_dice;
                    System.out.println("Its a Snake & Your Position Goes to " + position);
                    if (position == 0) {
                        System.out.println("Player position is Same " + position);
                    }
                    break;
                default:
                    System.out.println("Error! try again");
                    break;
            }
            position++;

        }
    }
}
