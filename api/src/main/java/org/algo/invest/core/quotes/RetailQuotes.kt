package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object RetailQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // E-Commerce
            symbolNameMapping["SHOP"] = QuoteSymbolMetaData("SHOP", "Shopify", "A14TJP", Industry.RETAIL)
            symbolNameMapping["SE"] = QuoteSymbolMetaData("SE", "Sea", "A2H5LX", Industry.RETAIL)
            symbolNameMapping["RAK.F"] = QuoteSymbolMetaData("RAK.F", "Rakuten", "927128", Industry.RETAIL)
            symbolNameMapping["ZAL.DE"] = QuoteSymbolMetaData("ZAL.DE", "Zalando", "ZAL111", Industry.RETAIL)
            symbolNameMapping["H24.DE"] = QuoteSymbolMetaData("H24.DE", "Home24", "A14KEB", Industry.RETAIL)
            symbolNameMapping["WEW.DE"] = QuoteSymbolMetaData("WEW.DE", "Westwing", "A2N4H0", Industry.RETAIL)
            symbolNameMapping["EBAY"] = QuoteSymbolMetaData("EBAY", "Ebay", "916529", Industry.RETAIL)
            symbolNameMapping["FVRR"] = QuoteSymbolMetaData("FVRR", "Fiverr", "A2PLX6", Industry.RETAIL)
            symbolNameMapping["MELI"] = QuoteSymbolMetaData("MELI", "Mercadolibre", "A0MYNP", Industry.RETAIL)

            // Retail
            symbolNameMapping["WMT"] = QuoteSymbolMetaData("WMT", "Walmart", "860853", Industry.RETAIL)
            symbolNameMapping["WBA"] = QuoteSymbolMetaData("WBA", "Walgreens Boots Alliance", "A12HJF", Industry.RETAIL)
            symbolNameMapping["TGT"] = QuoteSymbolMetaData("TGT", "Target", "856243", Industry.RETAIL)
            symbolNameMapping["FAST"] = QuoteSymbolMetaData("FAST", "Fastenal", "887891", Industry.RETAIL)
            symbolNameMapping["LOW"] = QuoteSymbolMetaData("LOW", "Lowes", "859545", Industry.RETAIL)
            symbolNameMapping["HBM.DE"] = QuoteSymbolMetaData("HBM.DE", "Hornbach", "608440", Industry.RETAIL)
            symbolNameMapping["HD"] = QuoteSymbolMetaData("HD", "Home Depot", "866953", Industry.RETAIL)

            // Konsum-/Verbrauchsgüter & Konglomerat
            symbolNameMapping["UL"] = QuoteSymbolMetaData("UL", "Unilever", "A0JNE2", Industry.RETAIL)
            symbolNameMapping["PG"] = QuoteSymbolMetaData("PG", "P&G", "852062", Industry.RETAIL)
            symbolNameMapping["MMM"] = QuoteSymbolMetaData("MMM", "3M", "851745", Industry.RETAIL)
            symbolNameMapping["DHR"] = QuoteSymbolMetaData("DHR", "Danaher", "866197", Industry.RETAIL)
            symbolNameMapping["BEI.DE"] = QuoteSymbolMetaData("BEI.DE", "Beiersdorf", "520000", Industry.RETAIL)
            symbolNameMapping["CL"] = QuoteSymbolMetaData("CL", "Colgate-Palmolive", "850667", Industry.RETAIL)
            symbolNameMapping["KMB"] = QuoteSymbolMetaData("KMB", "Kimberly-Clark", "855178", Industry.RETAIL)
            symbolNameMapping["BYW6.DE"] = QuoteSymbolMetaData("BYW6.DE", "BayWa", "519406", Industry.RETAIL)
            symbolNameMapping["CHD"] = QuoteSymbolMetaData("CHD", "Church & Dwight", "864371", Industry.RETAIL)

            // Bekleidung Und Sportartikel
            symbolNameMapping["NKE"] = QuoteSymbolMetaData("NKE", "Nike", "866993", Industry.RETAIL)
            symbolNameMapping["ADS.DE"] = QuoteSymbolMetaData("ADS.DE", "Adidas", "A1EWWW", Industry.RETAIL)
            symbolNameMapping["06S.F"] = QuoteSymbolMetaData("06S.DE", "Sportsman's Warehouse", "A112GA", Industry.RETAIL)
            symbolNameMapping["IXD1.DE"] = QuoteSymbolMetaData("IXD1.DE", "Inditex", "A11873", Industry.RETAIL)
            symbolNameMapping["LULU"] = QuoteSymbolMetaData("LULU", "Lululemon", "A0MXBY", Industry.RETAIL)
            symbolNameMapping["PTON"] = QuoteSymbolMetaData("PTON", "Peloton", "A2PR0M", Industry.RETAIL)
            symbolNameMapping["1B9.F"] = QuoteSymbolMetaData("1B9.F", "Boohoo", "A1XFBJ", Industry.RETAIL)
            symbolNameMapping["PLNT"] = QuoteSymbolMetaData("PLNT", "Planet Fitness", "A14U2K", Industry.RETAIL)

            return symbolNameMapping
        }
}