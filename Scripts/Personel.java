/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author Kayra
 */
public class Personel {
    public String ad,soyad;
	public int yas;
	public String bolum;
	private static int sayi=0;
	public Personel(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		sayi+=1;
	}
        public Personel(String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		sayi+=1;
	}
	public static int getSayi() {
		return sayi;
	}
	public static void setSayi(int sayi) {
		Personel.sayi = sayi;
	}
	public void bilgileriyazdir() {
		System.out.println("isim->"+ad+"\nsoyad->"+soyad+"\nyas->"+yas);
                calisansayiver();
	}
	final public void calisansayiver() {
		System.out.println("tum calisanlar->"+sayi);
	}
}
