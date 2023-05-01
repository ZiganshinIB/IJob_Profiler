import controller.ConsoleControllerUser;
import model.MyFabricModel;
import view.ConsoleViewUser;
import view.base.ConsoleView;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyFabricModel models = new MyFabricModel();
        ConsoleView consoleView = new ConsoleViewUser(scanner);
        ConsoleControllerUser controller = new ConsoleControllerUser(models, consoleView);
        controller.start();
    }
}
