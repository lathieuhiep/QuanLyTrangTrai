public class Ga extends GiaCam {
    int soCua;

    void boiDat() {
        System.out.println("Gà bới đất tìm sâu");
    }

    void nhapGiaTri(
            String gTriMa,
            String gTLoai,
            String gTriThucAn,
            String gTriMTS,
            String gTriTheTrang,
            String gTriNguonGoc,
            String gTriGiong,
            int gTriSoTrung,
            double gTriCanNang,
            int gTriSoCua
    ) {
        super.nhapGiaTri(
                gTriMa,
                gTLoai,
                gTriThucAn,
                gTriMTS,
                gTriTheTrang,
                gTriNguonGoc,
                gTriGiong,
                gTriSoTrung,
                gTriCanNang
        );

        soCua = gTriSoCua;
    }

    @Override
    void inTT() {
        super.inTT();
        System.out.println("Số cựa: " + soCua);
    }

    @Override
    void keu() {
        System.out.println("Cục tác");
    }
}
