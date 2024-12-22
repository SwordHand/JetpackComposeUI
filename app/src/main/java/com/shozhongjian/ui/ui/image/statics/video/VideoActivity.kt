package com.shozhongjian.ui.ui.image.statics.video

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shozhongjian.ui.ui.image.statics.video.ui.Videos
import com.shozhongjian.ui.ui.theme.UI组件Theme


class VideoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI组件Theme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                )
                {

                    Videos()


                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview7() {
    UI组件Theme {
        Videos()

    }
}