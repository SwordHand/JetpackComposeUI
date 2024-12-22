package com.shozhongjian.ui.ui.image.statics.staticdiagramsui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shozhongjian.ui.ui.image.statics.staticdiagramsui.ui.Images
import com.shozhongjian.ui.ui.theme.UI组件Theme

class ImangActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI组件Theme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                 .verticalScroll(rememberScrollState()) // 添加垂直滚动




                ) {
                    Images()



                }


            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    UI组件Theme {
        Images()


    }
}