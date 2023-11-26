package tiostitch.geometry.cube.controllers;

import tiostitch.geometry.cube.Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyController implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        CharController player = new Main().getPlayer();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                if (player.getY() <= 70)
                    if (checkAround(player))
                        return;

                player.setY(player.getY() - 10);
                break;
            case KeyEvent.VK_S:
                if (player.getY() >= 300)
                    return;

                player.setY(player.getY() + 10);
                break;
            case KeyEvent.VK_D:
                if (player.getX() >= 420)
                    return;

                if (isFinale(player))
                    return;

                player.setX(player.getX() + 10);
                break;
            case KeyEvent.VK_A:
                if (player.getX() <= 50)
                    return;

                if (isFinale(player))
                    return;

                player.setX(player.getX() - 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private boolean checkAround(CharController player) {
        return player.getX() < 200 || player.getX() > 270;
    }

    private boolean isFinale(CharController player) {
        return player.getY() <= 30 && player.getX() >= 200 && player.getX() <= 270;
    }
}
