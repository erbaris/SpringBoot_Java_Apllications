package com.erbaris.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import static com.erbaris.app.Directions.*;

public class FindLands {

    public static void run()
    {
        int[][] m = {{0,0,0,1,0,1,0}, {0,0,1,1,0,1,1}, {0,0,0,1,0,0,0}, {0,0,0,0,1,1,0}, {0,1,1,0,0,1,0}, {0,0,1,0,1,1,0}, {0, 0, 1, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0, 0} };
        //ArrayUtil.print(1, m);
        Console.writeLine(numberOfIslands(m));

    }
    public static int numberOfIslands(int[][] m)
    {
        var landCounter= 0;
        var checkedM = new int [m.length][m[0].length];
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m[i].length; j++){
                if (!isLand(checkedM, i, j) && isLand(m, i, j)){
                    landCounter++;
                    //Console.writeLine("%d %d", i ,j);
                    findLand(m, i, j, checkedM, LEFT);
                }
            }
        ArrayUtil.print(1, checkedM);
        return landCounter;
    }

    private static void findLand(int[][] m, int i, int j, int[][] checked, Directions d)
    {
        checked[i][j] = 1;
        if(d != UP && i != 0 && !isUpLand(checked, i ,j) && isUpLand(m, i, j))
            findLand(m, i - 1, j, checked, DOWN);
        if(d != DOWN && i != m.length - 1 && !isDownLand(checked, i ,j) && isDownLand(m, i, j))
            findLand(m, i + 1, j, checked, UP);
        if(d != LEFT && j != 0 && !isLeftLand(checked, i ,j) && isLeftLand(m, i, j))
            findLand(m, i, j - 1, checked, RIGHT);
        if(d != RIGHT && j != m[0].length -1 && !isRigthLand(checked, i ,j) && isRigthLand(m, i, j))
            findLand(m, i, j + 1, checked, LEFT);

    }
    private static boolean isLand(int[][] m, int i, int j)
    {
        return m[i][j] == 1;
    }
    private static boolean isLeftLand(int[][] m, int i, int j)
    {
        return isLand(m, i, j - 1);
    }
    private static boolean isRigthLand(int[][] m, int i, int j)
    {
        return isLand(m, i, j + 1);
    }
    private static boolean isUpLand(int[][] m, int i, int j)
    {
        return isLand(m, i - 1, j);
    }
    private static boolean isDownLand(int[][] m, int i, int j)
    {
        return isLand(m, i + 1, j);
    }


}
