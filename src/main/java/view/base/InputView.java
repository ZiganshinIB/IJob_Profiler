package view.base;

public interface InputView {
    /**
     * Ввод числа
     * @param message Выводим сообщение пред получением
     * @return Введеное значение
     */
    Integer getInteger(String message);

    /**
     * Ввод строки
     * @param message Сообщение на вывод
     * @return Введеное значение
     */
    String  getString(String message);

    /**
     * Ввод дробного числа
     * @param message Сообщение на вывод
     * @return Введеное значение
     */
    Double  getDouble(String message);

    /**
     * Ввод булевого значение
     * @param message Сообщение на вывод
     * @return Введеное значение (true or false)
     */
    Boolean getBoolean(String message);
}
