import java.util.Scanner;

public class Client {
public static void main(String[] args) {
	int choice = 0;
	Scanner sc = new Scanner(System.in);
	Factory factory;
	do {
		System.out.print("Do you want Audi or Mercedes? : ");
		String str = sc.nextLine().trim().toLowerCase(); 
		switch (str) {
		case "audi":{
			factory = new AudiFactory();
			break;
		}
		case "mercedes":{
			factory = new MercedesFactory();
			break;
		}
		default:
			factory=null;
		}
		if(factory!=null) {
		Headlight headlight = factory.makeHeadlight();
		Tire tire = factory.makeTire();
		headlight.flash();
		tire.vroom();
		}
		System.out.print("Enter 1 for more cars : ");
		choice = Integer.parseInt(sc.nextLine());
	}
	while(choice!=1);
	sc.close();
}
}
