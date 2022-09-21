package mükemmelSayi;

public class Main {

	public static void main(String[] args) {
		//6 --> 1,2,3 e bölünüt o yüzden mukemmeldir.
		//28 --> 1,2,4,7,14
		
		int number = 27;
		int topla = 0;
		for (int i = 1; i <number; i++) {
			if(number%i==0) {
				topla+=i;		
			}
		}
		
		if(topla==number) {
			System.out.println(topla+" Mükemmel sayıdır.");
		}
		else {
			System.out.println(number+" Mükemmel sayı değildir.");
		}
		
		
	}

}
