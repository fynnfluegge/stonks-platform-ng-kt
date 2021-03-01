package org.algo.invest.core.quotes

import org.algo.invest.model.SubIndustry
import org.algo.invest.model.QuoteSymbolMetaData
import java.util.LinkedHashMap
import org.algo.invest.model.Industry

object FinanceQuotes {
    val quotes: Map<String, QuoteSymbolMetaData>
        get() {
            val symbolNameMapping: MutableMap<String, QuoteSymbolMetaData> = LinkedHashMap()

            symbolNameMapping["JPM"] = QuoteSymbolMetaData("JPM", "JP Morgan", "850628", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["GS"] = QuoteSymbolMetaData("GS", "Goldman Sachs", "920332", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["WFC"] = QuoteSymbolMetaData("WFC", "Wells Fargo", "857949", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["BAC"] = QuoteSymbolMetaData("BAC", "Bank of America", "858388", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["MS"] = QuoteSymbolMetaData("MS", "Morgan Stanley", "885836", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["C"] = QuoteSymbolMetaData("C", "Citigroup", "A1H92V", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["ALV.DE"] = QuoteSymbolMetaData("ALV.DE", "Allianz", "840400", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["BRK-B"] = QuoteSymbolMetaData("BRK-B", "Berkshire Hathaway", "A0YJQ2", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["BLK"] = QuoteSymbolMetaData("BLK", "Blackrock", "928193", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["MSCI"] = QuoteSymbolMetaData("MSCI", "MSCI", "A0M63R", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["1YL.F"] = QuoteSymbolMetaData("1YL.F", "Prosus", "A2PRDK", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["HYQ.DE"] = QuoteSymbolMetaData("HYQ.DE", "Hypoport", "549336", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["UNH"] = QuoteSymbolMetaData("UNH", "UnitedHealth Group", "869561", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["LMND"] = QuoteSymbolMetaData("LMND", "Lemonade", "A2P7Z1", Industry.FINANCE, SubIndustry.BANK)
            symbolNameMapping["AFRM"] = QuoteSymbolMetaData("AFRM", "Affirm", "A2QL1G", Industry.FINANCE, SubIndustry.BANK)

            symbolNameMapping["DB1.DE"] = QuoteSymbolMetaData("DB1.DE", "Deutsche Börse", "581005", Industry.FINANCE, SubIndustry.EXCHANGE)
            symbolNameMapping["NDAQ"] = QuoteSymbolMetaData("NDAQ", "Nasdaq", "813516", Industry.FINANCE, SubIndustry.EXCHANGE)
            symbolNameMapping["ICE"] = QuoteSymbolMetaData("ICE", "Intercontinental Exchange", "A1W5H0", Industry.FINANCE, SubIndustry.EXCHANGE)

            symbolNameMapping["PYPL"] = QuoteSymbolMetaData("PYPL", "PayPal", "A14R7U", Industry.FINANCE, SubIndustry.PAYMENT)
            symbolNameMapping["V"] = QuoteSymbolMetaData("V", "Visa", "A0NC7B", Industry.FINANCE, SubIndustry.PAYMENT)
            symbolNameMapping["ADYEN.AS"] = QuoteSymbolMetaData("ADYEN.AS", "Adyen", "A2JNF4", Industry.FINANCE, SubIndustry.PAYMENT)
            symbolNameMapping["SQ"] = QuoteSymbolMetaData("SQ", "Square", "A143D6", Industry.FINANCE, SubIndustry.PAYMENT)
            symbolNameMapping["JKHY"] = QuoteSymbolMetaData("JKHY", "Jack Henry & Associates", "888286", Industry.FINANCE, SubIndustry.PAYMENT)
            symbolNameMapping["FISV"] = QuoteSymbolMetaData("FISV", "Fiserv", "881793", Industry.FINANCE, SubIndustry.PAYMENT)

            return symbolNameMapping
        }
}