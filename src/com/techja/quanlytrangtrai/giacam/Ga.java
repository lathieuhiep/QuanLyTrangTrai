package com.techja.quanlytrangtrai.giacam;

public class Ga extends GiaCam {
    private int soCua;

    public Ga(String ma, String loai, String thucAn, String moiTruongSong, String theTrang, String nguonGoc, String giong, int soTrung, double canNang, int soCua) {
        super(ma, loai, thucAn, moiTruongSong, theTrang, nguonGoc, giong, soTrung, canNang);
        this.soCua = soCua;
    }

    public void boiDat() {
        System.out.println("Gà bới đất tìm sâu");
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Số cựa: " + soCua);
    }

    @Override
    public void keu() {
        System.out.println("Cục tác");
    }

    @Override
    public void deTrung() {}
}
