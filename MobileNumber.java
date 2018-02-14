package pack1;

import java.text.DecimalFormat;

public class MobileNumber 
{
	public static void main(String[] args) {
		
	
	long phoneFmt = 123456789L;
	 
	DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
	String phoneRawString= phoneDecimalFmt.format(phoneFmt);

	java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
	   
	String[] phoneNumArr={phoneRawString.substring(0, 3),
	          phoneRawString.substring(3,6),
	          phoneRawString.substring(6)};

	System.out.println(phoneMsgFmt.format(phoneNumArr));
	}


}
