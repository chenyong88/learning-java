package com.cy.lambda.learning;

import java.util.Arrays;
import java.util.List;

/**
 * cc程序员
 *
 */
public class StreamSortDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa", "ff", "dd","bb");
        //sorted 产生一个新流，其中按自然顺序排序
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        People people  =  new People("111",11,"1");
        People people1  =  new People("113",13,"1");
        People people2  =  new People("115",13,"1");
         //
        List<People> list1 =   Arrays.asList(people,people1,people2);
        list1.stream().sorted(
                (p1,p2)  ->{
                    if(p1.getUserNaMme().equals(p2.getUserNaMme())){
                        return  p1.getAge() - p2.getAge();
                    }else {
                        return p1.getUserNaMme().compareTo(p2.getUserNaMme()) ;
                    }
                }
        ).forEach(s ->{
            System.out.println(s.toString());
        });


    }
}
class  People{
    private   String userNaMme;
    private   Integer age;
    private   String  sex;

    public People(String userNaMme, Integer age, String sex) {
        this.userNaMme = userNaMme;
        this.age = age;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserNaMme() {
        return userNaMme;
    }

    public void setUserNaMme(String userNaMme) {
        this.userNaMme = userNaMme;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "userNaMme='" + userNaMme + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
