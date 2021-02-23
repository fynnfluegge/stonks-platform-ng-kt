package org.algo.invest.core.quotes

import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object FinanceQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            // Finanzen/Versicherung/Holding
            symbolNameMapping["JPM"] = QuoteSymbolMetaData("JPM", "JP Morgan", "850628", Industry.FINANCE)
            symbolNameMapping["GS"] = QuoteSymbolMetaData("GS", "Goldman Sachs", "920332", Industry.FINANCE)
            symbolNameMapping["WFC"] = QuoteSymbolMetaData("WFC", "Wells Fargo", "857949", Industry.FINANCE)
            symbolNameMapping["BAC"] = QuoteSymbolMetaData("BAC", "Bank of America", "858388", Industry.FINANCE)
            symbolNameMapping["MS"] = QuoteSymbolMetaData("MS", "Morgan Stanley", "885836", Industry.FINANCE)
            symbolNameMapping["C"] = QuoteSymbolMetaData("C", "Citigroup", "A1H92V", Industry.FINANCE)
            symbolNameMapping["MUV2.DE"] = QuoteSymbolMetaData("MUV2.DE", "Munich Re", "843002", Industry.FINANCE)
            symbolNameMapping["ALV.DE"] = QuoteSymbolMetaData("ALV.DE", "Allianz", "840400", Industry.FINANCE)
            symbolNameMapping["BRK-B"] = QuoteSymbolMetaData("BRK-B", "Berkshire Hathaway", "A0YJQ2", Industry.FINANCE)
            symbolNameMapping["BLK"] = QuoteSymbolMetaData("BLK", "Blackrock", "928193", Industry.FINANCE)
            symbolNameMapping["MSCI"] = QuoteSymbolMetaData("MSCI", "MSCI", "A0M63R", Industry.FINANCE)
            symbolNameMapping["1YL.F"] = QuoteSymbolMetaData("1YL.F", "Prosus", "A2PRDK", Industry.FINANCE)
            symbolNameMapping["HYQ.DE"] = QuoteSymbolMetaData("HYQ.DE", "Hypoport", "549336", Industry.FINANCE)
            symbolNameMapping["UNH"] = QuoteSymbolMetaData("UNH", "UnitedHealth Group", "869561", Industry.FINANCE)
            symbolNameMapping["LMND"] = QuoteSymbolMetaData("LMND", "Lemonade", "A2P7Z1", Industry.FINANCE)

            // Exchange
            symbolNameMapping["DB1.DE"] = QuoteSymbolMetaData("DB1.DE", "Deutsche Börse", "581005", Industry.FINANCE)
            symbolNameMapping["ICE"] = QuoteSymbolMetaData("ICE", "Intercontinental Exchange", "A1W5H0", Industry.FINANCE)
            symbolNameMapping["NDAQ"] = QuoteSymbolMetaData("NDAQ", "Nasdaq", "813516", Industry.FINANCE)

            // Payment
            symbolNameMapping["PYPL"] = QuoteSymbolMetaData("PYPL", "PayPal", "A14R7U", Industry.FINANCE)
            symbolNameMapping["V"] = QuoteSymbolMetaData("V", "Visa", "A0NC7B", Industry.FINANCE)
            symbolNameMapping["ADYEN.AS"] = QuoteSymbolMetaData("ADYEN.AS", "Adyen", "A2JNF4", Industry.FINANCE)
            symbolNameMapping["SQ"] = QuoteSymbolMetaData("SQ", "Square", "A143D6", Industry.FINANCE)
            symbolNameMapping["JKHY"] = QuoteSymbolMetaData("JKHY", "Jack Henry & Associates", "888286", Industry.FINANCE)
            symbolNameMapping["FISV"] = QuoteSymbolMetaData("FISV", "Fiserv", "881793", Industry.FINANCE)

            return symbolNameMapping
        }
}