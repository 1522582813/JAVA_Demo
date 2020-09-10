package com.dalv;

    class Pan{
       private int eg = 0;
       private String name = "dalv";
       private int qq = 0;

        public Pan(int eg, String name, int qq) {
            this.eg = eg;
            this.name = name;
            this.qq = qq;
        }

        public int getEg() {
            return eg;
        }

        public void setEg(int eg) {
            this.eg = eg;
        }

        public String getName() {
            return  name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQq() {
            return qq;
        }

        public void setQq(int qq) {
            this.qq = qq;
        }
        public void sc(){
            System.out.println("年龄："+ eg + "，"+ "名称："+ name +","+ "QQ："+ qq);
        }
    }




public class Demo4 {
    public static void main(String[] arrs){
        Pan da = new Pan(18,"dalv11",1522582813);
        da.setEg(10);
        da.sc();
    }
}
