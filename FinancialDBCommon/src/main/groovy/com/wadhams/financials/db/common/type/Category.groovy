package com.wadhams.financials.db.common.type

enum Category {
	Accomodation('ACCOMODATION','ACCOMODATION'),
	AccountingFees('ACCOUNTING_FEES','ACCOUNTING_FEES'),
	Alcohol('ALCOHOL','ALCOHOL'),
	AssetRelatedCost('ASSET_RELATED_COST','ASSET_RELATED_COST'),
	BankingFees('BANKING_FEES','BANKING_FEES'),
	BassStraitFerry('BASS_STRAIT_FERRY','BASS_STRAIT_FERRY'),
	
	CampHillElectricUtilities('CH_ELECTRIC_UTILITIES','CH_ELECTRIC_UTILITIES'),
	CampHillFurniture('CH_FURNITURE','CH_FURNITURE'),
	CampHillGasUtilities('CH_GAS_UTILITIES','CH_GAS_UTILITIES'),
	CampHillHouseWares('CH_HOUSEWARES','CH_HOUSEWARES'),
	CampHillInsurance('CH_INSURANCE','CH_INSURANCE'),
	CampHillMaintenance('CH_MAINTENANCE','CH_MAINTENANCE'),
	CampHillRates('CH_RATES','CH_RATES'),
	CampHillRenovationCost('CH_RENO_COST','CH_RENO_COST'),
	CampHillRenovationServices('CH_RENO_SERVICES','CH_RENO_SERVICES'),
	CampHillSupplies('CH_SUPPLIES','CH_SUPPLIES'),
	CampHillWaterUtilities('CH_WATER_UTILITIES','CH_WATER_UTILITIES'),
	
	CampingEquipment('CAMPING_EQUIPMENT','CAMPING_EQUIPMENT'),
	CampingFees('CAMPING_FEES','CAMPING_FEES'),
	CampingSupplies('CAMPING_SUPPLIES','CAMPING_SUPPLIES'),
	
	CaravanEquipment('CARAVAN_EQUIPMENT','CARAVAN_EQUIPMENT'),
	CaravanInsurance('CARAVAN_INSURANCE','CARAVAN_INSURANCE'),
	CaravanMaintenance('CARAVAN_MAINTENANCE','CARAVAN_MAINTENANCE'),
	CaravanRego('CARAVAN_REGISTRATION','CARAVAN_REGISTRATION'),
	CaravanRepair('CARAVAN_REPAIR','CARAVAN_REPAIR'),
	CaravanServicing('CARAVAN_SERVICING','CARAVAN_SERVICING'),
	CaravanStorage('CARAVAN_STORAGE','CARAVAN_STORAGE'),
	CaravanSupplies('CARAVAN_SUPPLIES','CARAVAN_SUPPLIES'),
	
	CarEquipment('CAR_EQUIPMENT','CAR_EQUIPMENT'),
	CarInsurance('CAR_INSURANCE','CAR_INSURANCE'),
	CarMaintenance('CAR_MAINTENANCE','CAR_MAINTENANCE'),
	CarRego('CAR_REGISTRATION','CAR_REGISTRATION'),
	CarRepair('CAR_REPAIR','CAR_REPAIR'),
	CarServicing('CAR_SERVICING','CAR_SERVICING'),
	
	Cash('CASH','CASH'),
	Cleaning('CLEANING','CLEANING'),
	Clothing('CLOTHING','CLOTHING'),
	CloudStorage('CLOUD_STORAGE','CLOUD_STORAGE'),
	DataPlan('DATA_PLAN','DATA_PLAN'),
	Domestic_Travel('DOMESTIC_TRAVEL','DOMESTIC_TRAVEL'),
	Drinks('DRINKS','DRINKS'),
	DriversLicenseMolly('DRIVERS_LICENSE_MOLLY','DRIVERS_LICENSE_MOLLY'),
	DriversLicenseRob('DRIVERS_LICENSE_ROB','DRIVERS_LICENSE_ROB'),
	Electronics('ELECTRONICS','ELECTRONICS'),
	Entertainment('ENTERTAINMENT','ENTERTAINMENT'),
	ExtraEquipment('EXTRA_EQUIPMENT','EXTRA_EQUIPMENT'),
	Ferry('FERRY','FERRY'),
	
