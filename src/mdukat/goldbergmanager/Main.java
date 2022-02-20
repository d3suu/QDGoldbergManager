package mdukat.goldbergmanager;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainForm mf = new MainForm();
        mf.setContentPane(new MainForm().panel1);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setVisible(true);
        mf.pack();
    }
}
