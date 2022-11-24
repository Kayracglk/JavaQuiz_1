/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import java.util.Scanner;

/**
 *
 * @author Kayra
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
		
		System.out.println("Yazilimci sayisi->");
		int yazsayisi=scan.nextInt();
		
		Yazilimci[] dizi = new Yazilimci[yazsayisi];
		
		String ad,soyad;
		int yas,gs;
		for(int i=0;i<yazsayisi;i++) {
			System.out.print("\nAd->");
			ad = scan.next();
			System.out.print("Soyad->");
			soyad = scan.next();
			System.out.print("Yas->");
			yas = scan.nextInt();
			System.out.print("Gs->");
			gs = scan.nextInt();
			dizi[i]=new Yazilimci(ad,soyad,yas,gs);
			
		}
		//dizi[0].calisansayiver();
		//System.out.println("\nListeleniyor.");
		for(int i=0;i<yazsayisi;i++) {
			
			dizi[i].bilgileriyazdir();
			dizi[i].zamhesapla();
		}
    }
    
}
