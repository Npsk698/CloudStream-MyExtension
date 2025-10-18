package com.CoflixArt

import com.lagradost.cloudstream3.extractors.ExtractorApi
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.Qualities
import com.lagradost.cloudstream3.utils.newExtractorLink

class ExampleExtractor : ExtractorApi() {
    override var name = "Example"
    override var mainUrl = "https://example.com"

    override suspend fun getUrl(url: String, referer: String?): List<ExtractorLink>? {
        return listOf(
            newExtractorLink("Example", "Example", url) {
                this.quality = Qualities.P1080.value
            }
        )
    }
}
