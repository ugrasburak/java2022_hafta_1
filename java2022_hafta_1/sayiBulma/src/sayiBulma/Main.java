package sayiBulma;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak==sayilar[i]) {
				varMi=true;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut değildir.");
		}
	}

}
