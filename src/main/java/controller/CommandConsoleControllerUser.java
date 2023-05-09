package controller;

import controller.base.AbstractCommandConsoleController;
import model.Trophy;
import model.User;
import model.base.FabricModel;
import model.base.Model;
import view.base.ConsoleView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CommandConsoleControllerUser extends AbstractCommandConsoleController {

    private List<String> commandList;

    private  User user;
    /**
     * Запуск
     *
     * @param fabricModel
     * @param consoleView
     */
    public CommandConsoleControllerUser(FabricModel fabricModel, ConsoleView consoleView, User user) {
        super(fabricModel, consoleView);
        this.user = user;
    }

    /**
     * Возвращает список команд
     * Тут необходимо прописать команды
     *
     * @return Список команд
     */
    @Override
    protected List<String> getCommandList() {
        commandList = new ArrayList<>();
        commandList.add("Добавить Грамоту");
        commandList.add("Просмотреть награды");

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
                addTrophy();
                break;
            }
            case 1:{
                showTrophy();
                break;
            }
        }
    }

    private void showTrophy() {
        List<Model> trophies = fabricModel.getModelsIsType("Trophy");
        List<Trophy> userTrophies = new ArrayList<>();
        for (int i = 0; i < trophies.size(); i++) {
            if (((Trophy) trophies.get(i)).getUser().equals(user)){
                userTrophies.add((Trophy) trophies.get(i));
            }
        }
        consoleView.showItemList(userTrophies);
    }

    private void addTrophy() {
        String name = consoleView.getString("Название награды: ");
        String description = consoleView.getString("Введите описание нагрды: ");
        String status = consoleView.getString("Введите введите какое место вы получили или статус награды: ");
        String field = consoleView.getString("В какой областе: ");
        String date = consoleView.getString("Дата получение награды: ");

        fabricModel.addModel(new Trophy(date,name, description, status, field, user));
//        for (Field f: Trophy.class.getDeclaredFields()) {
//            System.out.println();
//            System.out.println(f.getType().getSimpleName());
//            System.out.println(f.getName());
//        }
    }

}
