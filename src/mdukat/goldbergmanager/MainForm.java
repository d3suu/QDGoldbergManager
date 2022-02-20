package mdukat.goldbergmanager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
    private JButton updateButton;
    JPanel panel1;
    private JTextField textFieldSteamUsername;
    private JTextField textFieldSteamID;

    public MainForm() {

        this.setTitle("Goldberg Emu Manager by d3suu"); // remember small software in 2007?

        textFieldSteamUsername.setText(SettingsHandler.getSteamUsername());
        textFieldSteamID.setText(SettingsHandler.getSteamID());

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!SettingsHandler.setSteamID(textFieldSteamID.getText())) {
                    JOptionPane.showMessageDialog(null, "Steam ID write error! Check stderr.");
                }else if(!SettingsHandler.setSteamUsername(textFieldSteamUsername.getText())){
                    JOptionPane.showMessageDialog(null, "Steam Username write error! Check stderr.");
                }else {
                    JOptionPane.showMessageDialog(null, "OK");
                }

            }
        });
    }
}
