import java.util.*;
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
Scanner scan = new Scanner(System.in);
System.out.println("enter 1 for chocalates");
System.out.println("enter 2 for snacks");
System.out.println("enter 3 for cooldrinks");
System.out.println("enter 4 for cigarettes");
	i=scan.nextInt();
	switch(i) {
	case 1 :
		System.out.println("chocolates");
		SuperCls s;
		s = new SuperCls();
		s.chocolates();
		break;
	case 2:
		System.out.println("snacks");
		SubCls s2;
		s2 = new SubCls();
		s2.snacks();
		break;
	case 3:
		System.out.println("cooldrinks");
		DerivedCls s3;
		s3 = new DerivedCls();
		s3.cooldrinks();
		break;
	case 4:
		System.out.println("cigarettes");
		DerivedCls s4;
		s4 = new DerivedCls();
		s4.cigarettes();
		
		
		
		
	
	}

	

	}
}