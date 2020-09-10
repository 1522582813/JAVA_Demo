package com.dalv;

public class Demo1 {
    public static void main(String[] args) {
        int data[] = new int[]{11, 85, 4, 97, 5, 45, 44};
        pai(data);
        dy(data);

    }

    public static void pai(int aaa[]) {
        for (int x = 0; x < aaa.length; x++) {
            for (int y = 0; y < aaa.length - 1; y++) {
                if (aaa[y] > aaa[y + 1]) {
                    int haha = aaa[y + 1];
                    aaa[y + 1] = aaa[y];
                    aaa[y] = haha;
                }
            }
        }
    }
    public static void dy(int dy[]){
        for(int x = 0; x< dy.length;x++){
            System.out.println(dy[x]);
        }
    }
}