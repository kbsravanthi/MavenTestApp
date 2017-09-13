package org.apex.inheri;

public interface ParentInterface2 {

	int data=20;
	public default void display()
	{
		System.out.println("Data in parent interface 2 class  "+data);
	}
	//public  void foo();
	//public default void foo() {};
}
