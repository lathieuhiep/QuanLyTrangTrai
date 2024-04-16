package com.techja.quanlytrangtrai.giacam;

public class Vit extends GiaCam {
    private String mao;

    public Vit(String ma, String loai, String thucAn, String moiTruongSong, String theTrang, String nguonGoc, String giong, int soTrung, double canNang, String mao) {
        super(ma, loai, thucAn, moiTruongSong, theTrang, nguonGoc, giong, soTrung, canNang);
        this.mao = mao;
    }

    public void boiLoi() {
        System.out.println("Vịt bơi lặn tìm cá");
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Mào: " + mao);
    }

    @Override
    public void keu() {
        System.out.println("Cạp cạp");
    }

    @Override
    public void deTrung() {}
}
