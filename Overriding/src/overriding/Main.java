/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);//scanner
        //
        Induk utama = new Induk();
        
        //membuat objek
        AnakPertama satu = new AnakPertama();
        System.out.print("Masukkan sisi kubus : ");//input sisi kubus
        satu.sisi = I.nextInt();
        
        //membuat objek
        AnakKedua dua = new AnakKedua();
        System.out.print("Masukkan panjang balok\t: ");//input panjang balok
        dua.p = I.nextInt();
        System.out.print("Masukkan lebar balok\t: ");//input lebar balok
        dua.l = I.nextInt();
        System.out.print("Masukkan tinggi balok\t: ");//input tinggi balok
        dua.t = I.nextInt();
        
        System.out.println("");
        utama.Volume();//pemanggilan method Volume pada class induk
        utama.LuasPermukaan();//pemanggilan method LuasPermukaan pada class induk
        
        satu.Volume();//pemanggilan method Volume pada class AnakPertama
        satu.LuasPermukaan();//pemanggilan method LuasPermukaan pada class AnakPertama
        
        dua.Volume();//pemanggilan method Volume pada class AnakKedua
        dua.LuasPermukaan();//pemanggilan method LuasPermukaan pada class AnakKedua
    }
    
}
