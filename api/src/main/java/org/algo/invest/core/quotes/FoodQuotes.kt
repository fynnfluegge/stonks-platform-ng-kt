package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object FoodQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Food & Beverages
            symbolNameMapping["NESM.DE"] = QuoteSymbolMetaData("NESM.DE", "Nestle", "A0Q4DC", Industry.FOOD)
            symbolNameMapping["MDLZ"] = QuoteSymbolMetaData("MDLZ", "Mondelez", "A1J4U0", Industry.FOOD)
            symbolNameMapping["BSN.DE"] = QuoteSymbolMetaData("BSN.DE", "Danone", "851194", Industry.FOOD)
            symbolNameMapping["KHC"] = QuoteSymbolMetaData("KHC", "Heinz Kraft", "A14TU4", Industry.FOOD)
            symbolNameMapping["GIS"] = QuoteSymbolMetaData("GIS", "General Mills", "853862", Industry.FOOD)
            symbolNameMapping["K"] = QuoteSymbolMetaData("K", "Kellogg", "853265", Industry.FOOD)
            symbolNameMapping["KO"] = QuoteSymbolMetaData("KO", "Coca-Cola", "850663", Industry.FOOD)
            symbolNameMapping["PEP"] = QuoteSymbolMetaData("PEP", "PepsiCo", "851995", Industry.FOOD)
            symbolNameMapping["CBGB.F"] = QuoteSymbolMetaData("CBGB.F", "Carlsberg", "861061", Industry.FOOD)
            symbolNameMapping["HNK1.F"] = QuoteSymbolMetaData("HNK1.F", "Heineken", "A0CA0G", Industry.FOOD)
            symbolNameMapping["TSN"] = QuoteSymbolMetaData("TSN", "Tyson Foods", "870625", Industry.FOOD)
            symbolNameMapping["PND.F"] = QuoteSymbolMetaData("PND.F", "Mowi Asa", "A2PBD2", Industry.FOOD)
            symbolNameMapping["BYND"] = QuoteSymbolMetaData("BYND", "Beyond Meat", "A2N7XQ", Industry.FOOD)

            // Food Delivery
            symbolNameMapping["DPZ"] = QuoteSymbolMetaData("DPZ", "Dominos", "A0B6VQ", Industry.FOOD)
            symbolNameMapping["0OC.F"] = QuoteSymbolMetaData("0OC.F", "Ocado", "A1C2GZ", Industry.FOOD)
            symbolNameMapping["SYY"] = QuoteSymbolMetaData("SYY", "Sysco", "859121", Industry.FOOD)
            symbolNameMapping["HFG.DE"] = QuoteSymbolMetaData("HFG.DE", "Hello Fresh", "A16140", Industry.FOOD)
            symbolNameMapping["DHER.DE"] = QuoteSymbolMetaData("DHER.DE", "Delivery Hero", "A2E4K4", Industry.FOOD)

            // Gastronomy
            symbolNameMapping["SBUX"] = QuoteSymbolMetaData("SBUX", "Starbucks", "884437", Industry.FOOD)
            symbolNameMapping["CMG"] = QuoteSymbolMetaData("CMG", "Chipotle", "A0ESP5", Industry.FOOD)
            symbolNameMapping["CAKE"] = QuoteSymbolMetaData("CAKE", "Cheesecake Factory", "884888", Industry.FOOD)
            symbolNameMapping["MCD"] = QuoteSymbolMetaData("MCD", "McDonalds", "856958", Industry.FOOD)
            symbolNameMapping["QSR"] = QuoteSymbolMetaData("QSR", "Restaurant Brands Int.", "A12GMA", Industry.FOOD)
            symbolNameMapping["YUM"] = QuoteSymbolMetaData("YUM", "Yum! Brands", "909190", Industry.FOOD)
            symbolNameMapping["TXRH"] = QuoteSymbolMetaData("TXRH", "Texas Roadhouse", "A0DKNQ", Industry.FOOD)

            return symbolNameMapping
        }
}