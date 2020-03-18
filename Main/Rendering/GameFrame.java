package Main.Rendering;

import javax.swing.*;
import java.awt.*;

import Main.Constants;

public class GameFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    public static JLabel[][] PixelMatrixA = new JLabel[20][40];// TODO make this dynamic, maybe? also, this has a default value of space
    public static JLabel[][] PixelMatrixB = new JLabel[20][40];
    static JPanel PanelA = new JPanel();
    static JPanel PanelB = new JPanel();

    public static final GameFrame NewFrame() {
        GameFrame Frame1 = new GameFrame();
        PanelA.setLayout(new GridLayout(20, 40, 0, 0));
        PanelB.setLayout(new GridLayout(20, 40, 0, 0));
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 40; y++) {
                PixelMatrixB[x][y] = new JLabel(" ");
                PanelB.add(PixelMatrixB[x][y]);
                PixelMatrixB[x][y].setFont(Constants.TestFont);
            }
        }
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 40; y++) {
                PixelMatrixA[x][y] = new JLabel(" ");
                PanelA.add(PixelMatrixA[x][y]);
                PixelMatrixA[x][y].setFont(Constants.TestFont);
            }
        }
        PanelA.setVisible(true);
        PanelB.setVisible(true);
        Frame1.add(PanelA);
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