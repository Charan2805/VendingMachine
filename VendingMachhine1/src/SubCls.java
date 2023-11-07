import java.util.*;
public class SubCls extends SuperCls {
void snacks() {
	System.out.println("enter 1 for samosa");
	System.out.println("enter 2 for bingo");
	System.out.println("enter 3 for biscuits");
	Scanner a;
	a= new Scanner(System.in);
	i=a.nextInt();
	
switch (i) {
case 1:
	System.out.println("samosa");
	 ItemName="samosa";
	Enter();
	Bill();
	break;
case 2:
	System.out.println("bingo");
	 ItemName="bingo";
	Enter();
	Bill();
	break;
case 3:
	System.out.println("biscuits");
	 ItemName="biscuits";
	Enter();
	Bill();
	break;
	
}

}
}
