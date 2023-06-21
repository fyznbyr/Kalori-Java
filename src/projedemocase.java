import java.util.Scanner;



public class projedemocase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("***İÇECEK VE YİYECEK KALORİ HESAPLAMA PROGRAMI***");
		
		
		System.out.println("1-Coca Cola Lime");
		System.out.println("2-Diet Kola");
		System.out.println("3-Fanta");
		System.out.println("4-Gazoz");
		System.out.println("5-Fanta Zero");
		System.out.println("6-Ice Tea");
		System.out.println("7-Kola");
		System.out.println("8-Kola Zero");
		System.out.println("9-Limonata");
		System.out.println("10-Pepsi");
		System.out.println("11-Sprite");
		System.out.println("12-Tonik");
		System.out.println("13-Schweppes Ginger Ale");
		System.out.println("14-Cici Bebe");
		System.out.println("15-Karam Çikolatalı Gofret");
		System.out.println("16-Negro Kakaolu Bisküvi");
		System.out.println("17-Hoşbeş Gofret");
		System.out.println("18-Eti Cin");
		System.out.println("19-Maximus");
		System.out.println("20-Tutku Bisküvi");
		
		System.out.println("Lütfen Bir Seçim Yapınız");
		
		
		boolean isValidChoice = false;
		int secim; 
		
		do{
			secim = scanner.nextInt();
		switch(secim) {
		case 1:
			System.out.println("Coca Cola Lime 41 Kalori");
			break;
			
		case 2:
			System.out.println("Diet Kola 1 Kalori");
			break;
		case 3:
			System.out.println("Fanta 39 Kalori");
			break;
		case 4:
			System.out.println("Gazoz 35 Kalori");
			break;
		case 5:
			System.out.println("Fanta Zero 0 Kalori");
			break;
		case 6:
			System.out.println("Ice Tea 27 Kalori");
			break;
		case 7:
			System.out.println("Kola 42 Kalori");
			break;
		case 8:
			System.out.println("Kola Zero 0 Kalori");
			break;
		case 9:
			System.out.println("Limonata 25 Kalori");
			break;
		case 10:
			System.out.println("Pepsi 44 Kalori");
			break;
		case 11:
			System.out.println("Sprite 37 Kalori");
			break;
		case 12:
			System.out.println("Tonik 35 Kalori");
			break;
		case 13:
			System.out.println("Schweppes Ginger Ale 38 kalori");
			break;
		case 14:
			System.out.println("Cici Bebe 443 Kalori");
			break;
		case 15:
			System.out.println("Karam Çikolatalı Gofret 517 Kalori");
			break;
		case 16:
			System.out.println("Negro Kakaolu Bisküvi 480 Kalori");
			break;
		case 17:
			System.out.println("Hoşbeş Gofret 493 Kalori");
			break;
		case 18:
			System.out.println("Eti Cin 440 Kalori");
			break;
		case 19:
			System.out.println("Maximus 498 Kalori");
			break;
		case 20:
			System.out.println("Tutku Bisküvi 510 Kalori");
			break;
		default:
			System.out.println("Geçersiz seçim yaptınız. Lütfen tekrar deneyin.");
			isValidChoice = false;
			break;
		}
	   } while (!isValidChoice);
		scanner.close();
	}
		
		 
		
	}


