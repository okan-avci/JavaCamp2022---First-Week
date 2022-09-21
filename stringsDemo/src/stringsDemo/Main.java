package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String mesaj2 = mesaj.concat("Dışsarı cıkalım mı?");
		System.out.println(mesaj);

		// length fonksiyon ile yazılan metin kaç karakterden oluştuğunu buluyoruz.
		System.out.println("Eleman sayisi : " + mesaj.length());
		// charAt ile metinden istedğimiz harfi getirebiliyoruz.
		System.out.println("5. eleman : " + mesaj.charAt(4));
		// concat ifadesi ile değişkende olan metne ekleme yapabiliyoruz.
		System.out.println(mesaj.concat("Dışsarı cıkalım mı?"));
		// concat fonksiyonunu değişkene tanımlayıp bu şekilde de kullanabiliriz.
		System.out.println(mesaj2);
		// mesaj değişkenindeki metin hangi karakter ile başladığını kontrol eder. True
		// ya da false döndürür.
		System.out.println(mesaj.startsWith("B"));
		// mesaj değişkenindeki metin hangi karakter ile bittiğini kontrol eder. True ya
		// da false döndürür.
		System.out.println(mesaj.endsWith("."));

		// getChars fonksiyonu srcBegin başlangıç dizinini belirler.
		// srcEnd bitiş dizinini belirler.
		// karakterler kısmıda burada istediğimiz başlangıç ve bitiş değerlerinde
		// karakterleri tutmamza sağlıyor.
		// dstBegin karakterleri atlamadan yani "bak" b ve k gelsin ama a gelmesin tarzı
		// kullanılabilir.
		char[] karakterler = new char[5];
		mesaj.getChars(/* srcBegin: */ 0, /* srcEnd: */5, karakterler, /* dstBegin: */0);
		System.out.println(karakterler);

		
		
		// Çok kullanılır. Bize karakterin hangi dizide olduğunu bulur. Saymaya soldan
		// başlar.
		System.out.println(mesaj.indexOf("a"));
		// Çok kullanılır. Bize karakterin hangi dizide olduğunu bulur. Saymaya sağdan
		// başlar.
		System.out.println(mesaj.lastIndexOf("a"));
		
		
		//replace = değiştirme
		String mesaj3 = mesaj.replace(/*oldchar:*/ ' ',/*newChar/*/'-');
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj3);
		
		//Çok kullanılır. Bir metnin içerisinden parça almaktır. ilk yazılan değer dahil son yazılan değer dahil olmaz.
		System.out.println(mesaj.substring(2,5));
		
		//split = parçalama. Çok kullanılır.
		for (String kelime : mesaj.split(/*regex*/" ")) {
			System.out.println(kelime);
		}
		
		//mesajı küçük harfe çevirir.
		System.out.println(mesaj.toLowerCase());
		//mesajı büyük harfe çevirir.
		System.out.println(mesaj.toUpperCase());
		//trim=kırpmak. metnin başındaki ve sonundaki boşlukları kırpmak için kullanabilirsin.
		System.out.println(mesaj.trim());
		
		
		
	}

}
