package com.longjunhao.wanjetpack.data

import com.google.gson.annotations.SerializedName

/**
 * .WendaResponse
 *
 * @author Admitor
 * @date 2021/05/25
 */
data class WendaResponse(
    @field:SerializedName("data") val data: WendaPage,
    @field:SerializedName("errorCode") val errorCode: Int,
    @field:SerializedName("errorMsg") val errorMsg: String
)

data class WendaPage(
    @field:SerializedName("curPage") val curPage: Int,
    @field:SerializedName("datas") val datas: List<Wenda>,
    @field:SerializedName("offset") val offset: Int,
    @field:SerializedName("pageCount") val pageCount: Int,
    @field:SerializedName("size") val size: Int,
    @field:SerializedName("total") val total: Int
)

data class Wenda(
    @field:SerializedName("title") val title: String,
    @field:SerializedName("id") val id: Int,
    @field:SerializedName("link") val link: String,
    @field:SerializedName("niceDate") val niceDate: String
)
