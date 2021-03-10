import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void binsTest(){
        Bins results = new Bins(2, 12); // for bins from 2..12
        Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
        results.incrementBin(10); // should increment bin # 10
    }
    @Test
    public void incrementBinsTest(){
        Bins results = new Bins(2,12);
        Dice dice = new Dice(2);
        results.incrementBin(dice.tossAddSum());
        Integer numberOfTens = results.getBin(7);
        System.out.println(numberOfTens);
    }
}
