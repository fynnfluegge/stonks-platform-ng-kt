package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object MediaQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Media
            symbolNameMapping["DIS"] = QuoteSymbolMetaData("DIS", "Walt Disney", "855686", Industry.MEDIA)
            symbolNameMapping["SPOT"] = QuoteSymbolMetaData("SPOT", "Spotify", "A2JEGN", Industry.MEDIA)
            symbolNameMapping["TME"] = QuoteSymbolMetaData("TME", "Tencent Music", "A1138D", Industry.MEDIA)
            symbolNameMapping["IQ8.F"] = QuoteSymbolMetaData("IQ8.F", "IQIYI", "A2JGN8", Industry.MEDIA)
            symbolNameMapping["ROKU"] = QuoteSymbolMetaData("ROKU", "Roku", "A2DW4X", Industry.MEDIA)
            symbolNameMapping["NNW.F"] = QuoteSymbolMetaData("NNW.F", "Naspers", "906614", Industry.MEDIA)

            // Games
            symbolNameMapping["NTO.F"] = QuoteSymbolMetaData("NTO.F", "Nintendo", "864009", Industry.MEDIA)
            symbolNameMapping["7CD.F"] = QuoteSymbolMetaData("7CD.F", "CD Project Red", "534356", Industry.MEDIA)
            symbolNameMapping["EA"] = QuoteSymbolMetaData("EA", "EA", "878372", Industry.MEDIA)
            symbolNameMapping["ATVI"] = QuoteSymbolMetaData("ATVI", "Activision Blizzard", "A0Q4K4", Industry.MEDIA)
            symbolNameMapping["TTWO"] = QuoteSymbolMetaData("TTWO", "Take 2", "914508", Industry.MEDIA)
            symbolNameMapping["TH9A.F"] = QuoteSymbolMetaData("TH9A.F", "THQ Nordic", "A2PS64", Industry.MEDIA)
            symbolNameMapping["11C.F"] = QuoteSymbolMetaData("11C.F", "11 Bit Studios", "A1J1ZZ", Industry.MEDIA)

            return symbolNameMapping
        }
}