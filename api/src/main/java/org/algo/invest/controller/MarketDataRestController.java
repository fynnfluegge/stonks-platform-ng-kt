package org.algo.invest.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.algo.invest.core.AppConfig;
import org.algo.invest.dto.ChartDataDto;
import org.algo.invest.dto.QuoteDto;
import org.algo.invest.model.QuoteRecord;
import org.algo.invest.model.QuoteRecord.Industry;
import org.algo.invest.model.QuoteRecord.QuoteType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"http://localhost:4200", "http://18.156.73.56:3000"})
public class MarketDataRestController {

	@Autowired
	RealtimeMarketDataController realtimeMarketDataController;
	
	@Autowired
	AppConfig appConfig;
	
	
	@RequestMapping(value="/getBigTechQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getBigTechQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.BIGTECH);
	}

	@RequestMapping(value="/updateBigTechQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateBigTechQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.BIGTECH);
	}
	
	@RequestMapping(value="/getIndicesQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getIndicesQuotes() {

		List<QuoteDto> result = getQuotes(QuoteType.CURRENCY, Industry.NONE);
		result.addAll(getQuotes(QuoteType.INDEX, Industry.NONE));
		result.addAll(getQuotes(QuoteType.FUTURE, Industry.NONE));
		
		return result;
	}

	@RequestMapping(value="/updateIndicesQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateIndicesQuotes() {

		List<QuoteDto> result = updateQuotes(QuoteType.CURRENCY, Industry.NONE);
		result.addAll(updateQuotes(QuoteType.INDEX, Industry.NONE));
		result.addAll(updateQuotes(QuoteType.FUTURE, Industry.NONE));
		
		return result;
	}
	
	@RequestMapping(value="/getEtfQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getEtfQuotes() {

		return getQuotes(QuoteType.ETF, Industry.NONE);
	}

	@RequestMapping(value="/updateEtfQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateEtfQuotes() {

		return updateQuotes(QuoteType.ETF, Industry.NONE);
	}
	
	@RequestMapping(value="/getTechManufacturingQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getTechManufacturingQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.TECH_MANUFACTURING);
	}

	@RequestMapping(value="/updateTechManufacturingQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateTechManufacturingQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.TECH_MANUFACTURING);
	}
	
	@RequestMapping(value="/getSemiconductorQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getSemiconductorQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.SEMICONDUCTOR);
	}

	@RequestMapping(value="/updateSemiconductorQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateSemiconductorQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.SEMICONDUCTOR);
	}
	
	@RequestMapping(value="/getItServicesQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getItServicesQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.ITSERVICES);
	}

	@RequestMapping(value="/updateItServicesQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateItServicesQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.ITSERVICES);
	}
	
	@RequestMapping(value="/getSecurityQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getSecurityQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.SECURITY);
	}

	@RequestMapping(value="/updateSecurityQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateSecutrityQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.SECURITY);
	}
	
	@RequestMapping(value="/getMediaQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getMediaQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.MEDIA);
	}

	@RequestMapping(value="/updateMediaQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateMediaQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.MEDIA);
	}
	
	@RequestMapping(value="/getEcommerceQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getEcommerceQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.ECOMMERCE);
	}

	@RequestMapping(value="/updateEcommerceQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateEcommerceQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.ECOMMERCE);
	}
	
	@RequestMapping(value="/getSoftwareQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getSoftwareQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.SOFTWARE);
	}

	@RequestMapping(value="/updateSoftwareQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateSoftwareQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.SOFTWARE);
	}
	
	@RequestMapping(value="/getHostingCloudQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getHostingCloudQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.CLOUD);
	}

	@RequestMapping(value="/updateHostingCloudQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateHostingCloudQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.CLOUD);
	}
	
	@RequestMapping(value="/getGamesQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getGamesQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.GAMES);
	}

	@RequestMapping(value="/updateGamesQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateGamesQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.GAMES);
	}
	
	@RequestMapping(value="/getGastronomyQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getGastronomyQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.GASTRONOMY);
	}

	@RequestMapping(value="/updateGastronomyQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateGastronomyQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.GASTRONOMY);
	}
	
