import java.util.Scanner;

public class Calculadora {

	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eliga el primer número a operar");
		int a = sc.nextInt();
		System.out.println("Eliga el segundo número a operar");
		int b = sc.nextInt();
		
		System.out.println("¿Qué desea hacer?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		
		case 1:
			System.out.println(a+b);
			main(args);
		case 2:
			System.out.println(a-b);
			main(args);
		case 3:
			System.out.println(a*b);
			main(args);
		case 4:
			System.out.println(a/b);
			main(args);
		case 5:
			break;
			
		default:
			main(args);
		}
	}
}
