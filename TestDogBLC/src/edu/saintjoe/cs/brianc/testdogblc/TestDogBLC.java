package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	    public String name;//variable
	    
	    public int weight;//variable
	    	    
	    public void setName(String newName) {
	    	name = newName;//method to set a new name
	    }
	    
	    public void setWeight(int newWeight) {
	    	weight = newWeight;//method to set a new weight
	    }
	    

	    public String getName() {
	    	return name;//method to get the object's name
	    }
	    
	    public int getWeight() {
	    	return weight;//method to get the object's weight
	    }
	    
	    public void bark() {//method that makes the dogs bark based on their weight
	    
	    	int pointless = 0;//pointless variable that should be deleted
	    	
	    	
	    	if (weight > 60 ) {//code that does the barking
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    
	    public int setBoth(String newName, int newWeight) {//method that can be used to set a new name and weight at the same time
	    	
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	

	    public void eat() { }//unfinished method that lets the dogs eat
	    
	    public void chaseCat() { }//unfinished method that lets the dogs chase a cat
	}

