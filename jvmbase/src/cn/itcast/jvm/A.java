package cn.itcast.jvm;

/**
 * @author zhouLucus
 * @create 2019-11-08 17:12
 */
public class A {
    public static void a(){
        System.out.println("enter method a");
    }
    public static void b(){
        a();
        System.out.println("enter method b");
    }

    public static void main(String[] args) {
        b();
        System.out.println("enter method main");
    }

}
