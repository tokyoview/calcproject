//package com.example.applicationproject;
//
//import android.content.Context;
//
//public class DataBaseFill implements Runnable {
//
//    private final Context context;
//
//    public DataBaseFill(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public void run() {
//        Parsing parsing = new Parsing(this.context);
//        Parsing.Maxidom mw = parsing.new Maxidom();
//        MaxidomParse(mw);
//    }
//
//    private void MaxidomParse(Parsing.Maxidom obj) {
//        String wallpapers_url = "https://www.maxidom.ru/catalog/oboi/?amount=12&PAGEN_3=";
//        String laminat_url = "https://www.maxidom.ru/catalog/laminat/?amount=12&PAGEN_3=";
//        //String plitka_url = "https://www.maxidom.ru/catalog/plitka-napolnaya/";
//        //String plintus_url = "https://www.maxidom.ru/catalog/plintusy-na-osnove-pvh/?amount=12&PAGEN_3=";
//        //String dveri_url = "https://www.maxidom.ru/catalog/dveri-mezhkomnatnye/";
//        //String pot_plitka_url = "https://www.maxidom.ru/catalog/plitki-potolochnye/?amount=12&PAGEN_3=";
//        /*for (int i = 1; i < 99; i++){
//            obj.parseMaxidomWallpaper(wallpapers_url + i);
//            obj.parseMaxidomLaminat(laminat_url + i);
//            //Log.i("RABOTYAGA", String.valueOf(i));
//        } */
//        //String plitka_url = "https://www.maxidom.ru/catalog/plitka-napolnaya/";
//        //String shtory_url = "https://www.maxidom.ru/catalog/shtory/";
//        //String dveri_url = "https://www.maxidom.ru/catalog/dveri-mezhkomnatnye/";
//        //String pot_plitka_url = "https://www.maxidom.ru/catalog/plitki-potolochnye/";
//
//        obj.parseMaxidomWallpaper(wallpapers_url + 1);
//        obj.parseMaxidomLaminat(laminat_url + 1);
//        //obj.parseMaxidomPlitka(plitka_url);
//        //obj.parseMaxidomPlintusPVH(plintus_url + 1);
//        //obj.parseMaxidomDveri(dveri_url);
//        //obj.parseMaxidomPotPlitka(pot_plitka_url + 1);
//    }
//}
