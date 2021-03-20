package cursoJava;
import java.util.Scanner;
public class Naufragio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Scanner bomba = new Scanner(System.in);
int tiros = 54;	

String a1= "O", a2= "O", a3= "O", a4= "O", a5= "O", a6= "O", a7= "O", a8= "O", a9= "O";
String b1= "O", b2= "O", b3= "O" , b4= "O" , b5= "O" , b6= "O" , b7= "O" , b8= "O" , b9= "O";
String c1= "O", c2= "O", c3= "O" , c4= "O" , c5= "O" , c6= "O" , c7= "O" , c8= "O" , c9= "O";
String d1= "O", d2= "O", d3= "O" , d4= "O" , d5= "O" , d6= "O" , d7= "O" , d8= "O" , d9= "O";
String e1= "O", e2= "O", e3= "O" , e4= "O" , e5= "O" , e6= "O" , e7= "O" , e8= "O" , e9= "O";
String f1= "O" , f2 = "O", f3 = "O" , f4= "O" , f5= "O" , f6= "O" , f7= "O" , f8= "O" , f9= "O";
while (tiros >= 0) {
	
	System.out.println("Atire!");
	
	String bum = bomba.next();
	
	if (bum.equals("a1")) {
		System.out.println("Voce acertou um navio!");
		a1 = "X";
	}
	if (bum.equals("b1")) {
		System.out.println("Voce acertou um navio!");
		b1 = "X";
	}
	if (bum.equals("c1")) {
		System.out.println("Voce acertou um navio!");
		c1 = "X";
	}
	if (bum.equals("f1")) {
		System.out.println("Voce acertou um navio!");
		f1 = "X";
	}
	if (bum.equals ("f2")) {
		System.out.println("Voce acertou um navio!");
		f2 = "X";
	}
	if (bum.equals("d4")) {
		System.out.println("Voce acertou um navio!");
		d4 = "X";
	}
	if (bum.equals("e4")) {
		System.out.println("Voce acertou um navio!");
		e4 = "X";
	}
	if (bum.equals("f4")) {
		System.out.println("Voce acertou um navio!");
		f4 = "X";
	}
	if (bum.equals("e8")) {
		System.out.println("Voce acertou um navio!");
		e8 = "X";
	}
	if (bum.equals("e9")) {
		System.out.println("Voce acertou um navio!");
		e9 = "X";
	}
	System.out.printf("X");System.out.printf("1"); System.out.printf("2"); System.out.printf("3"); System.out.printf("4"); System.out.printf("5"); System.out.printf("6"); System.out.printf("7"); System.out.printf("8"); System.out.printf("9"+"\n");
	System.out.printf("A");System.out.printf(a1); System.out.printf(a2); System.out.printf(a3); System.out.printf(a4); System.out.printf(a5); System.out.printf(a6); System.out.printf(a7); System.out.printf(a8); System.out.printf(a9+"\n"); 
	System.out.printf("B"); System.out.printf(b1); System.out.printf(b2); System.out.printf(b3); System.out.printf(b4); System.out.printf(b5); System.out.printf(b6); System.out.printf(b7); System.out.printf(b8); System.out.printf(b9+"\n");
	System.out.printf("C"); System.out.printf(c1); System.out.printf(c2); System.out.printf(c3); System.out.printf(c4); System.out.printf(c5); System.out.printf(c6); System.out.printf(c7); System.out.printf(c8); System.out.printf(c9+"\n");
	System.out.printf("D"); System.out.printf(d1); System.out.printf(d2); System.out.printf(d3); System.out.printf(d4); System.out.printf(d5); System.out.printf(d6); System.out.printf(d7); System.out.printf(d8); System.out.printf(d9+"\n");
	System.out.printf("E"); System.out.printf(e1); System.out.printf(e2); System.out.printf(e3); System.out.printf(e4); System.out.printf(e5); System.out.printf(e6); System.out.printf(e7); System.out.printf(e8); System.out.printf(e9+"\n");
	System.out.printf("F");System.out.printf(f1); System.out.printf(f2); System.out.printf(f3); System.out.printf(f4); System.out.printf(f5); System.out.printf(f6); System.out.printf(f7); System.out.printf(f8); System.out.printf(f9+"\n");
	if (f1=="X" && f2=="X" && f4=="X" && e4=="X" && d4=="X" && c1=="X" && b1=="X" && a1=="X" && e8=="X" && e9=="X") {
		tiros = 0;
		System.out.println("Você afundou todos os navios!");
	}
	tiros--;
	System.out.println(new String(new char[10]).replace("\0", "\r\n"));
} System.out.println("\n Fim de Jogo");
}
}