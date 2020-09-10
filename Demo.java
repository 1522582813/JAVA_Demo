package com.dalv;

/**
 * 数组的倒置操作
 */
public class Demo {
    public static void main(String[] args) {
        int name[] = new int[]{22,48,61,782,146,71,25};
        //数组的倒置操作
        dz(name);
        dy(name);
        }
        public static void dz(int dz[]){
        int len = dz.length / 2;
        int head = 0;
        int foot = dz.length - 1;
          for(int x = 0; x< len; x++){
                int mmb = dz[head];
                 dz[head] = dz[foot];
                 dz[foot] = mmb;
                 head++;
                 foot--;

        }
    }
        public static void dy(int dy[]){
            for(int x = 0; x< dy.length; x++){
                System.out.println(dy[x]);
            }
        }
    }

