package com.erbaris.app.runner;

import com.erbaris.app.FindLands;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class FindLandsAppRunner implements ApplicationRunner {
    private final FindLands m_findLands;

    public FindLandsAppRunner(FindLands findLands) {
        m_findLands = findLands;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //int[][] m = {{0,0,0,1,0,1,0}, {0,0,1,1,0,1,1}, {0,0,0,1,0,0,0}, {0,0,0,0,1,1,0}, {0,1,1,0,0,1,0}, {0,0,1,0,1,1,0}, {0, 0, 1, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0, 0} };
        //ArrayUtil.print(2, m);

        Console.writeLine("Test");

        m_findLands.run();
    }
}
