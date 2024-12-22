package com.shozhongjian.ui.ui

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.shozhongjian.ui.ui.image.statics.carousel.CarouselActivity
import com.shozhongjian.ui.ui.image.statics.staticdiagramsui.ImangActivity
import com.shozhongjian.ui.ui.image.statics.video.VideoActivity
import com.shozhongjian.ui.ui.image.statics.widgets.WidgetsActivity

@Composable
fun Main() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 15.dp) // 底部添加间距
            .padding(start = 15.dp) // 底部添加间距
            .windowInsetsPadding(WindowInsets.safeContent)
    ) {



    Row(
        modifier = Modifier

    ) {
        ImageButton(context = LocalContext.current)
        Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
        CarouselButton(context = LocalContext.current)
        Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
        WidgetsButton(context = LocalContext.current)
    }
        Row(
            modifier = Modifier
        ) {

            VideoButton(context = LocalContext.current)
        }
    }
}

@Composable
fun ImageButton(context: Context) {

        Button(onClick = {
            val image = Intent(context, ImangActivity::class.java)
            context.startActivity(image)
        }) {
            Text(text = "静态图UI")


    }
}
@Composable
fun CarouselButton(context: Context) {

        Button(onClick = {
            val imagecarousel = Intent(context, CarouselActivity::class.java)
            context.startActivity(imagecarousel)
        }) {
            Text(text = "轮播图")

    }

}
@Composable
fun WidgetsButton(context: Context) {

    Button(onClick = {
        val widgets = Intent(context, WidgetsActivity::class.java)
        context.startActivity(widgets)
    }) {
        Text(text = "小部件")

    }

}

@Composable
fun VideoButton(context: Context) {

    Button(onClick = {
        val video = Intent(context, VideoActivity::class.java)
        context.startActivity(video)
    }) {
        Text(text = "视频播放")

    }

}
