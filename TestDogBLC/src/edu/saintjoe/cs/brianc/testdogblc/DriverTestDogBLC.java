package edu.saintjoe.cs.brianc.testdogblc;

public class DriverTestDogBLC {

	public static void main(String[] args) {
		TestDogBLC Dog1 = new TestDogBLC();
		TestDogBLC Dog2 = new TestDogBLC();
		
		Dog1.setName("Bert");//set objects names to Bert and Ernie
		Dog2.setName("Ernie");
		
		Dog1.setWeight(80);//set Bert's weight to 80 and Ernie's to 30
		Dog2.setWeight(30);
		
		Dog1.bark();//both dogs bark
		Dog2.bark();
		
		Dog1.setWeight(5);//change dog's weights
		Dog2.setWeight(7);
		
		Dog1.bark();//both dogs bark
		Dog2.bark();
		
	}

}
