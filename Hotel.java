package practic;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
			 
		Scanner scan = new Scanner(System.in);
		System.out.println("������� 1, ���� � ��� ������; ������� 2, ���� � ��� ���");
		int type = scan.nextInt();
		
		 switch (type) {
			case 1:{         
			    Dog dog = new Dog();
			    dog.hello();
			    dog.say();
			    };
				break;
			case 2:{
	        	Cat cat = new Cat();
			    cat.hello();
			    cat.say();
			    };
				break;
			default:
				System.out.println("����� ������ ��� ��� ������. ��������");
				break;
		 }
		}	 
		 
	static String name;
    static int age;
    static int type;
    
		 public static void hotel () {
		        ArrayList<Animal> animals = new ArrayList<>();
		        if (type == 1) {
		            animals.add(new Dog(name, age));
		        } else if (type == 2) {
		            animals.add(new Cat(name, age));
		        } 
      
}
}

	
	

