package practic;

public class Dog extends Animal {
	
	public Dog() {
       super();
    }
	
	 public Dog(String name, int age) {
		 super(name, age);
	    }

	    @Override
	        public void say() {
	        System.out.println("гав");
	    }
	
	
}
