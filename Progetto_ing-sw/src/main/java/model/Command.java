
package model;

public interface Command {
    int[][] myShelf= new int[6][7];
    int chains[]=new int[100];
    int oldChains[]= new int[100];
    public default void adjacentTiles(int column, int row, int[] tiles, Player myPlayer){}
    public default void convertPoints(Player myPlayer, int[]oldChains, int[]chains){}
}
