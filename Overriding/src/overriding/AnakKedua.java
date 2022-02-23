/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author MOKLET-2
 */
public class AnakKedua extends Induk{
    int p, l, t;

    @Override//overriding
    int Volume(){
        System.out.println("\nBalok");
        int volume = p * l * t;//rumus perhitungan
        System.out.println("Volume Balok\t\t: " + volume+" cm3");
        return volume;
    }

    @Override//overriding
    int LuasPermukaan(){
        int LuasPermukaan = 2*(p*l + p*t + l*t);//rumus perhitungan
        System.out.println("Luas Permukaan Balok\t: " + LuasPermukaan+" cm2");
        return LuasPermukaan;
    }
}
