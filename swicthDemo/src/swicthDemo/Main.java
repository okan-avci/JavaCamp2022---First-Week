package swicthDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'Z';// Grade = Not

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
			System.out.println("Çok güzel");
			break;
		case 'C':
			System.out.println("Fena değil");
			break;
		case 'D':
			System.out.println("Kötü");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not");
		}
	}

}
