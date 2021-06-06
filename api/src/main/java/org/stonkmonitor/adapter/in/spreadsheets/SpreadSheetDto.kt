package org.stonkmonitor.adapter.`in`.spreadsheets

data class SpreadSheetDto (
 val range: String? = null,
 val majorDimension: String? = null,
 val values: List<List<String>> = ArrayList()
)