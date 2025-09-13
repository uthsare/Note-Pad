package Controller;

import View.UserInterface;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UIController extends UserInterface {

    UserInterface ui= new UserInterface();

    public UIController() {

        System.out.println("UI controller created"); // Debugging
        ui.setUI();

        //Open a File Listener
        ui.openItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.println("File selected: " + fileChooser.getSelectedFile());

                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append(System.lineSeparator());
                    }
                    reader.close();
                    // The 'content' StringBuilder now holds the entire file content
                    System.out.println("File content:\n" + content.toString());
                    ui.textArea.setText(content.toString());
                }
                catch (IOException ex) {
                    ex.printStackTrace(); // Handle potential I/O errors
                }

            }
        });

        //Save File Listener
        ui.saveItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Text File Saved!");
            MainController mainController = new MainController();
            mainController.saveFileContent(ui.saveText());
        });

        // Exit file Listener
        ui.exitMenuItem.addActionListener(e -> {
            System.exit(0);
        });

        //Cut Listener
        ui.cutMenuItem.addActionListener(e -> {
            textArea.cut();
        });

        //Copy Listener
        ui.copyMenuItem.addActionListener(e -> {
            textArea.copy();
        });

        //Paste Listener
        ui.pasteMenuItem.addActionListener(e -> {
            try{ui.textArea.paste();}
            catch(Exception ex){
                ex.printStackTrace();}
        });

        //Help Menu About dialog listener
        ui.aboutMenuItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "s16846 \n B.M.S Uthsara Basnayake");
        });


    }

    }





