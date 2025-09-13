package View;
import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame {

    public static String content="";

    public JFrame frame = new JFrame("Notepad");
    JPanel textpanel = new JPanel();

    JMenuBar menuBar = new JMenuBar();

    JMenu fileMenu = new JMenu("File");
    public JMenuItem openItem = new JMenuItem("Open");
    public JMenuItem saveItem = new JMenuItem("Save");
    public JMenuItem exitMenuItem = new JMenuItem("Exit");

    //Edit Menu
    JMenu editMenu = new JMenu("Edit");
    public JMenuItem copyMenuItem = new JMenuItem("Copy");
    public JMenuItem pasteMenuItem = new JMenuItem("Paste");
    public JMenuItem cutMenuItem = new JMenuItem("Cut");

    //Help Menu
    JMenu helpMenu = new JMenu("Help");
    public JMenuItem aboutMenuItem = new JMenuItem("About");

    public JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    Scrollbar scrollbar = new Scrollbar(Scrollbar.HORIZONTAL);

    JMenuBar setMenuBar(){

        //File Menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        //Edit Menu
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        menuBar.add(editMenu);

        //Help Menu
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);
        return menuBar;
    }

    public void setUI(){

        frame.setSize(800,700);
        textpanel.setSize(frame.getWidth(), frame.getHeight());
        textpanel.add(textArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(setMenuBar());
        frame.setLayout(new BorderLayout(20, 20));
        frame.add(textpanel, BorderLayout.LINE_START);
        frame.add(scrollPane, BorderLayout.SOUTH);
        pack();
        //setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public String saveText() {
        content += textArea.getText();
        return textArea.getText();
    }

}
