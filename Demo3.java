package com.dalv;

/**
 * 方法返回数组
 */
public class Demo3 {
    public static void main(String[] args){
     int[] data = fan();
        sc(data);
}

    public static int[] fan(){   //返回数据方法

        return new int[]{1,2};
    }


    public static void sc(int sc[]){

        for(int x = 0;x < fan().length;x++){
            System.out.println(sc[x]);

        }

    }

}
