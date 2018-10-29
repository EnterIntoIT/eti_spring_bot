package com.entertoit.bot.handler

import com.entertoit.bot.api.NewAudio
import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.GroupActor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AudioHandler @Autowired constructor(
        val vk: VkApiClient,
        val group: GroupActor
) {

    fun handleNewAudio(audio: NewAudio) {
        TODO("")
    }

}