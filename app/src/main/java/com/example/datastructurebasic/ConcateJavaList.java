package com.example.datastructurebasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by PrernaSurbhi on 04/03/22.
 * program to concat the list in java
 *
 * output
 * list1 addAllFuc: [a]
 * list2 addAllFuc : [b]
 * joined addAllFuc : [a, b]
 * concateStream  : [a, b]
 */
public class ConcateJavaList {
    public static void main(String args[]) {
      List<String> lista = new ArrayList<>();
      lista.add("a");

      List<String> listb = new ArrayList<>();
      listb.add("b");

      List<String>joined = new ArrayList<>();
      addAllFuc(lista,listb,joined);
      concateStream(lista,listb);
    }

    public static void addAllFuc(List<String> a,List<String> b,List<String> joined){
        joined.addAll(a);
        joined.addAll(b);

        System.out.println("list1 addAllFuc: " + a);
        System.out.println("list2 addAllFuc : " + b);
        System.out.println("joined addAllFuc : " + joined);
    }



    public static void concateStream(List<String> a,List<String> b){
        List<String> joined = Stream.concat(a.stream(),b.stream())
                .collect(Collectors.toList());
        System.out.println("concateStream  : " + joined);
    }
}
