package arkadasSayılar;

public class Main {

	public static void main(String[] args) {
		// 220-284 arkadaş sayılar da 220 nin tam bolenlerinin toplamı 284, 284'ünde
		// 220'dir.
		int sayi1 = 220;
		int sayi2 = 284;
		int toplaSayi1 = 0;
		int toplaSayi2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0 ) {
				toplaSayi1 += i;
			}
		}
		for (int j = 1; j < sayi2; j++) {
			if (sayi2 % j == 0) {
				toplaSayi2 += j;
			}
		}

		if (toplaSayi1 == sayi2 && toplaSayi2==sayi1) {
			System.out.println("Arkadaş sayıdır.");
		} else {
			System.out.println("Arkadaş sayı değiidir.");
		}

	}

}
