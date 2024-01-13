package GameInside;
/**
 * Class representing a map object.
 * This class contains information about the coordinate system.
 * It also provides methods for managing, modifying, visualizing, and retrieving data about the map.
 */
public class Map implements MapData {

    //Coordinates
    private int x;
    private int y;

    //Class constructor
    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Sets all map coordinates to 0.
     */
    public void mapGeneration() {
        for (int i = 0; i < MapData.map.length; i++) {
            for (int l = 0; l < MapData.map.length; l++) {
                MapData.map[l][i] = 0;
            }
        }
    }



    public void seeMap() {
        System.out.println();
        for (int i = 0; i < y; i++) {
            for (int l = 0; l < x; l++) {
                System.out.print(" "+ MapData.map[l][i]+" ");
            }
            System.out.println();
        }
    }

    /**
     *  Method allowing to modify the information stored in the map coordinates.
     * @param x X-axis
     * @param y Y-axis
     * @param c To what integer we want to change the information at the coordinate
     * @return Returns the value from the given coordinate.
     */
    public int changeMap(int x,int y,int c){
        MapData.map[x][y] = c;
        return MapData.map[y][x];
    }




    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Map{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
