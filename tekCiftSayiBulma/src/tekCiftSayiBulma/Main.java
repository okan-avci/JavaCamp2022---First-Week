package tekCiftSayiBulma;

public class Main {

	public static void main(String[] args) {
		int sayi = 10;
		int ciftSayiToplam = 0;
		int tekSayiToplam = 0;
		// verilen değere kadar hangi sayı tek, hangi sayı çift onu buldurdum.
		// Daha sonra tek sayıların ve çift sayıların ayrı ayrı toplamlarını yazdrdım.
		for (int i = 0; i < sayi; i++) {
			if (i % 2 == 0) {
				ciftSayiToplam += i;
				System.out.println(i + " sayısı çiftir.");
				System.out.println("--------");
			} else {
				tekSayiToplam += i;
				System.out.println(i + " sayısı tektir.");
				System.out.println("--------");
			}
		}

		System.out.println(ciftSayiToplam);
		System.out.println(tekSayiToplam);

	}

}
