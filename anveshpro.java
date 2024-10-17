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
{
	static double bill;
	Food obj = new Food();
	double vegmanchuria(int quantity){
		return quantity*150;
	}

	double alu65(int quantity){
		return quantity*170;
	}

	double crispyCorn(int quantity){
		return quantity*170;
	}

	double vegSpinRools(int quantity)
	{
		return quantity*150;
	}
	void selection(){
		System.out.println("\t\t\t\t\tSelect a Veg starter:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      1-Veg-manchuria                -->Rs.150.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      2-Alu65                        -->Rs.170.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      3-CrispyCorn                   -->Rs.170.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_BLUE+"      4-VegSpinRolls                 -->Rs.150.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+vegmanchuria(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+alu65(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+crispyCorn(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+vegSpinRools(vegrices.sc.nextInt());
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			
		}
		
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Veg-Starters Again:\n\t\t\t\t\t2.Exit:"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Veg-Starters bill: "+bill+color.RESET);
System.out.println();
			obj.food();
		}
	}

}

class nonvegStarters{
	static double bill;
	Food obj = new Food();
	double ApolloFish(int quantity){
		return quantity*240;
	}

	double PrawnsManchuria(int quantity){
		return quantity*240;
	}

	double DragonChicken(int quantity){
		return quantity*200;
	}

	double ChickenLollipop(int quantity){
		return quantity*275;
	}

	double Chicken65(int quantity){
		return quantity*200;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Non-veg starter:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      1-ApolloFish                -->Rs.240.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      2-PrawnsManchuria           -->Rs.240.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      3-DragonChicken             -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      4-ChickenLollipop           -->Rs.275.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_MAGENTA+"      5-Chicken65                 -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+ApolloFish(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+PrawnsManchuria(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+DragonChicken(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+ChickenLollipop(vegrices.sc.nextInt());
		}

		else if(n1==5){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+Chicken65(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Non-VegStarters Again:\n\t\t\t\t\t2.Exit:"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Non-veg Starters bill: "+bill+color.RESET);
System.out.println();
			obj.food();
		}
	}
}

class vegrices{
	static Scanner sc = new Scanner(System.in);
	static double bill;
	Food obj = new Food();
	double vegFiredRice(int quantity){
		return quantity*150;
	}

	double vegPalavo(int quantity){
		return quantity*180;
	}

	double vegBiriyani(int quantity){
		return quantity*200;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Veg rice:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        1-Veg Fried Rice            -->Rs.150.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        2-Veg Palav                 -->Rs.180.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BG_TURQUOISE+"        3-Veg Biriyani              -->Rs.200.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+vegFiredRice(sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+vegPalavo(sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+vegBiriyani(sc.nextInt());
			
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Veg Rices Again\n\t\t\t\t\t2.Exit"+color.RESET);
		int n2 = sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Veg Rices bill: "+bill+color.RESET);
System.out.println();
			obj.food();
		}
	}
}

class nonvegrices{
	static double bill;
	Food obj = new Food();
	double nonvegFiredRice(int quantity){
		return quantity*250;
	}

	double nonvegPalavo(int quantity){
		return quantity*280;
	}

	double nonvegBiriyani(int quantity){
		return quantity*300;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Non-veg rice:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       1-Chicken Fried Rice               -->Rs.250.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       2-Palav                            -->Rs.280.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.PURPLE+"       3-Chicken Biriyani                 -->Rs.300.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+nonvegFiredRice(vegrices.sc.nextInt());
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+nonvegPalavo(vegrices.sc.nextInt());
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+nonvegBiriyani(vegrices.sc.nextInt());
		}
		else if(n1==4){
			selection();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Non-veg Rices Again:\n\t\t\t\t\t2.Exit:"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Non-veg Rices bill: "+bill+color.RESET);
System.out.println();
			obj.food();
		}
	}
}

class vodka{
	static double bill;
	Liquids obj = new Liquids();
	double magicMoment(int quantity){
		return quantity*800;
	}

	double absoluteVodka(int quantity){
		return quantity*3000;
	}

	double greyGoose(int quantity){
		return quantity*3500;
	}

