package GameInside;

/**
 *
 */
public class CheckLife implements MapData {
    int life = 0;

    /**
     * This method calculates the number of living cells in a 3x3 grid and determines whether the cell will become alive or die.
     * @param l X-axis
     * @param i Y-axis
     */
    public void checkLife(int l, int i){
        life = 0;
        for (int o = -1; o < 2; o++) {
            for (int p = -1; p < 2; p++) {
                try {
                    if (MapData.map[l + p][i + o] == 1) {
                        life++;
                    }
                } catch (Exception e) {

                }
                if (MapData.map[l][i] == 0 && life== 3) { // If there are 3 living cells adjacent to a dead cell, it will come to life.
                    MapData.coordinates[l][i] = 1;
                } else if (MapData.map[l][i] == 1 && (life == 3||life == 4)) {// If a living cell has 2 or 3 living cells adjacent to it, it continues to live.(Written as 3 or 4 because the method counts the number within a 3x3 grid (including the cell being checked).)
                    MapData.coordinates[l][i] = 1;
                }else {
                    MapData.coordinates[l][i] = 2; // If a living cell has fewer than 2 or more than 3 neighbors, it dies.
                }
            }
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "CheckLife{" +
                "life=" + life +
                '}';
    }

}