	@RequestMapping(value="/getIndustrialManufacturingQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getIndustrialManufacturingQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.INDUSTRIAL_MANUFACTURING);
	}

	@RequestMapping(value="/updateIndustrialManufacturingQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateIndustrialManufacturingQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.INDUSTRIAL_MANUFACTURING);
	}
	
	@RequestMapping(value="/getMatChemQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getMatChemQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.MATERIALS_CHEMICALS);
	}

	@RequestMapping(value="/updateMatChemQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateMatChemQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.MATERIALS_CHEMICALS);
	}
	
	@RequestMapping(value="/getRecyclingQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getRecyclingQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.RECYCLING);
	}

	@RequestMapping(value="/updateRecyclingQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateRecyclingQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.RECYCLING);
	}
	
	@RequestMapping(value="/getCommunicationQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getCommunicationQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.COMMUNICATION);
	}

	@RequestMapping(value="/updateCommunicationQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateCommunicationQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.COMMUNICATION);
	}
	
	@RequestMapping(value="/getRealEstateQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getRealEstateQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.REALESTATE_CONSTRUCTION);
	}

	@RequestMapping(value="/updateRealEstateQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateRealEstateQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.REALESTATE_CONSTRUCTION);
	}
	
	@RequestMapping(value="/getFinanceQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getFinanceQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.FINANCE_INSURANCE_HOLDING);
	}

	@RequestMapping(value="/updateFinanceQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateFinanceQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.FINANCE_INSURANCE_HOLDING);
	}
	
	@RequestMapping(value="/getExchangeQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getExchangeQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.EXCHANGE);
	}

	@RequestMapping(value="/updateExchangeQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateExchangeQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.EXCHANGE);
	}
	
	@RequestMapping(value="/getPharmaQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getPharmaMedtechQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.PHARMA);
	}

	@RequestMapping(value="/updatePharmaQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updatePharmaMedtechQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.PHARMA);
	}
	
	@RequestMapping(value="/getMedtechQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getMedtechQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.MEDTECH);
	}

	@RequestMapping(value="/updateMedtechQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateMedtechQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.MEDTECH);
	}
	
	@RequestMapping(value="/getMedSoftwareQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getMedSoftwareQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.MEDSOFTWARE);
	}

	@RequestMapping(value="/updateMedSoftwareQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateMedSoftwareQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.MEDSOFTWARE);
	}
	
	@RequestMapping(value="/getBiotechQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getBiotechQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.BIOTECH);
	}

	@RequestMapping(value="/updateBiotechQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateBiotechQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.BIOTECH);
	}
	
	@RequestMapping(value="/getFoodQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getFoodQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.FOOD);
	}

	@RequestMapping(value="/updateFoodQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateFoodQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.FOOD);
	}
	
	@RequestMapping(value="/getFoodDeliveryQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getCarFoodDeliveryQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.FOOD_DELIVERY);
	}

	@RequestMapping(value="/updateFoodDeliveryQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateFoodDeliveryQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.FOOD_DELIVERY);
	}
	
	@RequestMapping(value="/getRetailQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getRetailQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.RETAIL);
	}

	@RequestMapping(value="/updateRetailQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateRetailQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.RETAIL);
	}
	
	
	@RequestMapping(value="/getConsumerQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getConsumerQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.CONSUMER_CONGLOMERATE);
	}

	@RequestMapping(value="/updateConsumerQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateConsumerQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.CONSUMER_CONGLOMERATE);
	}
	
	@RequestMapping(value="/getDressSportsQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getDressSportsQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.DRESS_SPORTS);
	}

	@RequestMapping(value="/updateDressSportsQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateDressSportsQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.DRESS_SPORTS);
	}
	
	@RequestMapping(value="/getEnergyQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getEnergyQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.ENERGY);
	}

	@RequestMapping(value="/updateEnergyQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateEnergyQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.ENERGY);
	}
	
	@RequestMapping(value="/getRenewableEnergyQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getRenewableEnergyQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.RENEWABLE_ENERGY);
	}

	@RequestMapping(value="/updateRenewableEnergyQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateRenewableEnergyQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.RENEWABLE_ENERGY);
	}
	
