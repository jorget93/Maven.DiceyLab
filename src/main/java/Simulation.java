public class Simulation {
    public Integer numOfDice;
    public Integer timesRolled;

    public Simulation(Integer numOfDice, Integer timesRolled){
        Dice dice = new Dice(numOfDice);
        for(int i = 0; i <= timesRolled; i++){
            dice.tossAddSum();
        }
    }
}
