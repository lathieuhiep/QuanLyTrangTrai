public class Vit extends GiaCam {
    String mao;

    void boiLoi() {
        System.out.println("Vịt bơi lặn tìm cá");
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
            String gTriMao
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

        mao = gTriMao;
    }

    @Override
    void inTT() {
        super.inTT();
        System.out.println("Mào: " + mao);
    }

    @Override
    void keu() {
        System.out.println("Cạp cạp");
    }
}
