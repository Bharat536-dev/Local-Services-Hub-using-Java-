import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
class color{
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String MAGENTA = "\u001B[35m";

    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Background colors
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    // More text colors
    public static final String ORANGE = "\u001B[38;5;208m";  
    public static final String PURPLE = "\u001B[38;5;135m"; 
    public static final String PINK = "\u001B[38;5;205m";    
    public static final String TEAL = "\u001B[38;5;78m";   
  
     public static final String BG_SKY_BLUE = "\u001B[38;5;117m";  // Sky blue text
    public static final String BG_ROSE = "\u001B[38;5;211m";       // Rose text
    public static final String BG_LEMON = "\u001B[38;5;227m";      // Lemon text
    public static final String BG_TURQUOISE = "\u001B[38;5;45m";  // Turquoise text

    public static final String BG_GRAY = "\u001B[48;5;236m";  // Gray background
    public static final String BG_GOLD = "\u001B[48;5;220m";  // Gold background
    public static final String BG_LAVENDER = "\u001B[48;5;183m"; // Lavender background
    public static final String BG_SALMON = "\u001B[48;5;209m"; // Salmon background
}

class vegStarters
{	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Food obj = new Food();
	void vegmanchuria(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*150;
	}

	void alu65(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*170;
	}

	void crispyCorn(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*150;
	}

	void vegSpinRools()
	{
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*150;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Veg starter:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      1-Veg-manchuria                -->Rs.150.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      2-Alu65                        -->Rs.170.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      3-CrispyCorn                   -->Rs.170.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      4-VegSpinRolls                 -->Rs.150.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      5-Exit                                    "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			vegmanchuria();
		}
		else if(n1==2){
			alu65();
		}
		else if(n1==3){
			crispyCorn();
		}
		else if(n1==4){
			vegSpinRools();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Veg-Starters Again:\n\t\t\t\t\t2.Bill & Exit:"+color.RESET);
		int n2 = sc.nextInt();
		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Veg-Starters bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;
				obj.food();
			}	
			else{
				Bill1+=Bill;
				obj.food();
			}
		}
	}

}

class nonvegStarters{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Food obj = new Food();
	void ApolloFish(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*240;
	}

	void PrawnsManchuria(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*240;
	}

	void DragonChicken(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*200;
	}

	void ChickenLollipop(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*275;
	}

	void Chicken65(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*200;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Non-veg starter:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      1-ApolloFish                -->Rs.240.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      2-PrawnsManchuria           -->Rs.240.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      3-DragonChicken             -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      4-ChickenLollipop           -->Rs.275.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      5-Chicken65                 -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      6-Exit                                    "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			ApolloFish();
		}
		else if(n1==2){
			PrawnsManchuria();
		}
		else if(n1==3){
			
			DragonChicken();
			
		}
		else if(n1==4){	
			ChickenLollipop();
		}
		else if(n1==5){	
			Chicken65();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Non-VegStarters Again:\n\t\t\t\t\t2.Bill & Exit:"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Non-veg Starters bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1 +=Bill;
				obj.food();
			}
			else{
				Bill1+=Bill;
				obj.food();
			}
		}
	}
}

class vegrices{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Food obj = new Food();
	void vegFiredRice(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*150;
	}

	void vegPalavo(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*180;
	}

	void vegBiriyani(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*200;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Veg rice:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        1-Veg Fried Rice            -->Rs.150.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        2-Veg Palav                 -->Rs.180.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        3-Veg Biriyani              -->Rs.200.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        4-Exit                                  "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			vegFiredRice();	
		}
		else if(n1==2){
			vegPalavo();
		}
		else if(n1==3){
			vegBiriyani();	
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Veg Rices Again\n\t\t\t\t\t2.Bill & Exit"+color.RESET);
		int n2 = sc.nextInt();
		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Veg Rices bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;
				obj.food();
			}
			else{
				Bill1+=Bill;
				obj.food();
			}
		}
	}
}

class nonvegrices{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Food obj = new Food();
	void nonvegFiredRice(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*250;
	}

	void nonvegPalavo(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*280;
	}

	void nonvegBiriyani(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*300;
	
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Non-veg rice:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       1-Chicken Fried Rice               -->Rs.250.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       2-Palav                            -->Rs.280.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       3-Chicken Biriyani                 -->Rs.300.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       4-Exit                                    "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			nonvegFiredRice();
		}
		else if(n1==2){
			nonvegPalavo();
		}
		else if(n1==3){
			nonvegBiriyani();
		}
		
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Non-veg Rices Again:\n\t\t\t\t\t2.Bill & Exit:"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Non-veg Rices bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;
				obj.food();
			}
			else{
				Bill1+=Bill;
				obj.food();
			}
		}
	}
}

class vodka{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Liquids obj = new Liquids();
	void magicMoment(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*800;
	}

	void absoluteVodka(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*3000;
	}

	void greyGoose(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*3500;
	}

	void smirGoof(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*2000;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect an Vodka:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         1-MagicMoment                -->Rs.800.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         2-Absolute Vodka             -->Rs.3000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         3-GreyGoose                  -->Rs.3500.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         4-SmirGoof                   -->Rs.2000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         5-Exit                                      "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			magicMoment();	
		}
		else if(n1==2){
			absoluteVodka();	
		}
		else if(n1==3){
			greyGoose();	
		}
		else if(n1==4){
			smirGoof();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Vodka Again\n\t\t\t\t\t2.Bill & Exit"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Vodka bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;	
				obj.liquids();
			}
			else{
				Bill1+=Bill;
				obj.liquids();
			}
		}
	}
}

class whisky{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Liquids obj = new Liquids();
	void johnnieWalker(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*22000;	
	}

	void jackDaniels(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*2700;	
	}

	void redLable(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*3600;	
	}

	void blackDog(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*1200;	
	}

	void royalGreen(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*800;	
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Whiskey:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        1-JohnnieWalker           -->Rs.22000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        2-JackDaniels             -->Rs.2700.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        3-RedLable                -->Rs.3600.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        4-BlackDog                -->Rs.1200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        5-RoyalGreen              -->Rs.800.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        6-Exit                                        "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		
		int n1 = sc.nextInt();
		if(n1==1){
			johnnieWalker();
		}
		else if(n1==2){
			jackDaniels();	
		}
		else if(n1==3){
			redLable();	
		}
		else if(n1==4){
			blackDog();
		}
		else if(n1==5){
			royalGreen();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Whiskey Again\n\t\t\t\t\t2.Bill & Exit:"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Whisky bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;
				obj.liquids();
			}
			else{
				Bill1+=Bill;
				obj.liquids();
			}
		}
	}
}

class brandy{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Liquids obj = new Liquids();
	void manshinHouse(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*800;
	}

	void morpehous(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*1200;
	}

	void mcDowellis(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*1200;
	}

	void kingLouis(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*8000;
		
	}


	void selection(){
		System.out.println("\t\t\t\t\tSelect a Brandy:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          1-MansionHouse            -->Rs.800.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          2-Morpehous               -->Rs.1200.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          3-McDowellis              -->Rs.1200.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          4-KingLouis               -->Rs.8000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          5-Exit                                    "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		
		int n1 = sc.nextInt();
		if(n1==1){
			manshinHouse();
		}
		else if(n1==2){
			morpehous();
		}
		else if(n1==3){
			mcDowellis();	
		}
		else if(n1==4){
			kingLouis();
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Brandy Again\n\t\t\t\t\t2.Bill & Exit"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Brandy bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;
				obj.liquids();
			}
			else{
				Bill1+=Bill;
				obj.liquids();
			}
		}		
	}
}

class beers{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	Liquids obj = new Liquids();
	void kingFisher(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*170;
	}

	void knockOut(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*150;
	}

	void budwiser(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*200;
	}

	void carlesberg(){
		System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
		int quantity = sc.nextInt();
		Bill+=quantity*200;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Beer:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           1-Carlesberg           -->Rs.170.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           2-KnockOut             -->Rs.150.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           3-Budwiser             -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           4-Carlesberg           -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           5-Exit                                 "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			carlesberg();	
		}
		else if(n1==2){
			knockOut();
		}
		else if(n1==3){
			budwiser();
		}
		else if(n1==4){
			carlesberg();
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Beers Again\n\t\t\t\t\t2.Bill & Exit"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			

			if(Bill!=0){
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t\t\tBilling Details:"+color.RESET);
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				System.out.println(color.CYAN+"\t\t\t\t\t\tYour Beers bill: "+Bill+color.RESET);
				System.out.println();
				System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
				System.out.println();
				Bill1+=Bill;
				obj.liquids();	
				
			}
			else{
				Bill1+=Bill;
				obj.liquids();
			}
		}
	}

}

class Food{
	static Scanner sc = new Scanner(System.in);
	static double Bill;
	static double Bill1;
	static Restuarant1 obj = new Restuarant1();
	Items  item = new Items();
	void food(){
		
		System.out.println("\t\t\t\t\t\t\t\t \u001B[5;97mFood Menu:\u001B[0m");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println(color.BLUE+"\t\t\t\t\t**********************************************************"+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                     1.Veg Starters "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                     2.Non-veg Starters "+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                     3.Veg Rices "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                     4.Non-veg Rices "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                     5-Exit                          "+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println(color.BLUE+"\t\t\t\t\t**********************************************************"+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int f = sc.nextInt();
		if(f==1){
			vegStarters x1 = new vegStarters();
			x1.selection();
			
		}
		else if(f==2){
			nonvegStarters x2 = new nonvegStarters();
			x2.selection();
			
		}
		else if(f==3){
			vegrices x3 = new vegrices();
			x3.selection();
			
		}
		else if(f==4){
			nonvegrices x4 = new nonvegrices();
			x4.selection();
			
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Menu again  "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny other number to exit..."+color.RESET);
			int inv = sc.nextInt();
			if(inv==1){
				food();
			}
			else if(inv==2){
				item.items();
			}
			else{
				
					Bill1 = vegStarters.Bill1+nonvegStarters.Bill1+vegrices.Bill1+nonvegrices.Bill1+vodka.Bill1+whisky.Bill1+brandy.Bill1+beers.Bill1;
					//System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
					if(Bill1!=0){
					LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharath                                       \t       ");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tYour Final Bill is: "+color.RESET+Bill1);
                //System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
					}
					System.out.println();
					System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
					System.out.println();
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
					System.out.println();
					System.out.println();
				
			}
		}
	 }
}

