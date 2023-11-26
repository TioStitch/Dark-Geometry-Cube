package tiostitch.geometry.cube;

import tiostitch.geometry.cube.controllers.CharController;
import tiostitch.geometry.cube.controllers.ImgController;
import tiostitch.geometry.cube.controllers.KeyController;

import javax.swing.*;

public class Main extends JFrame {

    private static JFrame frame = new JFrame();

    public static void main(String[] args) {
        start();
    }

    private ImageIcon logodraw = new ImageIcon(Main.class.getResource("Backgrounds/Logodraw.png"));
    private ImageIcon backdraw = ImgController.resizeImageGif(new ImageIcon(Main.class.getResource("Backgrounds/Backdraw.png")), 510, 408);
    private static CharController player = new CharController(50, 50, 40, 40);

    private static KeyController keyCrtller = new KeyController();

    public static void start() {
        frame.setTitle("GeometryCube - ALPHA-TEST v1.0");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(510, 408);

        GamePanel gamePanel = new GamePanel(60);
        frame.add(gamePanel);

        frame.setIconImage(new Main().getLogodraw().getImage());
        frame.addKeyListener(keyCrtller);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public ImageIcon getLogodraw() {
        return logodraw;
    }

    public ImageIcon getBackdraw() {
        return backdraw;
    }

    public CharController getPlayer() {
        return player;
    }
}
