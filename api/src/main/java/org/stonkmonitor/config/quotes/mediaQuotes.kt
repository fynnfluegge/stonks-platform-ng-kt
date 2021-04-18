package org.stonkmonitor.config.quotes

import org.stonkmonitor.model.SubIndustry
import org.stonkmonitor.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.stonkmonitor.model.Industry

val mediaQuotes: Map<String, QuoteSymbolMetaData>
    get() {
        val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

        symbolNameMapping["DIS"] = QuoteSymbolMetaData("DIS", "Walt Disney", "855686", Industry.MEDIA, SubIndustry.TELEVISION)
        symbolNameMapping["IQ8.F"] = QuoteSymbolMetaData("IQ8.F", "IQIYI", "A2JGN8", Industry.MEDIA, SubIndustry.TELEVISION)
        symbolNameMapping["ROKU"] = QuoteSymbolMetaData("ROKU", "Roku", "A2DW4X", Industry.MEDIA, SubIndustry.TELEVISION)
        symbolNameMapping["RKUNY"] = QuoteSymbolMetaData("RKUNY", "Rakuten", "927128", Industry.RETAIL, SubIndustry.TELEVISION)
        symbolNameMapping["NNW.F"] = QuoteSymbolMetaData("NNW.F", "Naspers", "906614", Industry.MEDIA, SubIndustry.TELEVISION)

        symbolNameMapping["SPOT"] = QuoteSymbolMetaData("SPOT", "Spotify", "A2JEGN", Industry.MEDIA, SubIndustry.MUSIC)
        symbolNameMapping["TME"] = QuoteSymbolMetaData("TME", "Tencent Music", "A1138D", Industry.MEDIA, SubIndustry.MUSIC)

        symbolNameMapping["NTO.F"] = QuoteSymbolMetaData("NTO.F", "Nintendo", "864009", Industry.MEDIA, SubIndustry.GAMES)
        symbolNameMapping["TTWO"] = QuoteSymbolMetaData("TTWO", "Take 2", "914508", Industry.MEDIA, SubIndustry.GAMES)
        symbolNameMapping["ATVI"] = QuoteSymbolMetaData("ATVI", "Activision Blizzard", "A0Q4K4", Industry.MEDIA, SubIndustry.GAMES)
        symbolNameMapping["7CD.F"] = QuoteSymbolMetaData("7CD.F", "CD Project Red", "534356", Industry.MEDIA, SubIndustry.GAMES)
        symbolNameMapping["EA"] = QuoteSymbolMetaData("EA", "EA", "878372", Industry.MEDIA, SubIndustry.GAMES)
        symbolNameMapping["TH9A.F"] = QuoteSymbolMetaData("TH9A.F", "THQ Nordic", "A2PS64", Industry.MEDIA, SubIndustry.GAMES)
        symbolNameMapping["11C.F"] = QuoteSymbolMetaData("11C.F", "11 Bit Studios", "A1J1ZZ", Industry.MEDIA, SubIndustry.GAMES)

        return symbolNameMapping
    }