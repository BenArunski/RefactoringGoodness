
public boolean isNewClassificationHigher(Integer currentClassificationCd,
		Integer newClassificationCd) {

	boolean isHigher = false;
	if (currentClassificationCd != null && newClassificationCd != null) {
		switch (currentClassificationCd) {
		case NpacsConstants.CLASSIFICATION_CBI:
		case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
		case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
		case NpacsConstants.CLASSIFICATION_SSAS:
		case NpacsConstants.CLASSIFICATION_PSC_ADULT:
		case NpacsConstants.CLASSIFICATION_WEC:
		case NpacsConstants.CLASSIFICATION_CBI_DUI:
			isHigher = false;
			break;
		case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
				isHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
				isHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
				isHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_ADMIN_OVERRIDE_VL:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			case NpacsConstants.CLASSIFICATION_CBR_LOW:
				isHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBI:
		case NpacsConstants.CLASSIFICATION_JSH:
		case NpacsConstants.CLASSIFICATION_3_B:
		case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			isHigher = false;
			break;
		case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
				isHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBR_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
				isHigher = true;
				break;
			}
			break;
		}
	}

	return isHigher;
}

public boolean isNewClassificationEqualOrLower(
		Integer currentClassificationCd, Integer newClassificationCd) {
	boolean isEqualOrLower = false;
	if (currentClassificationCd != null && newClassificationCd != null) {
		switch (currentClassificationCd) {
		case NpacsConstants.CLASSIFICATION_CBI:
		case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
		case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
		case NpacsConstants.CLASSIFICATION_SSAS:
		case NpacsConstants.CLASSIFICATION_PSC_ADULT:
		case NpacsConstants.CLASSIFICATION_WEC:
		case NpacsConstants.CLASSIFICATION_CBI_DUI:
			isEqualOrLower = true;
			break;
		case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
				isEqualOrLower = false;
				break;
			default:
				isEqualOrLower = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
				isEqualOrLower = false;
				break;
			default:
				isEqualOrLower = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
				isEqualOrLower = false;
				break;
			default:
				isEqualOrLower = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_ADMIN_OVERRIDE_VL:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			case NpacsConstants.CLASSIFICATION_CBR_LOW:
				isEqualOrLower = false;
				break;
			default:
				isEqualOrLower = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBI:
		case NpacsConstants.CLASSIFICATION_JSH:
		case NpacsConstants.CLASSIFICATION_3_B:
		case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			isEqualOrLower = true;
			break;
		case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
				isEqualOrLower = false;
				break;
			default:
				isEqualOrLower = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBR_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
				isEqualOrLower = false;
				break;
			default:
				isEqualOrLower = true;
				break;
			}
			break;
		}
	}

	return isEqualOrLower;
}

public boolean isNewClassificationEqualOrHigher(
		Integer currentClassificationCd, Integer newClassificationCd) {

	boolean isEqualOrHigher = false;
	if (currentClassificationCd != null && newClassificationCd != null) {
		switch (currentClassificationCd) {
		case NpacsConstants.CLASSIFICATION_CBI:
		case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
		case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
		case NpacsConstants.CLASSIFICATION_SSAS:
		case NpacsConstants.CLASSIFICATION_PSC_ADULT:
		case NpacsConstants.CLASSIFICATION_WEC:
		case NpacsConstants.CLASSIFICATION_CBI_DUI:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			case NpacsConstants.CLASSIFICATION_CBR_LOW:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_CBR_ADMIN_OVERRIDE_VL:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_CBI:
			case NpacsConstants.CLASSIFICATION_SEX_OFFENDER:
			case NpacsConstants.CLASSIFICATION_DOMESTIC_VIOLENCE:
			case NpacsConstants.CLASSIFICATION_SSAS:
			case NpacsConstants.CLASSIFICATION_PSC_ADULT:
			case NpacsConstants.CLASSIFICATION_WEC:
			case NpacsConstants.CLASSIFICATION_CBI_DUI:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_HIGH:
			case NpacsConstants.CLASSIFICATION_CBR_MEDIUM_LOW:
			case NpacsConstants.CLASSIFICATION_CBR_LOW:
			case NpacsConstants.CLASSIFICATION_CBR_ADMIN_OVERRIDE_VL:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBI:
		case NpacsConstants.CLASSIFICATION_JSH:
		case NpacsConstants.CLASSIFICATION_3_B:
		case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
				isEqualOrHigher = true;
				break;
			}
			break;
		case NpacsConstants.CLASSIFICATION_JCBR_LOW:
			switch (newClassificationCd) {
			case NpacsConstants.CLASSIFICATION_JCBI:
			case NpacsConstants.CLASSIFICATION_JSH:
			case NpacsConstants.CLASSIFICATION_3_B:
			case NpacsConstants.CLASSIFICATION_PSC_JUVENILE:
			case NpacsConstants.CLASSIFICATION_JCBR_LOW_MODERATE:
			case NpacsConstants.CLASSIFICATION_JCBR_LOW:
				isEqualOrHigher = true;
				break;
			}
			break;
		}
	}

	return isEqualOrHigher;
}
