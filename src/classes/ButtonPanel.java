package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;



public class ButtonPanel extends JPanel{

    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    // constructor
    ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(Color.red);

        addTask = new JButton("Dodaj zadanie");
        addTask.setBorder(getBorder());
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Usun zadanie");
        clear.setBorder(getBorder());
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(clear);
    }
    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }
}
