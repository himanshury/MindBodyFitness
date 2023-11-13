package com.example.bodyfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.DefaultPlayerUiController


class BenchPress : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bench_press)

        val videoPlayer =findViewById<YouTubePlayerView>(R.id.ytPlayer)
        videoPlayer.enableAutomaticInitialization = false // We set it to false because we init it manually

        val listener: YouTubePlayerListener = object : AbstractYouTubePlayerListener() {

            override fun onReady(youTubePlayer: YouTubePlayer) {
                // We're using pre-made custom ui
                val defaultPlayerUiController =
                    DefaultPlayerUiController(videoPlayer, youTubePlayer)
                defaultPlayerUiController.showFullscreenButton(true)
                videoPlayer.setCustomPlayerUi(defaultPlayerUiController.rootView)
                val videoId = "8iPEnn-ltC8"
                youTubePlayer.cueVideo(videoId, 0f)
            }
        }

        // Disable iFrame UI
        val options: IFramePlayerOptions = IFramePlayerOptions.Builder().controls(0).build()
        videoPlayer.initialize(listener, options)




    }
}


