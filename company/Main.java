package com.company;

public class Main {

    public static double[] sort(double[] sortList) { //insert
        for (int i = 1; i < sortList.length; i++) {
            double temp = sortList[i];
            int j = i-1;
            while(j >= 0 && temp < sortList[j]) {
                sortList[j+1] = sortList[j];
                j--;
            }
            sortList[j+1] = temp;
        }
        return sortList;
    }

    public static void main(String[] args) {
        double[] sortList = new double[20];
        for (int i = 0; i<sortList.length; i++) {
            sortList[i] = Math.random()*200-100;
            System.out.println(sortList[i]);
        }
        System.out.println("\n");
        sortList = sort(sortList);
        for (int i = 0; i<sortList.length; i++) {
            System.out.println(sortList[i]);
        }
    }
}
