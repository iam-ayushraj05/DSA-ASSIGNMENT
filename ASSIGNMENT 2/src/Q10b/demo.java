package Q10b;

import Q10a.test;

public class demo extends test implements sports{
	
public static void main(String []args) {
	demo obj =new demo();
	 obj.inputdetail();
	obj.showdeatils();
	System.out.println("grand total marks is" + (obj.mark1 + obj.mark2));
	System.out.println("grand total of score is  "+ (score1+score2));
}
}
