package com.radmethods.contentraven.crlabs.pojos;

import java.util.List;

@SuppressWarnings("serial")
public class CrOrgDetailsResponse extends CrResponse {
	private List<CrOrg> data;

	public List<CrOrg> getData() {
		return data;
	}

	public void setData(List<CrOrg> data) {
		this.data = data;
	} 
}
