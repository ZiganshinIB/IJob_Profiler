package controller;


import controller.base.AbstractCommandConsoleController;
import model.User;
import model.base.FabricModel;
import model.base.Model;
import view.base.ConsoleView;
import view.base.ModelForm;

import java.util.ArrayList;
import java.util.List;

public class CommandConsoleControllerMain extends AbstractCommandConsoleController {

    private List<String> commandList;

    /**
     * Создание Контроллера
     * @param fabricModel Класс для работы с Моделями
     * @param consoleView Viewer
     */
    public CommandConsoleControllerMain(FabricModel fabricModel, ConsoleView consoleView) {
        super(fabricModel, consoleView);
    }

    @Override
    protected List<String> getCommandList() {
        commandList = new ArrayList<>();
        commandList.add("Добавить Пользователя");
        commandList.add("Удалить пользователя");
        commandList.add("Рабоота с пользователем");
        return commandList;
    }

    /**
     * Выпольнить номер команды
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
                dellUser();
                break;
            }
            case 2:{
                workUser();
                break;
            }

        }
    }

    /**
     * Работа с пользователем
     */
    private void workUser() {
        List<Model> users = fabricModel.getModelsIsType("User");
        consoleView.showItemList(users);
        int index = consoleView.getInteger("Введите кого хотите");
        Model user = users.get(index);
        consoleView.showMessage("Выбран объект");
        consoleView.showModel((ModelForm) user);
        new CommandConsoleControllerUser(fabricModel,consoleView,(User) user).start();
        this.upload();
    }

    private void dellUser() {
        List<Model> users = fabricModel.getModelsIsType("User");
        consoleView.showItemList(users);
        int index = consoleView.getInteger("Введите кого хотите удалить");
        Model user = users.get(index);
        consoleView.showMessage("Мы удалим следующий объект");
        consoleView.showModel((ModelForm) user);
        fabricModel.remove(user);
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
