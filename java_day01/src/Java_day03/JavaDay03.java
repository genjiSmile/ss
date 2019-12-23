package Java_day03;

/**
 * @author Administrator
 * @version v1.0
 * @date 2019-12-9 14:26:55
 * @description
 **/
public class JavaDay03 {
    public  static void main(String[] args) {
        /**
         * 1整数类型 byte short int long
         * 2浮点类型 float double
         * 3布尔类型 boolean  （true  flase）
         * 4字符类型 char
         */
        //BasicTypes
        Object o = new Object();

        System.out.println("-----Byte-----");
        /**
         * Byte 范围 -128(-2^7)--127(2^7 - 1)
         * 占用内存   8位 1个字节
         */
        System.out.println("-----short-----");
        /**
         * short  范围 -32768（-2^15）--32767(2^15 - 1)
         * 占用内存  16位  2个字节
         */
        System.out.println("-----int-----");
        /**
         * int 范围 -2^31--2^31 - 1
         * 32位   4个字节
         */
        System.out.println("-----long-----");
        /**
         * long 范围 -2^63--2^63-1
         * 64位   8个字节
         */
        System.out.println("----整数类型的自动转换----");
        byte by =50;
        int i =by+20;//20默认是int类型
        System.out.println(i);

        byte by2 = 20;
       // byte by3 = by+by2; // 隐式转换（由低到高）  自动提升为int类型
        int by3 = by+by2;
        System.out.println(by3);

        short sh1=50;
        int sh2=sh1+30;
        System.out.println(sh2);

        int in1=126;
        byte byt1=(byte)in1;//显式转换
        System.out.println(byt1);

        long l=2000L;
        int i1=(int)l;
        System.out.println(i1);


        //FDTypes

        System.out.println("-----float-----");
        /**
         * 范围； -2^128--2^128
         * 占32位 4个字节
         */
        float f=3.1F;
        System.out.println("----donble-----");
        /**
         * 范围：-2^1024--2^1024
         * 占64位 8个字节
         */
        double d=3.14;

        int in2=(int)d;
        System.out.println(in2);//精度损失

        //CBTypes

        char c='A';
        char c2='a';
        char c1='竜';
        int ia=c+0;
        int ib=c2+0;
        int ic=c1+0;
        System.out.println(ia);//A-->65
        System.out.println(ib);//a-->97
        System.out.println(ic);


        boolean flag=false;
        System.out.println(flag);

        if(flag) {
            System.out.println("真");
        }     else{
            System.out.println("假");
        }
        //Transferred Meaning Char（使用转义字符）

        System.out.println("hello\" world");//表示"
        System.out.println("hello \nworld");//表示回车
        System.out.println("hello \'world");//表示'
        System.out.println("hello \r world");//表示换行
        System.out.println("hello \\world");//表示\




        }
    }
