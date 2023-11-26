package tiostitch.geometry.cube;

import tiostitch.geometry.cube.controllers.CharController;
import tiostitch.geometry.cube.controllers.ImgController;
import tiostitch.geometry.cube.controllers.KeyController;

import javax.swing.*;

public class Main extends JFrame {

    private final ImageIcon logoDraw = new ImageIcon(getClass().getResource("Backgrounds/Logodraw.png"));
    private final ImageIcon backDraw = ImgController.resizeImageGif(new ImageIcon(getClass().getResource("Backgrounds/Backdraw.png")), 510, 408);
    private static final CharController player = new CharController(50, 50, 40, 40);

    private final KeyController keyController = new KeyController();
    private final JFrame frame = new JFrame();

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        frame.setTitle("GeometryCube - ALPHA-TEST v1.0");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(510, 408);

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);

        frame.setIconImage(new Main().getLogoDraw().getImage());
        frame.addKeyListener(new Main().getKeyController());

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public ImageIcon getLogoDraw() {
        return logoDraw;
    }

    public ImageIcon getBackDraw() {
        return backDraw;
    }

    public KeyController getKeyController() {
        return keyController;
    }

    public CharController getPlayer() {
        return player;
    }
}