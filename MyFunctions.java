import java.util.Scanner;
import java.util.Arrays;

public class MyFunctions
{

	public static void actno1()
	{
		System.out.println("Joniver Sumalinog");
		System.out.println("1st Semester");
		System.out.println("2025-2026");
		System.out.println("Bachelor Science Information Technology");
	}


public static void actno2()
{
	Scanner botangnumber = new Scanner(System.in);

	System.out.print("Enter Height:");
	int height = botangnumber.nextInt();
	System.out.print("Enter Width:");
	int width = botangnumber.nextInt();


	int perimeter = 2 * (height + width);
	int area = height * width;

	System.out.println("Perimeter of Rectangle:" + perimeter);
	System.out.println("Area of Rectangle:" + area);

	}


public static void actno3()
{
	Scanner in = new Scanner(System.in);

	System.out.print("Enter ID");
	String eID = in.nextLine();

	if(eID.length() > 10){
		System.out.print("Invalid ID: ");
		return;
	}
	System.out.print("Input the Working Hrs:");
	int hours = in.nextInt();
	System.out.print("Salary Amount per Hr:");
	double salary = in.nextDouble();
	double  TotalSalary = salary * hours;

	System.out.println("Employee ID =" +eID);
	System.out.println("Salary = U$:" +TotalSalary);


}

public static void actno4()
{
	int num1 = 25;
	int num2 = 35;
	int num3 = 15;
	int max;

if(num1 >= num2 && num1 >= num3){
   max = num1;

}else if(num2 >= num1 && num2 >= num3){
	max = num2;
 }else{
     max = num3;
}
System.out.println("maximum value is:" + max);

}

public static void actno5()
{
	float x1 = 25;
	float y1 = 15;
	float x2 = 35;
	float y2 = 10;

	float dx = x2 - x1;
	float dy = y2 - y1;

	float squared = ( dx * dx ) + ( dy * dy);

	float guess = squared / 2;

	for(int i = 0; i < 10; i++){
	guess = (guess + squared / guess) / 2;
	}

	float distance = guess;

	System.out.printf("Distance between the said points: %.4f%n", distance);

	}

public static void actno6()
{

	int amount = 375;

	System.out.print("Input the amount" + amount);
	System.out.println("\nThere are:");

	int n100 = amount / 100;
	    amount = amount % 100;
	int n50 = amount / 50;
	    amount = amount % 50;
	int n20 = amount / 20;
	    amount = amount % 20;
	int n10 = amount / 10;
	     amount = amount % 20;
	int n5 = amount / 5;
	    amount = amount % 5;
	int n2 = amount / 2;
	    amount = amount % 2;
	int n1 = amount / 1 ;
	    amount = amount % 1;

	   System.out.println( n100 + " Notes of 100.00");
	   System.out.println( n50  + " Notes of 50.00");
	   System.out.println( n20  + " Notes of 20.00");
	   System.out.println( n10  + " Notes of 10.00");
	   System.out.println( n5 + " Notes of 5.00");
	   System.out.println( n2 + " Notes of 2.00");
	   System.out.println( n1 + " Notes of 1.00");

	}


public static void actno7()
{

	Scanner oras = new Scanner(System.in);

	System.out.print("Input Seconds");
	int totalSeconds = oras.nextInt();

	int hours = totalSeconds / 3600;
	int remainSeconds = totalSeconds % 3600;

	int minutes = remainSeconds / 60;
	int seconds = remainSeconds % 60;

	System.out.println("\nThere are:");
	System.out.println("H:M:S-" + hours +":" + minutes + ":" + seconds);

	}


public static void actno8()
{
     Scanner bowan = new Scanner(System.in);

	String[] months = {"January", "February", "March" , "April" , "May", "June", "July", "August", "September" , "October", "November", "December"};

	System.out.print("Enter Month: ");
	int buwan = bowan.nextInt();

	if(buwan >=1 && buwan <= 12){
		System.out.println(months[buwan - 1]);
	}
	else{
		System.out.println("Invalid");
	}

	}

public static void actno9(){

	Scanner joni = new Scanner(System.in);

	int positive = 0;
	int negative = 0;

	for(int i = 1; i<=5; i++){
		System.out.print("Enter Number" + i +":");
		int num = joni.nextInt();
		if ( num > 0){
		    positive++;
		}
		else if (num < 0){
			negative++;
		}
	}
	System.out.println("Number of Positive Numbers: " +  positive);
	System.out.println("Number of Negative Numbers: " +  negative);

}

public static void actno10()
{
	Scanner scan = new Scanner(System.in);
	        int correctPassword = 1234;

	       while (true){
			   System.out.print("Enter Password:");
			   int password = scan.nextInt();

			if(password == correctPassword){
				System.out.println("Correct Password!");
				break;
			 }
			 else{

				 System.out.println("Incorrect Password:");
			 }
}
}

public static void actno11()
{
	int x = 25;
		int y = 15;

		System.out.println("Input Coordinate");
		System.out.println(x);
		System.out.println(y);

		if( x > 0 && y > 0) {
			System.out.println("Quadrant-I (+,+)");
		}
		else if( x < 0 && y > 0 ){
			System.out.println("Quadrant-II (-,+)");
		}
		else if( x < 0 && y < 0){
			System.out.println("Quadrant-III (-,-)");
		}
		else if(x > 0 && y < 0){
			System.out.println("Quadrant-IV (+,-)");
		}
		else if ( x == 0 && y == 0){
			System.out.println("Point is at the Origin (0,0)");
		}
		else if ( x == 0) {
			System.out.println("Point is on X axis");
	}
	    else if ( y == 0) {
			System.out.println("Point is on Y axis");
		}

	}

public static void actno12()
{
	int x = 25;
	int y = 5;
	System.out.println(x);
	System.out.println(y);


	if(y != 0 ){
		double result = x / y;
		System.out.println(result);
	}
	else{
		System.out.println("Divsion is not possible :P");
	}

	}

public static void actno13()
{
	Scanner lines = new Scanner(System.in);
	  System.out.print("Input number of lines:");
	  int n = lines.nextInt();

	  int num = 1;

	  for(int i = 1; i <= n; i++) {
		  for( int j = 1; j <=3; j++) {
			  System.out.print( num + " ");
		   num++;
	   }
	   System.out.println();
	}

	}
public static void actno14(){
	Scanner score = new Scanner(System.in);

	     int[] marks = {10, 15, 20, 25, 0};
	     double sum = 0;
	     int count = 0;

	     for(int i : marks){
			 if(i <= 0)
			 break;
			 sum += i;
			 count++;
		 }
		 if(count > 0)
		  System.out.printf("Average remarks in Mathematics: %.2f%n" ,(sum / count));
		 else
	           System.out.println("invalid");

	  }

public static void actno15(){

	int [] number = { 25, 35, 20, 14, 45};

	int smallest = number[0];

	int position = 0;

	for(int i = 1; i < number.length; i++){
		if(number[i]< smallest){
			smallest = number[i];
			position = i;
	}
	}
	System.out.println("" + smallest);
	System.out.println("" +  position);
}




public static void actno16()
{
Scanner datata = new Scanner(System.in);
System.out.print("Input Data :");
double data = datata.nextDouble();

double convert = data / 2.54;

System.out.printf("Distance of %.2f%n cms is = %.2f%n inches", data , convert);

}

public static void actno17()
{
	Scanner input = new Scanner(System.in);

	System.out.print("Input Number: ");
	int number = input.nextInt();

	int original = number;
	int reverse = 0;

	while( number != 0){
		int digit = number % 10;
		 reverse = reverse * 10 + digit;
		 number = number / 10;
	}
	System.out.println("The Original Number is: " + original);
	System.out.println("The Reverse Number is: " + reverse);

	}

public static void actno18()
{
	Scanner input = new Scanner(System.in);

	System.out.print("Input Number: ");
	int number = input.nextInt();

	int absoluteNum;

	if(number < 0){
		absoluteNum = number * -1;
	}
	else{
		absoluteNum = number;
	}
	System.out.println("Original Value: " + number);
	System.out.println("Absolute Value: " + absoluteNum);

	}


public static void actno19()
{
	Scanner input = new Scanner(System.in);

	System.out.print("Input first Integer:");
	int num1 = input.nextInt();

	System.out.print("Input Second Integer:");
	int num2 = input.nextInt();

	if(num1 % num2  == 0){
		System.out.println(num1 + "is a multiple of" + num2);
	}
	else{
		System.out.println(num1 + "is not a multiple of" + num2);
	}

	}
public static void actno20()
{
Scanner input = new Scanner(System.in);

System.out.print("Input Text: ");
String word = input.nextLine();

String[] words = word.split(" ");

System.out.println();

for(int i = 0; i < words.length; i++){
	System.out.println(words[i]);
}
}

public static void actno21()
{
	Scanner joni = new Scanner(System.in);

		System.out.print("Input Currency: ");
	double amount = joni.nextDouble();

	System.out.print("Currency Notes:");

		int hundreds = (int)(amount/100);
		if(hundreds > 0)
			System.out.println("100 number of Note(s):" + hundreds);
			amount = amount % 100;

		int fifties = (int)(amount / 50);
	     if(fifties > 0)
			 System.out.println("50 number of Note(s):" + fifties);
			 amount = amount % 50;


		 int five = (int)(amount / 5);
		 if (five > 0)
			 System.out.println("5 number of Note(s):" + five);
			 amount = amount % 5;

		 int two = (int)(amount / 2);
		 if(two > 0)
			 System.out.println("2 number of Note(s):" + two);
			 amount = amount % 2;


		System.out.println("\nCurrency of Coins:");

		amount = Math.round(amount * 100.0) / 100.0;

		int fcents = (int)(amount / 0.50);
		if(fcents > 0)
			System.out.println("0.50 number of Coin(s):" + fcents);
		amount = amount % 0.50;
		int tfcents = (int)(amount / 0.25);
		if(tfcents > 0)
			System.out.println("0.25 number of Coin(s);" + tfcents);
		amount = amount % 0.25;

	}


public static void actno22(){

	Scanner user = new Scanner(System.in);
		System.out.print("Input two angles: ");
		String data = user.nextLine();



		String[] parts = data.split(",");
		double angle1 = Double.parseDouble(parts[0].trim());
		double angle2 = Double.parseDouble(parts[1].trim());

		double angle3 = 180 - (angle1 + angle2);

		System.out.println("Third angle of the Triangle:" + (int)angle3);

	}

public static void actno23(){
	Scanner in = new Scanner(System.in);

	System.out.print("Input an Alphabet:");
			char ch = in.next().toLowerCase().charAt(0);


		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		boolean isVowel = false;

		for(char v : vowels){
			if( ch == v){
				isVowel = true;
				break;
			}
		}

		if(isVowel){
			System.out.println("The Letter You Enter is a Vowel");
		}
			else if(ch >= 'a' && ch <= 'z')
			{
				System.out.println("The Letter You Enter is a Consonant");
			}

		}
public static void actno24(){
	Scanner input = new Scanner(System.in);

	        System.out.print("Input a digit:");
        int digit = input.nextInt();

        String word;
		        switch (digit) {
		            case 0: word = "Zero"; break;
		            case 1: word = "One"; break;
		            case 2: word = "Two"; break;
		            case 3: word = "Three"; break;
		            case 4: word = "Four"; break;
		            case 5: word = "Five"; break;
		            case 6: word = "Six"; break;
		            case 7: word = "Seven"; break;
		            case 8: word = "Eight"; break;
		            case 9: word = "Nine"; break;
		            default: word = "Invalid";
		        }
                     System.out.println(word);


   }

