package com.aigui;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AiGui
 * @create 2018-09-04 15:53
 *
 */
public class Template {
    public static final int INT_I = 100;
    public static final int INT_J = 100;
    public static final String STR_I ="dd";

    //psvm
    public static void main(String[] args) {
        int num =10;
        String s0 = "zhong guo ";
        System.out.println("Hello World!!!!");//sout
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("Template.main");//soutm
        System.out.println("num = " + num);//soutv
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
        /*for (String arg : args) {
            System.out.println(arg);
        }*/
        /*for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }*/
        List<String> list = new ArrayList<String>();
        list.add("dffd");
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void  method(){
        List<String> list = new ArrayList<String>();
        list.add("dffd");

        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
