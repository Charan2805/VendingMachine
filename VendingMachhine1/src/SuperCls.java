import java.util.Scanner;
public class SuperCls {
	int i;
	int Quantity;
	int Money;
	int Change;
	int Cost;
	String ItemName;
	int Total;
	void Enter() {
		Scanner a;
		a = new Scanner (System.in);
		System.out.println("enter items you want...");
		System.out.println("enter 1 for 10rupees");
		System.out.println("enter 2 for 20rupees");
		Cost=a.nextInt();
		switch (Cost) {
		case 1:
		    System.out.println("cost : 10rupees");
		    Cost=10;
		    break;
		case 2:
		    System.out.println("cost : 20rupees");
		    Cost=20;
		    break;
		default:
			 System.out.println("you entered incorrect");
		     break;
		}
	
		System.out.println(" Enter Quantity");
		Quantity = a.nextInt();
	
	if(Quantity>25) {
		System.out.println("items are not available");
	}
	else{
		Total=Quantity*Cost;
		System.out.println("Total Amount : "+ Total);
		System.out.println("Insert your money");
		Money=a.nextInt();
	}
	if(Money>Total) {
		
		Change=Money-Total;
	}
	 }
	void Bill() {
		if(Money<Total) {
			System.out.println("Money is not sufficient");
			System.out.println("Insert your Correct amount");
		}
		if(Quantity>25){
		System.out.println("items are available");
		}
		else if(Money>=Total) {
			System.out.println("***bill details***");
			System.out.println("ITEAM NAME:"+ ItemName);
			System.out.println("ITEM COST:"+Cost);
			System.out.println("ITEAM QUANTITY:"+Quantity);
			System.out.println("Total Amount:"+Total);
			System.out.println("your change here :"+Change);
			System.out.println("****THANK YOU****");
		}
 
		
	}
	void chocolates() {
		System.out.println("enter 1 for dairymilk");
		System.out.println("enter 2 for kitkat");
		System.out.println("enter 3 for munch");
		Scanner a;
		a= new Scanner(System.in);
		i=a.nextInt();
		
	switch (i) {
	case 1:
		System.out.println("dairymilk");
		 ItemName="Dairy_Milk";
		Enter();
		Bill();
		break;
	case 2:
		System.out.println("kitkat");
		 ItemName="kitkat";
		Enter();
		Bill();
		break;
	case 3:
		System.out.println("munch");
		 ItemName="munch";
		Enter();
		Bill();
		break;
		
	}
	
}
}
