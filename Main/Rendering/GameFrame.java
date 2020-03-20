package Main.Rendering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Main.Constants;

public class GameFrame extends JFrame {
    public static int entityPosX = 1;
    public static int entityPosY = 5;
    private static final long serialVersionUID = 1L;
    public static JLabel[][] PixelMatrixA = new JLabel[20][40];// TODO make this dynamic, maybe? also, this has a default value of space
    public static JLabel[][] PixelMatrixB = new JLabel[20][40];
    static JPanel PanelA = new JPanel();
    static JPanel PanelB = new JPanel();
    static String keyPressedString = null;

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
        Frame1.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        keyPressedString = "Up";
                        break;
                    case KeyEvent.VK_DOWN:
                        keyPressedString = "Down";
                        break;
                    case KeyEvent.VK_LEFT:
                        keyPressedString = "Left";
                        break;
                    case KeyEvent.VK_RIGHT:
                        keyPressedString = "Right";
                        break;
                    default:
                        keyPressedString = null;
                    
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

        });

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
    public String GetKey() {
        return keyPressedString;
    }
}