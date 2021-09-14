package weekly2Homework;

import java.util.Random;

public class Gambling_Game {
    public static void main (String [] args ){
        Random random = new Random();

        int totalGain = 0;

        while (totalGain <= 50) {
            int die = random.nextInt(6)+1;
            System.out.println("Değer" + die);
            if (die == 1 || die == 2) {
                System.out.println("Game is over :(");
                break;
            }
            else if (die == 3) {
                System.out.println("No money is earned. Try again your chance...");
            }
            else if (die == 4) {
                System.out.println("You earn 4 dolars.");
                totalGain = totalGain + 4;
                System.out.println("Total Gain:"+totalGain);
            }
            else if (die == 5) {
                System.out.println("You earn 5 dolars.");
                totalGain = totalGain + 5;
                System.out.println("Total Gain:"+totalGain);
            }
            else {
                System.out.println("You earn 6 dolars.");
                totalGain = totalGain + 6;
                System.out.println("Total Gain:"+totalGain);
            }
        }
        if(totalGain >= 50){
            System.out.println("You have earned the maximum amount of money you can earn :D " + totalGain);
        }
        else{
            System.out.println(" The amount you earn:D " + totalGain);
        }
    }
}
