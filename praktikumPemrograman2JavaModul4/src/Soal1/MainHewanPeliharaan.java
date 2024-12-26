package Soal1;

import java.util.Scanner;

public class MainHewanPeliharaan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nama hewan Peliharaan: ");
		String nama = input.nextLine();
		
		System.out.println("Nama ras: ");
		String ras = input.nextLine();
		
		HewanPeliharaan hp = new HewanPeliharaan(nama, ras);
		
		hp.display();
	}

}
