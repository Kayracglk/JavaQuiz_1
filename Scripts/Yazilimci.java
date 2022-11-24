/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author Kayra
 */
public class Yazilimci extends Personel{
        private int id;
	public int gs;
	private static int sayac=100;
	
	public Yazilimci(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.gs = gs;
		bolum="Yazilim";
		sayac+=5;
		this.id=sayac;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getSayac() {
		return sayac;
	}

	public static void setSayac(int sayac) {
		Yazilimci.sayac = sayac;
	}

	@Override
	public void bilgileriyazdir() {
		System.out.println("\nid->"+id);
		System.out.println("bolum->"+bolum);
		System.out.println("gs->"+gs);    
                super.bilgileriyazdir();
	}

	public void zamhesapla() {
		int x=0;
		if(gs>20) {
			
			x=yas*30/100;
		}
		else if(gs>10) {
			
			x=yas*20/100;
		}
		else {
			
			x=yas*10/100;
		}
		System.out.println("Zam miktari->"+x);
		System.out.println("");
	}	
}
