package cn.itcast.jvm;

/**
 * @author zhouLucus
 * @create 2019-11-08 17:12
 */

/**
 * java虚拟机栈的 局部变量表中 存放了 编译期 可知的各种基本数据类型
 * (boolean int short byte char double float)
 * 还有对象的引用 (仅仅保存了一个引用而已)
 *
 * 如果线程请求栈的深度大于虚拟机所允许的深度, 将抛出StackOverflowError异常
 */
public class A {
    public static void a(){
        // 局部变量
        int a = 111;
        int b=222;
        // 操作数栈
        int ccc = a*b;
        // 动态链接保存的是 对象的引用
        // 方法出口 就是方法return的值
        System.out.println("enter method a");
    }
    public static void b(){
        // 这个操作将抛出栈溢出异常
//        b();
        a();
        System.out.println("enter method b");
    }

    public static void main(String[] args) {
        b();
        System.out.println("enter method main");
    }

}