class Liquids{
	static Scanner sc = new Scanner(System.in);
	static double Bill1;
	static Restuarant1 obj = new Restuarant1();
	Items  item = new Items();
	void liquids(){
		System.out.println("\t\t\t\t\t\t\t\t \u001B[5;97mLiquids Menu:\u001B[0m");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println(color.BLUE+"\t\t\t\t\t**********************************************************"+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                        1.Vodka "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                        2.Whiskey "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                        3.Brandy "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                        4.Beers "+color.RESET+"\t\t\t |");
		System.out.println("\t\t\t\t\t|"+color.YELLOW+"                        5-Exit                    "+color.RESET+"\t |");                     
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println(color.BLUE+"\t\t\t\t\t**********************************************************"+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		
		int l = sc.nextInt();
		if(l==1){
			vodka l1 = new vodka();
			l1.selection();
		}
		else if(l==2){
			whisky l2 = new whisky();
			l2.selection();
		}
		else if(l==3){
			brandy l3 = new brandy();
			l3.selection();
		}
		else if(l==4){
			beers l4 = new beers();
			l4.selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Menu Again "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny other number to exit"+color.RESET);
			int inv = sc.nextInt();
			if(inv==1){
				liquids();
			}
			else if(inv==2){
				item.items();
			}
			else{
				
					Bill1 = vegStarters.Bill1+nonvegStarters.Bill1+vegrices.Bill1+nonvegrices.Bill1+vodka.Bill1+whisky.Bill1+brandy.Bill1+beers.Bill1;
					//System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
					if(Bill1!=0){
					LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharath                                       \t       ");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tYour Final Bill is: "+color.RESET+Bill1);
                //System.out.println("\t\t\t\t\t"+color.CYAN+"Your Final Bill is: "+Bill1+color.RESET);
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
					}
					System.out.println();
					System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
					System.out.println();
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
					System.out.println();
					System.out.println();
				
			}
		}
	}
}

class Items{
	static Scanner sc = new Scanner(System.in);
	static double Bill1;
	static restuarant res = new restuarant();
	void items(){
		System.out.println("\t\t\t\t\t\u001B[4mSelect an option:\u001B[0m");
		System.out.println();
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println();
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t1.Foods"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t\t2.Liquids"+color.RESET);
		System.out.println();
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");

		int it = sc.nextInt();
		if(it==1){
			Food it1 = new Food();
			it1.food();
		}
		else if(it==2){
			Liquids it2 = new Liquids();
			it2.liquids();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny other number to exit..."+color.RESET);
			int inv = sc.nextInt();
			if(inv==1){
				items();
			}
			else if(inv==2){
				res.restuarant();
			}
			else{
				
					Bill1 = vegStarters.Bill1+nonvegStarters.Bill1+vegrices.Bill1+nonvegrices.Bill1+vodka.Bill1+whisky.Bill1+brandy.Bill1+beers.Bill1;
					//System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
					if(Bill1!=0){
					LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharath                                       \t       ");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tYour Final Bill is: "+color.RESET+Bill1);
                //System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
					}
					System.out.println();
					System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
					System.out.println();
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
					System.out.println();
					System.out.println();
				
			}
		}
	}
}


class Restuarant1{
	static Scanner sc = new Scanner(System.in);
	static double Bill1;
	static restuarant res = new restuarant();
	