	double smirGoof(int quantity){
		return quantity*2000;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect an Vodka:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         1-MagicMoment                -->Rs.800.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         2-Absolute Vodka             -->Rs.3000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         3-GreyGoose                  -->Rs.3500.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.ORANGE+"         4-SmirGoof                   -->Rs.2000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+magicMoment(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+absoluteVodka(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+greyGoose(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+smirGoof(vegrices.sc.nextInt());
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Vodka Again\n\t\t\t\t\t2.Exit"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Vodka bill: "+bill+color.RESET);
System.out.println();	
			obj.liquids();
		}
	}
}

class whisky{
	static double bill;
	Liquids obj = new Liquids();
	double johnnieWalker(int quantity){
		return quantity*22000;
	}

	double jackDaniels(int quantity){
		return quantity*2700;
	}

	double redLable(int quantity){
		return quantity*3600;
	}

	double blackDog(int quantity){
		return quantity*1200;
	}

	double royalGreen(int quantity){
		return quantity*800;
	}

	void selection(){
		System.out.println("\t\t\t\t\tSelect a Whiskey:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        1-JohnnieWalker           -->Rs.22000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        2-JackDaniels             -->Rs.2700.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        3-RedLable                -->Rs.3600.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        4-BlackDog                -->Rs.1200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.GREEN+"        5-RoyalGreen              -->Rs.800.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+johnnieWalker(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+jackDaniels(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+redLable(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+blackDog(vegrices.sc.nextInt());
		}
		else if(n1==5){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+royalGreen(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Whiskey Again\n\t\t\t\t\t2.Exit:"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Whisky bill: "+bill+color.RESET);
System.out.println();
			obj.liquids();
		}
	}
}

class brandy{
	static double bill;
	Liquids obj = new Liquids();
	double manshinHouse(int quantity){
		return quantity*800;
	}

	double morpehous(int quantity){
		return quantity*1200;
	}

	double mcDowellis(int quantity){
		return quantity*1200;
	}

	double kingLouis(int quantity){
		return quantity*8000;
	}


	void selection(){
		System.out.println("\t\t\t\t\tSelect a Brandy:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          1-MansionHouse            -->Rs.800.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          2-Morpehous               -->Rs.1200.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          3-McDowellis              -->Rs.1200.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t|"+color.BRIGHT_YELLOW+"          4-KingLouis               -->Rs.8000.0"+color.RESET+"\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+manshinHouse(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+morpehous(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+mcDowellis(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+kingLouis(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Brandy Again\n\t\t\t\t\t2.Exit"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Brandy bill: "+bill+color.RESET);	
System.out.println();
			obj.liquids();
		}		
	}
}

class beers{
	static double bill;
	Liquids obj = new Liquids();
	double kingFisher(int quantity){
		return quantity*170;
	}

	double knockOut(int quantity){
		return quantity*150;
	}

	double budwiser(int quantity){
		return quantity*200;
	}

	double carlesberg(int quantity){
		return quantity*200;
	}


	void selection(){
		System.out.println("\t\t\t\t\tSelect a Beer:");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           1-Carlesberg           -->Rs.170.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           2-KnockOut             -->Rs.150.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           3-Budwiser             -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t|"+color.PINK+"           4-Carlesberg           -->Rs.200.0"+color.RESET+"\t\t |");
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int n1 = vegrices.sc.nextInt();
		if(n1==1){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+carlesberg(vegrices.sc.nextInt());
			
		}
		else if(n1==2){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+knockOut(vegrices.sc.nextInt());
			
		}
		else if(n1==3){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+budwiser(vegrices.sc.nextInt());
			
		}
		else if(n1==4){
			System.out.println(color.GREEN+"\t\t\t\t\tEnter Quantity:"+color.RESET);
			bill = bill+carlesberg(vegrices.sc.nextInt());
		}

		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
		}
		System.out.println(color.PINK+"\t\t\t\t\t1.Order Beers Again\n\t\t\t\t\t2.Exit"+color.RESET);
		int n2 = vegrices.sc.nextInt();

		if(n2==1){
			selection();
		}
		else if(n2==2){
			System.out.println(color.BRIGHT_RED+"\t\t\t\t\tBilling Details:"+color.RESET);
			System.out.println(color.CYAN+"\t\t\t\t\tYour Beers bill: "+bill+color.RESET);
			System.out.println();
			obj.liquids();
		}
	}

}

class Food{
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
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println(color.BLUE+"\t\t\t\t\t**********************************************************"+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		int f = vegrices.sc.nextInt();
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
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				food();
			}
			else if(inv==2){
				item.items();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}

class Liquids{
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
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		System.out.println(color.BLUE+"\t\t\t\t\t**********************************************************"+color.RESET);
		System.out.println("\t\t\t\t\t*--------------------------------------------------------*");
		
		int l = vegrices.sc.nextInt();
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
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit"+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				liquids();
			}
			else if(inv==2){
				item.items();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}

class Items{
	static restuarant res = new restuarant();
	void items(){
		System.out.println("\t\t\t\t\t\u001B[4mSelect an option:\u001B[0m");
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t1.Foods"+color.RESET);
		System.out.println(color.BRIGHT_CYAN+"\t\t\t\t\t2.Liquids"+color.RESET);
		int it = vegrices.sc.nextInt();
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
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit..."+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				items();
			}
			else if(inv==2){
				res.restuarant();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
				
			}
		}
	}
}

class Restuarant1{
	static restuarant res = new restuarant();
	void restuarant1(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    WELCOME TO CHAITANYA BAR & RESTAURANT          "+color.RESET);
		System.out.println(color.RED+"\t\t\t\t\t\t           ---------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r1 = vegrices.sc.nextInt();
		if(r1==1){
			Items r11 = new Items();
			r11.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restuarant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit"+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant1();
			}
			else if(inv==2){
				res.restuarant();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
		
			}
		}
	}
}
class Restuarant2{
	static restuarant res = new restuarant();
	void restuarant2(){
		System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    WELCOME TO SITARA GRAND BAR & RESTAURANT          "+color.RESET);
		System.out.println(color.RED+"\t\t\t\t\t\t           ------------------------------------------"+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t1.Menu "+color.RESET);
		System.out.println(color.YELLOW+"\t\t\t\t\t2.For other options"+color.RESET);
		int r2 = vegrices.sc.nextInt();
		if(r2==1){
			Items r21 = new Items();
			r21.items();
		}
		else{
			System.out.println(color.RED+"\t\t\t\t\tInvalid Input!!!"+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t1.Re-enter "+color.RESET);
			System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t2.Go to Restuarant Selection "+color.RESET);
			System.out.println(color.PURPLE+"\t\t\t\t\tAny key to exit "+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				restuarant2();
			}
			else if(inv==2){
				res.restuarant();
			}
			else{
				
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t        THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t\t            VISIT AGAIN          "+color.RESET);
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
	}
}
class restuarant{
	static restuarant res = new restuarant();
	void restuarant() {
	
	System.out.println();
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.CYAN+"&PP&"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@"+color.CYAN+"&&&&&&&&&&&&&&&&&&&&&&&&@@&#Y!!YY!!Y#&&&&&&&&&&&&&&&&&&&&&&&&&&&"+color.RESET+"@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@"+color.CYAN+"#5!!77777777777777777777??!::~7PBGYYBBP7~::!??77777777777777777777!!5#"+color.RESET+"@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@&"+color.CYAN+"BJ!!Y#@@@@@@@@@@@@@@@@@@@@&P7~?G#GJ!?GG?!JG#G?~7P&@@@@@@@@@@@@@@@@@@@&#Y!!JB&"+color.RESET+"@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"&G?!7P&@@@@@@@@@@@@@@@@@@@@#57!JB&P!.:75GPGG57:.!P&BJ!75#@@@@@@@@@@@@@@@@@@@@&P7!?G&"+color.RESET+"@@@@@@@@");
System.out.println("\t\t\t@@@@@"+color.CYAN+"#5~:!YB&&&#################BJ^^?P#&&#YJJYJJJJJJJYYJJY#&&#P?^^JB#################&&&BY!:!5#"+color.RESET+"@@@@@");
System.out.println("\t\t\t@@@@@"+color.CYAN+"Y77:^JJJJJJJJ??JJJJJJ??JJJJ?77^:?JJJJYYJJJYYYYYYJJYYYJJJJJ:^77?JJJJ??JJJJJJJ?JJJJJJJJ^:7!Y"+color.RESET+"@@@@@");
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@#GGGGG&@&GGGGG#@@BGGGGB@ "+color.RESET+":"+color.GREEN+"@&GGGGGB@@BGGGGB@@#GGGGG&@"+color.RESET+" "+color.GREEN+"7@BGGGGB@@#GGGGG&@&GGGGG#@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"^:PP5.?@Y.5PP^:@# ?PP7."+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"Y.5PP^:@# ?PP7 #@:^PP5.Y"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"&.7PP? #@:^PP5.J@?.5PP:^"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"^!@@@:?@Y.&@@7^@B.B@@G."+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"Y.&@@?:@#.G@@G.#@:7@@&.Y"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"&.G@@B.#@:7@@&.J@?:@@@!^"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"^^&&#.7@Y.B&&~:@B 5&&Y "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"Y.B&&!:@# 5&&5 #@:~&&B.Y"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"& Y&&5 B@:~&&B.J@7.#&&~^"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"5?JJJ7G@B7JJJ?5@&??JJ?J"+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"B7???!J&&777777&&J!???7B"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"&??JJ??&@5?JJJ7B@G7JJJ?5"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@&BGGBB&@&BBBBB#@@#BGGB#@ "+color.RESET+":"+color.GREEN+"@@@@?~??77???7??77??~?@@@@"+color.RESET+" "+color.GREEN+"7@#BGBB#@@#BGBBB&@&BBBGB&@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"~:55Y.?@Y.Y55^^@#.755!."+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"@@@^~@&&&&&&&&&&&&@~^@@@"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"&.7557.#@^^55Y.Y@?.Y55:^"+color.GREEN+"@"+color.RESET+""+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"^!@@@:?@Y.&@@7:@#.B@@G."+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"@@@^!@@@@@@@@@@@@@@!^@@@"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"&.G@@B.#@:7@@&.J@?:@@@!^"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"^~&&#.?@Y.#&&~:@B P&&5 "+color.GREEN+"& "+color.RESET+":"+color.GREEN+"@"+color.RESET+"@@@^!@@@@@@@@@@@@@@!^@@@"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"& Y&&P B@:~&&#.J@?.#&&~^"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"~~"+color.RESET+color.GREEN+"@"+color.RESET+"57???!G@B!???7Y@&77??77"+color.GREEN+"@ "+color.RESET+":"+color.GREEN+"@"+color.RESET+"@@@^!@@@@@@@@@@@@@@!^@@@"+color.GREEN+"@"+color.RESET+" "+color.GREEN+"7"+color.RESET+"@77??77&@Y7???!B@G!???75"+color.GREEN+"@"+color.RESET+color.CYAN+"~~"+color.RESET+"@@@@@@@@"+color.RESET);
System.out.println("\t\t\t@@@@@@&B"+color.CYAN+":^"+color.RESET+color.GREEN+"BBBBBBBBBBBBBBB#BB#BBBB## "+color.RESET+":"+color.GREEN+"BBBB:^#BBBBBBBBBBBB#^:BBBB"+color.RESET+" "+color.GREEN+"~##BBBB#BB#BBBB#BBBBBBBB#B"+color.RESET+color.CYAN+"~~"+color.RESET+"B&@@@@@@");
System.out.println("\t\t\t@@@@@@"+color.CYAN+"^:JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ:^"+color.RESET+"@@@@@@");
System.out.println("\t\t\t@@@@@@"+color.CYAN+"7~????????????????????????????????????????????????????????????????????????????????????~7"+color.RESET+"@@@@@@");
System.out.println("\t\t\t@@@@@@@@"+color.CYAN+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+color.RESET+"@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println();
	
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t\u001B[7m"+"\u001B[3m"+"1.CHAITANYA BAR & RESTAURANT\u001B[0m"+color.RESET);
		System.out.println();
		System.out.println(color.BRIGHT_BLUE+"\t\t\t\t\t\t\t\t\u001B[7m"+"\u001B[3m"+"2.SITARA GRAND BAR & RESTAURANT\u001B[0m"+color.RESET);
		//System.out.println("\t\t\t\t\t     -----------------------------------------------------------");
		int r = vegrices.sc.nextInt();
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
			System.out.println(color.PURPLE+"\t\t\t\t\t2.Exit"+color.RESET);
			int inv = vegrices.sc.nextInt();
			if(inv==1){
				res.restuarant();
			}
			else{
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t    THANKS FOR VISITING          "+color.RESET);
				System.out.println(color.BRIGHT_GREEN+"\t\t\t\t\t\t\t        VISIT AGAIN          "+color.RESET);
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
System.out.println("\t\t\t\t"+color.RED+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RESET);

System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&#GPB#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#GPY?!~~~!?J7!~~!?5G#&&@@@@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@&G55Y77!?YPB#&@@@@@@@@&#G5J7!!!7JPG&@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@GJ?^.:~JP#&@@@@@@@@@@@@@@&#GY!:.:~!G@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@::##GY::~!!?YPBBGY?!!~::?5G#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^:@@@@^.?5PP5J!!?YPP5?.^@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"&&&@@@@@@@@@@@@@@@@@@@@&&@@@@@B::#@&!:Y5?!!!!!7!!!!?5J:7@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B.!~.#&.:B@@@@&&&&&@@@@@B^.&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#^^^^&@&7.5@@@@@@@@@@@@5.7&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@@@@@~.P@@@@@@@@@@P.~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Y:~B@@@@@@B~:5@@@@@@@@@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&Y:^7??7^:5@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&B57!!!:.?YJ7.:??7?P#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&GJ!~!JG#G.:Y?7?J~.7BBP?~~!Y#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@P^~P#&@@@@@5.5@@@#:!@@@@@@&BJ^~#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@&BBBBBBY.^B##BBBBBBB:.5GG:.5#BBBBB###P..G#BBBGB&@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@&@&::77777??777777777???77????777777777???77777:.#@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@^:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@::@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@7.B@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@#.!@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@&&@@@@@@@@@5.5@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@G.J@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@&&&@@@@@@@@@B.^JJ???????????????????????J??JP5??????JJJ^.B@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@#BY.~BGGGGBBBGGGBBBGGGBBBGGGGG##GGGBBBB!.JB#@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@B:Y@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@J.B@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@B:J@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@J.G@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@B.7@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@?.B@@@@@@@@@@@@@@@@@@@@@@@&&&"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@B.7@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@J^#@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@#.7@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@5^B@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@B.?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@J.B@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@B.?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@J.G@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@&&&@@@@@@@@@@@@#.^??JJ?7??JJJ???JJJ???JJJ????JJJ???J^.G@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@BBBGGGGBBBGGGBBBGGGGBBGGGGBBGGGGBBGGGB@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@"+color.RESET+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RED+"@@"+color.RESET);

System.out.println("\t\t\t\t"+color.RED+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RESET);
System.out.println("\t\t\t\t"+color.RED+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RESET);
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
                System.out.println("\t\t\t\t\t"+color.BRIGHT_WHITE+""+color.RESET+color.CYAN+"\tBiller Name:"+color.RESET+"Anvesh                                       \t       ");
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
        System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.27/09/23\n\t\t\t\t\t\t2.28/09/23\n\t\t\t\t\t\t3.29/09/23\n\t\t\t\t\t\t4.30/09/23");
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
            System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.27/09/23\n\t\t\t\t\t\t2.28/09/23\n\t\t\t\t\t\t3.29/09/23\n\t\t\t\t\t\t4.30/09/23");
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
                Confirmation("27-09-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("27-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("27-09-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","9:45PM",a,n1,c);
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
                Confirmation("28-09-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("28-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("28-09-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("28-09-23","9:45PM",a,n1,c);
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
                Confirmation("29-09-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("29-09-23","2:30PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("29-09-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("29-09-23","9:45PM",a,n1,c);
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
                Confirmation("30-09-23","11:30PM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","9:45PM",a,n1,c);
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
        System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.27/09/23\n\t\t\t\t\t\t2.28/09/23\n\t\t\t\t\t\t3.29/09/23\n\t\t\t\t\t\t4.30/09/23");
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
            System.out.println("\u001B[33m"+"\t\t\t\t\t\t1.27/09/23\n\t\t\t\t\t\t2.28/09/23\n\t\t\t\t\t\t3.29/09/23\n\t\t\t\t\t\t4.30/09/23");
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
                Confirmation("27-09-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("27-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("27-09-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","9:45PM",a,n1,c);
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
                Confirmation("28-09-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("28-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("28-09-23","6:30PM",a,n1,c);
            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("28-09-23","9:45PM",a,n1,c);
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
                Confirmation("29-09-23","11:30AM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("29-09-23","2:30PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("29-09-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("29-09-23","9:45PM",a,n1,c);
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
                Confirmation("30-09-23","11:30PM",a,n1,c);
            }
            else if(n==2){
               System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","2:45PM",a,n1,c);
            }
            else if(n==3){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","6:30",a,n1,c);
            }
            else if(n==4){
                System.out.println("\t\t\t\t\t\tHOW MANY TICKETS YOU WANT");
                int n1=sc.nextInt();
                System.out.println("\t\t\t\t\t\tConfirmation of Your Tickets");
                Confirmation("30-09-23","9:45PM",a,n1,c);
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
	static Area are = new Area();
    static Theatre the = new Theatre();
     void theatre(){
	System.out.println("\u001B[32m"+"\t\t\t\t\t\t\t\t   \u001B[4mWELCOME TO KPHB COLONY\n\u001B[0m");
	System.out.println(color.BRIGHT_RED+"\u001B[3m\t\t\t\t\t\t\t\t\t  THEATRES\u001B[0m"+color.RESET);
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
			String opt = User.sc.next();
			if(opt.equals("yes")){
				System.out.println(color.CYAN+"\t\t\t\t\tSelect Payment Method: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t1 for PAYTM: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t2 for PHONEPE: "+color.RESET);
				int p = User.sc.nextInt();
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
				int p1 = User.sc.nextInt();
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

		int h1 = User.sc.nextInt();
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
			int r = User.sc.nextInt();
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
			String opt = User.sc.next();
			if(opt.equals("yes")){
				System.out.println(color.CYAN+"\t\t\t\t\tSelect Payment Method: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t1 for PAYTM: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t2 for PHONEPE: "+color.RESET);
				int p = User.sc.nextInt();
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
				int p1 = User.sc.nextInt();
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

		int h2 = User.sc.nextInt();
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
			int r = User.sc.nextInt();
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
			String opt = User.sc.next();
			if(opt.equals("yes")){
				System.out.println(color.CYAN+"\t\t\t\t\tSelect Payment Method: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t1 for PAYTM: "+color.RESET);
				System.out.println(color.BRIGHT_RED+"\t\t\t\t\t2 for PHONEPE: "+color.RESET);
				int p = User.sc.nextInt();
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
				int p1 = User.sc.nextInt();
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

		int h3 = User.sc.nextInt();
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
			int r = User.sc.nextInt();
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
		System.out.println("\t\t\t   "+color.BRIGHT_WHITE+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RESET);
		System.out.println("\t\t\t   "+color.BRIGHT_WHITE+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+color.RESET);
		System.out.println("\t\t\t   "+color.BRIGHT_WHITE+"@@@                                                                                    @@@"+color.RESET);
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJ     JJJJ     JJJJJJJJJ      JJJJJJJJ JJJJJJJJJJJ JJJJJJJJJJJ JJJ"+color.RESET+"           @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJ     JJJJ  JJJJJJJJJJJJJJ   JJJJJJJJJ JJJJJJJJJJJ JJJJJJJJJJJ JJJ"+color.RESET+"           @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJ     JJJJ JJJJ        JJJJ JJJJ           JJJJ    JJJ         JJJ"+color.RESET+"           @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJJJJJJJJJJ JJJJ        JJJJ  JJJJJJJJ      JJJJ    JJJJJJJJJJJ JJJ"+color.RESET+"           @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJJJJJJJJJJ JJJJ        JJJJ  JJJJJJJJJ     JJJJ    JJJJJJJJJJJ JJJ"+color.RESET+"           @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJ     JJJJ JJJJ        JJJJ        JJJJJ   JJJJ    JJJ         JJJ"+color.RESET+"           @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJ     JJJJ   JJJJJJJJJJJJJ   JJJJJJJJJJJ   JJJJ    JJJJJJJJJJJ JJJJJJJJJ"+color.RESET+"     @@@");
		System.out.println("\t\t\t   @@@    "+color.GREEN+"JJJJ     JJJJ    JJJJJJJJJJ     JJJJJJJJJJ    JJJJ    JJJJJJJJJJJ JJJJJJJJJ"+color.RESET+"     @@@");
		System.out.println("\t\t\t   "+color.BRIGHT_WHITE+"@@@                                                                                    @@@");
		System.out.println("\t\t\t   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\t\t\t   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
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
			
			System.out.println(color.GREEN+"\t\t\t\t\t\t\t\tTHANK YOU FOR USING OUR SERVICES!"+color.RESET);
			System.out.println(color.GREEN+"\t\t\t\t\t\t\t\t          VISIT AGAIN"+color.RESET);
		}

	}
}
class Insta {
    private String username="a";
    private String password="a";
    private long phno=6303196513l;
    Insta(String username,String password,long phno)
    {
        this.username=username;
        this.password=password;
        this.phno=phno;
    }
    Insta()
    {

    }
    void setName(String username)
    {
        this.username=username;
    }
    void setPass(String password)
    {
        this.password=password;
    }
    String getName()
    {
        return username;
    }
    String getPass()
    {
        return password;
    }
    long getPh()
    {
        return phno;
    }
}
class User
{
    static Scanner sc=new Scanner(System.in);  
    static Insta x=new Insta();
    static Area are = new Area();
    static void login()
    {
        System.out.println("please enter your credentials to login: ");
        System.out.println("please enter your username: ");
        String name=sc.next();
        System.out.println("please enter your password: ");
        String pass=sc.next();
        if(name.equals(x.getName()) && pass.equals(x.getPass()))
        {
            System.out.println("Login successfull..");
	    System.out.println();
	System.out.println();
            are.area();

        }
        else if(!(name).equals(x.getName()) && !(pass).equals(x.getPass()))
        {
            System.out.println("Invalid credentials....");
            while(true){
                System.out.println("please enter your mobile number to know your username: ");
                long phno=sc.nextLong();
                if(phno==x.getPh())
                {
                    System.out.println("your username : "+x.getName());
                    login();
                    break;
                }
                else{
                    System.out.println("Incorrect mobile number press 1 to renter press any number to exit application: ");
                    int n=sc.nextInt();
                    if(n!=1)
                    {
                        break;
                    }
                }
            }
        }
        else if(!(name).equals(x.getName()))
        {
            System.out.println("Invalid username..\npress 1 to reset press any key to exit: ");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Please enter your new username: ");
                x.setName(sc.next());
                System.out.println("Username updated successfully..");
                System.out.println("Your new username : "+x.getName());
                login();
            }
            else{
            	System.out.println("THANKS FOR VISITING...");
            	System.out.println("VISIT AGAIN...");
            }
        }
        else{
             System.out.println("Invalid password..\npress 1 to reset press any key to exit: ");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Please enter your new password: ");
                x.setPass(sc.next());
                System.out.println("Password updated successfully..");
                System.out.println("Your new Password : "+x.getPass());
                login();
            }
            else{
            	System.out.println("THANKS FOR VISITING...");
            	System.out.println("VISIT AGAIN...");
            }
        }
    }
    static void signup()
    {
        System.out.println("please enter your credentials to create a new account: ");
        System.out.println("enter usename: ");
        String name=sc.next();
        System.out.println("enter Password: ");
        String pass=sc.next();
        System.out.println("enter your mobile number: ");
        long phno=sc.nextLong();
        x=new Insta(name,pass,phno);
        System.out.println("account created successfully..");
        login();
    }
	public static void main(String[] args) {
	    
	    System.out.println("1 signup:\n2 login:");
	    int n=sc.nextInt();
	    if(n==1){
	        signup();
	    }
	    else if(n==2){
	       login();   
	    }
	    else{
	        System.out.println("Invalid selection..");
	        main(args);
	    }
	  
	}
}