package com.shozhongjian.ui.ui.image.statics.video.util

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okio.IOException
import org.json.JSONObject


//get异步请求
fun ResponseVideo(callback: (String?) -> Unit) {
    val client = OkHttpClient()
    val request = Request.Builder()
        .url("https://api.yujn.cn/api/heisis.php?type=json")
        .build()
    val call = client.newCall(request)

    call.enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            // 处理请求失败
            callback(null) // 返回 null 表示失败
        }

        override fun onResponse(call: Call, response: Response) {
            if (response.isSuccessful) {
                response.body?.let {
                    val jsonObject = JSONObject(it.string())
                    val dataUrl = jsonObject.getString("data")
                    val regex = Regex("(https?://[^\\s]+\\.mp4)")
                    val matchResult = regex.find(dataUrl)
                    val videoUrl = matchResult?.value // 获取匹配的 URL
                    callback(videoUrl) // 返回视频 URL
                } ?: callback(null) // 如果 body 为空，返回 null
            } else {
                callback(null) // 请求不成功，返回 null
            }
        }
    })
}

