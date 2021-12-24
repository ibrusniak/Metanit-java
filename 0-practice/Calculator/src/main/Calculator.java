
package main;

import utils.Logger;

/**
 * Calculator - class describes calculator
 */
public final class Calculator {

    private Logger logger = new Logger("CLTOR");
    private Screen screen;

    public Calculator(byte screenCapacity) {
        
        screen = new Screen(screenCapacity);
        logger.info("Calculator creted");
    }

    class Screen {

        private boolean minusFlag = false;
        private boolean memoryFlag = false;
        private boolean errorFlag = false;
        private byte[] digits;
        private byte screenCapacity;
        private Logger logger = Calculator.this.logger;

        private int decimalDotAfterPosition = -1;

        public Screen(byte screenCapacity) {

            digits = new byte[screenCapacity];
            this.screenCapacity = screenCapacity;
            logger.info("Calculator's screen created. Number of digits: " + screenCapacity);
        }

        public void addDigit(Byte digit) {
            logger.info("Screen. Add digit " + digit.toString());
        }

        public void removeDigit() {
            logger.info("Screen. Remove digit");
        }

        public void setDecimalDigit() {
            
            if (digits.length == screenCapacity) {
                logger.warning("Attempt to add dot to full screen");
            } else if (digits.length == screenCapacity - 1) {
                logger.warning("Not enought capacity to add digital dot!");
            } else if (decimalDotAfterPosition == -1) {
                logger.warning("Attempt to add dot twice");
            } else {
                decimalDotAfterPosition = digits.length;
                logger.info("Decimal dot has been added after position" + digits.length);
            }
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
    }


}
