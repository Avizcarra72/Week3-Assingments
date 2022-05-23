package myStrings;

public class myStrings {
	 
	public static void main(String[] args) {
//CALCULATE AVERAGE NUMBER OF LETTERS PER NAME
    String [] names = { "Sam","Tommy","Tim","Sally","Buck","Bob"};
   
    System.out.print("Average number of letters per Name: " + '\n');
    
    for (int i = 0; i < names.length; i++)
    {
    	System.out.println(names[i].length());
    }
    
//CONCATENATED NAMES SEPARATED BY SPACES
    System.out.println();
    System.out.print("Concatenated name separated by spaces " + '\n');
    String concatNames = " ";
    double sum = 0.0;
    double averageAge = 0.0;
    
    for (int i = 0; i < names.length; i++)
    {
    	concatNames += names[i].concat(" ");
    }
    System.out.println(concatNames);
	
//ADD THE LENGTH OF EACH NAME FROM NAMES ARRAYS TO NAMELENGTH ARRAY 
    System.out.println();
    System.out.print("Add the length of each name from names arrays to nameLength array" + '\n');
    int [] nameLength = new int[6];
    
    for (int i = 0; i < names.length; i++)
    {
    	nameLength[i] = names[i].length();
    	System.out.println(nameLength[i]);
    }
    
  //CALCULATE THE SUM OF ALL ELEMENTS IN NAMELENGTH ARRAY 
    System.out.println();
    System.out.print("Calculate the sum of all elements in nameLength array" + '\n');
    
    for (int i = 0; i < nameLength.length; i++)
    {
     sum += nameLength[i];
    }
    averageAge = (sum / nameLength.length);
    System.out.println(Math.round(averageAge));
    System.out.println();
    
  //METHOD THAT TAKES A STRING AND AN INT AS AN ARGUMENT AND RETURNS THE WORD CONCAT MULTIPLE TIMES BY THE NUMBER IN INT.
    System.out.println("Concatenated String multiple times based on the number of int");
    System.out.println(multiplyNames("Hello", 3));
    System.out.println();
    
  //METHOD THAT TAKES 2 STRINGS FIRSTNAME AND LASTNAME AND RETURN A FULLNAME SEPARATED WITH SPACE
    System.out.println(fullNames("Jon","Vizcarra"));

    
  //METHOD THAT TAKES AN ARRAY OF INT AND RETURN TRUE IF THE SUM OF ALL INT IS GREATER 100.
    
    int[] arrayInt = new int[2];
    arrayInt[0] = 50;
    arrayInt[1] = 52;
    System.out.println();
    System.out.println(Sum(arrayInt));
    
//METHOD THAT TAKES AN ARRAY OF DOUBLE AND RETURN THE AVERAGE OF ALL THE ELEMENTS IN THE ARRAY.
    
    double[] arrayD = new double[2];
    arrayD[0] = 50.1;
    arrayD[1] = 52.2;
    System.out.println();
    System.out.println(Math.round(dAverage(arrayD)));
    
//METHOD THAT TAKES TWO ARRAY OF DOUBLE AND RETURN TRUE IF THE AVERAGE OF THEELEMENTS IN THE ARRAY IS
//GREATER THAN THE AVERAGE OF THE ELEMENTS IN THE SECOND ARRAY    
    double[] arrayD2 = new double[2];
    arrayD[0] = 60.1;
    arrayD[1] = 52.2;
    System.out.println();
    System.out.println(compareAverage(arrayD, arrayD2));
 
	
//METHOD THAT TAKES A BOOLEAN IsHotOutside AND DOUBLE moneyInPocket AND RETURNS TRUE IF IT IS HOT OUTSIDE AND MOENY IN POCKET
// IS GREATER THAN 10.50
    boolean x = true;
    double num = 20.0;
    System.out.println();
	System.out.println(willBuyDrink(x, num));
}

public static String multiplyNames(String x, int y)
      
     {
	 String results = "";
       for ( int i = 0 ; i < y; i++)
       {
        results += x;
       }
	    return results;
	 }

public static String fullNames(String x, String y)

{
String FullName = "";

   FullName += x.concat(" ") + y;
   return FullName;
}

public static boolean Sum(int [] num)
 
{
  int x = 0;
  for ( int i = 0; i < num.length; i++)
  {
	  x += num[i];
  }
   
   if (x > 100 )
   {
     return true;
   }
   else
   {
	 return false;
   }
}

public static double dAverage(double
		[] num)

{
  double x = 0;
  for ( int i = 0; i < num.length; i++)
  {
	  x += num[i];
  }
   
  return x / num.length;
}

public static boolean compareAverage(double[] num1, double[] num2)

{
  double x = 0;
  for ( int i = 0; i < num1.length; i++)
  {
	  x += num1[i];
  }
  double d1 = x / num1.length;
  
  int w = 0;
  for ( int i = 0; i < num2.length; i++)
  {
	  w += num2[i];
  }
  double d2 = w / num2.length;
  
  if (d1 > d2)
  {
	  return true;
  }
  else
  {
	  return false;
  }
}

public static boolean willBuyDrink(boolean x, double num)

{
  if ( x && num > 10.50)
  {
	 return true; 
  }
  else
  {
	  return false;
  }
  }
}


