import java.util.Scanner;

public class art�kYil {

	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);

        System.out.print("Y�l Giriniz: ");
        year = input.nextInt();
        
        if(year%4==0) {
        	System.out.println(year +" bir art�k y�ld�r!");
        }
     
        else if(year%100==0) {
        	  if(year%400==0) {
        		System.out.println(year +" bir art�k y�ld�r!");
        	}
        	  else { System.out.println(year +" bir art�k y�l degildir!");
        }
        }
        else { System.out.println(year +" bir art�k y�l degildir!");
        	
        }

	}

}
