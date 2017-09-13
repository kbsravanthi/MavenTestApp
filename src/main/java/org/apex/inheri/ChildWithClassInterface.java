package org.apex.inheri;

public class ChildWithClassInterface extends Parent implements ParentInterface   {
	
	public void display()
	{
		System.out.println("Data in child class");
		super.display();
		
		ParentInterface.super.display();
	}

	
	
}
