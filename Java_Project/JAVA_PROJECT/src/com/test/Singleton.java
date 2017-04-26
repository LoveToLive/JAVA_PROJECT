package com.test;

public class Singleton {
	
	private static Singleton obj;
	
	private Singleton(){
		
	}
	
	public static Singleton newInstance(){
		if(obj==null){
			obj=new Singleton();
		}
		return obj;
	}
	void display(){
		System.out.println(" I am ShivU from SDM");
	}
}

class SingletonDemo{
	public static void main(String[] args) {
		System.out.println("fsdfs");
		Singleton s=Singleton.newInstance();
		s.display();
	}
}