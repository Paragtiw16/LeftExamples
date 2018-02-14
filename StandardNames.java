package pack1;

import java.util.Scanner;

public class StandardNames 
{
	public static void main(String[] args) {
	    int youngest =0,older=0;
	     String[] name = new String[10];
	         int[] age = new int[10];
	         String NAME_REQUEST = ("Please enter name");
	         String AGE_REQUEST = ("Please enter age");

	    for(int i=0 ; i< 10;i++){
	       Scanner in = new Scanner(System.in);
	       System.out.println(NAME_REQUEST); 
	    String tmpName = in.nextLine();
	    if(tmpName.equalsIgnoreCase("done"))
	    break;
	    name[i] = tmpName;
	    System.out.println(AGE_REQUEST);
	    age[i] = in.nextInt();
	    if(age[i] > age[older])
	    older = i;
	    if(age[i] < age[youngest])
	    youngest = i;

	    }

	     System.out.println("OLDER is  : " + name[older]);
	     System.out.println("Younger : " + name[youngest]);

	}

}
