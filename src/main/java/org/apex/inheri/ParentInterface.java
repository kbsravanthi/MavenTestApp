package org.apex.inheri;

public interface ParentInterface {

	int  data=5;
	//public  void display();
	public default  void display()
	{
		System.out.println("Data in parentInterface class  "+data);
	}
	//public default void foo(){}
	//public void foo();
	
}
