package com.shozhongjian.ui.ui.image.statics.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shozhongjian.ui.ui.image.statics.widgets.ui.Widgets
import com.shozhongjian.ui.ui.theme.UI组件Theme


class WidgetsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI组件Theme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                )
                {
                    Widgets()

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    UI组件Theme {
        Widgets()

    }
}