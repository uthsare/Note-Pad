package Controller;

import Model.Logic;

class LogicController extends Logic {
    Logic logic = new Logic();

    public LogicController(String text) {

        saveToFile(text);
    }

    /**
     * Get file Content from Main Controller.
     * Pass the text String to Logic
     *
     *
     */
    public void saveToFile(String text){
        logic.save(text);
        System.out.println(text+" saved successfully");// for debugging purpose

    }
}