	FingalEquipment('FINGAL_EQUIPMENT','FINGAL_EQUIPMENT'),
	FingalLandTax('FINGAL_LAND_TAX','FINGAL_LAND_TAX'),
	FingalRates('FINGAL_RATES','FINGAL_RATES'),
	FingalShed('FINGAL_SHED','FINGAL_SHED'),
	FingalSupplies('FINGAL_SUPPLIES','FINGAL_SUPPLIES'),
	FingalWater('FINGAL_WATER','FINGAL_WATER'),
	FingalWork('FINGAL_WORK','FINGAL_WORK'),
	
	Fishing('FISHING','FISHING'),
	Food('FOOD','FOOD'),
	Fuel('FUEL','FUEL'),
	Gifts('GIFTS','GIFTS'),
	HomeBrew('HOME_BREW','HOME_BREW'),
	InsuranceFees('INSURANCE_FEES','INSURANCE_FEES'),

	KimberleyKamperEquipment('KK_EQUIPMENT','KK_EQUIPMENT'),
	KimberleyKamperInsurance('KK_INSURANCE','KK_INSURANCE'),
	KimberleyKamperMaintenance('KK_MAINTENANCE','KK_MAINTENANCE'),
	KimberleyKamperRego('KK_REGISTRATION','KK_REGISTRATION'),
	KimberleyKamperRepair('KK_REPAIR','KK_REPAIR'),
	KimberleyKamperServicing('KK_SERVICING','KK_SERVICING'),
	KimberleyKamperStorage('KK_STORAGE','KK_STORAGE'),
	KimberleyKamperSupplies('KK_SUPPLIES','KK_SUPPLIES'),
	
	Laundry('LAUNDRY','LAUNDRY'),
	LegalFees('LEGAL_FEES','LEGAL_FEES'),
	Media('MEDIA','MEDIA'),
	Medical('MEDICAL','MEDICAL'),
	Membership('MEMBERSHIP','MEMBERSHIP'),
	Misc('MISC','MISC'),
	Office('OFFICE','OFFICE'),
	OverseasTravel('OVERSEAS_TRAVEL','OVERSEAS_TRAVEL'),
	Parking('PARKING','PARKING'),
	ParksPass('PARKS_PASS','PARKS_PASS'),
	PersonalGrooming('PERSONAL_GROOMING','PERSONAL_GROOMING'),
	Pharmacy('PHARMACY','PHARMACY'),
	PhoneDataPlan('PHONE_AND_DATA_PLAN','PHONE_AND_DATA_PLAN'),
	PhonePlanMolly('PHONE_PLAN_MOLLY','PHONE_PLAN_MOLLY'),
	PhonePlanRob('PHONE_PLAN_ROB','PHONE_PLAN_ROB'),
	PreparedFood('PREPARED_FOOD','PREPARED_FOOD'),
	
	PreppingEquipment('PREPPING_EQUIPMENT','PREPPING_EQUIPMENT'),
	PreppingSupplies('PREPPING_SUPPLIES','PREPPING_SUPPLIES'),
	
	RentalCar('RENTAL_CAR','RENTAL_CAR'),
	Safety('SAFETY','SAFETY'),
	SpecialActivity('SPECIAL_ACTIVITY','SPECIAL_ACTIVITY'),
	StarLinkData('STAR_LINK_DATA','STAR_LINK_DATA'),
	Technology('TECHNOLOGY','TECHNOLOGY'),
	Tolls('TOLLS','TOLLS'),
	Tools('TOOLS','TOOLS'),
	Transit('TRANSIT','TRANSIT'),
	TravelPublication('TRAVEL_PUBLICATION','TRAVEL_PUBLICATION'),
	
	Invalid('Invalid','Invalid'),
	Unknown('Unknown','Unknown');
	
	private static EnumSet<Category> allEnums = EnumSet.allOf(Category.class)
	
	private final String name
	private final String dbValue

	Category(String name, String dbValue) {
		this.name = name
		this.dbValue = dbValue
	}
	
	public static Category findByName(String text) {
		if (text) {
			text = text.toUpperCase()
			for (Category e : allEnums) {
				if (e.name.equals(text)) {
					return e
				}
			}
		}
		else {
			return Category.Unknown
		}
		
		println ''
		println "ZZZZ Invalid category text: $text"
		println ''
		return Category.Invalid
	}

	public String getName() {
		return name
	}

	public String getDbValue() {
		return dbValue
	}

}
