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
				System.out.println(ORANGE+"---------------------------------------------* * * YOUR ACCOUNT SIGNUP COMPLETED SUCCESFULLY * * *-------------------------------------"+RESET);
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
				System.out.println(ORANGE+"--------------------------------------------* * * YOUR ACCOUNT LOGIN SUCCESFULLY * * *-------------------------------------------------"+RESET);
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