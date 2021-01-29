package com.chitkara.exceptionhandling;

public class AssignmentDeneWaale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentKarneWaale a1 = new AssignmentKarneWaale();
		try {
			System.out.println("Assistant ko call");
			a1.assistant(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Chalo 9 pages ka bana lo!");
			System.out.println("assistant tere number gaye");
		} finally {
			System.out.println("Meri naukri bach gyi!");
		}
		System.out.println("Kr liya homework?");//
	}

}
