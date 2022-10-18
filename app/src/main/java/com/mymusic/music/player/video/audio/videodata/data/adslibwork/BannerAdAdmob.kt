package com.mymusic.music.player.video.audio.videodata.data.adslibwork

import android.app.Activity
import android.widget.RelativeLayout
import com.google.android.gms.ads.*


class BannerAdAdmob {
    companion object {
        lateinit var adView : AdView
         var bannerAd: Boolean? = false


        fun loadBannerAd(activity: Activity, id: String, adViewBanner: RelativeLayout) {
//=====================
            MobileAds.initialize(activity) {

            }

            adView = AdView(activity)
            adView.adUnitId = id

            adView.setAdSize(AdSize.BANNER)
            val adRequest = AdRequest.Builder().build()
            adView.loadAd(adRequest)

            var params = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT

            )
            adViewBanner.addView(adView, params)

            adView.adListener = object: AdListener() {
                override fun onAdLoaded() {
                    bannerAd = true
                    // Code to be executed when an ad finishes loading.
                }

                override fun onAdFailedToLoad(adError : LoadAdError) {
                    bannerAd = false
                    // Code to be executed when an ad request fails.
                }

                override fun onAdOpened() {
                    // Code to be executed when an ad opens an overlay that
                    // covers the screen.
                }

                override fun onAdClicked() {
                    loadBannerAd(activity, id, adViewBanner)
                    // Code to be executed when the user clicks on an ad.
                }

                override fun onAdClosed() {
                    // Code to be executed when the user is about to return
                    // to the app after tapping on an ad.
                }
            }

        }
    }
}