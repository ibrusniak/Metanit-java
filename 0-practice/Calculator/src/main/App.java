
package main;

import static utils.ConsoleOutput.*;

import utils.Logger;

/**
 * App - main class of Calculator project
 */
public class App {

    public static void main(String[] args) {
        
        Logger logger = new Logger("L0");
        
        logger.info("Application has been started");
        
        Calculator calculator = new Calculator((byte)12);

        println(calculator.getScreenAsString());

        logger.info("Application has been stoped");
    }
}