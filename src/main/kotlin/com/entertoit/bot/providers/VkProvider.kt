package com.entertoit.bot.providers

import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.GroupActor
import com.vk.api.sdk.httpclient.HttpTransportClient
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class VkProvider {

    @Bean
    fun provideVk(): VkApiClient =
            HttpTransportClient()
                    .let(::VkApiClient)

    @Bean
    fun provideGroupActor(): GroupActor = TODO("я бля не ебу как там группы создаются, сами напишите")

}