public class GiaCam {
    String ma, loai, thucAn, moiTruongSong, theTrang, nguonGoc,  giong;
    int soTrung;
    double canNang;

    void nhapGiaTri(
            String gTriMa,
            String gTLoai,
            String gTriThucAn,
            String gTriMTS,
            String gTriTheTrang,
            String gTriNguonGoc,
            String gTriGiong,
            int gTriSoTrung,
            double gTriCanNang
    ) {
        ma = gTriMa;
        loai = gTLoai;
        thucAn = gTriThucAn;
        moiTruongSong = gTriMTS;
        theTrang = gTriTheTrang;
        nguonGoc = gTriNguonGoc;
        giong = gTriGiong;
        soTrung = gTriSoTrung;
        canNang = gTriCanNang;
    }

    void inTT() {
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

    void deTrung() {}

    void keu() {
        System.out.println("Không biết kêu thế nào");
    }
}
