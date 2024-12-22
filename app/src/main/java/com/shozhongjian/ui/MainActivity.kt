package com.shozhongjian.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shozhongjian.ui.ui.Main
import com.shozhongjian.ui.ui.theme.UI组件Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI组件Theme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()


                ) {
                    Main()

                }
            }
        }
    }
}



@Preview(
    showBackground = true,
)
@Composable
fun GreetingPreview() {
    UI组件Theme {
            Main()

    }
}