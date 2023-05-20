package chapter6and7.Problem;

import chapter6and7.GeopoliticalZone;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

public class GeoMain {
    public static void main(String[] args) {
        String state = "Ogun";
        GeopoliticalZone[] geopoliticalZones = GeopoliticalZone.values();
        for (GeopoliticalZone d: geopoliticalZones) {
            if (d.name().equals(state)) System.out.println(geopoliticalZones);
        }
    }
}