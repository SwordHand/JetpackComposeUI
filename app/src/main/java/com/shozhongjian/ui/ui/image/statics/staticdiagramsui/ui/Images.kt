package com.shozhongjian.ui.ui.image.statics.staticdiagramsui.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shozhongjian.ui.R

@Composable
fun Images() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 15.dp) // 底部添加间距
            .padding(start = 15.dp) // 底部添加间距
            .windowInsetsPadding(WindowInsets.safeContent)

    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth() // 设置宽度为最大
                .clip(RoundedCornerShape(30.dp)), // 设置圆角，16.dp 可以根据需要调整
            painter = painterResource(id = R.drawable.a), // 替换为你的图像资源
            contentDescription = null,
        )
        Images2()
        Images3()
    }
}

@Composable
fun Images2() {
    Row(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
    ) {
        Image(
            modifier = Modifier
                .shadow(12.dp, RoundedCornerShape(30.dp)) // 添加阴影
                .clip(RoundedCornerShape(30.dp)) // 设置圆角
                .weight(1f), // 使用权重分配空间

            painter = painterResource(id = R.drawable.b), // 替换为你的图像资源
            contentDescription = "描述图像内容" // 提供图像的内容描述
        )
        Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
        Image(
            modifier = Modifier
                .shadow(12.dp, RoundedCornerShape(30.dp)) // 添加阴影
                .clip(RoundedCornerShape(30.dp)) // 设置圆角
                .weight(1f), // 使用权重分配空间

            painter = painterResource(id = R.drawable.b), // 替换为你的图像资源
            contentDescription = "描述图像内容" // 提供图像的内容描述
        )
    }
}

@Composable
fun Images3() {
    Column(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
    ) {
        for (index in 0 until 10) { // 假设有 100 个项目
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                // 第一个图像
                Image(
                    modifier = Modifier
                        .shadow(12.dp, RoundedCornerShape(30.dp)) // 添加阴影
                        .clip(RoundedCornerShape(30.dp)) // 设置圆角
                        .weight(1f), // 使用权重分配空间
                    painter = painterResource(id = R.drawable.b), // 替换为你的图像资源
                    contentDescription = "描述图像内容" // 提供图像的内容描述
                )
                Spacer(modifier = Modifier.width(10.dp)) // 添加间隔

                // 第二个图像
                Image(
                    modifier = Modifier
                        .shadow(12.dp, RoundedCornerShape(30.dp)) // 添加阴影
                        .clip(RoundedCornerShape(30.dp)) // 设置圆角
                        .weight(1f), // 使用权重分配空间
                    painter = painterResource(id = R.drawable.b), // 替换为你的图像资源
                    contentDescription = "描述图像内容" // 提供图像的内容描述
                )
                Spacer(modifier = Modifier.width(10.dp)) // 添加间隔

                // 第三个图像
                Image(
                    modifier = Modifier
                        .shadow(12.dp, RoundedCornerShape(30.dp)) // 添加阴影
                        .clip(RoundedCornerShape(30.dp)) // 设置圆角
                        .weight(1f), // 使用权重分配空间
                    painter = painterResource(id = R.drawable.b), // 替换为你的图像资源
                    contentDescription = "描述图像内容" // 提供图像的内容描述
                )
            }
            Spacer(modifier = Modifier.height(10.dp)) // 添加行间隔
        }
    }
}






