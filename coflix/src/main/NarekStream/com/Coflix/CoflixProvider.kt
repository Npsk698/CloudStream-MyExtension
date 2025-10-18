package com.CoflixArt

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class CoflixArtProvider: BasePlugin() {
    override fun load() {
        registerMainAPI(CoflixArt())
        // Ajouter d'autres extracteurs si besoin
    }
}
