import java.util.ArrayList;
import java.util.Random;

public class Dice {



    private Integer numberOfDice;


    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAddSum() {
        Random randomNumber = new Random();
        Integer sumRolled = 0;
        Integer dieRoll = 0;
        for(int i = 0; i < numberOfDice; i++){
            dieRoll = randomNumber.nextInt(6)+1;
            sumRolled += dieRoll;
            System.out.println("You Rolled: " + dieRoll);
        }
        System.out.println("Total rolled: " + sumRolled);
        return sumRolled;
    }
    public Integer getNumberOfDice(){
        return numberOfDice;
    }
}
