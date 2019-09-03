package ru.Urakanov;

public class HelloWorld {

	private static HelloWorld helloWorld;
	private String name;

	private HelloWorld(){
		name = "First";
	}
	

	public static HelloWorld getInstance(){
		if (helloWorld == null){
			helloWorld = new HelloWorld();		
		}
		return helloWorld;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}
