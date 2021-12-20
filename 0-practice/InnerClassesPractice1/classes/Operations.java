
package classes;

import static utils.Printer.*;

public class Operations {

    public static Operations.Factorial getFactorial(Integer base) {

        return new Operations.Factorial(base);
    }   
    
    public static class Factorial {

        private Integer base;

        public Factorial(Integer base) {

            setBase(base);
        }

        public void setBase(Integer base) {

            this.base = base;
        }

        public Integer getBase() {
            
            return base;
        }

        public Long getResult() {
            
            return factorial(base);
        }

        private Long factorial(Integer base) {

            if(base < 1) return 0l;
            
            if(base == 1) return 1l;
            else return base * factorial(base - 1);
        }
    }
}

