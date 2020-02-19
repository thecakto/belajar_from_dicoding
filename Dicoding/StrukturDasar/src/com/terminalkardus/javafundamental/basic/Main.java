package com.terminalkardus.javafundamental.basic;

import com.terminalkardus.javafundamental.basic.kendaraan.Kereta;
import com.terminalkardus.javafundamental.basic.kendaraan.Mobil;
import com.terminalkardus.javafundamental.basic.kendaraan.Motor;
import com.terminalkardus.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello Java");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok = " + tomorrow);
        Date lusa = DateUtils.addDays(today,2);
        System.out.println("Lusa = " + lusa);

    }
}
