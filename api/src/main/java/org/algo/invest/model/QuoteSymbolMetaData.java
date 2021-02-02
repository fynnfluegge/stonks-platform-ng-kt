package org.algo.invest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QuoteSymbolMetaData {

	private String symbol;
	private String name;
	private String wkn;
	private String url;
	private Industry industry;
}
