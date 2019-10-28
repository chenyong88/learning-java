package com.cy.lambda.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * cy
 *
 */
public class CreateStreamDemo {

    public static void main(String[] args) {
        //1.使用Collection下的 stream() 和 parallelStream() 方法
        List<String> list = new ArrayList<String>();
        Stream<String> stream  =list.stream();//创建一个串行流
        Stream<String> parallelStream  =list.parallelStream();//创建一个并行流

        //2.使用Arrays 中的 stream() 方法，将数组转成流
        String[] nums = new String[10];
        Stream<String> alist = Arrays.stream(nums);

        //3.使用Stream中的静态方法：of()、iterate()、generate
        //of
        Stream<Integer> streamk = Stream.of(1,2,3,4,5,6);
        //iterate
        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 2).limit(6);
        stream2.forEach(System.out::println); // 0 2 4 6 8 10
        //generate
        Stream<Double> stream3 = Stream.generate(Math::random).limit(2);
        stream3.forEach(System.out::println);


        //4.使用 Pattern.splitAsStream() 方法，将字符串分隔成流
        Pattern pattern = Pattern.compile(",");
        Stream<String> stringStream = pattern.splitAsStream("a,b,c,d");
        stringStream.forEach(System.out::println);


    }
}
