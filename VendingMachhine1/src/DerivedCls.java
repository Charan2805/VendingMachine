import java.util.*;
public class DerivedCls extends SubCls {
	void cooldrinks() {
		System.out.println("enter 1 for thumsup");
		System.out.println("enter 2 for sprite");
		System.out.println("enter 3 for maaza");
		Scanner b;
		b= new Scanner(System.in);
		i=b.nextInt();
		
	switch (i) {
	case 1:
		System.out.println("thumsup");
		 ItemName="thumsup";
		Enter();
		Bill();
		break;
	case 2:
		System.out.println("sprite");
		 ItemName="sprite";
		Enter();
		Bill();
		break;
	case 3:
		System.out.println("maaza");
		 ItemName="maaza";
		Enter();
		Bill();
		break;
	}
	}
	void cigarettes() {
		System.out.println("enter 1 for lights");
		System.out.println("enter 2 for kings");
		System.out.println("enter 3 for americanclub");
		Scanner c;
		c= new Scanner(System.in);
		i=c.nextInt();
		
	switch (i) {
	case 1:
		System.out.println("lights");
		 ItemName="lights";
		Enter();
		Bill();
		break;
	case 2:
		System.out.println("kings");
		 ItemName="kings";
		Enter();
		Bill();
		break;
	case 3:
		System.out.println("americanclub");
		 ItemName="americanclub";
		Enter();
		Bill();
		break;
	}
}
}