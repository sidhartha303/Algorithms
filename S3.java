package daysofcode;

import java.util.Scanner;

public class S3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        
        int x=(int) (Math.ceil(meal_cost)+((meal_cost*tip_percent)/100)+(meal_cost*tax_percent)/100);
        System.out.println("The total meal cost is "+x+" dollars");
          
        in.close();
	}

}