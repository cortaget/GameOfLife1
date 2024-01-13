package GameInside;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A regular key handler.
 */
public class KeyHandler implements KeyListener {
    private boolean pressed = false;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * If a key is pressed, the 'pressed' variable will be true.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        pressed = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }


    @Override
    public String toString() {
        return "KeyHandler{" +
                "pressed=" + pressed +
                '}';
    }
}
