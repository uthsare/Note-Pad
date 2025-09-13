package Controller;

import View.UserInterface;

public class MainController {
    public static void main(String[] args) {
        UIController uiController = new UIController();

    }

    /**
     * get call from ui controller event trigger.Pass the String to Logic Controller
     * */
    public void saveFileContent(String content) {

        LogicController logicController = new LogicController(content);
    }
}
