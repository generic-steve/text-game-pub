package Main.Rendering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Main.Constants;

public class GameFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    public static JLabel[][] PixelMatrix = new JLabel[20][40];// TODO make this dynamic, maybe? also, this has a default value of space
    public static final GameFrame NewFrame() {
        GameFrame Frame1 = new GameFrame();
        JPanel MainPanel = new JPanel();
        MainPanel.setLayout(new GridLayout(20, 40, 0, 0));
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 40; y++) {
                PixelMatrix[x][y] = new JLabel(" ");
            }
        }
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 40; y++) {
                MainPanel.add(PixelMatrix[x][y]);
                PixelMatrix[x][y].setFont(Constants.TestFont);
            }
        }
        MainPanel.setVisible(true);
        Frame1.add(MainPanel);
        return Frame1;
    }
    public GameFrame() {
        this.setSize(1200, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Game");
        this.setVisible(true);
        this.setResizable(false);
    }
}