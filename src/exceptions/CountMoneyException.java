package exceptions;

public class CountMoneyException extends Exception {
    @Override
    public String toString() {
        return "Значение должно быть в диапазоне 1-20";
    }
}
