package com.android.traveltube.ui.datail

import java.util.Date


data class DetailUiState(
    val videoId: String?,
    val videoTitle: String?,
    val videoDescription: String?,
    val videoDate: Date?,
    val channelName: String?,
    val channelThumbnail: String?,
    val subscriptionCount: String?,
    val isFavorite: Boolean = false
) {
    companion object {
        fun init() = DetailUiState(
            videoId = null,
            videoTitle = null,
            videoDescription = null,
            videoDate = null,
            channelName = null,
            channelThumbnail = null,
            subscriptionCount = null,
            isFavorite = false
        )
    }
}