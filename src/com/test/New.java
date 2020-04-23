package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class New {

    public static void main(String[] args) {

    List<Integer> variableList = new ArrayList<>();
    variableList.add(20);
    variableList.add(20);
    variableList.add(31);
    variableList.add(30);
    variableList.add(34);
    variableList.add(30);
    variableList.add(40);
    variableList.add(43);
    variableList.add(40);
    variableList.add(20);
    variableList.add(10);
    variableList.add(11);
    variableList.add(20);
    variableList.add(30);

    Set<Integer> varSet = new HashSet<>();
    for (Integer var: variableList) {
        varSet.add(var);

      }
        System.out.println(variableLists);
        System.out.print(varSet);
    }
}
