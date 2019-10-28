package com.cy.lambda.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * cy
 * 流的筛选与切片
 */
public class FilteringAndSlicingDemo {

    public static void main(String[] args) {

        //数据初始化
         List<Integer>  list =  new ArrayList<>();
         list.add(1);
         list.add(3);
         for (int i = 0; i < 10 ;i ++){
             list.add(i);
             //System.out.println(i);
         }

         //filter：过滤流中的某些元素
        list.stream().filter(s -> s<3)   //1,1,2
                .forEach(System.out::print);
        // limit(n)：获取n个元素
        list.stream().limit(3)
                .forEach(System.out::print);
        //skip(n)：跳过n元素，配合limit(n)可实现分页
        list.stream().skip(2).forEach(System.out::print);
        //distinct：通过流中元素的 hashCode() 和 equals() 去除重复元素
        list.stream().distinct().forEach(System.out::print);

        //综合
        list.stream().filter(s -> s<=6)
                     .distinct()
                     .skip(2)
                      .limit(3).forEach(System.out::println);







    }
}
