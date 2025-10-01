package Qsn2;

import java.util.*;
import java.util.stream.*;

public class filterNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);

        System.out.println("Numbers divisible by 5 are:");
        
        numbers.stream()
               .filter(n -> n % 5 == 0)  
               .forEach(System.out::println);
    }
}
