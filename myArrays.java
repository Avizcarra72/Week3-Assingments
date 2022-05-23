package myArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class myArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> ages = new ArrayList<Integer>();
       
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		boolean x = true;
		int i = 0;
		int w = 0;
		int v = 0;
		int z = 0;
		int ageSum = 0;
		int averageAge = 0;
		System.out.println("Ages: ");
        while (x)
        {
        
         for (int y = 0; y < ages.size(); y++)
            {
              System.out.println(ages.get(y));
              
              ageSum += ages.get(y);
              
              w = y;
            }
            System.out.println("The value of Last element after Subracting from 1st element");            
            v = ages.get(w) - ages.get(i);
            System.out.println("Last element age: " + v);
            System.out.println();
            if (z == 0 )
            {
            ages.add(100);
            ageSum = 0;
            v = 0;
            z++;
            System.out.println("Ages after adding 1 element ");
            }
            else
            {
            	averageAge = ageSum / w;
            	x = false;
            }    
        }
        System.out.println("Calculate Average age: " + averageAge );
        
        
        
     
}
}