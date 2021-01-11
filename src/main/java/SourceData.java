import java.util.Scanner;

/**
 * Класс для получения исходных данных из командной строки.
 * Для unit-тестов реализован конструктор, в который исходные данные передаются в готовом виде.
 * <p>
 * Created on 11.01.2021
 *
 * @author me
 */
public class SourceData {

    private final double first;
    private final double second;
    private String operation;

    public SourceData() {
        Scanner scanner = new Scanner(System.in);
        first = getValue(scanner, "первое");
        second = getValue(scanner, "второе");
        while (true) {
            System.out.print("Выберете операцию (\"+\", \"-\", \"*\", \"/\"): ");
            operation = scanner.nextLine();
            for (String operation : new String[]{"+", "-", "*", "/"}) {
                if (operation.equals(this.operation)) {
                    scanner.close();
                    return;
                }
            }
            System.out.print("Операция выбрана неверно. ");
        }
    }

    public SourceData(double first, double second, String operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperation() {
        return operation;
    }

    /**
     * Запрашивает ввод числа с клавиатуры и возвращает его.
     *
     * @param scanner     объект типа Scanner для ввода значений с клавиатуры
     * @param valueNumber порядковый номер числа, которое нужно ввести (первое/второе)
     * @return введённое с клавиатуры число
     */
    private double getValue(Scanner scanner, String valueNumber) {
        while (true) {
            try {
                System.out.printf("Введите %s число: ", valueNumber);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Число введено неверно. ");
            }
        }
    }
}
