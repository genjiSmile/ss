package Java_day02;

/**
 * @author Administrator
 * @version v1.0
 * @date 2019-12-5 10:11:01
 * @description
 **/
public class JavaVariable {
    public static void main(String[] args) {
        int salry = 122632;
        double d =1245.234;
                double ses =salry + d;
                System.out.println(ses);
        long  v =15568451232178l;
                System.out.println(v);
        /**
         * byte short int long
         * 浮点   小数
         * float  2^128
         * double 2^1024
         *  boolean  ture false
         * null
         */
        int q=2147483647;//2^31
                long l= System.currentTimeMillis();//获取当前时间毫秒值
        System.out.println("时间（毫秒值）"+l);
        System.out.println("------double-------");

        double pi=3.14;
                int z=8;
                System.out.println("double"+pi*z);



        Xiong xiongda = new Xiong(25,104,true);

        System.out.println("xiongda = " + xiongda);

    }
}