package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			System.out.println(number);
			total += number;

			if (max < number) {
				max = number;
				// Max de dizinin ilk elemanını diğer değerlerle nasıl karşılaştırdığını görmek
				// için kullanıldı.
				// System.out.println(number);
			}
			// İşlemin işleyişi daha iyi anlamak için kullanıldı.
			// System.out.println("myList total value = "+total);
		}
		System.out.println("myList total value = " + total);
		System.out.println("Max value = " + max);
	}

}
