/*ATANDA ADAMS DAMILARE
 * +2347067509331
 * Telegram: adamix
 * */
import java.util.InputMismatchException;

import java.util.Scanner;
public class Project {
	static Scanner sc= new Scanner(System.in);
public static void Welcome(){
	  System.out.println("This is a universal equation solver for different Shapes");
	  System.out.println("");
	  System.out.println("***************** Welcome!*********************"); 
	}
public static void Continue() {
	int a;
	while (true) {
	try {
	System.out.println("Do you want to calculate for another equation? reply 1 for Yes OR 2 for No");
	a=sc.nextInt();
	if(a==1) {
		EquList();
		
	}
	else if(a==2) {
		System.out.println("Thank you for using our Application");
		System.exit(0);
	}
	else {
		System.out.println("incorrect, choose 1 or 2");
	}
	}
	catch(InputMismatchException e) {
		System.out.println("incorrect, choose 1 or 2");
		sc.next();
	}
	}
	
}
public static void EquList(){
int a = 0 ;

  System.out.println("This is the list of What this program can currently solve,Please choose 1-10 accordingly");
  System.out.println("1.Area of a circle");
  System.out.println("2.Circumference of a circle");
  System.out.println("3.Perimeter of a square");
  System.out.println("4.Area of a square");
  System.out.println("5.Area of a triangle");
  System.out.println("6.Surface area of a cylinder");
  System.out.println("7.Volume of a cylinder");
  System.out.println("8.Surface area of a sphere");
  System.out.println("9.Volume of a sphere");
  System.out.println("10.Perimeter of a rectangle");
 try { 
  
a=sc.nextInt();
 }
 catch (InputMismatchException e) {
	 System.out.println("");
	 sc.next();
	 
 }
 
  switch(a){
  case 1:
  AreaOfCircle();
  break;
  case 2:
  CirOfCircle();
  break;
  case 3:
  PeriOfSquare();
  break;
  case 4:
  AreaOfSquare();
  break;
  case 5:
  AreaOfTri();
  break;
  case 6:
  SurfAreaOfCyl();
  break;
  case 7:
  VolOfCyl();
  break;
  case 8:
  SurfAreaOfSph();
  break;
  case 9:
  VolOfSph();
  break;
  case 10:
  PeriOfRect();
  break;
  default:
  System.out.println("invalid selection,input 1-10"); 
  EquList();
  }
 
 }
  
   
public static void PeriOfRect() {
	double input1 = 0,input2 = 0,peri = 0;
	System.out.println("calculate the perimeter of a rectangle");
	try {
	System.out.println("Enter the value for length");
	
	input1=sc.nextDouble();
	System.out.println("Enter the value for width");
	input2=sc.nextDouble();
	
	
	
	peri=2*(input1 + input2);
	
	System.out.println("The perimeter is:"+peri);
	
	}
	catch(InputMismatchException e){
		System.out.println("input an integer");
		sc.next();
		PeriOfRect();
		
	}	
}
	
public static void VolOfSph() {
	double r,vol;
	try {
	System.out.println("Calculate volume of a sphere");
	System.out.println("Enter the value for radius");
	r=sc.nextDouble();
	vol=(1.333)*(3.142)*(r*r*r);
	System.out.println("The volume of the sphere is:"+vol);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		VolOfSph();
		
	}
	
}
public static void SurfAreaOfSph() {
	double r,surf;
	try {
	System.out.println("Calculate the surface Area of a sphere");
	System.out.println("Enter the value for radius");
	r=sc.nextDouble();
	surf=4*(3.142)*(r*r);
	System.out.println("The surface area is:"+surf);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		SurfAreaOfSph();
	}
	
	
}
public static void VolOfCyl() {
	double vol,r,h;
	try {
	System.out.println("Calculate the volume of a cylinder");
	System.out.println("Input the radius");
	r=sc.nextDouble();
	System.out.println("input the height");
	h=sc.nextDouble();
	vol=(3.142)*(r*r)*h;
	System.out.println("the volume of the cylinder is:"+vol);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		VolOfCyl();
	}
	
}
public static void SurfAreaOfCyl() {
	double r,h,area;
	try {
	System.out.println("Calculate the Surface area of a cylinder");
	System.out.println("Enter the value for radius");
	r=sc.nextDouble();
	System.out.println("Enter the value for height");
	h=sc.nextDouble();
	area=((2*3.142*r*r)+ (2*3.142*r*h));
	System.out.println("The surface area is:"+area);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		SurfAreaOfCyl();
	}
}
public static void AreaOfTri() {
	// TODO Auto-generated method stub
	double b,h,area;
	try {
	System.out.println("Calculate the area of a triangle");
	System.out.println("Enter the value for base");
	b=sc.nextDouble();
	System.out.println("Enter the value for height");
	h=sc.nextDouble();
	area=(0.5*b*h);
	System.out.println("The area of the triangle is:"+area);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		AreaOfTri();
	}
	
}
public static void AreaOfSquare() {
	double l,area;
	try {
	System.out.println("Calculate the area of a square");
	System.out.println("Enter the length");
	l=sc.nextDouble();
	area=l*l;
	System.out.println("The area of the Square is:"+area);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		AreaOfSquare();
	}
	
}
public static void PeriOfSquare() {
	double l,peri;
	try {
	System.out.println("Calculate the perimeter of a square!");
	System.out.println("input the value of the length of one side of the square ");
	l=sc.nextDouble();
	peri= 4*l;
	System.out.println("the perimeter of the square is:"+peri);}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		PeriOfSquare();
	}
	
}
public static void CirOfCircle() {
	double peri,r,d,output;
	try {
	System.out.println("Calculate the circumference of a circle");
	System.out.println("Are you given radius or diameter? reply with 1 or 2 respectively");
	output=sc.nextDouble();
	if(output==1) {
		
		System.out.println("Enter the value of the radius ");
		r=sc.nextDouble();
		peri= 2*(3.142)*r;
		System.out.println("The perimeter is: "+peri);	
	}
	else if(output==2) {
		System.out.println("Enter the value of diameter");
		d=sc.nextDouble();
		peri=(3.142)*d;
		System.out.println("the perimeter is:"+peri);		
	}
	else {
		System.out.println("Wrong input!");
		CirOfCircle();}
	 
		
	}
	catch(InputMismatchException e) {
		System.out.println("input an integer");
		sc.next();
		CirOfCircle();
		
	}
	}

public static void AreaOfCircle(){
	  int option;
	  double area,rad,diam;
	  System.out.println("Calculate Area of a circle");
	  System.out.println("Enter 1 to supply radius, 2 for diameter\n");
	   option=sc.nextInt();
	   if(option==1)
	   {
	     System.out.println("supply radius");
	     rad=sc.nextDouble();
	     area=(3.142)*(rad*rad);
		   System.out.println("area is "+area);
	     
	   }
	   else if(option==2)
	   {
	   System.out.println("Supply Diameter");
	   diam=sc.nextDouble();
	   area=(3.142)*((diam*diam))/4;
	     System.out.println("area is "+area);
	   
	   }
	   else{
	     System.out.println("Wrong Input,try 1 or 2\n\n"); 
	     AreaOfCircle();
	   }
	 
	  }
	public static void main(String[] args) {
		Project a=new Project();
		a.Welcome();
		a.EquList();
		a.Continue();

	}

}

