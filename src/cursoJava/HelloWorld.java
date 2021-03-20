package cursoJava;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
			
Scanner input = new Scanner (System.in);

int x , y, value;

System.out.println("Give the first value: ");

x = input.nextInt();

System.out.println("Give the second value value: ");

y = input.nextInt();
value = x+y;
System.out.println("X = " +value);
value = 0;
System.out.println("Second round\n");
System.out.println("Give the first value: ");

x = input.nextInt();

System.out.println("Give the second value: ");

y = input.nextInt();

value = x+y;
System.out.println("X = " +value);

value = 0;

System.out.println("Round three: \n");

System.out.println("Give the first value: ");

x = input.nextInt();

System.out.println("Give the second value:  ");

y = input.nextInt();

value = x+y;

System.out.println("X = " +value);
System.out.println("\n");

	}

}
