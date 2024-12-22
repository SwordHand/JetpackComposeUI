package com.shozhongjian.ui.ui.image.statics.carousel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shozhongjian.ui.ui.image.statics.carousel.ui.Carouselss
import com.shozhongjian.ui.ui.theme.UI组件Theme

class CarouselActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI组件Theme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                ){
                    Carouselss()
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    UI组件Theme {
        Carouselss()
    }
}