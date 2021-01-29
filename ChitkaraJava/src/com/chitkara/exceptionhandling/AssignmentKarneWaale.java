package com.chitkara.exceptionhandling;

public class AssignmentKarneWaale {

	int pages;
	// 11

	public void assistant(int pages) {
		System.out.println("Hello main hun teacher ka assistant!");

		try {
			karnenge(pages);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("chalo 8 pages ka kr lo");
		} finally {
			System.out.println("Main bach gya!");
		}

		System.out.println("Assignment ho gya lagta hai");
	}

	// 11
	public void karnenge(int pages) { // Khat teacher ko diya
		// TODO Auto-generated method stub

		try {
			if (pages > 10) {
				throw new Exception("Humse na ho paega"); // Khat likha
			}
		} catch (Exception e) {
			System.out.println("Yr khud hi kr lenge milkr!");
		}

		System.out.println("Hum asssignment krenge");//
	}
}
