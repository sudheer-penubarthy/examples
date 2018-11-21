package com.sample.utils;

import java.util.Map;

public class GetCoordinates {
    private static String address = "tiruvanmiyur chennai";

    public static void main(String[] args) {
        Map<String, Double> coords;
        coords = OpenStreetMapUtils.getInstance().getCoordinates(address);
        System.out.println(coords);
        System.out.println("latitude :" + coords.get("lat"));
        System.out.println("longitude:" + coords.get("lon"));
    }
}

//"https://nominatim.openstreetmap.org/search?q=The+White+House,+Washington+DC&amp;format=json&amp;addressdetails=1"
