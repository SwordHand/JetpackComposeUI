package com.shozhongjian.ui.ui.image.statics.widgets.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.CircularWavyProgressIndicator
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearWavyProgressIndicator
import androidx.compose.material3.LoadingIndicator
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.shozhongjian.ui.R

@Composable
fun Widgets() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(end = 15.dp) // 底部添加间距
        .padding(start = 15.dp) // 底部添加间距
        .windowInsetsPadding(WindowInsets.safeContent)

    ) {


    Row {
        Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
        Widgets2()
        Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
        Widgets4()
        Spacer(modifier = Modifier.width(10.dp)) // 添加间隔


    }
    Row {
        Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
        Widgets3()
    }
        Row {
            Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
            Widgets5()
        }
        Row {
            Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
            Widgets6()
        }
    }

}



@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun Widgets2() {
    Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
  Column(horizontalAlignment = Alignment.CenterHorizontally) { ContainedLoadingIndicator() }
    Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
    Column(horizontalAlignment = Alignment.CenterHorizontally) { CircularWavyProgressIndicator() }
    Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
    Column(horizontalAlignment = Alignment.CenterHorizontally) { LoadingIndicator() }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun Widgets3() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) { LinearWavyProgressIndicator() }

}

@Composable
fun Widgets4() {
    FilledIconButton(onClick = { /* doSomething() */ }) {
        // 使用 painterResource 加载自定义图标
        Icon(
            painter = painterResource(id = R.drawable.rounded_album_24), // 替换为您的图标文件名
            contentDescription = "Localized description",
            modifier = Modifier.size(24.dp) // 设置图标大小
        )
    }
    Spacer(modifier = Modifier.width(10.dp)) // 添加间隔
    // 使用 remember 来保存 checked 状态
    var checked by remember { mutableStateOf(false) }

    FilledIconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
        // 根据 checked 状态选择不同的图标
        if (checked) {
            Icon(
                painter = painterResource(id = R.drawable.rounded_add_location_24), // 替换为您的填充图标文件名
                contentDescription = "Localized description",
                modifier = Modifier.size(24.dp) // 设置图标大小
            )
        } else {
            Icon(
                painter = painterResource(id = R.drawable.rounded_brightness_low_24), // 替换为您的轮廓图标文件名
                contentDescription = "Localized description",
                modifier = Modifier.size(24.dp) // 设置图标大小
            )
        }
    }
}


@Composable
fun Widgets5() {

    var sliderPosition by remember { mutableStateOf(0f) }
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(text = "%.2f".format(sliderPosition))
        Slider(
            modifier = Modifier.semantics { contentDescription = "Localized Description" },
            value = sliderPosition,
            onValueChange = { sliderPosition = it }
        )
    }
}
@Composable
fun Widgets6() {

    var checked by remember { mutableStateOf(true) }
    Switch(
        modifier = Modifier.semantics { contentDescription = "Demo" },
        checked = checked,
        onCheckedChange = { checked = it }
    )

}


