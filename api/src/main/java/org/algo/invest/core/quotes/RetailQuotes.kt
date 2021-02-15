package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object RetailQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // E-Commerce
            symbolNameMapping["SHOP"] = QuoteSymbolMetaData("SHOP", "Shopify", "A14TJP", Industry.ECOMMERCE)
            symbolNameMapping["SE"] = QuoteSymbolMetaData("SE", "Sea", "A2H5LX", Industry.ECOMMERCE)
            symbolNameMapping["RAK.F"] = QuoteSymbolMetaData("RAK.F", "Rakuten", "927128", Industry.ECOMMERCE)
            symbolNameMapping["ZAL.DE"] = QuoteSymbolMetaData("ZAL.DE", "Zalando", "ZAL111", Industry.ECOMMERCE)
            symbolNameMapping["H24.DE"] = QuoteSymbolMetaData("H24.DE", "Home24", "A14KEB", Industry.ECOMMERCE)
            symbolNameMapping["WEW.DE"] = QuoteSymbolMetaData("WEW.DE", "Westwing", "A2N4H0", Industry.ECOMMERCE)
            symbolNameMapping["EBAY"] = QuoteSymbolMetaData("EBAY", "Ebay", "916529", Industry.ECOMMERCE)
            symbolNameMapping["FVRR"] = QuoteSymbolMetaData("FVRR", "Fiverr", "A2PLX6", Industry.ECOMMERCE)
            symbolNameMapping["MELI"] = QuoteSymbolMetaData("MELI", "Mercadolibre", "A0MYNP", Industry.ECOMMERCE)

            // Retail
            symbolNameMapping["WMT"] = QuoteSymbolMetaData("WMT", "Walmart", "860853", Industry.RETAIL)
            symbolNameMapping["WBA"] = QuoteSymbolMetaData("WBA", "Walgreens Boots Alliance", "A12HJF", Industry.RETAIL)
            symbolNameMapping["TGT"] = QuoteSymbolMetaData("TGT", "Target", "856243", Industry.RETAIL)
            symbolNameMapping["FAST"] = QuoteSymbolMetaData("FAST", "Fastenal", "887891", Industry.RETAIL)
            symbolNameMapping["LOW"] = QuoteSymbolMetaData("LOW", "Lowes", "859545", Industry.RETAIL)
            symbolNameMapping["HBM.DE"] = QuoteSymbolMetaData("HBM.DE", "Hornbach", "608440", Industry.RETAIL)
            symbolNameMapping["HD"] = QuoteSymbolMetaData("HD", "Home Depot", "866953", Industry.RETAIL)

            // Konsum-/Verbrauchsgüter & Konglomerat
            symbolNameMapping["UL"] = QuoteSymbolMetaData("UL", "Unilever", "A0JNE2", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["PG"] = QuoteSymbolMetaData("PG", "P&G", "852062", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["MMM"] = QuoteSymbolMetaData("MMM", "3M", "851745", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["DHR"] = QuoteSymbolMetaData("DHR", "Danaher", "866197", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["BEI.DE"] = QuoteSymbolMetaData("BEI.DE", "Beiersdorf", "520000", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["CL"] = QuoteSymbolMetaData("CL", "Colgate-Palmolive", "850667", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["KMB"] = QuoteSymbolMetaData("KMB", "Kimberly-Clark", "855178", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["BYW6.DE"] = QuoteSymbolMetaData("BYW6.DE", "BayWa", "519406", Industry.CONSUMER_CONGLOMERATE)
            symbolNameMapping["CHD"] = QuoteSymbolMetaData("CHD", "Church & Dwight", "864371", Industry.CONSUMER_CONGLOMERATE)

            // Bekleidung Und Sportartikel
            symbolNameMapping["NKE"] = QuoteSymbolMetaData("NKE", "Nike", "866993", Industry.DRESS_SPORTS)
            symbolNameMapping["ADS.DE"] = QuoteSymbolMetaData("ADS.DE", "Adidas", "A1EWWW", Industry.DRESS_SPORTS)
            symbolNameMapping["06S.F"] = QuoteSymbolMetaData("06S.DE", "Sportsman's Warehouse", "A112GA", Industry.DRESS_SPORTS)
            symbolNameMapping["IXD1.DE"] = QuoteSymbolMetaData("IXD1.DE", "Inditex", "A11873", Industry.DRESS_SPORTS)
            symbolNameMapping["LULU"] = QuoteSymbolMetaData("LULU", "Lululemon", "A0MXBY", Industry.DRESS_SPORTS)
            symbolNameMapping["PTON"] = QuoteSymbolMetaData("PTON", "Peloton", "A2PR0M", Industry.DRESS_SPORTS)
            symbolNameMapping["1B9.F"] = QuoteSymbolMetaData("1B9.F", "Boohoo", "A1XFBJ", Industry.DRESS_SPORTS)
            symbolNameMapping["PLNT"] = QuoteSymbolMetaData("PLNT", "Planet Fitness", "A14U2K", Industry.DRESS_SPORTS)

            return symbolNameMapping
        }
}