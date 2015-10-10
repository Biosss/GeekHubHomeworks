import java.util.Scanner;

class Lesson1 {
    public static void main(String[] args) {
	
        System.out.println("Please, select action from the list below:");
		System.out.println("1) Calculate the n-factorial");
		System.out.println("2) Show Fibonacci numbers");
		System.out.println("3) Show number like word");
		System.out.println("4) Exit");

		Scanner reader = new Scanner(System.in);
		int choose = reader.nextInt();

        switch (choose) {
            case 1:  
					System.out.println("Enter 'n', to calculate n-factorial:");
		            int n = reader.nextInt();  //Число n, факториал которого мы находим.
					int nFaktorial = 1; 	   
					for (int i = 1; i <= n; i++)
						nFaktorial *= i;
					System.out.println(n + "!= " + nFaktorial);	
                    break;
			case 2:  
					System.out.println("Fibonacci numbers");
					int fibonachi[];  			//массив чисел Фибоначи
					fibonachi = new int[20];
					for(int i = 0; i < 20 ;i++){
						if (i < 2)
							fibonachi[i] = i;
						else fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
					System.out.println(i + ") " + fibonachi[i]);	
					}
                     break;
			case 3:  
					System.out.println("Enter any number:");
					int number = reader.nextInt();
					switch (number) {
					case 0:System.out.println("Zero");
						break;	
					case 1:System.out.println("One");
						break;	
					case 2:System.out.println("Two");
						break;	
					case 3:System.out.println("Three");
						break;	
					case 4:System.out.println("Four");
						break;	
					case 5:System.out.println("Five");
						break;	
					case 6:System.out.println("Six");
						break;	
					case 7:System.out.println("Seven");
						break;	
					case 8:System.out.println("Eight");
						break;	
					case 9:System.out.println("Nine");
						break;							
                    }
					break;
			case 4:  
                     break;
			default: System.out.println("It was chosen the wrong action!!!");
                     break;
					 }
					 
		
    }
}