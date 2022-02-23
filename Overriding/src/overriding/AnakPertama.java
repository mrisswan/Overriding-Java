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
public class AnakPertama extends Induk{
    int sisi;
    
    @Override//overriding
    int Volume(){
        System.out.println("\nKubus");
        int volume = sisi * sisi * sisi;//rumus perhitungan
        System.out.println("Volume Kubus\t\t: " + volume+" cm3");
        return volume;
    }

    @Override//overriding
    int LuasPermukaan(){
        int LuasPermukaan = 6 * sisi * sisi;//rumus perhitungan
        System.out.println("Luas Permukaan Kubus\t: " + LuasPermukaan+" cm2");
        return LuasPermukaan;
    }
}