	@RequestMapping(value="/getAeroTravelQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getAeroTravelQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.AEROSPACE_TRAVEL);
	}

	@RequestMapping(value="/updateAeroTravelQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateAeroTravelQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.AEROSPACE_TRAVEL);
	}
	
	@RequestMapping(value="/getAutoQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getAutoQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.AUTOMOBILE);
	}

	@RequestMapping(value="/updateAutoQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateAutoQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.AUTOMOBILE);
	}
	
	@RequestMapping(value="/getPaymentQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getPaymentQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.PAYMENT);
	}

	@RequestMapping(value="/updatePaymentQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updatePaymentQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.PAYMENT);
	}
	
	@RequestMapping(value="/getCarRentalQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getCarRentalQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.CAR_RENTAL);
	}

	@RequestMapping(value="/updateCarRentalQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateCarRentalQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.CAR_RENTAL);
	}
	
	
	@RequestMapping(value="/getGeneralServicesQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getGeneralServicesQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.GENERAL_SERVICES);
	}

	@RequestMapping(value="/updateGeneralServicesQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateGeneralServicesQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.GENERAL_SERVICES);
	}
	
	@RequestMapping(value="/getAkkuQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getAkkuQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.AKKU);
	}

	@RequestMapping(value="/updateChinaQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateChinaQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.CHINA);
	}
	
	@RequestMapping(value="/getChinaQuotes", method=RequestMethod.GET)
	public List<QuoteDto> getChinaQuotes() {

		return getQuotes(QuoteType.EQUITY, Industry.CHINA);
	}

	@RequestMapping(value="/updateAkkuQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateAkkuQuotes() {

		return updateQuotes(QuoteType.EQUITY, Industry.AKKU);
	}
	
