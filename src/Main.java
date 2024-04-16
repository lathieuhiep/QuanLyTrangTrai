public class Main {
    public static void main(String[] args) {
        // ga ri
        Ga gaRi = new Ga();
        gaRi.nhapGiaTri(
                "G01",
                "Gà ri",
                "Thóc",
                "Trên cạn",
                "Bình thường",
                "VN",
                "Cái",
                0,
                1.2,
                4
        );
        gaRi.inTT();
        gaRi.deTrung();
        gaRi.boiDat();
        gaRi.keu();

        // vit xiem
        Vit vitXiem = new Vit();
        vitXiem.nhapGiaTri("G02",
                "Vịt xiêm",
                "Thóc",
                "Trên cạn / Dưới nước",
                "Bình thường",
                "Thái Lan",
                "Cái",
                0,
                1.2,
                "Mào xanh"
        );
        vitXiem.inTT();
        vitXiem.deTrung();
        vitXiem.boiLoi();
        vitXiem.keu();
    }
}
