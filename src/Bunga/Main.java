/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bunga;

/**
 *
 * @author Irawa
 */
public class Main {

    public static void main(String[] args) {

        Bunga_Kamboja bunga = new Bunga_Kamboja();

        bunga.setnama_ilmiah("Plumeria rubra");
        bunga.setWarna("Merah");
        bunga.setIklim("Tropis");
        bunga.setTanah("Berdrainase baik");
        bunga.setHewan_penyerbuk("Lebah");

        System.out.println("\t\t\tBunga Kamboja");
        System.out.println("Nama Ilmiah       : " + bunga.getnama_ilmiah());
        System.out.println("Warna             : " + bunga.getWarna());
        System.out.println("Iklim             : " + bunga.getIklim());
        System.out.println("Tanah             : " + bunga.getTanah());
        System.out.println("Hewan Penyerbuk   : " + bunga.getHewan_penyerbuk());
        
        Bunga_Edelweis fr = new Bunga_Edelweis();

        fr.setnama_ilmiah("Leontopolium alpinum");
        fr.setWarna("Putih atau keperakan ditengahnya kuning");
        fr.setIklim("Sejuk hingga dingin");
        fr.setTanah("Berbatu");
        fr.setHewan_penyerbuk("Lebah dan kupu-kupu");

        System.out.println("\n\t\t\tBunga Edelweis");
        System.out.println("Nama Ilmiah       : " + fr.getnama_ilmiah());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Iklim             : " + fr.getIklim());
        System.out.println("Tanah             : " + fr.getTanah());
        System.out.println("Hewan Penyerbuk   : " + fr.getHewan_penyerbuk());
        
        Bunga_Tulip bt = new Bunga_Tulip();

        bt.setnama_ilmiah("Tulipa");
        bt.setWarna("Beraam (Merah, Kuning, Putih)");
        bt.setIklim("sedang");
        bt.setTanah("Berdrainase baik dan subur");
        bt.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Tulip");
        System.out.println("Nama Ilmiah       : " + bt.getnama_ilmiah());
        System.out.println("Warna             : " + bt.getWarna());
        System.out.println("Iklim             : " + bt.getIklim());
        System.out.println("Tanah             : " + bt.getTanah());
        System.out.println("Hewan Penyerbuk   : " + bt.getHewan_penyerbuk());
        
        Bunga_Matahari fm = new Bunga_Matahari();

        fm.setnama_ilmiah("Heliantus anuus");
        fm.setWarna("Kuning");
        fm.setIklim("Sub tropis");
        fm.setTanah("Tanah yang berdrainase baik, kaya nutrisi");
        fm.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Matahari");
        System.out.println("Nama Ilmiah       : " + fm.getnama_ilmiah());
        System.out.println("Warna             : " + fm.getWarna());
        System.out.println("Iklim             : " + fm.getIklim());
        System.out.println("Tanah             : " + fm.getTanah());
        System.out.println("Hewan Penyerbuk   : " + fm.getHewan_penyerbuk());
        
        Bunga_Mawar bm = new Bunga_Mawar();

        bm.setnama_ilmiah("Rosa");
        bm.setWarna("Beragam (Merah, Kuning, Putih)");
        bm.setIklim("Sedang hingga Subtropis");
        bm.setTanah("Tanah yang berdrainase baik dan subur");
        bm.setHewan_penyerbuk("Lebah dan Kupu-kupu");

        System.out.println("\n\t\t\tBunga Mawar");
        System.out.println("Nama Ilmiah       : " + bm.getnama_ilmiah());
        System.out.println("Warna             : " + bm.getWarna());
        System.out.println("Iklim             : " + bm.getIklim());
        System.out.println("Tanah             : " + bm.getTanah());
        System.out.println("Hewan Penyerbuk   : " + bm.getHewan_penyerbuk());
    }

}
