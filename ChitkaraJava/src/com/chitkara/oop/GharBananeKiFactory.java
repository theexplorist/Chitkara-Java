package com.chitkara.oop;

public class GharBananeKiFactory {

	/*
	public static void gharBadli(Ghar ghar1, Ghar ghar2) {
		// TODO Auto-generated method stub
		Ghar temp = ghar1;
		ghar1 = ghar2;
		ghar2 = temp;
	}

	// ram, shyam
	public static void gharBadliReturns(Ghar ghar1, Ghar ghar2) {
		// TODO Auto-generated method stub
		int temp = ghar1.price;
		ghar1.price = ghar2.price;
		ghar2.price = temp;

		int tempSize = ghar1.size;
		ghar1.size = ghar2.size;
		ghar2.size = tempSize;

		String tempColor = ghar1.color;
		ghar1.color = ghar2.color;
		ghar2.color = tempColor;
	}

	// case 3 shyam khel gya
	public static void gharBadliReturns2(Ghar ghar1, Ghar ghar2) {
		// TODO Auto-generated method stub
		ghar2 = new Ghar();// Ye khatarnak line shyam ne add kri
		int temp = ghar1.price;
		ghar1.price = ghar2.price;
		ghar2.price = temp;

		int tempSize = ghar1.size;
		ghar1.size = ghar2.size;
		ghar2.size = tempSize;

		String tempColor = ghar1.color;
		ghar1.color = ghar2.color;
		ghar2.color = tempColor;
	}
	*/

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Ghar shyamKaGhar = new Ghar();// int[]
		 * shyam = new int[5] System.out.println(shyamKaGhar);
		 * 
		 * // System.out.println(shyamKaGhar.price); //get //
		 * System.out.println(shyamKaGhar.color); //get //
		 * System.out.println(shyamKaGhar.size);//get
		 * 
		 * shyamKaGhar.price = 1000000;// set shyamKaGhar.color = "Red";//set
		 * shyamKaGhar.size = 2000;//set
		 * 
		 * // System.out.println(shyamKaGhar.price); //
		 * System.out.println(shyamKaGhar.color); //
		 * System.out.println(shyamKaGhar.size);
		 * 
		 * Ghar ramKaGhar = new Ghar(); // // System.out.println(ramKaGhar.price); //
		 * System.out.println(ramKaGhar.color); // System.out.println(ramKaGhar.size);
		 * 
		 * ramKaGhar.price = 20000;// set ramKaGhar.color = "Yellow";//set
		 * ramKaGhar.size = 1000;
		 * 
		 * // System.out.println(ramKaGhar.price); //
		 * System.out.println(ramKaGhar.color); // System.out.println(ramKaGhar.size);
		 * // // gharBadli(ramKaGhar, shyamKaGhar);
		 * 
		 * System.out.println(ramKaGhar.price); System.out.println(ramKaGhar.color);
		 * System.out.println(ramKaGhar.size);
		 * 
		 * gharBadliReturns2(ramKaGhar, shyamKaGhar);
		 * 
		 * System.out.println(ramKaGhar.price); //0 System.out.println(ramKaGhar.color);
		 * //null System.out.println(ramKaGhar.size); //0
		 * 
		 * ramRevenge(shyamKaGhar, ramKaGhar.price, ramKaGhar.size, ramKaGhar.color);
		 * System.out.println("ram ka badla"); System.out.println(ramKaGhar.price);
		 * System.out.println(ramKaGhar.color); System.out.println(ramKaGhar.size);
		 * System.out.println("Shyam ka kya haal hai");
		 * System.out.println(shyamKaGhar.price); System.out.println(shyamKaGhar.color);
		 * System.out.println(shyamKaGhar.size);
		 */
		// Ref //Object
		/*
		 * Ghar rajKaGhar = new Ghar(); rajKaGhar.price = 1000; rajKaGhar.color =
		 * "Blue"; rajKaGhar.size = 1000;
		 * 
		 * Ghar jaiKaGhar = new Ghar(); jaiKaGhar.price = 2000; jaiKaGhar.color =
		 * "Yellow"; jaiKaGhar.size = 100;
		 * 
		 * jaiKaGhar.gharKiPriceBata(rajKaGhar);//
		 */

		Ghar rahulKaGhar = new Ghar(2000, "Red", 1000000);
		Ghar meraGhar = new Ghar();
		meraGhar.getDoors();
		meraGhar.gharKiPriceBata(meraGhar);
		meraGhar.getDoors();
		//rahulKaGhar.priceSet(10000000);

		//rahulKaGhar.gharKiPriceBata(rahulKaGhar);
	}

	public static void ramRevenge(Ghar ghar1, int price, int size, String color) {
		// TODO Auto-generated method stub
		ghar1.price = 0;
		ghar1.color = null;
		ghar1.size = 0;

		price = 10000000;
		size = 10000;
		color = "Red";
	}

}
