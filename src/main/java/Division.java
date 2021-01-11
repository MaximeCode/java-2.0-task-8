/**
 * Created on 11.01.2021
 *
 * @author me
 */
public class Division extends Operation {

    public Division(SourceData sourceData) {
        super(sourceData);
    }

    /**
     * Вычисляет результат деления дробрых чисел.
     */
    public Division calculate() {
        setResult(getFirst() / getSecond());
        return this;
    }
}
