import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua mensagem de Natal: ");
		String msg = sc.nextLine();
		
		System.out.println("Mensagem de Natal: "+msg);
		System.out.println("Mensagem de Natal: "+msg.toUpperCase());
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+""+msg.toLowerCase());
			System.out.println(i+""+msg.toUpperCase());
		}
		sc.close();

	}

}
