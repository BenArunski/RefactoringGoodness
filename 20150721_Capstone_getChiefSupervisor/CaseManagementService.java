/**
 * @param districtCd
 * @return
 */
private Long getCaseSupervisorForDistrict(Integer districtCd) {
	Long caseSupervisorId = null;
	List<AuthorizedUser> authorizedUserList = getNpacsService()
			.getCPOOfficers(districtCd);
	if (authorizedUserList.size() > 0) {
		for (AuthorizedUser authorizedUser : authorizedUserList) {
			caseSupervisorId = authorizedUser.getAuthorizedUserId();
			break;
		}
	} else {
		authorizedUserList = getNpacsService().getCDPOfficers(districtCd);
		for (AuthorizedUser authorizedUser : authorizedUserList) {
			caseSupervisorId = authorizedUser.getAuthorizedUserId();
			break;
		}
	}
	return caseSupervisorId;
}
