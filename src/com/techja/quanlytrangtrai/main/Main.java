package com.techja.quanlytrangtrai.main;

import com.techja.quanlytrangtrai.giacam.Ga;
import com.techja.quanlytrangtrai.giacam.GiaCam;
import com.techja.quanlytrangtrai.giacam.Vit;

public class Main {
    public static void main(String[] args) {
        // ga ri
        GiaCam giaCam1 = new Ga(
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

        giaCam1.inTT();
        giaCam1.keu();
        giaCam1.deTrung();
        ((Ga)giaCam1).boiDat();

        // vit xiem
        GiaCam giaCam2 = new Vit(
                "G02",
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
        giaCam2.inTT();
        giaCam2.keu();
        giaCam2.deTrung();
        ((Vit)giaCam2).boiLoi();
    }
}
