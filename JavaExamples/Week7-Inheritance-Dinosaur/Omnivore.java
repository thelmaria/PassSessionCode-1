
import java.util.Scanner;

public class Omnivore extends Dinosaur {
	
	public Omnivore(String name, int age, String habitat, double size, double weight) {
		super(name, age, habitat, size, weight);
	}
	
	public void kill(int amountToKill){
		
		if(amountToKill < 1){
			System.out.println("");
		}else if(amountToKill == 1){
			System.out.println(getName() + " killed " + amountToKill + " small dinosaurs!");
		}else if(amountToKill > 1){
			System.out.println(getName() + " killed " + amountToKill + " small dinosaurs! " 
									+ getName() + " is on a rampage");
		}
	}
	
	@Override
	public void eat() {
		String userInput = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What do you feel like? Leafs or meat? ");
		userInput = keyboard.nextLine();
		if(!(userInput.equalsIgnoreCase("leafs")) || !(userInput.equalsIgnoreCase("meat"))){
			System.out.println("Please enter 'leafs' or 'meat'! ");
			userInput = keyboard.nextLine();
		}else{
			System.out.println(getName() + " ate " + userInput);
		}
	}

}
