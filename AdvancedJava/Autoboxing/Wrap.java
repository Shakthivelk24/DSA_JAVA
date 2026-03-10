package AdvancedJava.Autoboxing;

class Wrap {
	public static void main(String args[]) {
        //Integer iOb = 100; //Autoboxing - compiler converts this to Integer.valueOf(100);
		Integer iOb = new Integer(100); //Explicitly creating an Integer object - not recommended, but it works.
		//Integer iOb = 100;
		int i = iOb.intValue();
		System.out.println(i + " " + iOb); // displays 100 100
	}
}
