package org.algo.invest.core.quotes

import org.algo.invest.model.Category
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object RetailQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["SHOP"] = QuoteSymbolMetaData("SHOP", "Shopify", "A14TJP", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["JD"] = QuoteSymbolMetaData("JD", "JD.com", "", Industry.OTHER, Category.CHINA)
            symbolNameMapping["SE"] = QuoteSymbolMetaData("SE", "Sea", "A2H5LX", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["ZAL.DE"] = QuoteSymbolMetaData("ZAL.DE", "Zalando", "ZAL111", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["H24.DE"] = QuoteSymbolMetaData("H24.DE", "Home24", "A14KEB", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["WEW.DE"] = QuoteSymbolMetaData("WEW.DE", "Westwing", "A2N4H0", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["EBAY"] = QuoteSymbolMetaData("EBAY", "Ebay", "916529", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["FVRR"] = QuoteSymbolMetaData("FVRR", "Fiverr", "A2PLX6", Industry.RETAIL, Category.ECOMMERCE)
            symbolNameMapping["MELI"] = QuoteSymbolMetaData("MELI", "Mercadolibre", "A0MYNP", Industry.RETAIL, Category.ECOMMERCE)

            symbolNameMapping["WMT"] = QuoteSymbolMetaData("WMT", "Walmart", "860853", Industry.RETAIL, Category.OTHER)
            symbolNameMapping["WBA"] = QuoteSymbolMetaData("WBA", "Walgreens Boots Alliance", "A12HJF", Industry.RETAIL, Category.OTHER)
            symbolNameMapping["TGT"] = QuoteSymbolMetaData("TGT", "Target", "856243", Industry.RETAIL, Category.OTHER)
            symbolNameMapping["FAST"] = QuoteSymbolMetaData("FAST", "Fastenal", "887891", Industry.RETAIL, Category.OTHER)
            symbolNameMapping["LOW"] = QuoteSymbolMetaData("LOW", "Lowes", "859545", Industry.RETAIL, Category.OTHER)
            symbolNameMapping["HBM.DE"] = QuoteSymbolMetaData("HBM.DE", "Hornbach", "608440", Industry.RETAIL, Category.OTHER)
            symbolNameMapping["HD"] = QuoteSymbolMetaData("HD", "Home Depot", "866953", Industry.RETAIL, Category.OTHER)

            symbolNameMapping["UL"] = QuoteSymbolMetaData("UL", "Unilever", "A0JNE2", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["PG"] = QuoteSymbolMetaData("PG", "P&G", "852062", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["MMM"] = QuoteSymbolMetaData("MMM", "3M", "851745", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["BEI.DE"] = QuoteSymbolMetaData("BEI.DE", "Beiersdorf", "520000", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["CL"] = QuoteSymbolMetaData("CL", "Colgate-Palmolive", "850667", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["KMB"] = QuoteSymbolMetaData("KMB", "Kimberly-Clark", "855178", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["BYW6.DE"] = QuoteSymbolMetaData("BYW6.DE", "BayWa", "519406", Industry.RETAIL, Category.CONSUMER)
            symbolNameMapping["CHD"] = QuoteSymbolMetaData("CHD", "Church & Dwight", "864371", Industry.RETAIL, Category.CONSUMER)

            symbolNameMapping["NKE"] = QuoteSymbolMetaData("NKE", "Nike", "866993", Industry.RETAIL, Category.APPAREL)
            symbolNameMapping["ADS.DE"] = QuoteSymbolMetaData("ADS.DE", "Adidas", "A1EWWW", Industry.RETAIL, Category.APPAREL)
            symbolNameMapping["SPWH"] = QuoteSymbolMetaData("SPWH", "Sportsman's Warehouse", "A112GA", Industry.RETAIL, Category.APPAREL)
            symbolNameMapping["LULU"] = QuoteSymbolMetaData("LULU", "Lululemon", "A0MXBY", Industry.RETAIL, Category.APPAREL)
            symbolNameMapping["PLNT"] = QuoteSymbolMetaData("PLNT", "Planet Fitness", "A14U2K", Industry.RETAIL, Category.SPORTS)
            symbolNameMapping["PTON"] = QuoteSymbolMetaData("PTON", "Peloton", "A2PR0M", Industry.RETAIL, Category.SPORTS)

            return symbolNameMapping
        }
}