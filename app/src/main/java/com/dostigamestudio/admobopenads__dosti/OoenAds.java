package com.dostigamestudio.admobopenads__dosti;

import android.app.Application;

import com.dostigamestudio.admob_open_ads__dosti.Admob_Ads_DOSTI_Manager;
import com.google.android.gms.ads.MobileAds;

public class OoenAds extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this);

        new Admob_Ads_DOSTI_Manager(this,"ca-app-pub-3940256099942544/3419835294");


    }
}