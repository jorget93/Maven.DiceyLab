import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void constructorTest(){
        Dice dice = new Dice(2);
        Integer min = 2;
        Integer max = 6 * 2;

        Integer sum = dice.tossAddSum();

        Assert.assertTrue(sum >= min && sum <= max);
    }
}
