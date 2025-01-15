/**
 * Author:Eda Akyıl
 * User:edaakyil
 * Date:9.12.2024
 * Time:14:56
 */

package com.edaakyil.java;

public class Demo {
    public static void main(String[] args)
    {
        B b = new B(10, 34);
        A a;

        a = b; //upcasting

       ++a.x;
       //++a.y; // error
       ++b.x;
       ++b.y;


    }
}

class C extends B {
    public C(int x, int y)
    {
        super(x, y);
    }

    //public void foo() {}  // error
}

class B extends A {
    int x;
    int y;

    public B(int x, int y)
    {
        super(x);
        this.x = x;
        this.y = y;
    }

    final public void foo() {}
}

class A {
    int x;

    public A(int x)
    {
        this.x = x;
    }

    public void foo() {}
}
