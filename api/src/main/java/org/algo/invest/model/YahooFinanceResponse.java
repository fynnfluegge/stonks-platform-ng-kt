package org.algo.invest.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class YahooFinanceResponse {

	private QuoteResponse quoteResponse;
	
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class QuoteResponse {
		private List<QuoteRecord> result;
	}
}