	void restuarant1(){
		String str1="CHAITANYA BAR & RESTAURANT";
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    WELCOME TO CHAITANYA BAR & RESTAURANT          "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t       KPHB PHASE 1,NEAR METRO STATION          "+color.RESET);
		System.out.println(color.RED+"\t\t\t\t\t\t           ---------------------------------------"+color.RESET);
		System.out.println();
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println();
		System.out.println(color.YELLOW+"\t\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t\t2.For other options"+color.RESET);
		System.out.println();
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int r1 = sc.nextInt();
		if(r1==1){
			Items r11 = new Items();
			r11.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny other number to exit"+color.RESET);
			int inv = sc.nextInt();
			if(inv==1){
				restuarant1();
			}
			else if(inv==2){
				res.restuarant();
			}
			else{
				
					Bill1 = vegStarters.Bill1+nonvegStarters.Bill1+vegrices.Bill1+nonvegrices.Bill1+vodka.Bill1+whisky.Bill1+brandy.Bill1+beers.Bill1;
					//System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
					if(Bill1!=0){
					LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharath                                       \t       ");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tYour Final Bill is: "+color.RESET+Bill1);
                //System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
					}
					System.out.println();
					System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
					System.out.println();
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
					System.out.println();
					System.out.println();
				
			}
		}
	}
}
class Restuarant2{
	static Scanner sc = new Scanner(System.in);
	static double Bill1;
	static restuarant res = new restuarant();
	void restuarant2(){
		String str2="SITARA GRAND BAR & RESTAURANT";
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    WELCOME TO SITARA GRAND BAR & RESTAURANT          "+color.RESET);
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        KPHB PHASE 1,NEAR TRENDS STORE          "+color.RESET);
		System.out.println(color.RED+"\t\t\t\t\t\t           ------------------------------------------"+color.RESET);
		System.out.println();
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println();
		System.out.println(color.YELLOW+"\t\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t\t2.For other options"+color.RESET);
		System.out.println();
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int r2 = sc.nextInt();
		if(r2==1){
			Items r21 = new Items();
			r21.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restaurant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny other number to exit "+color.RESET);
			int inv = sc.nextInt();
			if(inv==1){
				restuarant2();
			}
			else if(inv==2){
				res.restuarant();
			}
			else{
				
					Bill1 = vegStarters.Bill1+nonvegStarters.Bill1+vegrices.Bill1+nonvegrices.Bill1+vodka.Bill1+whisky.Bill1+brandy.Bill1+beers.Bill1;
					//System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
					if(Bill1!=0){
					LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharath                                       \t       ");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tYour Final Bill is: "+color.RESET+Bill1);
                //System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
					}
					System.out.println();
					System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
					System.out.println();
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
					System.out.println();
					System.out.println();
				
			}
		}
	}
}
class restuarant{
	static Scanner sc = new Scanner(System.in);
	static double Bill1;
	static restuarant res = new restuarant();
	void restuarant()  {
		System.out.println();

System.out.println("\t\t\t                                                "+color.CYAN+"&PP&"+color.RESET);
System.out.println("\t\t\t                  "+color.CYAN+"&&&&&&&&&&&&&&&&&&&&&&&&@@&#Y!!YY!!Y#&&&&&&&&&&&&&&&&&&&&&&&&&&&"+color.RESET);
System.out.println("\t\t\t               "+color.CYAN+"#5!!77777777777777777777??!::~7PBGYYBBP7~::!??77777777777777777777!!5#"+color.RESET);
System.out.println("\t\t\t            "+color.CYAN+"BJ!!Y#@@@@@@@@@@@@@@@@@@@@&P7~?G#GJ!?GG?!JG#G?~7P&@@@@@@@@@@@@@@@@@@@&#Y!!JB&"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"&G?!7P&@@@@@@@@@@@@@@@@@@@@#57!JB&P!.:75GPGG57:.!P&BJ!75#@@@@@@@@@@@@@@@@@@@@&P7!?G&"+color.RESET);
System.out.println("\t\t\t     "+color.CYAN+"#5~:!YB&&&#################BJ^^?P#&&#YJJYJJJJJJJYYJJY#&&#P?^^JB#################&&&BY!:!5#"+color.RESET);
System.out.println("\t\t\t     "+color.CYAN+"Y77:^JJJJJJJJ??JJJJJJ??JJJJ?77^:?JJJJYYJJJYYYYYYJJYYYJJJJJ:^77?JJJJ??JJJJJJJ?JJJJJJJJ^:7!Y"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@#GGGGG&@&GGGGG#@@BGGGGB@ "+color.RESET+":"+color.GREEN+"@&GGGGGB@@BGGGGB@@#GGGGG&@"+color.RESET+" "+color.GREEN+"7@BGGGGB@@#GGGGG&@&GGGGG#@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"       RESTAURANT       "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@&BGGBB&@&BBBBB#@@#BGGB#@ "+color.RESET+":"+color.GREEN+"@@@@?~??77???7??77??~?@@@@"+color.RESET+" "+color.GREEN+"7@#BGBB#@@#BGBBB&@&BBBGB&@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+""+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"                       "+color.GREEN+"@ "+color.RESET+":"+color.GREEN+"@"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"                        "+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+":^"+color.RESET+color.GREEN+"BBBBBBBBBBBBBBB#BB#BBBB## "+color.RESET+":"+color.GREEN+"BBBB:^#BBBBBBBBBBBB#^:BBBB"+color.RESET+" "+color.GREEN+"~##BBBB#BB#BBBB#BBBBBBBB#B"+color.RESET+color.CYAN+"~~"+color.RESET);
System.out.println("\t\t\t      "+color.CYAN+"^:JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ:^"+color.RESET);
System.out.println("\t\t\t      "+color.CYAN+"7~????????????????????????????????????????????????????????????????????????????????????~7"+color.RESET);
System.out.println("\t\t\t        "+color.CYAN+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+color.RESET);

System.out.println();
	
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t\u001B[7m"+"\u001B[3m"+"1.CHAITANYA BAR & RESTAURANT\u001B[0m"+color.RESET);
		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t\u001B[7m"+"\u001B[3m"+"2.SITARA GRAND BAR & RESTAURANT\u001B[0m"+color.RESET);
		//System.out.println("\t\t\t\t\t     -----------------------------------------------------------");
		int r = sc.nextInt();
		if(r==1){
			Restuarant1 r1 = new Restuarant1();
			r1.restuarant1();
		}
		else if(r==2){
			Restuarant2 r2 = new Restuarant2();
			r2.restuarant2();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\t2.Bill & Exit"+color.RESET);
			int inv = sc.nextInt();
			if(inv==1){
				res.restuarant();
			}
			else{
				
					Bill1 = vegStarters.Bill1+nonvegStarters.Bill1+vegrices.Bill1+nonvegrices.Bill1+vodka.Bill1+whisky.Bill1+brandy.Bill1+beers.Bill1;
					//System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
					if(Bill1!=0){
					LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharath                                       \t       ");
                //System.out.println(color.CYAN+"\t\t\t\t\tYour Final Bill is: "+Bill1+color.RESET);
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tYour Final Bill is: "+color.RESET+Bill1);
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
				}
					
					System.out.println();
					System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
					System.out.println();
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
					System.out.println();
					System.out.println();
				
			}
		}
	}
}
class Course
{
    String name;
    double cost;
    int duration;
    boolean enrolled;

    Course(String name, double cost, int duration)
    {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
        this.enrolled = false;
    }

    void enroll()
    {
        this.enrolled = true;
    }
}

class Institute
{
    String name;
    String location;
    Course course1 = null;
    Course course2 = null;
    Course course3 = null;
    Course course4 = null;
    Course course5 = null;
    Course course6 = null;
    Course course7 = null;

    Institute(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    void addCourse(int courseNumber, Course course)
    {
        switch (courseNumber)
        {
            case 1:
                course1 = course;
                break;
            case 2:
                course2 = course;
                break;
            case 3:
                course3 = course;
                break;
            case 4:
                course4 = course;
                break;
            case 5:
                course5 = course;
                break;
            case 6:
                course6 = course;
                break;
            case 7:
                course7 = course;
                break;
        }
    }

    Course getCourse(int courseNumber)
    {
        switch (courseNumber)
        {
            case 1:
                return course1;
            case 2:
                return course2;
            case 3:
                return course3;
            case 4:
                return course4;
            case 5:
                return course5;
            case 6:
                return course6;
            case 7:
                return course7;
            default:
                return null;
        }
    }
}

class Institutes
{	static Scanner sc = new Scanner(System.in);
   	void institutes() 
    {
        

        while (true)
        {
	   
	     
	    System.out.println(color.RED+"\t\t\t\t\t\t\t\t\t\u001B[3mINSTITUTES\u001B[0m"+color.RESET);
	    System.out.println();
System.out.println("\t\t\t\t																							                              "                        );
System.out.println("\t\t\t\t																							                              "			               );
System.out.println("\t\t\t\t			                                                          @@@@@@@@@@                                          "			               );
System.out.println("\t\t\t\t			                                                    @@@@@@@@@@@@@@@@@@@@@@@                                   "			               );
System.out.println("\t\t\t\t			                                               @@@@@@@@@@@@@@         @@@@@@@@@@@                             "			               );
System.out.println("\t\t\t\t			                                               @ @@@@@@@                @@@@@@@@@@@                           "			               );
System.out.println("\t\t\t\t			                                              @ @  @@@@@@@@@@@@@@@@@@@@@@@@@@@@                               "			               );
System.out.println("\t\t\t\t			                                             @ @   @@@@@@   @@@@@@@   @@@@@@                                  "			               );
System.out.println("\t\t\t\t			                                           @@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@                                  "			               );
System.out.println("\t\t\t\t			                                                    @@@@@@@@@@&&&&&@@@@@B@@                                   "			               );
System.out.println("\t\t\t\t			                                                      @@@               @@@                                   "			               );
System.out.println("\t\t\t\t			                                                       @@@@           @@@@                                    "			               );
System.out.println("\t\t\t\t			                                                        @@@@@       @@@@@                                     "			               );
System.out.println("\t\t\t\t			                                                         @@@@@@@@@@@@                                         "			               );
System.out.println("\t\t\t\t			                                                     @@@@@@@@@@@@@@@@@@@@                                     "			               );
System.out.println("\t\t\t\t			                                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@                                 "			               );
System.out.println("\t\t\t\t			                                              @@@@@       @@@@@@@@@@       @@@@@                              "			               );
System.out.println("\t\t\t\t			                                             @@@@@      @@@@@@@@@@@@@@       @@@@@                            "			               );
System.out.println("\t\t\t\t			                                   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                  "			               );
System.out.println("\t\t\t\t			                                   HHHHHHHH                                        HHHHHHHHH                  "			               );
System.out.println("\t\t\t\t			                                   HHHHHHHH                ACHIEVER                HHHHHHHHH                  "			               );
System.out.println("\t\t\t\t			                                   HHHHHHHH                                        HHHHHHHHH                  "			               );
System.out.println("\t\t\t\t			                                   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                  "			               );
System.out.println("\t\t\t\t			                                   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                  "			               );
System.out.println("\t\t\t\t			                                         HHHH                                 	HHHH                          "			               );
System.out.println("\t\t\t\t			                                         HHHH                                 	HHHH                          "			               );
System.out.println("\t\t\t\t			                                         HHHH                                 	HHHH                     	  "			               );
System.out.println("\t\t\t\t			                                         HHHH              CVCORP               HHHH                     	  "			               );
System.out.println("\t\t\t\t			                                         HHHH                                 	HHHH                     	  "			               );
System.out.println("\t\t\t\t			                                         HHHH                                 	HHHH                      	  "			               );
System.out.println("\t\t\t\t			                                         HHHH                                 	HHHH                      	  "			               );
System.out.println("\t\t\t\t			                                         HHHHH@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@HHHHH                    	  "			               );
System.out.println("\t\t\t\t			                                         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                      	  "			               );
System.out.println("\t\t\t\t			                																							  "			               );
System.out.println("\t\t\t\t																							                              "			               );
System.out.println();
            System.out.println(color.BLUE + "\t\t\t\t\t\tSELECT AN INSTITUTE:" + color.RESET);
            System.out.println("\t\t\t\t\t\t1. " +color.GREEN + "CV CORP" + color.RESET + " (\u001B[5;31mLocation: 3rd Floor, Yathi Towers, Rd Number 1, beside SBI, KPHB\u001B[0m)");
            System.out.println("\t\t\t\t\t\t2. " +color.RED + "VCUBE" +color.RESET +" (\u001B[5;32mLocation: 2nd Floor, above Raymond's Clothing Store, KPHB Phase 1\u001B[0m)");
            System.out.println("\t\t\t\t\t\t3. " +color.YELLOW + "QSPIDERS" +color.RESET + " (\u001B[5;36mLocation: Metro station, QSpiders 2nd floor, No.222/MIG, Rd number 2 KPHB Phase 1,near KPHB\u001B[0m)");
            System.out.println("\t\t\t\t\t\t4. " +color.CYAN + "HARSHA TRAININGS" +color.RESET + " (\u001B[5;33mLocation: 5th Floor, AED Hospital, MIG-73, Rd Number 1, KPHB Phase 1\u001B[0m )");
            System.out.println("\t\t\t\t\t\t5. " +color.BLUE + "AAA CORP" +color.RESET + " (\u001B[5;35mLocation: KPHB ROAD NO:1 near metro station\u001B[0m)");
            System.out.println("\t\t\t\t\t\t6. " +color.RED+"Exit"+color.RESET);

            int instituteChoice = sc.nextInt();
            Institute selectedInstitute = null;

            if (instituteChoice == 6)
            {
                break;
            }

            switch (instituteChoice)
            {
                case 1:
                    selectedInstitute = new Institute("CV CORP", "3rd Floor, Yathi Towers, Rd Number 1, beside SBI, KPHB");
                    selectedInstitute.addCourse(1, new Course("JAVA FULL-STACK", 35000.0, 6));
                    selectedInstitute.addCourse(2, new Course("APTITUDE & COMMUNICATION", 22000.0, 4));
                    selectedInstitute.addCourse(3, new Course("APTITUDE & CORE JAVA", 25000.0, 5));
                    selectedInstitute.addCourse(4, new Course("SQL & TESTING", 24000.0, 4));
                    selectedInstitute.addCourse(5, new Course("PYTHON FULL-STACK", 30000.0, 5));
                    selectedInstitute.addCourse(6, new Course("WEB DEVELOPMENT", 20000.0, 3));
         
                    break;
                case 2:
                    selectedInstitute = new Institute("VCUBE", "2nd Floor, above Raymond's Clothing Store, KPHB Phase 1");
                    selectedInstitute.addCourse(1, new Course("APTITUDE & CORE JAVA", 20000.0, 4));
                    
                    selectedInstitute.addCourse(2, new Course("CLOUD COMPUTING", 20000.0, 3));
                    selectedInstitute.addCourse(3, new Course("SQL & TESTING", 25000.0, 4));
                   
                    selectedInstitute.addCourse(4, new Course("JAVA FULL-STACK", 32000.0, 6));
                   
                    break;
                case 3:
                    selectedInstitute = new Institute("QSPIDERS","Metro station,QSpiders 2nd floor,No.222/MIG,Rd number 2 KPHB");
      
                    selectedInstitute.addCourse(1, new Course("JAVA FULL-STACK", 25000.0, 6));
                 
                    selectedInstitute.addCourse(2, new Course("APTITUDE & CORE JAVA", 22000.0, 5));
                   
                    selectedInstitute.addCourse(3, new Course("WEB DEVELOPMENT", 20000.0, 3));
                   
                    break;
                case 4:
                    selectedInstitute = new Institute("HARSHA TRAININGS", "5th Floor, AED Hospital, MIG-73, Rd Number 1,KPHB Phase 1");
                    
                    selectedInstitute.addCourse(1, new Course("APTITUDE & CORE JAVA", 20000.0, 4));
                    selectedInstitute.addCourse(2, new Course("WEB DEVELOPMENT", 20000.0, 3));
                    selectedInstitute.addCourse(3, new Course("JAVA FULL-STACK", 45000.0, 6));
                    break;
                case 5:
                    selectedInstitute = new Institute("AAA CORP", "KPHB ROAD NO:1 near metro station");
                    
                    selectedInstitute.addCourse(1, new Course("PYTHON FULL-STACK", 35000.0, 5));
                   
                    selectedInstitute.addCourse(2, new Course("JAVA FULL-STACK", 25000.0, 6));
                  
                    selectedInstitute.addCourse(3, new Course("APTITUDE & CORE JAVA", 22000.0, 5));
                   
                    break;
                default:
                    System.out.println(color.RED+"\t\t\t\t\t\tInvalid Institute choice. Exiting."+color.RESET);
                    return;
            }

            double totalCost = 0.0;

            System.out.println("\t\t\t\t\t\tWelcome to " +color.GREEN + selectedInstitute.name +color.RESET + " (Location: " +color.GREEN + selectedInstitute.location +color.RESET + ")");

            while (true)
            {
                int courseNumber = 1;

                for (int i = 1; i <= 5; i++)
   		{
                    Course selectedCourse = selectedInstitute.getCourse(i);
                    if (selectedCourse != null)
		    {
                        System.out.println("\t\t\t\t\t\t"+courseNumber + ". " +color.GREEN + selectedCourse.name +color.RESET + " - RS." + selectedCourse.cost + " - Duration: " + selectedCourse.duration + " months");
                        courseNumber++;
                    }
                }

                System.out.println("\t\t\t\t\t\t"+courseNumber + ".Go back to institute selection");
                int courseChoice = sc.nextInt();

                if (courseChoice == courseNumber)
		{
                    break;
                }

                if (courseChoice >= 1 && courseChoice <= 7)
		{
                    Course selectedCourse = selectedInstitute.getCourse(courseChoice);

                    if (selectedCourse != null)
		    {
                        if (!selectedCourse.enrolled)
			{
                            selectedCourse.enroll();
                            totalCost += selectedCourse.cost;
                            System.out.println("\t\t\t\t\t\tEnrolled in " +color.GREEN + selectedCourse.name +color.RESET + " - RS." + selectedCourse.cost + " - Duration: " + selectedCourse.duration + " months");
                        } 
			else if (selectedCourse.enrolled)
			{
                            System.out.println("\t\t\t\t\t\t\u001B[5;32mYou are already enrolled in \u001B[0m" +"\u001B[5;32m"+color.GREEN + selectedCourse.name +color.RESET+"\u001B[0m");
                        }
                    } 
		    else
		    {
                        System.out.println(color.RED+"\t\t\t\t\t\tCourse not available. Please try again."+color.RESET);
                    }
                } 
		else
		{
                    System.out.println(color.RED+"\t\t\t\t\t\tInvalid course choice."+color.RESET+color.GREEN+" Please select a valid course."+color.RESET);
                }

                System.out.println("\t\t\t\t\t\tDo you want to enroll in other courses? (" +color.YELLOW + "yes/any key for No" +color.RESET + ")");
                String continueChoice = sc.next().toLowerCase();

                if (!continueChoice.equals("yes"))
		{
                    break;
                }
            }

            if (totalCost > 0.0)
	    {
                boolean paymentSuccessful = false;
                while (!paymentSuccessful)
		{
                    System.out.println(color.PINK+"\t\t\t\t\t\tPlease make the payment."+color.RESET);
                    System.out.println("\t\t\t\t\t\tSelect a UPI method for payment:");
                    System.out.println("\t\t\t\t\t\t1. " +color.CYAN + "Google Pay" +color.RESET);
                    System.out.println("\t\t\t\t\t\t2. " +color.CYAN + "PhonePe" +color.RESET);
                    System.out.println("\t\t\t\t\t\t3. " +color.CYAN + "Paytm" +color.RESET);
                    int paymentChoice = sc.nextInt();
			
                    switch (paymentChoice) {
                        case 1:
			
			     System.out.println(color.YELLOW+"\t\t\t\t\t\tProcessing payment..."+color.RESET);
                             try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
                            System.out.println(color.GREEN + "\t\t\t\t\t\t\u001B[5;32mPAYMENT SUCCESSFUL!!!\u001B[0m" +color.RESET);
			    
                            System.out.println("\t\t\t\t\t\tPaid RS." + totalCost + " using Google Pay.");
                            System.out.println();
                            paymentSuccessful = true;
                            break;
                        case 2:
                           System.out.println(color.YELLOW+"\t\t\t\t\t\tProcessing payment..."+color.RESET);
try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
                            System.out.println(color.GREEN + "\t\t\t\t\t\t\u001B[5;32mPAYMENT SUCCESSFUL!!!\u001B[0m" +color.RESET);
			    
                            System.out.println("\t\t\t\t\t\tPaid RS." + totalCost + " using PhonePe.");
                            System.out.println();
                            paymentSuccessful = true;
                            break;
                        case 3:
                            	System.out.println(color.YELLOW+"\t\t\t\t\t\tProcessing payment..."+color.RESET);
try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
                            System.out.println(color.GREEN + "\t\t\t\t\t\t\u001B[5;32mPAYMENT SUCCESSFUL!!!\u001B[0m" +color.RESET);
			   
                            System.out.println("\t\t\t\t\t\tPaid RS." + totalCost + " using Paytm.");
                            System.out.println();
                            paymentSuccessful = true;
                            break;
                        default:
                            System.out.println(color.RED+"\t\t\t\t\t\t\u001B[5;31mInvalid payment method. Please select a valid payment method.\u001B[0m"+color.RESET);
                            break;
                    }
                }
		 
                LocalDateTime currentTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		System.out.println("\t\t\t\t\t*------------------------------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.RED+"\tBilling Details:"+color.RESET+                                                       color.BRIGHT_WHITE+"\t\t\t\t\t\t       "+color.RESET);
		System.out.println("\t\t\t\t\t*------------------------------------------------------------------------------*");
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Bharat Kumar                                       \t       ");
                System.out.println(color.CYAN+"\t\t\t\t\t"+color.BRIGHT_WHITE+color.RESET+color.CYAN+"\tInstitute: "+color.RESET+ selectedInstitute.name+"\t\t\t\t\t\t       ");
                System.out.println(color.CYAN+"\t\t\t\t\t"+color.BRIGHT_WHITE+color.RESET+color.CYAN+"\tLocation: "+color.RESET+  selectedInstitute.location+"      ");
System.out.println(color.CYAN + "\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBilling Date and Time: " + color.RESET + formattedTime+"\t\t\t       ");
                System.out.println(color.CYAN+"\t\t\t\t\t"+color.BRIGHT_WHITE+color.RESET+color.CYAN+"\tEnrolled Courses:"+color.RESET+"\t\t\t\t\t\t       ");
	
                for (int i = 1; i <= 7; i++)
		{
                    Course enrolledCourse = selectedInstitute.getCourse(i);
                    if (enrolledCourse != null && enrolledCourse.enrolled)
	            {
                        System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+color.RESET+"\t"+color.GREEN + enrolledCourse.name +color.RESET + " - RS." + enrolledCourse.cost + " - Duration: " + enrolledCourse.duration + " months                    ");
                    }
                }
                System.out.println(color.CYAN+"\t\t\t\t\t"+color.BRIGHT_WHITE+color.RESET+color.CYAN+"\tTotal Cost: "+color.RESET+"RS."+ totalCost+"\t\t\t\t\t\t       ");
		System.out.println("\t\t\t\t\t*------------------------------------------------------------------------------*");
            }

            System.out.println("\t\t\t\t\t\tDo you want to enroll in another institute? (" +color.YELLOW + "yes/any key for No" +color.RESET + ")");
            String enrollAnotherInstitute = sc.next().toLowerCase();
            if (!enrollAnotherInstitute.equals("yes"))
	    {
                break;
            }
        }

        System.out.println(color.YELLOW+"\t\t\t\t\t\t              \u001B[5;33mTHANK YOU FOR USING OUR SERVICE!\u001B[0m"+color.RESET);
	System.out.println();
	System.out.println();
    }
}

class Arjun{
    static Scanner sc=new Scanner(System.in);
    void Select()
    {
        String th="\t\t\t\t\t\t   *WELCOME TO ARJUN THEATER*   ";
        System.out.print("\t\t");
        System.out.print("\u001B[103m");
        System.out.print("\u001B[31m");
        for(int i=0;i<th.length();i++)
        {
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
        }
        System.out.print(th.charAt(i));
        }
        System.out.println("\u001B[0m");
        System.out.println();
        System.out.println(color.BLUE+"\t\t\t\t\t\tMovie Name"+color.RESET+"\n"+"\t\t\t\t\t\t"+color.GREEN+"1.KUSHI"+color.RESET+"\n\t\t\t\t\t\t"+color.GREEN+"2.SKANDHA"+color.RESET);
        int a=sc.nextInt();
        if(a==1){
	System.out.println("\t\t\t\t\t\tSelect a Date:");
        System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.09/10/23\n\t\t\t\t\t\t2.10/10/23\n\t\t\t\t\t\t3.11/10/23\n\t\t\t\t\t\t4.12/10/23");
        int n=sc.nextInt();
        String s="KUSHI";
        if(n==1)
        {
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TODAY(s,n1);
        }
        else if(n==2){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TOMMOROW(s,n1);
        }
        else if(n==3){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day3(s,n1);
        }
        else if(n==4){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day4(s,n1);
        }
        else{
            System.out.println("\t\t\t\t\t\tInvalid Selection");
            Select();
        }
	}
        else if (a==2){
	    System.out.println("\t\t\t\t\t\tSelect a Date:");
            System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.09/10/23\n\t\t\t\t\t\t2.10/10/23\n\t\t\t\t\t\t3.11/10/23\n\t\t\t\t\t\t4.12/10/23");
        int n=sc.nextInt();
        String s="SKANDHA";
        if(n==1)
        {
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TODAY(s,n1);
        }
        else if(n==2){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TOMMOROW(s,n1);
        }
        else if(n==3){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day3(s,n1);
        }
        else if(n==4){
             System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day4(s,n1);
        }
        else{
            System.out.println("\t\t\t\t\t\tInvalid Selection");
            Select();
        }
            
        }
        else{
            System.out.println("\t\t\t\t\t\tInvalid Movie Selection");
            
        }
    }
      void TODAY(String a,int c){
	    System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","9:45PM",a,n1,c);
            }
        }
        void TOMMOROW(String a,int c){
		    System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","9:45PM",a,n1,c);
            }
        }
        void Day3(String a,int c){
		    System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","2:30PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","9:45PM",a,n1,c);
            }
        }
        void Day4(String a,int c){
		    System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","11:30PM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","9:45PM",a,n1,c);
            }
        }
        
        void Confirmation(String a,String b,String d,int c,int n1){
            System.out.println("\u001B[36m"+"\t\t\t\t\t\t1.Confirm\n\t\t\t\t\t\t2.Cancel");
            int n=sc.nextInt();
            if(n==1){
		    int paymentMethod;
            do {
                System.out.println(color.PINK+"\t\t\t\t\t\tPlease make the payment."+color.RESET);
		System.out.println(color.CYAN+"\t\t\t\t\t\tSelect a UPI method"+color.RESET);
                System.out.println("\t\t\t\t\t\t1. G-PAY");
                System.out.println("\t\t\t\t\t\t2. PHONEPE");
                System.out.println("\t\t\t\t\t\t3. PAYTM");
                paymentMethod = sc.nextInt();
                if (paymentMethod < 1 || paymentMethod > 3) {
                    System.out.println(color.RED+"\t\t\t\t\t\tInvalid Payment Method. Please enter a valid payment method."+color.RESET);
                }
            } while (paymentMethod < 1 || paymentMethod > 3);

            if (paymentMethod == 1) {
                System.out.println(color.GREEN+"\t\t\t\t\t\tPayment Successful with G-PAY"+color.RESET);
		try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
            } else if (paymentMethod == 2) {
                System.out.println(color.GREEN+"\t\t\t\t\t\tPayment Successful with PHONEPE"+color.RESET);
		try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
            } else if (paymentMethod == 3) {
                System.out.println(color.GREEN+"\t\t\t\t\t\tPayment Successful with PAYTM"+color.RESET);
	         try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
            }
                System.out.println(color.CYAN+"\t\t\t\t\t\tBooking Successful"+color.RESET);
		System.out.println();
		System.out.print(color.RED+"\t\t\t\t\t\tTAKE YOUR TICKET"+color.RESET);
               System.out.println("\t\t"+"\u001B[32m");
	        String border = "\t\t\t\t\t\t+-------------------------------------------------+";

            System.out.println(border);
            System.out.println("\t\t\t\t\t\t|                 ARJUN THEATER                   |");
            System.out.println("\t\t\t\t\t\t|               TICKET INFORMATION                |");
            System.out.println("\t\t\t\t\t\t|                                                 |");
            System.out.println(border);
            System.out.println("\t\t\t\t\t\t| Movie Name: " + d + " Booking Date: " + LocalDate.now()+"\t  |");
            System.out.println("\t\t\t\t\t\t| Date: " + a + "             Show Time: " + b+"\t  |");
            System.out.println("\t\t\t\t\t\t| Amount---------" + c + "*" + n1+"\t\t\t\t  |");
            System.out.println("\t\t\t\t\t\t| Total Amount-------" + c * n1+"\t\t\t  |");
            System.out.print("\t\t\t\t\t\t| Seat Numbers: ");
                for(int i=1;i<=c;i++){
                System.out.print(10+(int)(Math.random()*9)+" ");
            }
	    System.out.print("\t\t\t  |");
	    System.out.println();
            System.out.println(border);
            System.out.println("\u001B[36m"+"\t\t"+"\t\t\t\t\t\t  Enjoy the Show!");
            }
            else{
                System.out.println("\t\t\t\t\t\tBooking Cancelled"+"\u001B[0m");
                System.out.println("\t\t\t\t\t\t\t\t\t  Thank You!!");
            }
        }

}
class Viswanth70mm{
    static Scanner sc=new Scanner(System.in);
    void Select()
    {
        String th="\t\t\t\t\t\t   *WELCOME TO VISWANATH70MM THEATER*   ";
        System.out.print("\t\t");
        System.out.print("\u001B[103m");
        System.out.print("\u001B[31m");
        for(int i=0;i<th.length();i++)
        {
        try{
            Thread.sleep(150);
        }
        catch(Exception e){
        }
        System.out.print(th.charAt(i));
        }
        System.out.println("\u001B[0m");
        System.out.println();
        System.out.println("\u001B[31m"+"\t\t\t\t\t\tMovie Name"+"\u001B[32m\n"+"\t\t\t\t\t\t1.Devara\n\t\t\t\t\t\t2.Jawan");
        int a=sc.nextInt();
        if(a==1){
	System.out.println("\t\t\t\t\t\tSelect a Date:");
        System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.09/10/23\n\t\t\t\t\t\t2.10/10/23\n\t\t\t\t\t\t3.11/10/23\n\t\t\t\t\t\t4.12/10/23");
        int n=sc.nextInt();
       String s="DEVARA";
        if(n==1)
        {
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TODAY(s,n1);
        }
        else if(n==2){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TOMMOROW(s,n1);
        }
        else if(n==3){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day3(s,n1);
        }
        else if(n==4){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day4(s,n1);
        }
        else{
            System.out.println("\t\t\t\t\t\tInvalid Selection");
            Select();
        }
        }
        else if (a==2){
            System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.09/10/23\n\t\t\t\t\t\t2.10/10/23\n\t\t\t\t\t\t3.11/10/23\n\t\t\t\t\t\t4.12/10/23");
        int n=sc.nextInt();
        String s="JAWAN";
        if(n==1)
        {
             System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TODAY(s,n1);
        }
        else if(n==2){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            TOMMOROW(s,n1);
        }
        else if(n==3){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day3(s,n1);
        }
        else if(n==4){
            System.out.println("\t\t\t\t\t\tEnter your Ticket Prices: 1.100 2.150 3.200 ");
            int n1=sc.nextInt();
            Day4(s,n1);
        }
        else{
            System.out.println("\t\t\t\t\t\tInvalid Selection");
            Select();
        }
            
        }
        else{
            System.out.println("\t\t\t\t\t\tInvalid Movie Selection");
            
        }
    }
      void TODAY(String a,int c){
	    System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time:"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("09-10-23","9:45PM",a,n1,c);
            }
        }
        void TOMMOROW(String a,int c){
	System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time:"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("10-10-23","9:45PM",a,n1,c);
            }
        }
        void Day3(String a,int c){
	System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time:"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","2:30PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("11-10-23","9:45PM",a,n1,c);
            }
        }
        void Day4(String a,int c){
		System.out.println(color.GREEN+"\t\t\t\t\t\tSelect your time:"+color.RESET);
            System.out.println("\u001B[31m"+"\t\t\t\t\t\tShow Timings");
            System.out.println("\t\t\t\t\t\t1.11:30AM\n\t\t\t\t\t\t2.2:45PM\n\t\t\t\t\t\t3.6:30PM\n\t\t\t\t\t\t4.9:45PM");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","11:30PM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("12-10-23","9:45PM",a,n1,c);
            }
        }
        
        void Confirmation(String a,String b,String d,int c,int n1){
            System.out.println("\u001B[36m"+"\t\t\t\t\t\t1 Confirm\n\t\t\t\t\t\t2 Cancel");
            int n=sc.nextInt();
            if(n==1){
		    int paymentMethod;
            do {
                System.out.println(color.PINK+"\t\t\t\t\t\tPlease make the payment."+color.RESET);
		System.out.println(color.CYAN+"\t\t\t\t\t\tSelect a UPI method"+color.RESET);
                System.out.println("\t\t\t\t\t\t1. G-PAY");
                System.out.println("\t\t\t\t\t\t2. PHONEPE");
                System.out.println("\t\t\t\t\t\t3. PAYTM");
                paymentMethod = sc.nextInt();
                if (paymentMethod < 1 || paymentMethod > 3) {
                    System.out.println(color.RED+"\t\t\t\t\t\tInvalid Payment Method. Please enter a valid payment method."+color.RESET);
                }
            } while (paymentMethod < 1 || paymentMethod > 3);

            if (paymentMethod == 1) {
                System.out.println(color.GREEN+"\t\t\t\t\t\tPayment Successful with G-PAY"+color.RESET);
		try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
            } else if (paymentMethod == 2) {
                System.out.println(color.GREEN+"\t\t\t\t\t\tPayment Successful with PHONEPE"+color.RESET);
		try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
            } else if (paymentMethod == 3) {
                System.out.println(color.GREEN+"\t\t\t\t\t\tPayment Successful with PAYTM"+color.RESET);
	         try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
            }
                System.out.println(color.CYAN+"\t\t\t\t\t\tBooking Successful"+color.RESET);
		System.out.println();
		System.out.print(color.RED+"\t\t\t\t\t\tTAKE YOUR TICKET"+color.RESET);
                System.out.println("\t\t"+"\u001B[32m");
	        String border = "\t\t\t\t\t\t+-------------------------------------------------+";

            System.out.println(border);
            System.out.println("\t\t\t\t\t\t|                  VISWANTH70MM                   |");
            System.out.println("\t\t\t\t\t\t|               TICKET INFORMATION                |");
            System.out.println("\t\t\t\t\t\t|                                                 |");
            System.out.println(border);
            System.out.println("\t\t\t\t\t\t| Movie Name: " + d + " Booking Date: " + LocalDate.now()+"\t  |");
            System.out.println("\t\t\t\t\t\t| Date: " + a + "             Show Time: " + b+"\t  |");
            System.out.println("\t\t\t\t\t\t| Amount---------" + c + "*" + n1+"\t\t\t\t  |");
            System.out.println("\t\t\t\t\t\t| Total Amount-------" + c * n1+"\t\t\t  |");
            System.out.print("\t\t\t\t\t\t| Seat Numbers: ");
                for(int i=1;i<=c;i++){
                System.out.print(10+(int)(Math.random()*9)+" ");
            }
	    System.out.print("\t\t\t  |");
	    System.out.println();
            System.out.println(border);
            System.out.println("\u001B[36m"+"\t\t"+"\t\t\t\t\t\t  Enjoy the Show!");
            }
            else{
                System.out.println("\t\t\t\t\t\tBooking Cancelled"+"\u001B[0m");
                System.out.println("                THANK YOU!");
            }
        }
}
class Theatre{
	static Scanner sc = new Scanner(System.in);
	static Area are = new Area();
    static Theatre the = new Theatre();
     void theatre(){
	System.out.println("\u001B[32m"+"\t\t\t\t\t\t\t\t   \u001B[4mWELCOME TO THEATRE\n\u001B[0m");
	
	System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\t\t\t");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&#PY75"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&#G5?!:..   7BY B"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&#GYJ7~.     ~B&J.     !#.:"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&&BG5?7!~.     ^B@G^     :P&B~     .^7"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&#BGY?~~!~.     .G@&?.     7#B7    ..~7YPB#&"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&BPY?~^^!!:      5@@G^     :PG?   .:^7J5B#&"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"        7&@&7     .?5?. .:~!?5G#&"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"! B5.     ~?7:.~7JY5G#&"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&~7Y~::~7YPG#&"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"P:&#.:~^^^^^777^^^^::~!!~:^^^:^!!~:^^::^~!!^~^::^~!~:^^^:^^B"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"& .&Y     !&@Y     ~&@Y     ~&@5     ^&@P     ^&@P     ^B ?"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"..^     J&#^     ?&#^     7&#~     7&#~     !&&!     ~&B J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+". !!77!7?7!!!!!!7?7!!!77!7?77!!!777?77!!!!!7?77!!!777?7! J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@?...!@@:...B@&7:....~G@7 .G@@P. 5@~..&@7.....:.&@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@~    B5    G@   B&&~  5&   @&  :@@:  #@^  !JJJG@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@~  ~ . .!  G&  .@@@P  ~@B  !~  &@@:  #@!  :~~^B@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@~  &.  PJ  P@7  :7~  .&@@J    G@@@.  #@!  ^!!!~#@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@BYP@#5P@&G5&@@&GJ??5#@@@@@PYYG@@@@GYP@@BY5YYYYY&@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"^J"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"J^#####################################################G^Y"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@"+color.BLUE+"&J??????????????????????????????????????????????????????P@"+color.RESET+"@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


	
	System.out.println();
        System.out.println(color.BLUE+"\t\t\t\t\t\tSELECT YOUR THEATER:"+color.RESET);
        System.out.println(color.YELLOW+"\t\t\t\t\t\t1.Arjun Theater\n\t\t\t\t\t\t2.Viswanth70MM\n\t\t\t\t\t\t3.Exit"+color.RESET);
        int n=Arjun.sc.nextInt();
        if(n==1){
        Arjun obj=new Arjun();
        obj.Select();
        }
        else if(n==2){
            Viswanth70mm obj=new Viswanth70mm();
            obj.Select();
        }
        else{
            System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
	    System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
            are.area();
        }
    }
}
class Hostel1{
	static Scanner sc = new Scanner(System.in);
	static Hostel host = new Hostel();
	static double payment;
	double OneSharing(){
		System.out.println(color.PURPLE+"\t\t\t\t\tNumber of One-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\tCost of One-Sharing room --> 7000"+color.RESET);
		return 7000;
	}

