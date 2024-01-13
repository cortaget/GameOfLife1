package GameInside;

import javax.swing.*;
import java.util.Scanner;

/**
 * The most crucial class, where the game loop and preparation for it are defined.
 */
public class Game implements MapData {
    private boolean startStop = true;
    JFrame jFrame = new JFrame("Game of Life");
    GamePanel gamePanel = new GamePanel();

    /**
     * In this method, the preparation for the game takes place.
     */
    public void press() {

        mapSpace.mapGeneration();


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1920, 1080);


        jFrame.add(gamePanel);

        jFrame.setVisible(true);
        gameStart();
    }

    /**
     * This is the actual game loop.
     */
    public void gameStart() {

        Simulation simulation = new Simulation(MapData.map.length, MapData.map.length);

        while (simulation.isLifeExist()) {
            if (gamePanel.isStarted()) {

            //mapSpace.seeMap();
                gamePanel.repaint();
            simulation.SimulationOneStep();
            simulation.SimulationWrite();



            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }

        }



    }

    public boolean isStartStop() {
        return startStop;
    }

    public void setStartStop(boolean startStop) {
        this.startStop = startStop;
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public String toString() {
        return "Game{" +
                "startStop=" + startStop +
                ", jFrame=" + jFrame +
                ", gamePanel=" + gamePanel +
                '}';
    }
}
