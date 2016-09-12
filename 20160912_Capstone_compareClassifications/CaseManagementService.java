
private static final Map<Integer, Integer> classificationHeight = new HashMap<>();

static {
	classificationHeight.put(NpacsConstants.CLASSIFICATION_CBI, 50);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_SEX_OFFENDER, 50);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE, 50);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_SSAS, 50);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_PSC_ADULT, 50);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_WEC, 50);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_CBI_DUI, 50);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH, 40);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW, 30);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_CBR_LOW, 20);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_CBR_ADMIN_OVERRIDE_VL, 10);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_JCBI, 30);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_JSH, 30);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_3_B, 30);
	classificationHeight.put(NpacsConstants.CLASSIFICATION_PSC_JUVENILE, 30);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE, 20);

	classificationHeight.put(NpacsConstants.CLASSIFICATION_JCBR_LOW, 10);
}

public boolean isNewClassificationHigher(Integer currentClassificationCd, Integer newClassificationCd) {
	return currentClassificationCd != null
		   && newClassificationCd != null
		   && classificationHeight.get(newClassificationCd) > classificationHeight.get(currentClassificationCd);
}

public boolean isNewClassificationEqualOrLower(Integer currentClassificationCd, Integer newClassificationCd) {
	return currentClassificationCd != null
		   && newClassificationCd != null
		   && classificationHeight.get(newClassificationCd) <= classificationHeight.get(currentClassificationCd);
}

public boolean isNewClassificationEqualOrHigher(Integer currentClassificationCd, Integer newClassificationCd) {
	return currentClassificationCd != null
		   && newClassificationCd != null
		   && classificationHeight.get(newClassificationCd) >= classificationHeight.get(currentClassificationCd);
}
