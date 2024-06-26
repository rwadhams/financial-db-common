package com.wadhams.financials.db.common.type

enum ReportGrouping {
	SpecificRunningCost('SPECIFIC_RUNNING_COST','SPECIFIC_RUNNING_COST'),	//specific with start and end dates
	OngoingRunningCost('ONGOING_RUNNING_COST','ONGOING_RUNNING_COST'),		//start and end dates are consecutive and don't overlap
	
	CampHillReno('CAMP_HILL_RENO','CAMP_HILL_RENO'),	//grouping for specific expenses
	
	Future('FUTURE','FUTURE'),	//designates a future dated transaction

	Invalid('Invalid','Invalid'),
	Unknown('Unknown','Unknown');
	
	private static EnumSet<ReportGrouping> allEnums = EnumSet.allOf(ReportGrouping.class)
	
	private final String name
	private final String dbValue

	ReportGrouping(String name, String dbValue) {
		this.name = name
		this.dbValue = dbValue
	}
	
	public static ReportGrouping findByName(String text) {
		if (text) {
			text = text.toUpperCase()
			for (ReportGrouping e : allEnums) {
				if (e.name.equals(text)) {
					return e
				}
			}
		}
		else {
			return ReportGrouping.Unknown
		}
		
		println "ZZZZ Invalid reporting group text: $text"
		return ReportGrouping.Invalid
	}

	public String getName() {
		return name
	}

	public String getDbValue() {
		return dbValue
	}

}
