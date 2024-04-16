package com.techja.quanlytrangtrai.giacam;

import com.techja.quanlytrangtrai.ichung.IHanhVi;
import com.techja.quanlytrangtrai.ichung.IInTT;

public abstract class GiaCam implements IHanhVi, IInTT {
    private String ma, loai, thucAn, moiTruongSong, theTrang, nguonGoc,  giong;
    private int soTrung;
    private double canNang;

    public GiaCam(String ma, String loai, String thucAn, String moiTruongSong, String theTrang, String nguonGoc, String giong, int soTrung, double canNang) {
        this.ma = ma;
        this.loai = loai;
        this.thucAn = thucAn;
        this.moiTruongSong = moiTruongSong;
        this.theTrang = theTrang;
        this.nguonGoc = nguonGoc;
        this.giong = giong;
        this.soTrung = soTrung;
        this.canNang = canNang;
    }

    @Override
    public void inTT() {
        System.out.println("Mã: " + ma);
        System.out.println("Loại: " + loai);
        System.out.println("Thức ăn: " + thucAn);
        System.out.println("Môi trường sống: " + moiTruongSong);
        System.out.println("Thể trạng: " + theTrang);
        System.out.println("Nguồn gốc: " + nguonGoc);
        System.out.println("Giống: " + giong);
        System.out.println("Số trứng: " + soTrung);
        System.out.println("Cân nặng: " + canNang);
    }
}
