package controller;


import controller.base.AbstactConsoleController;
import model.User;
import model.base.FabricModel;
import view.base.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class ConsoleControllerUser extends AbstactConsoleController {

    private List<String> commandList;

    /**
     * Создание Контроллера
     * @param fabricModel Класс для работы с Моделями
     * @param consoleView Viewer
     */
    public ConsoleControllerUser(FabricModel fabricModel, ConsoleView consoleView) {
        super(fabricModel, consoleView);
    }

    @Override
    protected List<String> getCommandList() {
        commandList = new ArrayList<>();
        commandList.add("Добавить Пользователя");
        return commandList;
    }

    /**
     * Выпольнить номер команды
     *
     * @param number номер команды
     */
    @Override
    protected void compel(Integer number) {
        switch (number){
            //Добавить Пользователя
            case 0:{
                addUser();
                break;
            }
            case 1:{
                break;
            }

        }
    }

    private void addUser() {
        String name = consoleView.getString("Введите Имя:");
        String secondName = consoleView.getString("Введите Фамилию:");
        String patronymic = consoleView.getString("Введите Отчество:");
        Integer age = consoleView.getInteger("Введите возраст: ");
        User user = new User(age, name, secondName, patronymic);
        fabricModel.addModel(user);
    }

}
