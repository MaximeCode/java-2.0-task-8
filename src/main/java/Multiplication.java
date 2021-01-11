/**
 * Created on 11.01.2021
 *
 * @author me
 */
public class Multiplication extends Operation {

    public Multiplication(SourceData sourceData) {
        super(sourceData);
    }

    /**
     * Вычисляет произведение дробрых чисел.
     */
    public Multiplication calculate() {
        setResult(getFirst() * getSecond());
        return this;
    }
}
