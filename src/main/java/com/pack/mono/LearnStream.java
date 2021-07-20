package com.pack.mono;

import java.util.stream.Stream;

public class LearnStream {

    public static void main(String[] args) {

        Stream<Integer> str = Stream.of(1,2,3,4).map(i -> i*2);

        str.forEach(System.out :: println);
    }
}
