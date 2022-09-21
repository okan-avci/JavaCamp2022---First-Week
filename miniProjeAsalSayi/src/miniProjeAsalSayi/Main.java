package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 11;
		int remainder = number % 2;// remainder = kalan
		System.out.println(remainder);
		boolean isPrime = true;// isPrime= asal

		if (number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {// 25 sayısını 24 kadar bütün sayılara bölerek asal mı değil mi kontrol eder.
				isPrime = false;
			}
		}
		
		// isPrime==true demekle aynı anlama geliyor.
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
