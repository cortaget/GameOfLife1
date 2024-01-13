package GameInside;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * A regular mouse handler.
 */
public class MouseHandler implements MouseListener, MapData {
    GamePanel source;

    public MouseHandler(GamePanel source) {
        this.source = source;
    }

    /**
     * When clicking on a living/dead cell, the cell will become the opposite state.
     * An example: When clicking on a dead cell, it will become alive.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        int num = MapData.map[(int) e.getX() / 50][(int) e.getY() / 50];
        if (num == 1) {
            num = 0;
            System.out.println(MapData.map[(int) e.getX() / 50][(int) e.getY() / 50]);
        } else if (num == 0) {
            num = 1;

        }
        MapData.map[(int) e.getX() / 50][(int) e.getY() / 50] = num;
        source.repaint();
        //mapSpace.seeMap();
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public GamePanel getSource() {
        return source;
    }

    public void setSource(GamePanel source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "MouseHandler{" +
                "source=" + source +
                '}';
    }
}

