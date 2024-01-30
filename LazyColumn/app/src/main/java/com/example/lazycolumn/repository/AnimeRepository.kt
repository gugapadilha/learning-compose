package com.example.lazycolumn.repository

import com.example.lazycolumn.model.Anime

class AnimeRepository {
    fun getAllData(): List<Anime>{
        return listOf(
            Anime(
                id = 0,
                order = 1,
                name = "Fate/Zero",
                photoUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/fdc0dff409f19dfd8ffff5037257ac98.jpe"
            ),
            Anime(
                id = 1,
                order = 2,
                name = "Edgerunners",
                photoUrl = "https://i0.wp.com/cuatrobastardos.com/wp-content/uploads/2022/10/Cyberpunk-Edgerunners-cover-1.jpg?fit=2000%2C1125&ssl=1"
            ),
            Anime(
                id = 2,
                order = 3,
                name = "Akame Ga Kill",
                photoUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/15789223-1b22-4760-b944-30408c4c5244/d87gohw-86256c8b-e78e-4fd7-86d3-388fcc94d079.jpg/v1/fill/w_1600,h_1120,q_75,strp/akame_ga_kill_wallpaper_by_nai_shiro_d87gohw-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTEyMCIsInBhdGgiOiJcL2ZcLzE1Nzg5MjIzLTFiMjItNDc2MC1iOTQ0LTMwNDA4YzRjNTI0NFwvZDg3Z29ody04NjI1NmM4Yi1lNzhlLTRmZDctODZkMy0zODhmY2M5NGQwNzkuanBnIiwid2lkdGgiOiI8PTE2MDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.MSY0orxSxGtfhmQ9Eg7YpZWYIKTTVE0dvDhXvJicnIs"
            ),
            Anime(
                id = 3,
                order = 4,
                name = "Darling in the FranXX",
                photoUrl = "https://i.pinimg.com/originals/b2/a4/c9/b2a4c9e24bf9ddfb51cebedac2a78ff2.jpg"
            ),
            Anime(
                id = 4,
                order = 5,
                name = "Overlord",
                photoUrl = "https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_1240/b_white/f_auto/q_auto/ncom/software/switch/70010000037889/ca6a563e0815cf642ce950bf6a0d71a4e890da0bc6850498155ccd56fddb25ef"
            ),
            Anime(
                id = 5,
                order = 6,
                name = "Code Geas",
                photoUrl = "https://wp.radiojhero.com/wp-content/uploads/2020/09/1_TNYQk_QBPlDd4hoLokC9YA.jpeg"
            ),
            Anime(
                id = 6,
                order = 7,
                name = "Eighty Six",
                photoUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/aa3f7282fe345e81a1addada43bfad92.jpe"
            ),
            Anime(
                id = 7,
                order = 8,
                name = "Sword Art Online",
                photoUrl = "https://www.animeunited.com.br/oomtumtu/2020/07/sword-art-online-alicization-lycoris-listingthumb-01-ps4-05dec19-en-us.jpeg"
            ),
            Anime(
                id = 8,
                order = 9,
                name = "Demon Slayer",
                photoUrl = "https://pop.proddigital.com.br/wp-content/uploads/sites/8/2023/03/demon-slayer-season-3-swordsmith-village-arc-key-art2000x1270.jpg"
            ),
            Anime(
                id = 9,
                order = 10,
                name = "Terror in Resonance",
                photoUrl = "https://www.crunchyroll.com/imgsrv/display/thumbnail/1200x675/catalog/crunchyroll/e0bc1639524e169511fbabc9fcb15970.jpe"
            )
        )
    }
}