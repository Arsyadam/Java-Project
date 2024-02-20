package oop.pholimorphisme;

public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    @Override
    public double luas(){
        return this.sisi * this.sisi;
    }

    @Override
    public double keliling(){
        return this.sisi *4;
    }
}