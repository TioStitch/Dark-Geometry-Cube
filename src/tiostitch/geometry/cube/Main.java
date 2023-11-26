package tiostitch.geometry.cube;

import tiostitch.geometry.cube.controllers.CharController;
import tiostitch.geometry.cube.controllers.ImgController;
import tiostitch.geometry.cube.controllers.KeyController;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        start();
    }

    private ImageIcon logodraw = new ImageIcon(getClass().getResource("Backgrounds/Logodraw.png"));
    private ImageIcon backdraw = ImgController.resizeImageGif(new ImageIcon(getClass().getResource("Backgrounds/Backdraw.png")), 510, 408);
    private static CharController player = new CharController(50, 50, 40, 40);

    private KeyController keyCrtller = new KeyController();
    private JFrame frame = new JFrame();

    public static void start() {
        Main main = new Main();

        main.frame.setTitle("GeometryCube - ALPHA-TEST v1.0");
        main.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.frame.setSize(510, 408);

        GamePanel gamePanel = new GamePanel(60);
        main.frame.add(gamePanel);

        main.frame.setIconImage(new Main().getLogodraw().getImage());
        main.frame.addKeyListener(new Main().getKeyCrtller());

        main.frame.setResizable(false);
        main.frame.setLocationRelativeTo(null);
        main.frame.setVisible(true);
    }

    public ImageIcon getLogodraw() {
        return logodraw;
    }

    public ImageIcon getBackdraw() {
        return backdraw;
    }

    public KeyController getKeyCrtller() {
        return keyCrtller;
    }

    public CharController getPlayer() {
        return player;
    }

    public JFrame getFrame() {
        return frame;
    }
}
