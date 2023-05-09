import controller.CommandConsoleControllerMain;
import model.MyFabricModel;
import model.Trophy;
import view.ConsoleViewUser;
import view.base.ConsoleView;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyFabricModel models = new MyFabricModel();
        ConsoleView consoleView = new ConsoleViewUser(scanner);
//
        CommandConsoleControllerMain controller = new CommandConsoleControllerMain(models, consoleView);
        controller.start();
    }
}
