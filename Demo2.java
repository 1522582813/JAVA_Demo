package com.dalv;

public class Demo2 {
    public static void main(String[] args) {
        int data[][] = new int[][]{{11, 22, 33}, {44, 55, 66}};
        for (int x = 0; x < data.length; x++) { //遍历行
            for (int y = 0; y < data[x].length; y++) { //遍历一行有多少列
                System.out.print(data[x][y]);
            }
            System.out.println();
        }
    }
}