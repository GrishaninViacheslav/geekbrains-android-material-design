package geekbrians.slava_5655380.ui.fragments.pictureoftheday

import geekbrians.slava_5655380.domain.model.PODServerResponseData

sealed class PictureOfTheDayData {
    data class Success(val serverResponseData: PODServerResponseData) : PictureOfTheDayData()
    data class Error(val error: Throwable) : PictureOfTheDayData()
    data class Loading(val progress: Int?) : PictureOfTheDayData()
}