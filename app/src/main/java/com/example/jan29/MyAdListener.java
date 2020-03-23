package com.example.jan29;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

class MyAdListener extends AdListener {
    Context context;
    InterstitialAd mInterstitialAd;
    public MyAdListener(Context context, InterstitialAd mInterstitialAd) {
        this.context=context;
        this.mInterstitialAd=mInterstitialAd;
    }

    @Override
        public void onAdLoaded() {
            // Code to be executed when an ad finishes loading.
            Toast.makeText(context, "AdLoaded", Toast.LENGTH_SHORT).show();
            if (mInterstitialAd!=null){
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        }

        @Override
        public void onAdFailedToLoad(int errorCode) {
            // Code to be executed when an ad request fails.
            Toast.makeText(context, "AdFailedToLoad", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onAdOpened() {
            // Code to be executed when an ad opens an overlay that
            // covers the screen.
            Toast.makeText(context, "AdOpened", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onAdClicked() {
            // Code to be executed when the user clicks on an ad.
            Toast.makeText(context, "AdLoaded", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onAdLeftApplication() {
            // Code to be executed when the user has left the app.
            Toast.makeText(context, "AdClicked", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onAdClosed() {
            // Code to be executed when the user is about to return
            // to the app after tapping on an ad.
            Toast.makeText(context, "AdClosed", Toast.LENGTH_SHORT).show();
                if (mInterstitialAd!=null){
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }

        }
    
}
