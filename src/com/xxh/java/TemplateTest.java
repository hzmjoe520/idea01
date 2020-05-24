package com.xxh.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author xiaohe
 * @date 2020/5/24-11:04
 */
public class TemplateTest {

    //psvm
    public static void main(String[] args) {

        //sout
        System.out.println("hello");
        
        //soutv
        int  num = 100;

        System.out.println("num = " + num);
        
        
        //数据源.fori
        int[] arr  = {20,2,124,5};

        for (int i = 0; i < arr.length; i++) {
            
        }

        //iter
           for (int i : arr) {
            System.out.println("i = " + i);
        }

        //数据源.for
List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("hello");
        for (String s : list) {

        }

       /* for (String s : list) {

        }*/

        Date date  =  new Date();

        Date date1 = new Date();

        //ifn   or   list.ifn
        if (date1 == null) {

        }
        //inn   or list.inn
        if (date1 != null) {

        }

    }
}
