package practic;

import java.util.Scanner;

public abstract class Animal {
    
    String name;
	int age;
	    
	public Animal (String name, int age) {
	this.name = name;
	this.age = age;
	}

	public Animal() {
    }
		
	public void say() {
	}
		
	public void hello () {
		   	
    	Scanner n = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = n.nextLine();
                
        Scanner g = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        age = g.nextInt();
        
        n.close();
        g.close();
        
        System.out.println("Добро пожаловать, " + name);
          
   }
}	
    	

    

