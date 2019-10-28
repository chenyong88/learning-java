package com.cy.lambda.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingDemo {
    public static void main(String[] args) {
//        map(Function f)	接受一个函数作为参数，并将函数应用到每一个元素上，返回新的元素
//        mapToDouble(ToDoubleFunction f)	返回的新元素为double类型
//        mapToInt(ToIntFunction f)	返回的新元素为int类型
//        mapToLong(ToLongFunction f)	返回的新元素为long类型
//        flatMap(Function f)	操作多层嵌套的流，使其扁平化

        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(3);
        for (int i = 0; i < 10 ;i ++){
            list.add(i);
            //System.out.println(i);
        }
        //接受一个函数作为参数，并将函数应用到每一个元素上，返回新的元素
        System.out.println("int :");
        list.stream().map(s -> s.intValue());
        //返回的新元素为double类型
        list.stream().mapToDouble(s -> s.intValue());
        // mapToInt(ToIntFunction f)	返回的新元素为int类型
        list.stream().mapToInt(s -> s.intValue());
        //mapToLong(ToLongFunction f)	返回的新元素为long类型
        list.stream().mapToLong(s-> s).forEach(System.out::print);
        //flatMap(Function f)	操作多层嵌套的流，使其扁平化
        list.stream().flatMap(s ->{
            Stream<String> stream =  Stream.empty();
            return stream;
        });







    }
}
