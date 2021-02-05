package org.algo.invest.core.quotes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.algo.invest.model.Industry;
import org.algo.invest.model.QuoteSymbolMetaData;

public class HealthQuotes {

	public static Map<String, QuoteSymbolMetaData> getQuotes(){
		
		Map<String, QuoteSymbolMetaData> symbolNameMapping = new LinkedHashMap<>();
		
		// Pharma
		symbolNameMapping.put("PFE", new QuoteSymbolMetaData("PFE","Pfizer","852009","", Industry.PHARMA));
		symbolNameMapping.put("JNJ", new QuoteSymbolMetaData("JNJ","Johnson & Johnson","853260","",Industry.PHARMA));
		symbolNameMapping.put("AZN", new QuoteSymbolMetaData("AZN","AstraZeneca","886455","",Industry.PHARMA));
		symbolNameMapping.put("GILD", new QuoteSymbolMetaData("GILD","Gilead","885823","",Industry.PHARMA));
		symbolNameMapping.put("BAYN.DE", new QuoteSymbolMetaData("BAYN.DE","Bayer","BAY001","",Industry.PHARMA));
		symbolNameMapping.put("SRT3.DE", new QuoteSymbolMetaData("SRT3.DE","Sartorius","716563","",Industry.PHARMA));
		symbolNameMapping.put("RHO6.F", new QuoteSymbolMetaData("RHO6.F","Roche","851311","",Industry.PHARMA));
		symbolNameMapping.put("ABT", new QuoteSymbolMetaData("ABT","Abbott Laboratories","850103","",Industry.PHARMA));
		symbolNameMapping.put("NOVC.DE", new QuoteSymbolMetaData("NOVC.DE","Novo Nordisk","A1XA8R","",Industry.PHARMA));
		symbolNameMapping.put("NOTA.F", new QuoteSymbolMetaData("NOTA.F","Novartis","904278","",Industry.PHARMA));
		symbolNameMapping.put("MRK.DE", new QuoteSymbolMetaData("MRK.DE","Merck","659990","",Industry.PHARMA));
		symbolNameMapping.put("PA8.DE", new QuoteSymbolMetaData("PA8.DE","Paion","A0B65S","",Industry.PHARMA));
		
		// Medtech
		symbolNameMapping.put("TMO", new QuoteSymbolMetaData("TMO","Thermo Fisher Scientific","857209","",Industry.MEDTECH));
		symbolNameMapping.put("ISRG", new QuoteSymbolMetaData("ISRG","Intuitive Surgical","888024","",Industry.MEDTECH));
		symbolNameMapping.put("ILMN", new QuoteSymbolMetaData("ILMN","Illumina","927079","",Industry.MEDTECH));
		symbolNameMapping.put("SYK", new QuoteSymbolMetaData("SYK","Stryker","864952","",Industry.MEDTECH));
		symbolNameMapping.put("BSX", new QuoteSymbolMetaData("BSX","Boston Scientific","884113","",Industry.MEDTECH));
		symbolNameMapping.put("DXCM", new QuoteSymbolMetaData("DXCM","Dexcom","A0D9T1","",Industry.MEDTECH));
		symbolNameMapping.put("QDEL", new QuoteSymbolMetaData("QDEL","Quidel","867261","",Industry.PHARMA));
		symbolNameMapping.put("WX8.F", new QuoteSymbolMetaData("WX8.F","Wuxi AppTec","A2PAJG","",Industry.MEDTECH));
		symbolNameMapping.put("SHL.DE", new QuoteSymbolMetaData("SHL.DE","Siemens Healthineers","SHL100","",Industry.MEDTECH));
		symbolNameMapping.put("PHIA.F", new QuoteSymbolMetaData("PHIA.F","Philips","940602","",Industry.MEDTECH));
		symbolNameMapping.put("MDT", new QuoteSymbolMetaData("MDT","Medtronic","A14M2J","",Industry.MEDTECH));
		symbolNameMapping.put("DRW3.DE", new QuoteSymbolMetaData("DRW3.DE","Drägerwerk","555063","",Industry.MEDTECH));
		symbolNameMapping.put("EUZ.DE", new QuoteSymbolMetaData("EUZ.DE","Eckert & Ziegler","565970","",Industry.MEDTECH));
		symbolNameMapping.put("ZBH", new QuoteSymbolMetaData("ZBH","Zimmer Biomet","753718","",Industry.MEDTECH));
		symbolNameMapping.put("EW", new QuoteSymbolMetaData("EW","Edwards Lifesciences","936853","",Industry.MEDTECH));
		symbolNameMapping.put("49Z.F", new QuoteSymbolMetaData("49Z.F","Cellink","A2PX00","",Industry.MEDTECH));

		// Medsoftware
		symbolNameMapping.put("TDOC", new QuoteSymbolMetaData("TDOC","Teladoc Health","A14VPK","",Industry.MEDSOFTWARE));
		symbolNameMapping.put("VEEV", new QuoteSymbolMetaData("VEEV","Veeva System","A1W5SA","",Industry.MEDSOFTWARE));
		
		// Biotechnology
		symbolNameMapping.put("AMGN", new QuoteSymbolMetaData("AMGN","Amgen","867900","",Industry.BIOTECH));
		symbolNameMapping.put("NVTA", new QuoteSymbolMetaData("NVTA","Invitae","A14NKG","",Industry.BIOTECH));
		symbolNameMapping.put("ABBV", new QuoteSymbolMetaData("ABBV","AbbVie","A1J84E","",Industry.BIOTECH));
		symbolNameMapping.put("BIO", new QuoteSymbolMetaData("BIO","Bio-Rad Laboratories","865406","",Industry.BIOTECH));
		symbolNameMapping.put("ASMB", new QuoteSymbolMetaData("ASMB","Assembly Biosciences","A117S1","",Industry.BIOTECH));
		symbolNameMapping.put("CRSP", new QuoteSymbolMetaData("CRSP","CRISPR Therapeutics","A2AT0Z","",Industry.BIOTECH));
		symbolNameMapping.put("22UA.F", new QuoteSymbolMetaData("22UA.F","Biontech","A2PSR2","",Industry.BIOTECH));
		symbolNameMapping.put("MRNA", new QuoteSymbolMetaData("MRNA","Moderna","A2N9D9","",Industry.BIOTECH));
		symbolNameMapping.put("CVAC", new QuoteSymbolMetaData("CVAC","Curevac","A2P71U","",Industry.BIOTECH));
		symbolNameMapping.put("EDIT", new QuoteSymbolMetaData("EDIT","Editas","A2AC4K","",Industry.BIOTECH));
		symbolNameMapping.put("CGEN", new QuoteSymbolMetaData("CGEN","Compugen","553001","",Industry.BIOTECH));
		
		return symbolNameMapping;
	}
}
