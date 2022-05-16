
package com.ibrusniak.hello;

import javax.swing.JOptionPane;
import com.ibrusniak.factorial.Factorial;

public class Hello {

    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Hello Demo Module");
        int a = 5;
        int b = Factorial.calculate(a);
        System.out.printf("\nFactorial of %d is equal to %d\n", a, b);
    }
}

