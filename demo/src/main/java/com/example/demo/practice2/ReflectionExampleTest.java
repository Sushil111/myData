package com.example.demo.practice2;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionExampleTest {
	
	private ReflectionExampleTest(int x1)
	{
		System.out.println(x1);
	}
	public ReflectionExampleTest()
	{
		
	}
	
	public int x=0;
	private int y=20;
	private String test="Testing";
	static private char ch='K';
	
	private String addValues(int x,int y)
	{
		return String.valueOf(x+y);
	}
	
	public int addValue(int x,int y)
	{
		return (x+y);
	}
	
	public static float subtractValue(float x, float y)
	{
		return x-y;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException, IllegalArgumentException, NoSuchFieldException {
		//Class class1=args.getClass();
		//System.out.println(class1);
		ReflectionExampleTest reflectionExampleTest=new ReflectionExampleTest();
		Class<? extends ReflectionExampleTest> class1=reflectionExampleTest.getClass();
		System.out.println("Class Names :"+class1);
		Method m1[]=class1.getDeclaredMethods();
		/*for (Method m :m1)
		{
			System.out.println("Declared methods of this class :"+m);
			
			
			@SuppressWarnings("rawtypes")
			Class [] s1= m.getParameterTypes();
			for(int j=0;j<s1.length;j++)
			{
				System.out.println(s1[j]);
			}
			System.out.println("Access modifiers :"+Modifier.toString(m.getModifiers()));
			System.out.println("Return Type :"+m.getReturnType());
			
			System.out.println();
		}
		
		Field fieldList[]=class1.getDeclaredFields();
		for(int i=0;i<fieldList.length;i++)
		{
			Field fld=fieldList[i];
			System.out.println("Field Name :"+fld.getName());
			System.out.println("Declaring class name :"+fld.getDeclaringClass());
			System.out.println("Field type :"+fld.getType());
			System.out.println("Modifiers :"+ (Modifier.toString(fld.getModifiers())));
		}
		
		@SuppressWarnings("unchecked")
		Constructor<ReflectionExampleTest>[] ctor=(Constructor<ReflectionExampleTest>[]) class1.getConstructors();
		for(Constructor<?> ctr :ctor)
		{
			//******* -- imp --object creation testing using constructor 
			Object obj =ctr.newInstance();
			System.out.println("New Object creation using constructor for an object :"+obj.toString());
			System.out.println(ctr);
		}
		System.out.println("Test??????????????????????????");
		@SuppressWarnings("unchecked")
		Constructor<ReflectionExampleTest>[] ctr1= (Constructor<ReflectionExampleTest>[]) class1.getDeclaredConstructors();
		for(Constructor<?> ctr :ctr1)
		{
			System.out.println(ctr);
		}
		
		//
		Object arglist[]=new Object[2];
		arglist[0]=50;
		arglist[1]=20;
	  for(Method m :m1)
	  {
		 // System.out.println("Method invocation for :"+ m.invoke(reflectionExampleTest, arglist));
		  if(!m.toString().contains("main"))
		  {
			 // Object obj=m.invoke(reflectionExampleTest, arglist);
			  System.out.println("Method invocation for :"+m+ " "+m.invoke(reflectionExampleTest, arglist));  
		  }
		 
	  }
	  */
		
		//---imp--- setting a field's value of an object using reflection
		Class<?> cls1=Class.forName("com.example.demo.practice2.ReflectionExampleTest");
		Field fld=cls1.getField("x");
		fld.setInt(reflectionExampleTest, 20);
	    System.out.println("x :"+reflectionExampleTest.x);
	    
	    ////creating an array object using reflection
	    
	    
	}

}
