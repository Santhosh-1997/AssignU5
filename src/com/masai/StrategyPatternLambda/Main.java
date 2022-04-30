package com.masai.StrategyPatternLambda;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Computation<Integer>> computations = Arrays.asList(

                (n, m) -> {return n+m; },
                (n, m) -> {return n-m; },
                (n, m) -> {return n*m; }
        );

        computations.forEach(x -> System.out.println(x.compute(2, 2)));

    }
}
