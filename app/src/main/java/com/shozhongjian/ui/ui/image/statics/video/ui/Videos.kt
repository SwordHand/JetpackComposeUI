package com.shozhongjian.ui.ui.image.statics.video.ui

import android.net.Uri
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.OptIn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.SimpleExoPlayer
import androidx.media3.ui.PlayerView
import com.shozhongjian.ui.ui.image.statics.video.util.ResponseVideo

@Composable
fun Videos() {
    // 使用状态来保存视频 URL
    val videoUrl = remember { mutableStateOf<String?>(null) }

    // 在 LaunchedEffect 中调用异步函数
    LaunchedEffect(Unit) {
        ResponseVideo { url ->
            videoUrl.value = url // 更新状态
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(end = 15.dp) // 底部添加间距
            .padding(start = 15.dp) // 底部添加间距
            .windowInsetsPadding(WindowInsets.safeContent)
    ) {
        // 检查 videoUrl 是否为 null
        if (videoUrl.value != null) {
            VideoPlayer(
                videoUrl = videoUrl.value!!, // 使用非空断言
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
        } else {
            LoadingVideo()
        }
    }
}

@kotlin.OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun LoadingVideo() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContainedLoadingIndicator()
    }
}
@OptIn(UnstableApi::class)
@Composable
fun VideoPlayer(
    videoUrl: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val player = remember {
        SimpleExoPlayer.Builder(context).build().apply {
            setMediaItem(
                MediaItem.Builder()
                    .setUri(Uri.parse(videoUrl))
                    .build()
            )
            prepare()
            play()
        }
    }

    DisposableEffect(key1 = player) {
        onDispose {
            player.release()
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        AndroidView(
            factory = { AndroidViewContext ->
                PlayerView(AndroidViewContext).apply {
                    this.player = player
                    useController = true
                    layoutParams = FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                }
            },
            modifier = Modifier
                .fillMaxSize()

        )
    }
}