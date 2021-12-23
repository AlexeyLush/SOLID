package exceptions;

public class OpenedPlaceException extends RuntimeException{
    @Override
    public String toString() {
        return "Неправильный ответ! (правильный: сказки)";
    }
}
