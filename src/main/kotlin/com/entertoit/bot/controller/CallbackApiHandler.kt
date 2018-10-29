package com.entertoit.bot.controller

import com.entertoit.bot.api.NewAudio
import com.entertoit.bot.api.NewMessage
import com.entertoit.bot.handler.AudioHandler
import com.entertoit.bot.handler.MessagesHandler
import com.google.gson.Gson
import com.google.gson.JsonObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CallbackApiHandler @Autowired constructor(
    val gson: Gson,
    val messagesHandler: MessagesHandler,
    val audioHandler: AudioHandler
) {

    @PostMapping("/handle")
    fun handle(requestBody: HttpEntity<String>): String {
        val event = requestBody.body?.let { gson.fromJson(it, JsonObject::class.java) } ?: return "request body is null"
        when(event["type"].asString) {
            "message_new" -> messagesHandler.handle(gson.fromJson(event["object"], NewMessage::class.java))
            "audio_new" -> audioHandler.handleNewAudio(gson.fromJson(event["object"], NewAudio::class.java))
            else -> {}
        }
        return "ok"
    }

}