	double TwoSharing(){
		System.out.println(color.PURPLE+"\t\t\t\t\tNumber of Two-Sharing room available in Hostel --> 8"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\tCost of Two-Sharing room --> 6500"+color.RESET);
		return 6500;
	}

	double ThreeSharing(){
		System.out.println(color.PURPLE+"\t\t\t\t\tNumber of Three-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\tCost of Three-Sharing room --> 6000"+color.RESET);
		return 6000;
	}

	double FourSharing(){
		System.out.println(color.PURPLE+"\t\t\t\t\tNumber of Four-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\tCost of Four-Sharing room --> 5500"+color.RESET);
		return 5500;
	}

	double FiveSharing(){
		System.out.println(color.PURPLE+"\t\t\t\t\tNumber of Five-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.PURPLE+"\t\t\t\t\tCost of Five-Sharing room --> 5000"+color.RESET);
		return 5000;
	}

	void billing(double payment){
		System.out.println(color.BG_LEMON+"\t\t\t\t\tAre you Interested for Booking: (yes/no)"+color.RESET);
			String opt = sc.next();
			if(opt.equals("yes")){
				System.out.println(color.CYAN+"\t\t\t\t\tSelect Payment Method: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t1 for PAYTM: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t2 for PHONEPE: "+color.RESET);
				int p = sc.nextInt();
				if(p==1){
					System.out.println(color.BLUE+"\t\t\t\t\tPaid Rs."+payment+" through PAYTM."+color.RESET);
					try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tPayment Successful.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tTHANK YOU FOR BOOKING ROOM IN VISHNU NIVAS Hostel.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tVISIT AGAIN FOR OUR SERVICES..."+color.RESET);
				}
				else if(p==2){
					System.out.println(color.BLUE+"\t\t\t\t\tPaid Rs."+payment+" through PHONEPE."+color.RESET);
					try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tPayment Successful.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tTHANK YOU FOR BOOKING ROOM IN VISHNU NIVAS Hostel.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tVISIT AGAIN FOR OUR SERVICES..."+color.RESET);
				}
				else{
					System.out.println(color.RED+"\t\t\t\t\tInvalid Payment Method"+color.RESET);
					billing(payment);
				}
			}
			else{
				System.out.println("\t\t\t\t\t1 for go back to room Selection: ");
				System.out.println("\t\t\t\t\t2 for go back to hostel Selection: ");
				System.out.println(color.RED+"\t\t\t\t\t3 for exit: "+color.RESET);
				int p1 = sc.nextInt();
				if(p1==1){
					Selection();
				}
				else if(p1==2){
					host.hostel();
				}
				else{
					System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
					System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
				}
			}
	}

	void Selection(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tWelcome to VISHNU NIVAS Hostel, KPHB phase-1, Near AED Hospital..."+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1 for One-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2 for Two-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t3 for Three-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t4 for Four-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t5 for Five-Sharing room: "+color.RESET);

		int h1 =sc.nextInt();
		if(h1==1){
			payment = OneSharing();
			billing(payment);
		}
		else if(h1==2){
			payment = TwoSharing();
			billing(payment);
		}
		else if(h1==3){
			payment = ThreeSharing();
			billing(payment);
		}
		else if(h1==4){
			payment = FourSharing();
			billing(payment);
		}
		else if(h1==5){
			payment = FiveSharing();
			billing(payment);
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Selection..."+color.RESET);
			System.out.println("\t\t\t\t\t1 for go to Room Selection: ");
			System.out.println("\t\t\t\t\t2 for go to Hostel Selection: ");
			System.out.println(color.RED+"\t\t\t\t\t3 for exit: "+color.RESET);
			int r = sc.nextInt();
			if(r==1){
				Selection();
			}
			else if(r==2){
				host.hostel();
			}
			else{
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
			}
		}
	}
}

class Hostel2{
	static Scanner sc = new Scanner(System.in);
	static Hostel host = new Hostel();
	static double payment;
	double OneSharing(){
		System.out.println(color.BG_ROSE+"\t\t\t\t\tNumber of One-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_ROSE+"\t\t\t\t\tCost of One-Sharing room --> 10000"+color.RESET);
		return 10000;
	}

	double TwoSharing(){
		System.out.println(color.BG_ROSE+"\t\t\t\t\tNumber of Two-Sharing room available in Hostel --> 8"+color.RESET);
		System.out.println(color.BG_ROSE+"\t\t\t\t\tCost of Two-Sharing room --> 9000"+color.RESET);
		return 9000;
	}

	double ThreeSharing(){
		System.out.println(color.BG_ROSE+"\t\t\t\t\tNumber of Three-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_ROSE+"\t\t\t\t\tCost of Three-Sharing room --> 8000"+color.RESET);
		return 8000;
	}

	double FourSharing(){
		System.out.println(color.BG_ROSE+"\t\t\t\t\tNumber of Four-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_ROSE+"\t\t\t\t\tCost of Four-Sharing room --> 7000"+color.RESET);
		return 7000;
	}

	double FiveSharing(){
		System.out.println(color.BG_ROSE+"\t\t\t\t\tNumber of Five-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_ROSE+"\t\t\t\t\tCost of Five-Sharing room --> 6000"+color.RESET);
		return 6000;
	}

	void billing(double payment){
		System.out.println(color.BG_LEMON+"\t\t\t\t\tAre you Interested for Booking: (yes/no)"+color.RESET);
			String opt = sc.next();
			if(opt.equals("yes")){
				System.out.println(color.CYAN+"\t\t\t\t\tSelect Payment Method: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t1 for PAYTM: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t2 for PHONEPE: "+color.RESET);
				int p = sc.nextInt();
				if(p==1){
					System.out.println(color.BLUE+"\t\t\t\t\tPaid Rs."+payment+" through PAYTM."+color.RESET);
				try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tPayment Successful.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tTHANK YOU FOR BOOKING ROOM IN NARAYANA MENS Hostel.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tVISIT AGAIN FOR OUR SERVICES..."+color.RESET);
				}
				else if(p==2){
					System.out.println(color.BLUE+"\t\t\t\t\tPaid Rs."+payment+" through PHONEPE."+color.RESET);
				try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tPayment Successful.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tTHANK YOU FOR BOOKING ROOM IN NARAYANA MENS Hostel.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tVISIT AGAIN FOR OUR SERVICES..."+color.RESET);
				}
				else{
					System.out.println(color.RED+"\t\t\t\t\tInvalid Payment Method"+color.RESET);
					billing(payment);
				}
			}
			else{
				System.out.println("\t\t\t\t\t1 for go back to room Selection: ");
				System.out.println("\t\t\t\t\t2 for go back to hostel Selection: ");
				System.out.println(color.RED+"\t\t\t\t\t3 for exit: "+color.RESET);
				int p1 = sc.nextInt();
				if(p1==1){
					Selection();
				}
				else if(p1==2){
					host.hostel();
				}
				else{
					System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
					System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
				}
			}
	}

	void Selection(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tWelcome to NARAYANA MENS Hostel, KPHB phase-2, Near MANYAVAAR..."+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1 for One-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2 for Two-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t3 for Three-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t4 for Four-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t5 for Five-Sharing room: "+color.RESET);

		int h2 = sc.nextInt();
		if(h2==1){
			payment = OneSharing();
			billing(payment);
		}
		else if(h2==2){
			payment = TwoSharing();
			billing(payment);
		}
		else if(h2==3){
			payment = ThreeSharing();
			billing(payment);
		}
		else if(h2==4){
			payment = FourSharing();
			billing(payment);
		}
		else if(h2==5){
			payment = FiveSharing();
			billing(payment);
		}
		else{
			System.out.println();
			System.out.println("\t\t\t\t\t1 for go to Room Selection: ");
			System.out.println("\t\t\t\t\t2 for go to Hostel Selection: ");
			System.out.println(color.RED+"\t\t\t\t\t3 for exit: "+color.RESET);
			int r = sc.nextInt();
			if(r==1){
				Selection();
			}
			else if(r==2){
				host.hostel();
			}
			else{
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
				System.out.println();
					System.out.println();
			}
		}
	}
}

class Hostel3{
	static Scanner sc = new Scanner(System.in);
	static Hostel host = new Hostel();
	static double payment;
	double OneSharing(){
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tNumber of One-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tCost of One-Sharing room --> 12000"+color.RESET);
		return 12000;
	}

	double TwoSharing(){
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tNumber of Two-Sharing room available in Hostel --> 8"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tCost of Two-Sharing room --> 11000"+color.RESET);
		return 11000;
	}

	double ThreeSharing(){
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tNumber of Three-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tCost of Three-Sharing room --> 10000"+color.RESET);
		return 10000;
	}

	double FourSharing(){
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tNumber of Four-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tCost of Four-Sharing room --> 9000"+color.RESET);
		return 9000;
	}

	double FiveSharing(){
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tNumber of Five-Sharing room available in Hostel --> 10"+color.RESET);
		System.out.println(color.BG_TURQUOISE+"\t\t\t\t\tCost of Five-Sharing room --> 8000"+color.RESET);
		return 8000;
	}

	void billing(double payment){
		System.out.println(color.BG_LEMON+"\t\t\t\t\tAre you Interested for Booking: (yes/no)"+color.RESET);
			String opt = sc.next();
			if(opt.equals("yes")){
				System.out.println(color.CYAN+"\t\t\t\t\tSelect Payment Method: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t1 for PAYTM: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t2 for PHONEPE: "+color.RESET);
				int p = sc.nextInt();
				if(p==1){
					System.out.println(color.BLUE+"\t\t\t\t\tPaid Rs."+payment+" through PAYTM."+color.RESET);
					try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tPayment Successful.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tTHANK YOU FOR BOOKING ROOM IN VIGNESWARA MENS Hostel.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tVISIT AGAIN FOR OUR SERVICES..."+color.RESET);
				}
				else if(p==2){
					System.out.println(color.BLUE+"\t\t\t\t\tPaid Rs."+payment+" through PHONEPE."+color.RESET);
			try {
                    // Add a delay to simulate payment processing
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle the InterruptedException
                    e.printStackTrace();
                }
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tPayment Successful.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tTHANK YOU FOR BOOKING ROOM IN VIGNESWARA MENS Hostel.."+color.RESET);
					System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tVISIT AGAIN FOR OUR SERVICES..."+color.RESET);
				}
				else{
					System.out.println(color.RED+"\t\t\t\t\tInvalid Payment method"+color.RESET);
					billing(payment);	
				}
			}
			else{
				System.out.println("\t\t\t\t\t1 for go back to room Selection: ");
				System.out.println("\t\t\t\t\t2 for go back to hostel Selection: ");
				System.out.println(color.RED+"\t\t\t\t\t3 for exit: "+color.RESET);
				int p1 = sc.nextInt();
				if(p1==1){
					Selection();
				}
				else if(p1==2){
					host.hostel();
				}
				else{
					System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
					System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
					System.out.println();
					System.out.println();          
				}
			}
	}

	void Selection(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tWelcome to VIGNESWARA MENS Hostel, KPHB phase-3, Near CENTRO..."+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1 for One-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2 for Two-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t3 for Three-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t4 for Four-Sharing room: "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t5 for Five-Sharing room: "+color.RESET);

		int h3 = sc.nextInt();
		if(h3==1){
			payment = OneSharing();
			billing(payment);
		}
		else if(h3==2){
			payment = TwoSharing();
			billing(payment);
		}
		else if(h3==3){
			payment = ThreeSharing();
			billing(payment);	
		}
		else if(h3==4){
			payment = FourSharing();
			billing(payment);
		}
		else if(h3==5){
			payment = FiveSharing();
			billing(payment);
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Selection..."+color.RESET);
			System.out.println("\t\t\t\t\t1 for go to Room Selection: ");
			System.out.println("\t\t\t\t\t2 for go to Hostel Selection: ");
			System.out.println(color.RED+"\t\t\t\t\t3 for exit: "+color.RESET);
			int r = sc.nextInt();
			if(r==1){
				Selection();
			}
			else if(r==2){
				host.hostel();
			}
			else{
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANK YOU FOR VISITING..."+color.RESET);
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
				System.out.println();
					System.out.println();
			}
		}
	}
}

class Hostel{
	static Scanner sc = new Scanner(System.in);
	static Hostel host = new Hostel();
	void hostel(){
		System.out.println(color.ORANGE+"\t\t\t\t\t\t\t\t  HOSTELS"+color.RESET);
		System.out.println();
		;
		System.out.println("\t\t\t          "+color.GREEN+"JJJJ     JJJJ     JJJJJJJJJ      JJJJJJJJ JJJJJJJJJJJ JJJJJJJJJJJ JJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJ     JJJJ  JJJJJJJJJJJJJJ   JJJJJJJJJ JJJJJJJJJJJ JJJJJJJJJJJ JJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJ     JJJJ JJJJ        JJJJ JJJJ           JJJJ    JJJ         JJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJJJJJJJJJJ JJJJ        JJJJ  JJJJJJJJ      JJJJ    JJJJJJJJJJJ JJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJJJJJJJJJJ JJJJ        JJJJ  JJJJJJJJJ     JJJJ    JJJJJJJJJJJ JJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJ     JJJJ JJJJ        JJJJ        JJJJJ   JJJJ    JJJ         JJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJ     JJJJ   JJJJJJJJJJJJJ   JJJJJJJJJJJ   JJJJ    JJJJJJJJJJJ JJJJJJJJJ"+color.RESET);
		System.out.println("\t\t\t          "+color.GREEN+"JJJJ     JJJJ    JJJJJJJJJJ     JJJJJJJJJJ    JJJJ    JJJJJJJJJJJ JJJJJJJJJ"+color.RESET);
	

		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t1-VISHNU NIVAS MENS Hostel: "+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t2-NARAYANA MENS Hostel: "+color.RESET);
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t3-VIGNESWARA MENS Hostel: "+color.RESET);
		int h = sc.nextInt();
		if(h==1){
			Hostel1 h1 = new Hostel1();
			h1.Selection();
		}
		else if(h==2){
			Hostel2 h2 = new Hostel2();
			h2.Selection();
		}
		else if(h==3){
			Hostel3 h3 = new Hostel3();
			h3.Selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Selection..."+color.RESET);
			System.out.println(color.BG_SKY_BLUE+"\t\t\t\t\t1 for Go back to Hostel: "+color.RESET);
			System.out.println(color.BG_SKY_BLUE+"\t\t\t\t\t2 for exit: "+color.RESET);
			int n = sc.nextInt();
			if(n==1){
				host.hostel();
			}
			else{
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\tTHANKS FOR VISITING"+color.RESET);
				System.out.println(color.BRIGHT_MAGENTA+"\t\t\t\t\t\t\t\t     VISIT AGAIN"+color.RESET);
				System.out.println();
					System.out.println();
			}
		}
	}
}
class Area{
	static Scanner sc = new Scanner(System.in);
	static Area are = new Area();
	static boolean b = true;
	void welcome(){
		System.out.println(color.BRIGHT_GREEN+"\t \u001B[5;32m`8.`888b                 ,8' 8 8888888888   8 8888             ,o888888o.        ,o888888o.              ,8.       ,8.          8 888888888888 ");
		System.out.println("\t  `8.`888b               ,8'  8 8888         8 8888            8888     `88.   . 8888     `88.           ,888.     ,888.         8 8888         ");
		System.out.println("\t   `8.`888b             ,8'   8 8888         8 8888         ,8 8888       `8. ,8 8888       `8b         .`8888.   .`8888.        8 8888         ");
		System.out.println("\t    `8.`888b     .b    ,8'    8 8888         8 8888         88 8888           88 8888        `8b       ,8.`8888. ,8.`8888.       8 8888         ");
		System.out.println("\t     `8.`888b    88b  ,8'     8 888888888888 8 8888         88 8888           88 8888         88      ,8'8.`8888,8^8.`8888.      8 888888888888 ");
		System.out.println("\t      `8.`888b .`888b,8'      8 8888         8 8888         88 8888           88 8888         88     ,8' `8.`8888' `8.`8888.     8 8888         ");
		System.out.println("\t       `8.`888b8.`8888'       8 8888         8 8888         88 8888           88 8888        ,8P    ,8'   `8.`88'   `8.`8888.    8 8888         ");
		System.out.println("\t        `8.`888`8.`88'        8 8888         8 8888         `8 8888       .8' `8 8888       ,8P    ,8'     `8.`'     `8.`8888.   8 8888         ");
		System.out.println("\t         `8.`8' `8,`'         8 8888         8 8888            8888     ,88'   ` 8888     ,88'    ,8'       `8        `8.`8888.  8 8888         ");
		System.out.println("\t          `8.`   `8'          8 888888888888 8 888888888888     `8888888P'        `8888888P'     ,8'         `         `8.`8888. 8 888888888888\u001B[0m "+color.RESET);
    
	}
	 void area() {
		
   		if(b){
		 	welcome();
		 	b = false;
	 	} 
		System.out.println();	
		System.out.println();
		System.out.println("\t\t\t\t\t\t"+color.RED+"+*"+color.RESET+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"-------"+color.RED+"*+"+color.RESET);
		System.out.println("\t\t\t\t\t\t+*"+color.BLUE+"---------------------------------------------------------------------"+color.RESET+"*+");
		System.out.println(color.BLUE+"\t\t\t\t\t\t|"+"                                                                       |"+color.RESET);
		System.out.println("\t\t\t\t\t\t|\t   \u001B[5;33m1-RESTAURANTS\u001B[0m                         \u001B[5;32m2-INSTITUTES\u001B[0m           |");
		System.out.println(color.BLUE+"\t\t\t\t\t\t|"+"                                                                       |"+color.RESET);
	
		System.out.println("\t\t\t\t\t\t|"+"                                                                       |"+color.RESET);
		System.out.println("\t\t\t\t\t\t|\t\t\t         \u001B[5;31m5-EXIT\u001B[0m                                 |");
		
		System.out.println("\t\t\t\t\t\t|"+"                                                                       |");
		System.out.println(color.BLUE+"\t\t\t\t\t\t|"+"                                                                       |"+color.RESET);
		System.out.println("\t\t\t\t\t\t|\t   \u001B[5;34m3-THEATRES\u001B[0m                            \u001B[5;35m4-HOSTELS\u001B[0m              |"+color.RESET);
		
		
		System.out.println(color.BLUE+"\t\t\t\t\t\t|"+"                                                                       |"+color.RESET);
		System.out.println("\t\t\t\t\t\t+*"+color.BLUE+"---------------------------------------------------------------------"+color.RESET+"*+");
		System.out.println("\t\t\t\t\t\t"+color.RED+"+*"+color.RESET+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"--------"+color.BLUE+"------"+color.RESET+"-------"+color.RED+"*+"+color.RESET);
		System.out.println();
		
		int s = sc.nextInt();
		if(s==1){
			restuarant res = new restuarant();
			res.restuarant();
			are.area();
		}
		else if(s==2){
			Institutes inst = new Institutes();
			inst.institutes();
			are.area();
		}
		else if(s==3){
			Theatre the = new Theatre();
			the.theatre();
			are.area();
		}
		else if(s==4){
			Hostel host = new Hostel();
			host.hostel();
			are.area();
		}
		else{
			
		
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.GREEN+"\t\t\t\t\t\t\t\tTHANK YOU FOR USING OUR SERVICES!"+color.RESET);
			System.out.println(color.GREEN+"\t\t\t\t\t\t\t\t          VISIT AGAIN"+color.RESET);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(color.GREEN+"\t\t\t\t   *     **                                **                                                    ");
			System.out.println("\t\t\t\t   **     **                                **                                                   "); 
			System.out.println("\t\t\t\t   **     **                                **                                                   "); 
			System.out.println("\t\t\t\t ******** **                                **            **   ****         ****    **   ****    "); 
			System.out.println("\t\t\t\t********  **  ***      ****    ***  ****    **  ***        **    ***  *    * ***  *  **    ***  *"); 
			System.out.println("\t\t\t\t   **     ** * ***    * ***  *  **** **** * ** * ***       **     ****    *   ****   **     **** "); 
			System.out.println("\t\t\t\t   **     ***   ***  *   ****    **   ****  ***   *        **      **    **    **    **      **  "); 
			System.out.println("\t\t\t\t   **     **     ** **    **     **    **   **   *         **      **    **    **    **      **  "); 
			System.out.println("\t\t\t\t   **     **     ** **    **     **    **   **  *          **      **    **    **    **      **  "); 
			System.out.println("\t\t\t\t   **     **     ** **    **     **    **   ** **          **      **    **    **    **      **  "); 
			System.out.println("\t\t\t\t   **     **     ** **    **     **    **   ******         **      **    **    **    **      **  "); 
			System.out.println("\t\t\t\t   **     **     ** **    **     **    **   **  ***         *********     ******      ******* ** "); 
			System.out.println("\t\t\t\t    **    **     **  ***** **    ***   ***  **   *** *        **** ***     ****        *****   **"); 
			System.out.println("\t\t\t\t           **    **   ***   **    ***   ***  **   ***               ***                          "); 
			System.out.println("\t\t\t\t                 *                                           *****   ***                         "); 
			System.out.println("\t\t\t\t                *                                          ********  **                          "); 
			System.out.println("\t\t\t\t                  *                                         *      ****                          ");   
			System.out.println("\t\t\t\t             *                                                                                  "+color.RESET);
		}

	}
}
class lo
{
	private String name="a";
	private String password="a";
	private String num="1234";
	
