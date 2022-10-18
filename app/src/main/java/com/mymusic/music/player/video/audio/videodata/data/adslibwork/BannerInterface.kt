package com.mymusic.music.player.video.audio.videodata.data.adslibwork

import android.widget.RelativeLayout
import com.google.android.gms.ads.AdSize

interface BannerInterface {

    fun showBanner(bannerIDString:String, mAdsSize: AdSize, container: RelativeLayout)
}