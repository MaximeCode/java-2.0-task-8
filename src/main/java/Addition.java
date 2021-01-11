/**
 * Created on 11.01.2021
 *
 * @author me
 */
public class Addition extends Operation {

    public Addition(SourceData sourceData) {
        super(sourceData);
    }

    /**
     * Вычисляет сумму дробрых чисел.
     */
    public Addition calculate() {
        setResult(getFirst() + getSecond());
        return this;
    }
}
