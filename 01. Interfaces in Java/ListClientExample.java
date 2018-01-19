/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.interfaces.in.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author martin
 */
public class ListClientExample {
    private List list;
    public ListClientExample() {
        list = new ArrayList();
    }
    private List getList() {
        return list;   
    }
    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        if (list.getClass() == ArrayList.class) {
           System.out.println("The object is an ArrayList"); 
        } else if (list.getClass() == LinkedList.class) {
           System.out.println("The object is an LinkedList"); 
        }
 
    }
}