   public static void actno25()
   {

Scanner input = new Scanner(System.in);

    int numberToGuess = (int)(Math.random() * 20) + 1;
    int guess = 0;

    System.out.println("I have picked a number between 1 and 20. Try to guess it!");

    while (guess != numberToGuess) {
        System.out.print("Enter your guess: ");
        if (input.hasNextInt()) {
            guess = input.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Ooops! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } else {
            System.out.println("Invalid input! Enter a number between 1 and 20.");
            input.next();
        }
     }
   }


public static void actno26()
{
	Scanner user = new Scanner(System.in);
  String username = "";


			while (true){
				System.out.print("Enter Username:");
				username = user.nextLine();
		if(username.length() >= 8){
					System.out.println("User Detected: " + username);
                      break;
				}
				else{
					System.out.println("Invalid Username!");
             }
	     }
    }

public static void actno27()
{
Scanner joni = new Scanner(System.in);

    System.out.print("Enter a Positive Number: ");
    int number = joni.nextInt();

    if (number < 0) {
        System.out.println("Invalid input! Please enter a positive number.");
        return;
    }

    int factorial = 1;
    int i = 1;

    while (i <= number) {
        factorial *= i;
        i++;
    }

    System.out.println("The Factorial of " + number + " is " + factorial);
}


public static void actno28()
{
	Scanner joni = new Scanner(System.in);

	    System.out.print("Enter a Number: ");
	    int number = joni.nextInt();

	    int i = 1;
	    System.out.println("Multiplication Table of " + number + ":");

	    while (i <= 10) {
	        System.out.println(number + "x" + i + "=" + (number * i));
	        i++;
	    }
}

public static void actno29()
{
	int i = 1;

	System.out.println("1 to 100");

	while(i <= 100){
				if ( i % 3 == 0 && i % 5 == 0){
					System.out.println("Fizz Buzz");
				}
				else if(i % 3 == 0){
					System.out.println("Fizz");
			}
			else if(i % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
			i++;
		}
}


public static void actno30()
{
	Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence:");
	    String sentence = input.nextLine();

	    String[] words = sentence.split(" ");
	    String longest = "";

	    int i = 0;
			while(i < words.length){
				if(words[i].length() > longest.length()){
					longest = words[i];
				}
				i++;
			}

			System.out.println("The Longest word is: " + longest);
			System.out.println("It has " + longest.length() + " letters.");

}

public static void actno31()
{

int numbers[] = {45, 25, 21};
    System.out.println("Array Elements: 45, 25, 21");

    int max = numbers[0];
    int min = numbers[0];

    int i = 1;
    while(i < numbers.length){

        if(numbers[i] > max){
            max = numbers[i];
        }
        if(numbers[i] < min){
            min = numbers[i];
        }

        i++;
    }

    System.out.println("Max Element of Array is: " + max);
    System.out.println("Minimum Element of Array is: " + min);
}

public static void actno32(){

int numbers[] = {45, 25, 21, 12, 30};
    int n = numbers.length;

    int[] odd = new int[n];
    int[] even = new int[n];

    int evenCount = 0;
    int oddCount = 0;

    int i = 0;

    while(i < n){
        if(numbers[i] % 2 == 0){
            even[evenCount] = numbers[i];
            evenCount++;
        }
        else{
            odd[oddCount] = numbers[i];
            oddCount++;
        }
        i++;
    }

    System.out.print("The even elements are: ");
    i = 0;
    while(i < evenCount){
        System.out.print(even[i] + " ");
        i++;
    }
    System.out.println();

    System.out.print("The odd elements are: ");
    i = 0;
    while(i < oddCount){
        System.out.print(odd[i] + " ");
        i++;
    }
    System.out.println();
}

public static void actno33()
{

 int arr[] = {2, 7, 4, 5, 9};

    System.out.print("Elements of Array: ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }

    System.out.println();

    int n = arr.length;

    for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - 1 - i; j++){
            if(arr[j] > arr[j + 1]){

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }

    System.out.print("Elements of Array in sorted ascending order: ");
    int i = 0;
    while(i < n){
        System.out.print(arr[i] + " ");
        i++;
    }

    System.out.println();
}

public static void actno34(){



int arr[] = {5, 1, 9};
    int n = arr.length;


    for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - 1 - i; j++){
            if(arr[j] < arr[j + 1]){

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    System.out.print("Elements of Array in sorted descending order: ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void actno35()
	{
	    int[] numbers = {2, 9, 1, 4, 6};

	    System.out.println("Array Elements: 2, 9, 1, 4, 6");

	    int first  = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;

	    for(int i = 0; i < numbers.length; i++){
	        if(numbers[i] > first){
	            second = first;
	            first = numbers[i];
	        }
	        else if(numbers[i] > second && numbers[i] != first){
	            second = numbers[i];
	        }
	    }

	    System.out.println("The Second largest element in the array is: " + second);
}

public static void actno36()
{
	Scanner enter = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = enter.nextInt();

		if(num % 2 == 0 ){
			System.out.println("The number entered is even");
	}
	else
	{
		System.out.println("The number entered is odd");
	}

}

public static void actno37()
{
    Scanner input = new Scanner(System.in);

    System.out.print("Input any decimal number: ");
    int decimal = input.nextInt();

    String binary = "";

    if (decimal == 0) {
        binary = "0";
    } else {
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
    }

    System.out.println("The Binary Value is: " + binary);
}

public static void actno38()
{
	    Scanner input = new Scanner(System.in);

	    System.out.print("Input year: ");
	    int year = input.nextInt();

	    int checker = 0;

	    if(year >= 1000 && year <= 9999){


	        if(year % 400 == 0){
	            checker = 1;
	        }
	        else if(year % 100 == 0){
	            checker = 2;
	        }
	        else if(year % 4 == 0){
	            checker = 1;
	        }
	        else{
	            checker = 2;
	        }
	    }

	    switch(checker){
	        case 0:
	            System.out.println("Invalid year");
	            break;
	        case 1:
	            System.out.println("Leap Year");
	            break;
	        case 2:
	            System.out.println("Not a Leap Year");
	            break;
	    }
	}

public static void actno39() {
    Scanner input = new Scanner(System.in);

    System.out.println("WELCOME TO JONIVER's COMPUTING AREA OF THE CIRCLE PROGRAM");
    System.out.print("Input radius: ");
    float radius = input.nextFloat();

    float area = getArea(radius);

    System.out.printf("Output: the area is : %.2f%n", area);
}

public static float getArea(float radius) {
    return (float)(Math.PI * radius * radius);
}


public static void actno40()
{

	Scanner input = new Scanner(System.in);

	        System.out.println("WELCOME TO JONIVER'S COMPUTING AREA OF THE SQUARE PROGRAM");
	        System.out.print("Input side: ");
	        int side = input.nextInt();

	        int area = getArea(side);

	        System.out.println("Output: the area is : " + area);
	    }

	    public static int getArea(int side) {
	        return side * side;
	    }

public void  actno41()
{
	Scanner input = new Scanner(System.in);
	        System.out.println("WELCOME TO NICO’S PROGRAM FOR ACTNO41");

	        System.out.print("Enter some value: ");
	        int value = input.nextInt();

	        int result = value * 2;
	        System.out.println("The result is: " + result);
	    }
public static void actno42()
{
    Scanner in = new Scanner(System.in);

    System.out.print("INPUT FIVE DIGIT INTEGER: ");
    int num = in.nextInt();

    if(num < 10000 || num > 99999){
        System.out.println("ONLY FIVE DIGIT");
        return;
    }

    int[] digits = new int[5];
    int i = 4;
    int temp = num;

    while(temp > 0){
        digits[i] = temp % 10;
        temp /= 10;
        i--;
    }

    int left = 0;
    int right = 4;
    int isPal = 1;

    while(left < right){
        if(digits[left] != digits[right]){
            isPal = 0;
            break;
        }
        left++;
        right--;
    }

    if(isPal == 1){
        System.out.println("PALINDROME");
    }
    else{
        System.out.println("NOT PALINDROME");
    }
}


public void actno43(){

Scanner in = new Scanner(System.in);

    System.out.print("INPUT FOUR DIGIT INTEGER: ");
    int num = in.nextInt();


    if(num < 1000 || num > 9999){
        System.out.println("ONLY FOUR DIGIT");
        return;
    }

    int[] digits = new int[4];
    int i = 3;
    int temp = num;

    while(temp > 0){
        digits[i] = temp % 10;
        temp /= 10;
        i--;
    }

    System.out.print("OUTPUT: ");
    int j = 0;
    while(j < 4){
        System.out.print(digits[j] + " ");
        j++;
    }

    System.out.println();
}


public static void actno44() {
    Scanner in = new Scanner(System.in);

    System.out.print("Input Gross Salary: ");
    double salary = in.nextDouble();

    double tax = 0;

    if (salary <= 50000) {
        tax = 0.10 * salary;
    } else if (salary <= 100000) {
        tax = 5000 + 0.15 * (salary - 50000);
    } else if (salary <= 200000) {
        tax = 15000 + 0.20 * (salary - 100000);
    } else {
        tax = 0.25 * salary;
    }

    System.out.printf("Tax Due: %.2f%n", tax);
}

public static void actno45()
{
    Scanner in = new Scanner(System.in);

    System.out.print("Input digit: ");
    long num = in.nextLong();


    if (num < 0 || num > 9999999999L) {
        System.out.println("Input number only 10 digits allowed");
        return;
    }

    if (num == 0) {
        System.out.println("zero");
        return;
    }

    String result = convertToWords(num);
    System.out.println("Output: " + result);
}


public static String convertToWords(long num)
{
    String[] units = {"", " thousand ", " million ", " billion "};

    String words = "";
    int group = 0;

    while (num > 0) {

        int part = (int)(num % 1000);
        if (part != 0) {
            words = convertThreeDigits(part) + units[group] + words;
        }

        num /= 1000;
        group++;
    }

    return words.trim();
}


public static String convertThreeDigits(int num)
{
    String[] ones = { "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen" };

    String[] tens = { "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety" };

    String result = "";

    if (num >= 100) {
        result += ones[num / 100] + " hundred ";
        num %= 100;
    }

    if (num >= 20) {
        result += tens[num / 10] + " ";
        num %= 10;
    }

    if (num > 0) {
        result += ones[num] + " ";
    }

    return result;
}


public static void actno46() {
    Scanner in = new Scanner(System.in);
    String line = "";

    while (true) {
        System.out.print("Enter Text: ");
        line = in.nextLine();

        if (line.equals("tiuq")) {
            System.out.println("Exiting Act 46...");
            break;
        }


        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}


public static void actno47(){

	Scanner in = new Scanner(System.in);

	    System.out.print("Enter a positive integer N: ");
	    int N = in.nextInt();

	    if (N <= 0) {
	        System.out.println("Invalid input! N must be positive.");
	        return;
	    }

	    long first = 1, second = 1;
	    System.out.print("Fibonacci sequence: ");

	    for (int i = 1; i <= N; i++) {
	        if (i == 1 || i == 2) {
	            System.out.print("1 ");
	        } else {
	            long next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	        }
	    }
	    System.out.println();
}

public static void actno48(){

	Scanner in = new Scanner(System.in);

	double amount = 0;

	while(true){

		System.out.print("Enter Principal amount: ");
		amount = in.nextDouble();
		if(amount > 0) break;
			System.out.println("Amount must be positive");
}

	int years = 0;

	while(true){
		System.out.print("Enter number of years: ");
		years = in.nextInt();

		if(years > 0) break;

		System.out.println("Years must be positive");

	}

	double rate = 0.10;
	double finalAmount = amount * Math.pow(1 + rate, years);

	System.out.printf("After %d years, the amount will be %.2f%n", years, finalAmount);
}

public static void actno49() {
Scanner in = new Scanner(System.in);

int[] nums = new int[10];

for (int i = 0; i < 10; i++) {
    System.out.print("Enter number " + (i + 1) + ": ");
    nums[i] = in.nextInt();
}

analyze(nums);

}

public static void analyze(int[] nums) {
int total = 0;
int largest = nums[0];
int smallest = nums[0];
int posTotal = 0;
int negTotal = 0;
int negCount = 0;
int between = 0;

for (int n : nums) {
    total += n;

    if (n > largest) largest = n;
    if (n < smallest) smallest = n;

    if (n > 0) posTotal += n;
    if (n < 0) {
        negTotal += n;
        negCount++;
    }

    if (n >= 50 && n <= 100) between++;
}

System.out.println("Total: " + total);
System.out.println("Largest: " + largest);
System.out.println("Smallest: " + smallest);
System.out.println("Positive Total: " + posTotal);
System.out.println("Negative Total: " + negTotal);
System.out.println("Negative Numbers Count: " + negCount);
System.out.println("Numbers between 50 and 100: " + between);

}

public static void actno50() {
Scanner in = new Scanner(System.in);

System.out.println("DESTINATION CODES: 1-AMERICA, 2-ASIAN, 3-AFRICAN, 4-EUROPEAN");
System.out.print("DESTINATION CODE: ");
int dest = in.nextInt();

System.out.print("Enter Time Code (1-peak, 2-off-peak): ");
int time = in.nextInt();

System.out.print("Enter Duration (in minutes): ");
int duration = in.nextInt();

System.out.printf("Total charge: P%.2f\n", computeCharge(dest, time, duration));

}

public static double computeCharge(int dest, int time, int duration) {
double rate = 0;
int unit = 1;

switch(dest) {
    case 1:
        rate = (time == 1) ? 50 : 45;
        unit = 3;
        break;
    case 2:
        rate = (time == 1) ? 30 : 27;
        unit = 2;
        break;
    case 3:
        rate = (time == 1) ? 40 : 36;
        unit = 3;
        break;
    case 4:
        rate = (time == 1) ? 35 : 30;
        unit = 2;
        break;
    default:
        System.out.println("Invalid Destination Code");
        return 0;
}

return Math.ceil((double)duration / unit) * rate;

}

public static void actno51(){
	Scanner in = new Scanner(System.in);

	System.out.print("Enter Distance in meters: ");

	int distance = in.nextInt();

    int fare = 20;

    if(distance > 300){

		int extra = distance - 300;
		int blocks = extra / 200;

		if(extra % 200 != 0){

			blocks++;
		}
		fare += blocks * 2;
	}
	System.out.println("Taxi Fare: " + fare);
}

public static void actno52() {
	Scanner in = new Scanner(System.in);
    System.out.print("Enter a code: ");
    String code = in.nextLine();
    if (isValidCode(code)) {
        System.out.println("valid code");
    } else {
        System.out.println("invalid code");
    }
}
public static boolean isValidCode(String code) {
    if (code.length() > 5 || code.length() == 0) {
        return false;
    }

    if (code.charAt(0) != '*') {
        return false;
    }

    char lastChar = code.charAt(code.length() - 1);
    if (!Character.isLetter(lastChar)) {
        return false;
    }
    for (int i = 1; i < code.length() - 1; i++) {
	        char c = code.charAt(i);
	        if (!Character.isLetterOrDigit(c)) {
	            return false;
	        }
	    }

	    return true;
}

public static void actno53(){


	double[] scores = readScores();
	double finalScores = computeFinal(scores);

	System.out.printf("The final score is: %.2f \n", finalScores);
}

public static double[] readScores(){

	Scanner in = new Scanner(System.in);
	double[] sc = new double[10];

	System.out.print("Please enter 10 scores:");
	for(int i = 0; i < 10; i++){
		sc[i] = in.nextDouble();
	}

	return sc;
}

public static double computeFinal(double[] scores){
	Arrays.sort(scores);

	double sum = 0;
	for(int i = 0; i< 9; i++){
		sum += scores[i];
	}

	return sum / 8.0;
}

public static void actno54(){

	    Scanner in = new Scanner(System.in);

	    System.out.print("Base: ");
	    int base = in.nextInt();

	    System.out.print("Exponent: ");
	    int exp = in.nextInt();

	    int result = power(base, exp);

	    System.out.println("Output: " + result);
	}

	public static int power(int base, int exp) {
	    int result = 1;

	    for (int i = 0; i < exp; i++) {
	        result *= base;
	    }

	    return result;
}

public static void actno55() {
    Scanner in = new Scanner(System.in);

    System.out.print("Input number: ");
    int n = in.nextInt();

    if (n < 0) {
        n = -n;
    }

    printPattern(n);
}

public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
        }
        System.out.println();
    }
}

public static void actno56() {
    Scanner in = new Scanner(System.in);

    System.out.print("Input number: ");
    int num = in.nextInt();

    if (num < 0) num = -num; // disregard negative

    int bombs = computeBombs(num);

    System.out.println("Output: " + bombs + " bombs");
}

public static int computeBombs(int num) {
    int bombs = 0;

    while (num > 0) {
        int digit = num % 10;

        switch (digit) {
            case 0:
            case 6:
            case 7:
            case 5:
                bombs += 1;
                break;

            case 1:
            case 2:
                bombs += 2;
                break;

            default:
                bombs += 0;
        }

        num /= 10;
    }

    return bombs;
}
}