	@RequestMapping(value="/get24hOutperformer", method=RequestMethod.GET)
	public List<QuoteDto> getDailyOutperformer() {

		Comparator<QuoteRecord> byDailyChangePercent = Comparator
				  .comparing(QuoteRecord::getRegularMarketChangePercent).reversed();
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(byDailyChangePercent)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList()).subList(0, 9);
	}

	@RequestMapping(value="/get24hUnderperformer", method=RequestMethod.GET)
    public List<QuoteDto> getDailyUnderPerformer() {
		 
		 Comparator<QuoteRecord> byDailyChangePercent = Comparator
				  .comparing(QuoteRecord::getRegularMarketChangePercent);
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(byDailyChangePercent)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList()).subList(0, 9);
	}
	
	@RequestMapping(value="/get50dOutperformer", method=RequestMethod.GET)
	public List<QuoteDto> get50dOutperformer() {

		Comparator<QuoteRecord> byDailyChangePercent = Comparator
				  .comparing(QuoteRecord::getFiftyDayAverageChangePercent).reversed();
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(byDailyChangePercent)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList()).subList(0, 9);
	}

	@RequestMapping(value="/get50dUnderperformer", method=RequestMethod.GET)
    public List<QuoteDto> get50dPerformer() {
		 
		 Comparator<QuoteRecord> byDailyChangePercent = Comparator
				  .comparing(QuoteRecord::getFiftyDayAverageChangePercent);
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(byDailyChangePercent)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList()).subList(0, 9);
	}
	
	@RequestMapping(value="/get200dOutperformer", method=RequestMethod.GET)
	public List<QuoteDto> get200dOutperformer() {

		Comparator<QuoteRecord> byDailyChangePercent = Comparator
				  .comparing(QuoteRecord::getTwoHundredDayAverageChangePercent).reversed();
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(byDailyChangePercent)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList()).subList(0, 9);
	}

	@RequestMapping(value="/get200dUnderperformer", method=RequestMethod.GET)
    public List<QuoteDto> get200dUnderPerformer() {
		 
		 Comparator<QuoteRecord> byDailyChangePercent = Comparator
				  .comparing(QuoteRecord::getTwoHundredDayAverageChangePercent);
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == QuoteType.EQUITY)
				.sorted(byDailyChangePercent)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList()).subList(0, 9);
	}
	

	private List<QuoteDto> getQuotes(QuoteType quoteType, Industry industry){
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == quoteType && appConfig.getSymbolNameMapping().get(x.getSymbol()).getIndustry() == industry)
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList());
	}

	private List<QuoteDto> updateQuotes(QuoteType quoteType, Industry industry){
		
		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
				.filter(x -> x.getQuoteType() == quoteType && appConfig.getSymbolNameMapping().get(x.getSymbol()).getIndustry() == industry && x.isRefresh())
				.map(
					new Function<QuoteRecord, QuoteDto>(){

						@Override
						public QuoteDto apply(QuoteRecord _QuoteRecord) {
							
							return getQuoteDto(_QuoteRecord);
						}
					}
					
				).collect(Collectors.toList());
	}
	
	@RequestMapping(value="/getAllQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getAllQuotes() {

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
			.map(
				new Function<QuoteRecord, QuoteDto>(){

					@Override
					public QuoteDto apply(QuoteRecord _QuoteRecord) {
						
						return getQuoteDto(_QuoteRecord);
					}
				}
				
			).collect(Collectors.toList());
	}
	
	@RequestMapping(value="/updateAllQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateAllQuotes() {

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
			.filter(x -> x.isRefresh())
			.map(
				new Function<QuoteRecord, QuoteDto>(){

					@Override
					public QuoteDto apply(QuoteRecord _QuoteRecord) {
						
						return getQuoteDto(_QuoteRecord);
					}
				}
				
			).filter(x -> x!=null).collect(Collectors.toList());
	}
	
	@RequestMapping(value="/getSparplanQuotes", method=RequestMethod.GET)
    public List<QuoteDto> getSparplanQuotes() {

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
			.filter(x -> appConfig.getSparplanWkns().contains(appConfig.getSymbolNameMapping().get(x.getSymbol()).getWkn()))
			.sorted((x1,x2) -> appConfig.getSymbolNameMapping().get(x1.getSymbol()).getName().compareTo(appConfig.getSymbolNameMapping().get(x2.getSymbol()).getName()))
			.map(
				new Function<QuoteRecord, QuoteDto>(){

					@Override
					public QuoteDto apply(QuoteRecord _QuoteRecord) {
						
						return getQuoteDto(_QuoteRecord);
					}
				}
				
			).collect(Collectors.toList());
	}
	
	@RequestMapping(value="/updateSparplanQuotes", method=RequestMethod.GET)
    public List<QuoteDto> updateSparplanQuotes() {

		return appConfig.getSymbolNameMapping().keySet().stream().map(s -> realtimeMarketDataController.getRealtimeStockRecords().get(s))
			.filter(x -> x.isRefresh())
			.filter(x -> appConfig.getSparplanWkns().contains(appConfig.getSymbolNameMapping().get(x.getSymbol()).getWkn()))
			.map(
				new Function<QuoteRecord, QuoteDto>(){

					@Override
					public QuoteDto apply(QuoteRecord _QuoteRecord) {
						
						return getQuoteDto(_QuoteRecord);
					}
				}
				
			).filter(x -> x!=null).collect(Collectors.toList());
	}

	@RequestMapping(value="/log", method=RequestMethod.GET)
    public List<String> getLog() {
		List<String> s_log = new ArrayList<String>();
		try{
		   FileInputStream fstream = new FileInputStream("logs/bot-app.log");
		   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		   String strLine;
		   while ((strLine = br.readLine()) != null)   {
		     s_log.add(strLine);
		   }
		   fstream.close();
		} catch (Exception e) {
		}
		return s_log;
	}
	
	private QuoteDto getQuoteDto(QuoteRecord quoteRecord) {
		
		ChartDataDto chartData = new ChartDataDto(
				realtimeMarketDataController.getHistoryQuotes().containsKey(quoteRecord.getSymbol())
					&& realtimeMarketDataController.getHistoryQuotes().get(quoteRecord.getSymbol()).size() > 10 ?
				realtimeMarketDataController.getHistoryQuotes().get(quoteRecord.getSymbol()).entrySet().stream().collect(lastN(10)).subList(0, 10)
					.stream().map(x -> x.getValue().getClose().floatValue()).collect(Collectors.toList()) :
						new ArrayList<Float>());

		if (chartData.getData().size() == 10 && chartData.getData().get(9) != quoteRecord.getRegularMarketPrice())
		{
			chartData.getData().remove(0);
			chartData.getData().add(quoteRecord.getRegularMarketPrice());
		}

		
		return QuoteDto.builder().symbol(quoteRecord.getSymbol())
				.name(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getName())
				.wkn(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getWkn())
				.url(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getUrl())
				.exchange(quoteRecord.getFullExchangeName())
				.currency(quoteRecord.getCurrency())
				.price(quoteRecord.getRegularMarketPrice())
				.dayChange(quoteRecord.getRegularMarketChange())
				.dayChangePercent(quoteRecord.getRegularMarketChangePercent())
				.marketCap(quoteRecord.getMarketCap())
				.fiftyDayAverage(quoteRecord.getFiftyDayAverage())
				.fiftyDayAverageChangePercent(quoteRecord.getFiftyDayAverageChangePercent())
				.twoHundredDayAverage(quoteRecord.getTwoHundredDayAverage())
				.twoHundredDayAverageChangePercent(quoteRecord.getTwoHundredDayAverageChangePercent())
				.fiftyTwoWeekHigh(quoteRecord.getFiftyTwoWeekHigh())
				.fiftyTwoWeekHighChangePercent(quoteRecord.getFiftyTwoWeekHighChangePercent())
				.fiftyTwoWeekLow(quoteRecord.getFiftyTwoWeekLow())
				.fiftyTwoWeekLowChangePercent(quoteRecord.getFiftyTwoWeekLowChangePercent())
				.quoteType(quoteRecord.getQuoteType())
				.chartData(Arrays.asList(chartData))
				.build();
	}

	@RequestMapping(value="/quote/{symbol}", method=RequestMethod.GET)
    public QuoteDto getQuote(@PathVariable String symbol) {

		QuoteRecord quoteRecord = realtimeMarketDataController.getRealtimeStockRecords().get(symbol);
		
		ChartDataDto chartData = new ChartDataDto(
				realtimeMarketDataController.getHistoryQuotes().containsKey(symbol) &&
						realtimeMarketDataController.getHistoryQuotes().get(symbol).size() >= 200 ?
				realtimeMarketDataController.getHistoryQuotes().get(symbol).values().stream().collect(lastN(200)).subList(0, 200)
					.stream().map(x -> x.getClose().floatValue()).collect(Collectors.toList()) :
						new ArrayList<Float>());

		if (chartData.getData().size() == 200 && chartData.getData().get(199) != quoteRecord.getRegularMarketPrice())
		{
			chartData.getData().remove(0);
			chartData.getData().add(quoteRecord.getRegularMarketPrice());
		}

		return QuoteDto.builder().symbol(quoteRecord.getSymbol())
			.name(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getName())
			.wkn(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getWkn())
			.url(appConfig.getSymbolNameMapping().get(quoteRecord.getSymbol()).getUrl())
			.exchange(quoteRecord.getFullExchangeName())
			.currency(quoteRecord.getCurrency())
			.price(quoteRecord.getRegularMarketPrice())
			.dayChange(quoteRecord.getRegularMarketChange())
			.dayChangePercent(quoteRecord.getRegularMarketChangePercent())
			.marketCap(quoteRecord.getMarketCap())
			.fiftyDayAverage(quoteRecord.getFiftyDayAverage())
			.fiftyDayAverageChangePercent(quoteRecord.getFiftyDayAverageChangePercent())
			.twoHundredDayAverage(quoteRecord.getTwoHundredDayAverage())
			.twoHundredDayAverageChangePercent(quoteRecord.getTwoHundredDayAverageChangePercent())
			.fiftyTwoWeekHigh(quoteRecord.getFiftyTwoWeekHigh())
			.fiftyTwoWeekHighChangePercent(quoteRecord.getFiftyTwoWeekHighChangePercent())
			.fiftyTwoWeekLow(quoteRecord.getFiftyTwoWeekLow())
			.fiftyTwoWeekLowChangePercent(quoteRecord.getFiftyTwoWeekLowChangePercent())
			.quoteType(quoteRecord.getQuoteType())
			.chartData(Arrays.asList(chartData))
			.build();
	}

	public <T> Collector<T, ?, List<T>> lastN(int n) {
		return Collector.<T, Deque<T>, List<T>>of(ArrayDeque::new, (acc, t) -> {
			if(acc.size() == n)
				acc.pollFirst();
			acc.add(t);
		}, (acc1, acc2) -> {
			while(acc2.size() < n && !acc1.isEmpty()) {
				acc2.addFirst(acc1.pollLast());
			}
			return acc2;
		}, ArrayList::new);
	}
}
