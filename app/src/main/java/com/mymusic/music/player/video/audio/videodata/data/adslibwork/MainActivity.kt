package com.mymusic.music.player.video.audio.videodata.data.adslibwork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mymusic.music.player.video.audio.videodata.data.adslibwork.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()/* ,BannerInterface*/{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        showBanner("ca-app-pub-3940256099942544/                                                                                                                                                                  6300978111", AdSize.BANNER,binding.bannerAdmob)

        BannerAdAdmob.loadBannerAd(this,"ca-app-pub-3940256099942544/6300978111",binding.adViewBanner)

    }

}