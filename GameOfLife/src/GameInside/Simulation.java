package GameInside;

/**
 * In this class, everything related to the simulation of the game is included.
 */
public class Simulation extends Map {
    public Simulation(int x, int y) {
        super(x, y);
    }

    CheckLife checkLife = new CheckLife();

    private boolean lifeExist = true;


    /**
     * This method takes one simulation step (but only saves the state).
     */
    public void SimulationOneStep() {
        lifeExist = false;
        for (int i = 0; i < getY(); i++) {
            for (int l = 0; l < getX(); l++) {
                checkLife.checkLife(l,i);//
                if (MapData.map[l][i] == 1){
                    lifeExist = true;
                }



            }
        }
    }

    /**
     * This method records the result of the simulation onto the actual map.
     */
    public void SimulationWrite() {
        for (int i = 0; i < getY(); i++) {
            for (int l = 0; l < getX(); l++) {
                if (MapData.coordinates[l][i] == 1) {
                    MapData.map[l][i] = 1;
                }else if (MapData.coordinates[l][i] == 2) {
                    MapData.map[l][i] = 0;
                }
            }
        }
    }

    public boolean isLifeExist() {
        return lifeExist;
    }

    public void setLifeExist(boolean lifeExist) {
        this.lifeExist = lifeExist;
    }

    public CheckLife getCheckLife() {
        return checkLife;
    }

    public void setCheckLife(CheckLife checkLife) {
        this.checkLife = checkLife;
    }

    @Override
    public String toString() {
        return "Simulation{" +
                "checkLife=" + checkLife +
                ", lifeExist=" + lifeExist +
                '}';
    }
}
