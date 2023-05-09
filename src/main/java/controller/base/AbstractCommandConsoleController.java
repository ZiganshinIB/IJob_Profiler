package controller.base;

import model.base.FabricModel;
import view.base.ConsoleView;

import java.util.List;

public abstract class AbstractCommandConsoleController implements Controller {
    protected FabricModel fabricModel;
    protected ConsoleView consoleView;

    /**
     * Выпольнить номер команды
     * @param number номер команды
     */
    protected abstract void compel(Integer number);

    /**
     * Запуск
     */
    public AbstractCommandConsoleController(FabricModel fabricModel, ConsoleView consoleView){
        this.fabricModel = fabricModel;
        this.consoleView = consoleView;
        upload();
    }
    @Override
    public void start() {
        int numberCommand = consoleView.getCommandNumber();
        while (numberCommand != ConsoleView.getStop_CODE_COMMAND()){
            compel(numberCommand);
            numberCommand = consoleView.getCommandNumber();
        }
    }

    /**
     * Возвращает список команд
     * Тут необходимо прописать команды
     * @return Список команд
     */
    protected abstract List<String> getCommandList();


    protected void upload(){
        consoleView.setCommandList(getCommandList());
    }

}
