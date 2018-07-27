import java.util.Scanner;
public class Main {
	static int health = 2;
	static boolean end = false;
	    public static void main(String args[]) {
	      Scanner keyboard = new Scanner(System.in);
	      //boolean end = false;
	      
	      do{

	          missionOne();
	          
	    	  
	      }while(end == false);
	    }
	    
	    public static void startNode(){
	    	
	    	
	    }
	    
	    public static void takeDamage(int damage){
	    	health -= damage;
	    	if(health==1){
	    		System.out.println("You took damage");
	    	}
	    	
	    	else if(health==0){
	    		System.out.println("You took lethal damage");
	    		death();
	    		//System.exit(0);
	    	}
	    }
	    public static void missionOne(){
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("You are a young recruit part of the UNSC's elite group");
	        System.out.println("Your planet has been invaded by an alien race called the Covenant. Your team is specialized to tackle elite threats.");
	        System.out.println("Your first mission is to deal with a threat at the nearby UNSC base. Either \n1) Attack the base\n2) ignore it.");
	        int userInput = keyboard.nextInt();
	        if(userInput == 2){
	        	takeDamage(1);
	        	missionTwo();
	            //death();
	        }
	        else if(userInput == 1){
	            System.out.println("You eliminated the enemy. One of your teammates died in the fight");
	            missionTwo();
	        }
	    }
	    
	    public static void missionTwo(){
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("The UNSC has declared a major war on the Covenent. You are asked to fight in the battle. Either \n1)Fight in the battle \n2) ignore.");
	        int userInput = keyboard.nextInt();
	        if(userInput == 2){
	        	takeDamage(1);
	            missionThree();
	         }   
	        else if(userInput == 1){
	            System.out.println("You won the battle, but sadly one of you teamates died in the battle");
	            missionThree();
	        }
	    }
	        
	    public static void missionThree(){
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Your last mission is to go to the abandoned UNSC base and kill the last remaining Covenents. Either \n1) Stand and fight \n2) run away from the battle");
	        int userInput = keyboard.nextInt();
	        if(userInput == 2){
	        	takeDamage(1);
	            death();
	          }  
	        else if(userInput == 1){
	            System.out.println("You stood in the heat of battle with your team and fought valiantly. You will always be remebered as a hero to the UNSC. They thank you for your sacrifice");
	            System.exit(0);
	        }
	    }
	        
	       
	    public static void death(){
	    	Scanner keyboard = new Scanner(System.in);
	        System.out.println("Game Over.");
	        System.out.println("Play Again? y/n");
	        String input = keyboard.nextLine();
	        if(input.equals("n")){
	            end = true;
	             System.out.println("Thanks for playing!");
	             System.exit(0);
	        }
	        if(input.equals("y")){
	        	health = 2;
	            end = false;
	            missionOne();
	            }
	    }  
	        
	
}