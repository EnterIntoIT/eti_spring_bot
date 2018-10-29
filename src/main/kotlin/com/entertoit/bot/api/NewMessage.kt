package com.entertoit.bot.api

import com.google.gson.annotations.SerializedName

data class NewMessage(
        @SerializedName("id") val messageId: Long,
        @SerializedName("from_id") val userId: Long,
        @SerializedName("text") val content: String
)