package org.algo.invest.core.quotes;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndicesQuotes {

    public static Map<String, QuoteSymbolMetaData> getQuotes() {

        Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<String, QuoteSymbolMetaData>();

        symbolNameMapping.put("EURUSD=X", new QuoteSymbolMetaData("EURUSD=X","EUR/USD", "", Industry.NONE));
        symbolNameMapping.put("USDCNY=X", new QuoteSymbolMetaData("USDCNY=X","USD/CNY", "", Industry.NONE));
        symbolNameMapping.put("BTC-USD", new QuoteSymbolMetaData("BTC-USD","BTC/USD", "", Industry.NONE));
        symbolNameMapping.put("GC=F", new QuoteSymbolMetaData("GC=F","GOLD/USD", "", Industry.NONE));
        symbolNameMapping.put("CL=F", new QuoteSymbolMetaData("CL=F","Crude Oil/USD", "", Industry.NONE));
        symbolNameMapping.put("^VIX", new QuoteSymbolMetaData("^VIX","Volatility Index", "", Industry.NONE));
        symbolNameMapping.put("^GDAXI", new QuoteSymbolMetaData("^GDAXI","DAX", "", Industry.NONE));
        symbolNameMapping.put("^MDAXI", new QuoteSymbolMetaData("^MDAXI","MDAX", "", Industry.NONE));
        symbolNameMapping.put("^SDAXI", new QuoteSymbolMetaData("^SDAXI","SDAX", "", Industry.NONE));
        symbolNameMapping.put("^TECDAX", new QuoteSymbolMetaData("^TECDAX","TecDAX", "", Industry.NONE));
        symbolNameMapping.put("^DJI", new QuoteSymbolMetaData("^DJI","Dow Jones", "", Industry.NONE));
        symbolNameMapping.put("^IXIC", new QuoteSymbolMetaData("^IXIC","Nasdaq Comp", "", Industry.NONE));
        symbolNameMapping.put("^NDX", new QuoteSymbolMetaData("^NDX","Nasdaq 100", "", Industry.NONE));
        symbolNameMapping.put("^NDXT", new QuoteSymbolMetaData("^NDXT","Nasdaq 100 Tech", "", Industry.NONE));
        symbolNameMapping.put("^GSPC", new QuoteSymbolMetaData("^GSCP","S&P 500", "", Industry.NONE));
        symbolNameMapping.put("NQ=F", new QuoteSymbolMetaData("NQ=F","Nasdaq 100 Future", "", Industry.NONE));
        symbolNameMapping.put("YM=F", new QuoteSymbolMetaData("YM=F","Dow Jones Future", "", Industry.NONE));
        symbolNameMapping.put("ES=F", new QuoteSymbolMetaData("ES=F","S&P 500 Future", "", Industry.NONE));
        symbolNameMapping.put("^N225", new QuoteSymbolMetaData("^N225","Nikkei", "", Industry.NONE));
        symbolNameMapping.put("000001.SS", new QuoteSymbolMetaData("000001.SS","Shanghai Comp", "", Industry.NONE));
        symbolNameMapping.put("^HSI", new QuoteSymbolMetaData("^HSI","Hang Seng HK", "", Industry.NONE));
        symbolNameMapping.put("^HSCE", new QuoteSymbolMetaData("^HSCE","Hang Seng China", "", Industry.NONE));

        return symbolNameMapping;
    }
}
