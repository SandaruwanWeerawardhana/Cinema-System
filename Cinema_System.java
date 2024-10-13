import java.util.*;
class Cinema_System{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);
		System.out.println("\t==================================================================================");
		System.out.println("\t||   		                                                 	       ||");
		System.out.println("\t|| 	  	                                                	       ||");
		System.out.println("\t||	                           %@@@%                                       ||");
		System.out.println("\t||	                       .%@@@@@@@@@@@.            	               ||");
		System.out.println("\t||	        .#@@#.        .%@@@@@@@@@@@@@%.          	               ||");
		System.out.println("\t||	      +@@@@@@@@+     %@@@@@@@@@@@@@@@@%*           	               ||");
		System.out.println("\t||	      @@@@@@@@@@     .%@@@@@@@@@@@@@@%*.		               ||");
		System.out.println("\t||	      +@@@@@@@%.       %@@@@@@@@@@@@%#    	  	               ||");
		System.out.println("\t||	        *@@@%*            *%@@@@%*      		       	       ||");
		System.out.println("\t||	      #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$  		               ||");
		System.out.println("\t||	     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$            %@@                ||");
		System.out.println("\t||	    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@          @@@@                ||");
		System.out.println("\t||	    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                ||");
		System.out.println("\t||	    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                ||");
		System.out.println("\t||	    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                ||");
		System.out.println("\t||	    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                ||");
		System.out.println("\t||	     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                ||");
		System.out.println("\t||	      $@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$         $@@@@                ||");
		System.out.println("\t||	        $@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$             $@@                ||");
		System.out.println("\t||	              @@@@       @@@@                                          ||");
		System.out.println("\t||	             @@@@         @@@                                          ||");
		System.out.println("\t||	            @@$            $@@                                         ||");
		System.out.println("\t|| 									       ||");
		System.out.println("\t|| 	     _____  ___________   __________   _________    _______            ||");
		System.out.println("\t||          /  _  \\/_  __/  __/  / ___/_  _/ \\/  / __/   \\ /  / _ \\            ||");
		System.out.println("\t||         /     _/ / / _\\ \\    / /____/ //     / _//  /\\_/  /  _  \\           ||");
		System.out.println("\t||        /__/\\__\\ /_//___ /    \\____/___/__/\\_/___/__/  /__/__/ \\_ \\          ||");
		System.out.println("\t||                                                                             ||");
		System.out.println("\t||=============================================================================||");
		
		System.out.print("\n\tEnter Date: ");
		String da = input.next();
		input.nextLine();  
		System.out.print("\n\tLocation: ");
		String loca = input.nextLine(); 
		
		//Avaiable Films

		System.out.println("\t   _            _ _     _    _         ___ _ _          ");
	        System.out.println("\t  /_\\__   _____(_) |___| |__| |____  | __(_) |_,___   __");
	        System.out.println("\t / _ \\ \\/ / _  | | / _ |  _ \\ /  __) | _|| | |     \\(_<   ");
       	 	System.out.println("\t/_/ \\_\\__/\\__ _|_|_\\_ _|__ _/_\\___|  |_| |_|_|_|_|_/__/       ");
        	System.out.println("\t==========================================================");	

        
        	System.out.println("\n\t1) Movie 1 - Hall 1\t\t2) Movie 2 - Hall 2");
        	System.out.println("\t3) Movie 3 - Hall 3\t\t4) Movie 4 - Hall 4\n");

		System.out.print("\nEnter Movie Name: ");
		String movie=input.nextLine();
		
		System.out.println("\t   _______           ");
		System.out.println("\t  |__   __|_         ");
		System.out.println("\t     | |  (_)_ __ __     ___ ");
		System.out.println("\t     | |  | |  _   _ \\ / _  \\ ");
		System.out.println("\t     | |  | | | | | | |  ___/    ");
		System.out.println("\t     |_|  |_|_| |_| |_|\\____|        ");
		System.out.println("\t================================== ");

                System.out.println("\n\t\t1)9.00 A.M\n\t\t2)2.00 P.M\n\t\t3)7.00 A.M ");
		System.out.print("Enter Time : ");
		int time=input.nextInt();
		input.nextLine();

		System.out.println("\t\t\t  ______          _       ");
		System.out.println("\t\t\t /  ___ \\        | |               ");
		System.out.println("\t\t\t | /  \\/_   _  __| |_ ____   _,__,____  ___ __,__          ");
		System.out.println("\t\t\t | |   | | | / __| __/  _  \\|  _   _ \\/   _ \\  __|   ");
		System.out.println("\t\t\t | \\__/\\ |_| \\__ \\ ||  (_)  | | | | | |  ___/ |   ");
		System.out.println("\t\t\t \\_____/\\_,__|___/\\__/\\____/|_| |_| |_|\\____|_|                ");
		System.out.println("\t\t\t  ");
		System.out.println("\t\t\t================================================== ");
		
		System.out.print("\tName : ");
		String fname=input.nextLine();
		System.out.print("\tPhone Number : ");
		String pnumber=input.nextLine();
		System.out.print("\tChild OR Parent : ");
		String cparent=input.nextLine();
		System.out.print("\tNumber Of Ticket : ");
		int ticket=input.nextInt();

		int tax = 72;
		int price = 90;
		double z = 0.8; 
		int x = (int)(ticket * price * z); 
		System.out.println("\t=================================================================================");
		System.out.println("\t|| 	     _____  ___________   __________   _________    _______            ||");
		System.out.println("\t||          /  _  \\/_  __/  __/  / ___/_  _/ \\/  / __/   \\ /  / _ \\            ||");
		System.out.println("\t||         /     _/ / / _\\ \\    / /____/ //     / _//  /\\_/  /  _  \\           ||");
		System.out.println("\t||        /__/\\__\\ /_//___ /    \\____/___/__/\\_/___/__/  /__/__/ \\_ \\          ||");
		System.out.println("\t||                                                                             ||");
		System.out.println("\t||-----------------------------------------------------------------------------||");
		System.out.println("\t|| Date : " + da +"                                 "+"Location : "+ loca +"                       "+"||");
		System.out.println("\t||					                                       ||");
		System.out.println("\t|| Name            : " + fname +"                                                         "+"||");
		System.out.println("\t|| Phone Number    : " + pnumber +"                                                         "+"||");
		System.out.println("\t|| Ticket          : " + ticket +"                                                         "+"||");
		System.out.println("\t|| Type            : " + cparent +"                                                         "+"||");
		System.out.println("\t|| Time            : " + time+"                                                         "+"||");
		System.out.println("\t|| Hall            :"+"Hall "+movie+"                                                     "+"||");
		System.out.println("\t|| Tax             : " + tax +"                                                        "+"||");
		System.out.println("\t||                                                       Total : "+x+"           "+"||");
		System.out.println("\t====================================================================================");
			
 	




	}
}

