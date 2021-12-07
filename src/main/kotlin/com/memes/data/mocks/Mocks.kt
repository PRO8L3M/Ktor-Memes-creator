package com.memes.data.mocks

import com.memes.data.model.Meme
import com.memes.routes.BASE_URL

object Mocks {

    val memes = listOf(
        Meme(
            id = 1L,
            name = "Ancient Aliens",
            tags = listOf("Ancient", "Aliens", "Ancient Aliens"),
            imageUrl = "$BASE_URL/memes/Ancient-Aliens.jpeg"
        ),
        Meme(
            id = 2L,
            name = "Buff Doge vs Cheems",
            tags = listOf("buff", "doge", "vs", "cheems"),
            imageUrl = "$BASE_URL/memes/Buff-Doge-vs-Cheems.png"
        ),
        Meme(
            id = 3L,
            name = "Disaster Girl",
            tags = listOf("disaster", "girl", "fire", "house"),
            imageUrl = "$BASE_URL/memes/Disaster-Girl.jpeg"
        ),
        Meme(
            id = 4L,
            name = "Drake Hotline Bling",
            tags = listOf("drake", "hotline", "bling"),
            imageUrl = "$BASE_URL/memes/Drake-Hotline-Bling.jpeg"
        ),
        Meme(
            id = 5L,
            name = "Grus Plan",
            tags = listOf("grus", "plan"),
            imageUrl = "$BASE_URL/memes/Grus-Plan.jpeg"
        ),
        Meme(
            id = 6L,
            name = "I Bet He Is Thinking About Other Women",
            tags = listOf("jealous", "girlfriend", "other", "women", "sleeping"),
            imageUrl = "$BASE_URL/memes/I-Bet-Hes-Thinking-About-Other-Women.jpeg"
        ),
        Meme(
            id = 7L,
            name = "Two Buttons",
            tags = listOf("two", "buttons", "button", "red"),
            imageUrl = "$BASE_URL/memes/Two-Buttons.jpeg"
        ),
        Meme(
            id = 8L,
            name = "Woman Yelling At Cat",
            tags = listOf("woman", "yelling", "cat"),
            imageUrl = "$BASE_URL/memes/Woman-Yelling-At-Cat.jpeg"
        ),
    )
}
