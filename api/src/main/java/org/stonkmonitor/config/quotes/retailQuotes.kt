package org.stonkmonitor.config.quotes

import org.stonkmonitor.model.SubIndustry
import org.stonkmonitor.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.stonkmonitor.model.Industry

val retailQuotes: Map<String, QuoteSymbolMetaData>
    get() {
        val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

        symbolNameMapping["SHOP"] = QuoteSymbolMetaData("SHOP", "Shopify", "A14TJP", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["JD"] = QuoteSymbolMetaData("JD", "JD.com", "", Industry.OTHER, SubIndustry.CHINA)
        symbolNameMapping["SE"] = QuoteSymbolMetaData("SE", "Sea", "A2H5LX", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["ZAL.DE"] = QuoteSymbolMetaData("ZAL.DE", "Zalando", "ZAL111", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["H24.DE"] = QuoteSymbolMetaData("H24.DE", "Home24", "A14KEB", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["WEW.DE"] = QuoteSymbolMetaData("WEW.DE", "Westwing", "A2N4H0", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["EBAY"] = QuoteSymbolMetaData("EBAY", "Ebay", "916529", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["FVRR"] = QuoteSymbolMetaData("FVRR", "Fiverr", "A2PLX6", Industry.RETAIL, SubIndustry.ECOMMERCE)
        symbolNameMapping["MELI"] = QuoteSymbolMetaData("MELI", "Mercadolibre", "A0MYNP", Industry.RETAIL, SubIndustry.ECOMMERCE)

        symbolNameMapping["WMT"] = QuoteSymbolMetaData("WMT", "Walmart", "860853", Industry.RETAIL, SubIndustry.OTHER)
        symbolNameMapping["WBA"] = QuoteSymbolMetaData("WBA", "Walgreens Boots Alliance", "A12HJF", Industry.RETAIL, SubIndustry.OTHER)
        symbolNameMapping["TGT"] = QuoteSymbolMetaData("TGT", "Target", "856243", Industry.RETAIL, SubIndustry.OTHER)
        symbolNameMapping["FAST"] = QuoteSymbolMetaData("FAST", "Fastenal", "887891", Industry.RETAIL, SubIndustry.OTHER)
        symbolNameMapping["LOW"] = QuoteSymbolMetaData("LOW", "Lowes", "859545", Industry.RETAIL, SubIndustry.OTHER)
        symbolNameMapping["HBM.DE"] = QuoteSymbolMetaData("HBM.DE", "Hornbach", "608440", Industry.RETAIL, SubIndustry.OTHER)
        symbolNameMapping["HD"] = QuoteSymbolMetaData("HD", "Home Depot", "866953", Industry.RETAIL, SubIndustry.OTHER)

        symbolNameMapping["UL"] = QuoteSymbolMetaData("UL", "Unilever", "A0JNE2", Industry.RETAIL, SubIndustry.CONSUMER)
        symbolNameMapping["PG"] = QuoteSymbolMetaData("PG", "P&G", "852062", Industry.RETAIL, SubIndustry.CONSUMER)
        symbolNameMapping["MMM"] = QuoteSymbolMetaData("MMM", "3M", "851745", Industry.RETAIL, SubIndustry.CONSUMER)
        symbolNameMapping["BEI.DE"] = QuoteSymbolMetaData("BEI.DE", "Beiersdorf", "520000", Industry.RETAIL, SubIndustry.CONSUMER)
        symbolNameMapping["CL"] = QuoteSymbolMetaData("CL", "Colgate-Palmolive", "850667", Industry.RETAIL, SubIndustry.CONSUMER)
        symbolNameMapping["KMB"] = QuoteSymbolMetaData("KMB", "Kimberly-Clark", "855178", Industry.RETAIL, SubIndustry.CONSUMER)
        symbolNameMapping["CHD"] = QuoteSymbolMetaData("CHD", "Church & Dwight", "864371", Industry.RETAIL, SubIndustry.CONSUMER)

        symbolNameMapping["NKE"] = QuoteSymbolMetaData("NKE", "Nike", "866993", Industry.RETAIL, SubIndustry.APPAREL)
        symbolNameMapping["ADS.DE"] = QuoteSymbolMetaData("ADS.DE", "Adidas", "A1EWWW", Industry.RETAIL, SubIndustry.APPAREL)
        symbolNameMapping["UA"] = QuoteSymbolMetaData("UA", "Under Armour", "A0HL4V", Industry.RETAIL, SubIndustry.APPAREL)
        symbolNameMapping["SPWH"] = QuoteSymbolMetaData("SPWH", "Sportsman's Warehouse", "A112GA", Industry.RETAIL, SubIndustry.APPAREL)
        symbolNameMapping["LULU"] = QuoteSymbolMetaData("LULU", "Lululemon", "A0MXBY", Industry.RETAIL, SubIndustry.APPAREL)
        symbolNameMapping["1B9.F"] = QuoteSymbolMetaData("1B9.F", "Boohoo", "", Industry.RETAIL, SubIndustry.APPAREL)

        symbolNameMapping["PLNT"] = QuoteSymbolMetaData("PLNT", "Planet Fitness", "A14U2K", Industry.RETAIL, SubIndustry.SPORTS)
        symbolNameMapping["PTON"] = QuoteSymbolMetaData("PTON", "Peloton", "A2PR0M", Industry.RETAIL, SubIndustry.SPORTS)

        return symbolNameMapping
    }