    lo(){}
	lo(String name,String pass,String num)
	{
		this.name=name;
		this.password=pass;
		this.num=num;
	}
	void setname(String name)
	{
		this.name=name;
	}
	void setpass(String pass)
	{
		this.password=pass;
	}
	String getname()
	{
		return name;
	}
	String getpass()
	{
		return password;
	}
	String getnum()
	{
		return num;
	}
}
class user
{
static java.util.Scanner sc= new java.util.Scanner(System.in);
static lo x= new lo();
static Area are = new Area();
 public static final String RESET = "\u001B[0m";
    public static final String BRED = "\u001B[91m";
    public static final String BGREEN = "\u001B[92m";
    public static final String BYELLOW = "\u001B[93m";
    public static final String BBLUE = "\u001B[94m";
    public static final String BMAGENTA = "\u001B[95m";
    public static final String BCYAN = "\u001B[96m";
    public static final String BWHITE = "\u001B[97m";
    public static final String ORANGE = "\u001B[38;5;208m";  
    public static final String BLINK = "\u001B[5;32m";
	static void signup()
	{
		System.out.println(BBLUE+"ENTER YOUR NAME : ");
		String name=sc.next();
		System.out.println(BYELLOW+"ENTER YOUR PASSWORD");
		String pass= sc.next();
		while(true)
		{
		    System.out.println(BRED+"ENTER YOUR MOBILE NUMBER : ");
		    String num=sc.next();
			if(num.length()==10)
			{
			    x=new lo(name,pass,num);
                otp();	
                break;
			}
			else
			{		
				System.out.println(BWHITE+"INVALID MOBILE NUMBER");
				System.out.println(BYELLOW+"\nPRESS 1 FOR RE-ENTER NUMBER"+BRED+"\n PRESS ANY NUM FOR EXIT");
				System.out.print(BBLUE+"Enter your option: ");
				int n=sc.nextInt();
				if(n!=1)
				{
	    			System.out.println(BRED+"EXIT BYE BYE");
					break;
				}
			}
		}
	}
	static void otp()
	{
		int otp=(int)(Math.random()*8999)+1000;
		System.out.println(BBLUE+otp);
		while(true)
		{
			System.out.println(BGREEN+"ENTER YOUR OTP : ");
			int n=sc.nextInt();
			if(n==otp)
			{
				System.out.println(ORANGE+"\t\t\t\t---------------------------------* * * SIGN-IN COMPLETED SUCCESSFULLY * * *--------------------------------"+RESET);
				main(null);
				break;
			}
			else
			{
				System.out.println(BYELLOW+"INVALID OTP"+BGREEN+"\nPRESS 1 FOR RE-ENTER OTP"+BRED+"\n PRESS ANY NUM FOR REGENERATE");
				System.out.print(BBLUE+"Enter your option: ");
				int n1=sc.nextInt();
				if(n1!=1)
				{
					otp();
					break;
				}
			}
			
		}		
	}

