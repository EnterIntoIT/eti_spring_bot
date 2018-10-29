package com.entertoit.bot.handler

import com.entertoit.bot.api.NewMessage
import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.GroupActor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MessagesHandler @Autowired constructor(
        val vk: VkApiClient,
        val group: GroupActor
) {

    fun handle(message: NewMessage) {
        val messageText = message.content
        TODO("ну, там, пост запилить, всё такое")
    }

}