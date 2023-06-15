package chapter10.example2;

import static util.Console.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Kiyv", "London", "Paris", "Berlin", "Washington");
        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext())
            println(iterator.next());

        println();

        Stream<String> st = cities.stream();
        st.filter(x -> x.length() > 4)
          .map(x -> x.toUpperCase())
          .map(x -> {
            String res = "";
            for (int i = x.length() - 1; i >= 0; i--) res += x.charAt(i);
            return res;
          })
          .forEach(util.Console::println);
    }
}