		static void login()
		{
			System.out.println(BBLUE+"ENTER YOUR NAME : ");
		    String name=sc.next();
		    System.out.println(BYELLOW+"ENTER YOUR PASSWORD");
		    String pass= sc.next();
			if(name.equals(x.getname())&&pass.equals(x.getpass()))
			{
				System.out.println(ORANGE+"\t\t\t\t---------------------------------* * * YOUR ACCOUNT LOGIN SUCCESFULL * * *--------------------------------"+RESET);
				System.out.println();
				System.out.println();
				are.area();
			}
			else if(!(name.equals(x.getname()))  &&  !(pass.equals(x.getpass())))
			{
				System.out.println(BCYAN+"INVALID LOGIN DETAILS ");
				while(true)
				{
					System.out.println(ORANGE+"PLEASE ENTER YOUR MOBILE NUMBER : ");
					String ph=sc.next();
					
					if(ph.equals(x.getnum())&&ph.length()==10)
					{
						System.out.println(BGREEN+"YOUR USER NAME IS = "+x.getname());
						login();
						break;
					}
					else
					{		
						System.out.println(BMAGENTA+"INVALID MOBILE NUMBER");
						System.out.println(BYELLOW+"\nPRESS 1 FOR RE-ENTER NUMBER"+BRED+"\n PRESS ANY NUM FOR EXIT");
				        System.out.print(BBLUE+"Enter your option: ");
						int n=sc.nextInt();
						if(n!=1)
						{
							System.out.println(BRED+"EXIT BYE BYE ");
							break;
						}
					}
				}
			}

		
			else if(!(name.equals(x.getname())))
			{
				System.out.println(BGREEN+"RESET YOUR NAME : ");
					x.setname(sc.next());
					login();	
			}
			else
			{
				System.out.println(BBLUE+"RESET YOUR PASSWORD ");
					x.setpass(sc.next());
					login();	
			}
	}

      
public static void main(String[]args)
{
	
	System.out.println(BGREEN+"\t\t\t\t\t\t\t*-----------------------------------------------------------*");
    System.out.println(BWHITE+"\t\t\t\t\t\t\t*                     SELECT ONE OPTION                     *");
    System.out.println(BGREEN+"\t\t\t\t\t\t\t*-----------------------------------------------------------*");
    System.out.println(BGREEN+"\t\t\t\t\t\t\t*                                                           *");
    System.out.println(BCYAN +"\t\t\t\t\t\t\t*                      1.LOGIN                              *");
    System.out.println(BRED  +"\t\t\t\t\t\t\t*                      2.SIGNIN                             *");
    System.out.println(BGREEN+"\t\t\t\t\t\t\t*                                                           *");
    System.out.println(BGREEN+"\t\t\t\t\t\t\t*-----------------------------------------------------------*"+RESET);
	System.out.print(BBLUE+"Enter your option: ");
	int n=sc.nextInt();
	if(n==1)
	{
		login();
	}	
	else if(n==2)
	{
		signup();
	}
	else
	{	
			main(null);
		
	}
}
}