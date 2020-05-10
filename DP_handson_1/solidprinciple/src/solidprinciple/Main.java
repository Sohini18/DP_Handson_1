package solidprinciple;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. You would like to order or repair");
		String processOption= sc.nextLine();
		ProcessRepair processRepair=new ProcessRepair();
		PhoneOrder phoneOrder=new PhoneOrder();
		switch(processOption) {
		case "order":
			System.out.println("Please provide the model name");
			phoneOrder.ProcessOrder(sc.nextLine());
			break;
		case "repair":
			System.out.println("Is it the phone or the accesory you want to repair");
			String productType=sc.nextLine();
			if(productType.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name");
				processRepair.ProcessPhoneRepair(sc.nextLine());
				
			}
			else {
				System.out.println("Please provide the accesory details like headphones,charger etc");
			    processRepair.ProcessAccesoryRepair(sc.nextLine());
			}
			break;
		default:
			break;
			
		
		
		
		
		}

	}

}
