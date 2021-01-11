import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 11.01.2021
 *
 * @author me
 */
public class Task8Test {

    private final double delta = 0.0001;

    @Test
    public void additionTest() {
        Assert.assertEquals("результат сложения двух дробных чисел отличается от ожидаемого.",
                2,
                Operation.getOperation(new SourceData(1, 1, "+"))
                        .calculate()
                        .getResult(),
                delta);
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals("результат вычитания двух дробных чисел отличается от ожидаемого.",
                1,
                Operation.getOperation(new SourceData(2, 1, "-"))
                        .calculate()
                        .getResult(),
                delta);
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals("результат умножения двух дробных чисел отличается от ожидаемого.",
                4,
                Operation.getOperation(new SourceData(2, 2, "*"))
                        .calculate()
                        .getResult(),
                delta);
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals("результат деления двух дробных чисел отличается от ожидаемого.",
                2,
                Operation.getOperation(new SourceData(4, 2, "/"))
                        .calculate()
                        .getResult(),
                delta);
    }
}
