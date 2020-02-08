import javax.swing.*;
import java.awt.*;
public class GameFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel[][] PixelList = new JLabel[40][20];
    public static final void NewFrame() {
        new GameFrame();
    }
    public GameFrame() {
        this.setSize(1600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Game");
        this.setVisible(true);
        this.setResizable(false);
        JPanel MainPanel = new JPanel();
        MainPanel.setLayout(new GridLayout(40, 20, 0, 0));
        for(int x = 0; x < 40; x++) {
            for(int y = 0; y < 40; y++){
                MainPanel.add(PixelList[x-1][y-1]);

            }
        }

    }
}