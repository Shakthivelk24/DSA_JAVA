package AdvancedJava.Enumeration;

/* enum - switch */
enum Season { SUMMER,RAINY,WINTER,SPRING; }

public class EnumExample3 {
    Season s;
 
    // Constructor
    public EnumExample3(Season s) { this.s = s; }
 
    // Print - using switch
    public void seasonDisplay()
    {
        switch (s) {
			case SUMMER:
					System.out.println("Summer Season");
					break;
			case RAINY:
					System.out.println("Rainy Season");
					break;			
			case WINTER:
					System.out.println("Winter Season");
					break;
			case SPRING:
					System.out.println("Spring Season");
					break;
			
        }
    }
 
    public static void main(String[] args)
    {
        String str = "WINTER";
        EnumExample3 e = new EnumExample3(Season.valueOf(str));
        e.seasonDisplay();
    }
}
// Output
// Winter Season
