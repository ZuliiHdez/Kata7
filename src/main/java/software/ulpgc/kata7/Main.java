package software.ulpgc.kata7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new JFrame() {
            {
            this.setTitle("hello");
            this.setSize(300,300);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
             }
        }.setVisible(true);
    }
}
