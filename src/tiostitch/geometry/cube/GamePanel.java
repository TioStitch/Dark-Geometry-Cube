package tiostitch.geometry.cube;

import tiostitch.geometry.cube.controllers.CharController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private final ImageIcon background = new Main().getBackDraw();
    private final CharController player = new Main().getPlayer();

    public GamePanel() {
        Timer timer = new Timer(1000 / 60, e -> updateGame());
        timer.start();
    }

    private void updateGame() {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        if (player.getY() <= -40) {
            Font font = new Font("BOLD", Font.BOLD, 60);
            g2.setFont(font);
            g2.setColor(Color.RED);
            g2.drawString("VOCÊ GANHOU!", 20, 160);

            removeKeyListener(new Main().getKeyController());
            return;
        }

        g2.drawImage(background.getImage(), 0, 0, 510, 408, null);

        g2.setColor(new Color(104, 255, 61));
        g2.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());
    }
}
