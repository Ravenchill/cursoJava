
package cursoJava;
import java.util.Scanner; 

public class VariaveisEConstantes {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		Scanner weight = new Scanner(System.in);
		Scanner height = new Scanner(System.in);
		Scanner gender = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		Scanner cnh2 = new Scanner(System.in);
		Scanner donator = new Scanner(System.in); 
	
		
		
		final double Gravidade = 9.8;
		
		
		System.out.println("Digite seu nome: ");
		String nome = name.nextLine();
		System.out.println("Preencha sua idade: ");
		int idade = age.nextInt();
		System.out.println("informe seu peso: ");
		double peso = weight.nextDouble();
		System.out.println("informe sua altura: ");
		double altura = name.nextDouble();
		System.out.println("Informe seu gênero: ");
		String gênero = name.next();
		System.out.println("Informe o tipo de CNH: ");
		String cnh = cnh2.nextLine();
		System.out.println("Você é doador de órgãos? Verdadeiro ou Falso");
		boolean doador = name.nextBoolean();
		
		double bmi = peso/(altura*altura);
		
		System.out.println("Nome informado :"+nome);
	    System.out.println("Idade informada: "+idade);
	    System.out.println("Peso informado: "+peso);
	    System.out.println("Altura informada: "+altura);
	    System.out.println("Gênero informado: "+gênero);
	    System.out.println("Categoria da CNH: "+cnh);
	    System.out.println("Doador de Órgãos? :"+doador);
	    System.out.println("BMI: "+bmi);
	    
	  //  System.out.printf("Nome: %s \n idade: %d \n Peso: %2.f  \n Altura: %d  \n Gênero: %s \n CNH: %s  \n Doador: %s  \n BMI: %d"+nome,+idade,+peso,+altura,gênero,cnh,doador,+bmi);
		
		
		
		
		
		
		

	}

}
