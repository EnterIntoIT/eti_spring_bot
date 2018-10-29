package com.entertoit.bot.providers

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller

@Controller
class GsonProvider {

    @Bean
    fun provideGson(): Gson =
            GsonBuilder()
                    .create()


}