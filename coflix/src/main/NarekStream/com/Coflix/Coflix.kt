package com.CoflixArt

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class CoflixArt : MainAPI() {
    override var mainUrl = "https://coflix.art"
    override var name = "Narek Stream"
    override val hasMainPage = true
    override var lang = "fr"
    override val hasDownloadSupport = true
    override val hasQuickSearch = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override val mainPage = mainPageOf(
        "movies" to "Films",
        "series" to "Séries"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        // TODO: parser la page d'accueil
        return newHomePageResponse(list = emptyList(), hasNext = false)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        // TODO: parser la recherche
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse {
        // TODO: parser un film ou série
        return newMovieLoadResponse("Titre", url, TvType.Movie, url) {}
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // TODO: parser les lecteurs
        return true
    }
}
