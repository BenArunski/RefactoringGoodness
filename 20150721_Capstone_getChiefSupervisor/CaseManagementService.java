// Moved method to NpacsService and made get*Officers() private
@Override
public Long getHeadChiefForDistrict(Integer districtCode) {

	List<AuthorizedUser> officers = getCPOOfficers(districtCode);

	if(isEmpty(officers)) {
		officers = getCDPOfficers(districtCode);
	}

	return isEmpty(officers) ? null : officers.get(0).getAuthorizedUserId();
}
