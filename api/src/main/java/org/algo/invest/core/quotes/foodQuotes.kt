package org.algo.invest.core.quotes

import org.algo.invest.model.SubIndustry
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

val foodQuotes: Map<String, QuoteSymbolMetaData>
    get() {
        val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

        symbolNameMapping["NESM.DE"] = QuoteSymbolMetaData("NESM.DE", "Nestle", "A0Q4DC", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["MDLZ"] = QuoteSymbolMetaData("MDLZ", "Mondelez", "A1J4U0", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["BSN.DE"] = QuoteSymbolMetaData("BSN.DE", "Danone", "851194", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["KHC"] = QuoteSymbolMetaData("KHC", "Heinz Kraft", "A14TU4", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["GIS"] = QuoteSymbolMetaData("GIS", "General Mills", "853862", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["K"] = QuoteSymbolMetaData("K", "Kellogg", "853265", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["KO"] = QuoteSymbolMetaData("KO", "Coca-Cola", "850663", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["PEP"] = QuoteSymbolMetaData("PEP", "PepsiCo", "851995", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["CBGB.F"] = QuoteSymbolMetaData("CBGB.F", "Carlsberg", "861061", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["HNK1.F"] = QuoteSymbolMetaData("HNK1.F", "Heineken", "A0CA0G", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["TSN"] = QuoteSymbolMetaData("TSN", "Tyson Foods", "870625", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["PND.F"] = QuoteSymbolMetaData("PND.F", "Mowi Asa", "A2PBD2", Industry.FOOD, SubIndustry.FOOD)
        symbolNameMapping["BYND"] = QuoteSymbolMetaData("BYND", "Beyond Meat", "A2N7XQ", Industry.FOOD, SubIndustry.FOOD)

        symbolNameMapping["DPZ"] = QuoteSymbolMetaData("DPZ", "Dominos", "A0B6VQ", Industry.FOOD, SubIndustry.DELIVERY)
        symbolNameMapping["0OC.F"] = QuoteSymbolMetaData("0OC.F", "Ocado", "A1C2GZ", Industry.FOOD, SubIndustry.DELIVERY)
        symbolNameMapping["SYY"] = QuoteSymbolMetaData("SYY", "Sysco", "859121", Industry.FOOD, SubIndustry.DELIVERY)
        symbolNameMapping["HFG.DE"] = QuoteSymbolMetaData("HFG.DE", "Hello Fresh", "A16140", Industry.FOOD, SubIndustry.DELIVERY)
        symbolNameMapping["DHER.DE"] = QuoteSymbolMetaData("DHER.DE", "Delivery Hero", "A2E4K4", Industry.FOOD, SubIndustry.DELIVERY)

        symbolNameMapping["SBUX"] = QuoteSymbolMetaData("SBUX", "Starbucks", "884437", Industry.FOOD, SubIndustry.GASTRONOMY)
        symbolNameMapping["CMG"] = QuoteSymbolMetaData("CMG", "Chipotle", "A0ESP5", Industry.FOOD, SubIndustry.GASTRONOMY)
        symbolNameMapping["CAKE"] = QuoteSymbolMetaData("CAKE", "Cheesecake Factory", "884888", Industry.FOOD, SubIndustry.GASTRONOMY)
        symbolNameMapping["MCD"] = QuoteSymbolMetaData("MCD", "McDonalds", "856958", Industry.FOOD, SubIndustry.GASTRONOMY)
        symbolNameMapping["QSR"] = QuoteSymbolMetaData("QSR", "Restaurant Brands Int.", "A12GMA", Industry.FOOD, SubIndustry.GASTRONOMY)
        symbolNameMapping["YUM"] = QuoteSymbolMetaData("YUM", "Yum! Brands", "909190", Industry.FOOD, SubIndustry.GASTRONOMY)
        symbolNameMapping["TXRH"] = QuoteSymbolMetaData("TXRH", "Texas Roadhouse", "A0DKNQ", Industry.FOOD, SubIndustry.GASTRONOMY)

        return symbolNameMapping
    }