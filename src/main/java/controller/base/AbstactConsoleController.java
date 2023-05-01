package controller.base;

import model.base.FabricModel;
import view.base.ConsoleView;

import java.util.List;

public abstract class AbstactConsoleController implements Controller {
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
    public AbstactConsoleController(FabricModel fabricModel, ConsoleView consoleView){
        this.fabricModel = fabricModel;
        this.consoleView = consoleView;
        consoleView.setCommandList(getCommandList());
    }
    @Override
    public void start() {
        int numberCommand = consoleView.getCommandNumber();
        while (numberCommand != ConsoleView.getStop_CODE_COMMAND()){
            compel(numberCommand);
            numberCommand = consoleView.getCommandNumber();
        }
    }

    protected abstract List<String> getCommandList();


}
