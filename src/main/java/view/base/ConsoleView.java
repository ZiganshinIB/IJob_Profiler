package view.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ConsoleView implements View, InputView {
    protected static final Integer STOP_CODE_COMMAND = -1;
    protected Scanner scanner;
    /**
     * Список команд
     */
    protected List<String> commandList;

    /**
     * Создать
     * @param scanner поток ввода
     */
    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setCommandList(List<String> commandList){
        this.commandList = commandList;
    }

    /**
     * Показать элементы
     */
    @Override
    public void showCommand() {
        for (int i = 0; i < commandList.size(); i++)
            showMessage("\t" + i + ". " + commandList.get(i));
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    /**
     * Выводит список команд и запрашивает ввести номер команды
     * @return номер комманды
     */
    public int getCommandNumber(){
        showMessage("Выбирете команду из списка (если хотите выйти введите" + STOP_CODE_COMMAND +"):");
        showCommand();
        return scanner.nextInt();
    }

    /**
     * Ввод числа
     *
     * @param message Выводим сообщение пред получением
     * @return Введеное значение
     */
    @Override
    public Integer getInteger(String message) {
        System.out.print(message+" ");
        int res;
        try {
            res = scanner.nextInt();
        }catch (Exception e){
            showMessage("Ошибка Вам надо ввести число!!!");
            res = getInteger(message);
        }
        return res;
    }

    /**
     * Ввод строки
     *
     * @param message Сообщение на вывод
     * @return Введеное значение
     */
    @Override
    public String getString(String message) {
        System.out.print(message+" ");
        return scanner.next();
    }

    /**
     * Ввод дробного числа
     *
     * @param message Сообщение на вывод
     * @return Введеное значение
     */
    @Override
    public Double getDouble(String message) {
        System.out.print(message+" ");
        double res;
        try {
            res = scanner.nextDouble();
        }catch (Exception e){
            showMessage("Ошибка Вам надо ввести число!!!");
            res = getDouble(message);
        }
        return res;
    }

    /**
     * Ввод булевого значение
     *
     * @param message Сообщение на вывод
     * @return Введеное значение (true or false)
     */
    @Override
    public Boolean getBoolean(String message) {
        System.out.println(message+" ");
        showMessage("Введите Y-елси true");
        return scanner.next().equalsIgnoreCase("y");
    }

    public static int getStop_CODE_COMMAND (){
        return STOP_CODE_COMMAND;
    }
}
