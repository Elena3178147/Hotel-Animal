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
        System.out.print("������� ���: ");
        name = n.nextLine();
                
        Scanner g = new Scanner(System.in);
        System.out.print("������� �������: ");
        age = g.nextInt();
        
        n.close();
        g.close();
        
        System.out.println("����� ����������, " + name);
          
   }
}	
    	

    

