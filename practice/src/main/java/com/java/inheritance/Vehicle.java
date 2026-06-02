package com.java.inheritance;

public class Vehicle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }

    abstract public void set();
    
    abstract public void get();

}

class Test extends demo
{

    public void set(int a)
    {
        this.a = a;
    }

    final public void get()
    {
        System.out.println("a = " + a);
    }

    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.set(20);
        obj.get();
    }

	@Override
	public void set() {
		// TODO Auto-generated method stub
		
	}
}
