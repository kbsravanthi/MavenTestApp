package org.apex.maven;



	class A
	{
		 private int var;
		 protected int testVar=9;
		 
		 public int getVar() {
			 return var;
		 }
		 public void setVar(int var) {
			 this.var = var;
		 }
		 
		 
			
		 public void methodPub()
		  {
		     System.out.println("Public method of Class A accessible everywhere");
		  }
		 public void methodPri()
		  {
		     System.out.println("Private variable of Class A" +var);
		  }
		  void methodDef()
		  {
		     System.out.println("Default method of Class A extends to package");
		  }
		  protected void methodProtec()
		  {
		     System.out.println("Protected method of Class A extends to inherited child classes");
		  }
		
	}
	class B extends A
	{
	  
	  
	  public void methodB()
	  {
		 //super(var);
	     //super.methodPri();
	  }
	}
	class C extends A
	{
	 public void methodC()
	 {
	 System.out.println("method of Class C");
	 }
	}
	class D extends A
	{
	  public void methodD()
	  {
	     System.out.println("method of Class D");
	     System.out.println("Protected Example test variable in class A "+testVar);
	  }
	}
	public class HierarchicalExample
	{
	  
	  public static void main(String args[])
	  {
		
		  PublicDefaultExample ex = new PublicDefaultExample();		 
		  
		  System.out.println("PublicDefaultExample default variable b "+ex.b);
		

		 B obj1 = new B();
		 obj1.methodPub();
		 
		 
		 obj1.setVar(5);
	     obj1.methodPri();
	     
	     C obj2 = new C();
	     obj2.methodProtec();
	     
	     D obj3 = new D();
	     obj3.methodDef();
	     obj3.methodD();
	  }
	}

