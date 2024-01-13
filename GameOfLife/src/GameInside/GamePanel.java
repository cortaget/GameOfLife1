package GameInside;

import javax.swing.*;
import java.awt.*;

/**
 * Here is everything related to graphics.
 */
public class GamePanel extends JPanel {

    MouseHandler mouseHandler = new MouseHandler(this);
    KeyHandler keyHandler = new KeyHandler();


    public GamePanel(){
        setDoubleBuffered(true);
        setFocusable(true);
        setVisible(true);
        addMouseListener(mouseHandler);
        addKeyListener(keyHandler);
        setBackground(Color.BLACK);

    }

    /**
     *This method creates the game map as a popup window.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for(int i = 0; i < MapData.map.length;i++){
            for (int j = 0;j < MapData.map[0].length;j++){
                g2.setColor(Color.WHITE);
                g2.drawRect(i*50,j*50,50,50);
                if(MapData.map[i][j] == 1){
                    g2.setColor(Color.white);
                    g2.fillRect(i*50,j*50,50,50);
                }
            }
        }
    }




    public MouseHandler getMouseHandler() {
        return mouseHandler;
    }

    public void setMouseHandler(MouseHandler mouseHandler) {
        this.mouseHandler = mouseHandler;
    }

    /**
     * The method waits for any key to be pressed.
     */
    public boolean isStarted(){
        System.out.print("");
        return keyHandler.isPressed();
    }

    public KeyHandler getKeyHandler() {
        return keyHandler;
    }

    public void setKeyHandler(KeyHandler keyHandler) {
        this.keyHandler = keyHandler;
    }


    @Override
    public String toString() {
        return "GamePanel{" +
                "mouseHandler=" + mouseHandler +
                ", keyHandler=" + keyHandler +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}