package ru.ncedu.horstmann.inheritanceandreflection.enumclass;

/**
 * This class EnumClass
 * Exercises 7
 * Define an enumeration type for the eight combinations of primary colors
 * BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen, and getBlue.
 * @version 1.0, 6 Jan 2021
 * @author Vladislav Semenovykh
 */
public class EnumClass {
    public enum typeColor{
        BLACK (0,0,0),
        RED (255,0,0),
        BLUE (0,0,255),
        GREEN (0,255,0),
        WHITE (255,255,255),
        YELLOW (255,255,0);

        private int red;
        private int green;
        private int blue;

        private typeColor(int red, int green, int blue){
            this.red=red;
            this.green=green;
            this.blue=blue;
        }

        public int getRed(){
            return red;
        }
        public int getGreen(){
            return green;
        }
        public int getBlue(){
            return blue;
        }
    }
}
