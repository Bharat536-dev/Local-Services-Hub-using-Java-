import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
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
   	public static void main(String[] args)
    {
        

        while (true)
        {
	   
	     
	    
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