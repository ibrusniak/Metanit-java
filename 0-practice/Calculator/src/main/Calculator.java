
package main;

import utils.Logger;

/**
 * Calculator - class describes calculator
 * 
 * Imaginenative model:
 * [                 0]
 * [mc][m+][m-][mr]
 * [ 7][ 8][ 9][ *][ /]
 * [ 4][ 5][ 6][ -][  ]
 * [ 1][ 2][ 3][  ][  ]
 * [ 0][ .][ n][ +][ =]
 * 
 * key "n" means "negative"
 */
public final class Calculator {

    public enum keys {

        KEY_MEMORY_CLEAR,
        KEY_MEMORY_PLUS,
        KEY_MEMORY_MINUS,
        KEY_MEMORY_RESET,

        KEY_SEVEN, KEY_EIGHT, KEY_NINE,
        KEY_FOUR, KEY_FIVE, KEY_SIX,
        KEY_ONE, KEY_TWO, KEY_THREE,
        KEY_ZERO,
        
        KEY_DECIMAL_DOT, KEY_NEGATIVE,
        
        KEY_ADDITION,
        KEY_SUBSTRATION,
        KEY_MULTIPLICATION,
        KEY_DIVISION,
        
        KEY_RESULT
    }

    private Logger logger = new Logger("CLTOR");
    private Screen screen;

    public Calculator(byte screenCapacity) {
        
        screen = new Screen(screenCapacity);
        logger.info("Calculator creted");
    }

    public String getScreenAsString() {
        return screen.toString();
    }

    public void onKeyPress(Calculator.keys key) {

    }

    /**
     * Screen - class describes calculator's scren. What does it look like?
     * [0][0][0][0][0][0][0][0][0][0][1] or
     * [0][0][0][0][0][0][0][0][0][3][5] or
     * [0][0][0][0][0][0][0][0][0][.][5] or
     * [0][0][0][0][0][5][3][4][.][2][4] or
     * Simple array with digits. On those position where are no digits - zero
     * Decimal dot - take one position, so "digit capacity" is capacity - 1
     */
    private class Screen {

        private final char DECIMAL_DOT = '.';

        private char[] screenCells;
        private byte fullCapacity;

        private boolean minusFlag = false;
        private boolean memoryFlag = false;
        private boolean errorFlag = false;
        private Logger logger = Calculator.this.logger;

        public Screen(byte digitsCapacity) {

            if(digitsCapacity < 3 || digitsCapacity > 100) {
                logger.warning("Attempt to create screen with " + digitsCapacity + " digits!");
                digitsCapacity = 12;
            }

            screenCells = new char[digitsCapacity + 1];
            fullCapacity = (byte)(digitsCapacity + 1);
            reset();
            logger.info("Screen created. Full capacity (with decimal dot): " + fullCapacity);
        }
        
        public void reset() {

            for(byte i = 0; i < screenCells.length; i++) {
                screenCells[i] = '0';
            }
            logger.info("Screen reset");
        }

        public boolean isDotPresents() {

            for(byte i = (byte)(screenCells.length - 1); i >= 0; i--) {
                if (screenCells[i] == DECIMAL_DOT) return true;
            }
            return false;
        }

        public void addDigit(char digit) {
            if(shiftLeft()) {
                screenCells[screenCells.length - 1] = digit;
                logger.info("Screen. Add digit " + Character.toString(digit));
            }
        }

        public void removeDigit() {
            logger.info("Screen. Remove digit");
        }

        public void setDecimalDigit() {
            
        }

        @Override public String toString() {

            String stringRepresantation
                = String.format("[%s][%s][%s]",
                    errorFlag ? "ERR" : "   ",
                    memoryFlag ? "MEM" : "   ",
                    minusFlag ? "MINUS" : "     ");
            
            for(char ch : screenCells) {
                stringRepresantation += "[" + Character.toString(ch) + "]";
            }

            return stringRepresantation;
        }

        public void setErrorFlag() {
            errorFlag = true;
        }

        public void resetErrorFlag() {
            errorFlag = false;
        }

        public boolean getErrorFlag() {
            return errorFlag;
        }

        public void setMinusFlag() {
            minusFlag = true;
        }

        public void resetMinusFlag() {
            minusFlag = false;
        }

        public boolean getMinusFlag() {
            return minusFlag;
        }

        public void setMemoryFlag() {
            memoryFlag = true;
        }

        public void resetMemoryFlag() {
            memoryFlag = false;
        }

        public boolean getResetFlag() {
            return memoryFlag;
        }
    
        private void shiftRight() {

            for(byte i = (byte)(screenCells.length - 1); i > 0; i--) {
                screenCells[i] = screenCells[i - 1];
            }
            screenCells[0] = '0';
        }    

        private boolean shiftLeft() {

            if(screenCells[0] != '0' || screenCells[1] == DECIMAL_DOT) {
                return false;
            } else {

                for(byte i = 0; i < (byte)(screenCells.length - 2); i++) {
                    screenCells[i] = screenCells[i + 1];
                }
                screenCells[screenCells.length] = '0';
                return true;
            }
        }
    }
}
