package com.shozhongjian.ui.ui.image.statics.carousel.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.mandatorySystemGesturesPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.shozhongjian.ui.R


@Composable
fun Carouselss() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 15.dp) // 底部添加间距
            .padding(start = 15.dp) // 底部添加间距
            .windowInsetsPadding(WindowInsets.safeContent)

    ) {
        Carousels()
    }
}

/**
 * 展示轮播图的Composable函数
 *
 * 该函数使用HorizontalUncontainedCarousel组件来展示一组图片，并支持滑动切换。
 * 图片资源通过CarouselItem数据类进行封装，包含图片的唯一ID和对应的资源ID。
 *
 * @param modifier 用于修饰轮播图的Modifier
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Carousels(modifier: Modifier = Modifier) {

    // 定义一个CarouselItem列表，包含了轮播图中要展示的图片资源
    val item = remember {
        listOf(
            CarouselItem(0, R.drawable.a),
            CarouselItem(1, R.drawable.c),
            CarouselItem(2, R.drawable.d),
            CarouselItem(3, R.drawable.e)
        )
    }

    // 使用HorizontalUncontainedCarousel组件展示轮播图
    HorizontalUncontainedCarousel(
        // 初始化轮播图的状态，设置轮播图的总项数为item列表的长度
        state = rememberCarouselState {
            item.count()
        },
        // 设置每个轮播项的宽度为250dp
        itemWidth = 350.dp,
        // 设置每个轮播项之间的间距为12dp
        itemSpacing = 5.dp,
        // 设置轮播图内容的内边距，左侧内边距为12dp
        contentPadding = PaddingValues(start = 0.dp),

        // 应用传入的Modifier，并设置轮播图的宽度为最大宽度，高度根据内容自适应，上下各有12dp的内边距
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 10.dp, bottom = 10.dp)
    ) { index ->
        // 获取当前轮播项对应的CarouselItem
        val value = item[index]

        // 使用Image组件展示轮播项的图片
        Image(
            // 使用rememberAsyncImagePainter加载图片资源
            painter = rememberAsyncImagePainter(model = value.imagesResource),
            // 图片的内容描述为空
            contentDescription = null,
            // 设置图片的缩放模式为裁剪
            contentScale = ContentScale.Crop,
            // 应用Modifier，设置图片的宽度为最大宽度，高度为350dp，并应用一个裁剪形状为MaterialTheme.shapes.extraLarge的遮罩
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .maskClip(shape = MaterialTheme.shapes.extraLarge)
                .mandatorySystemGesturesPadding()
        )
    }
}