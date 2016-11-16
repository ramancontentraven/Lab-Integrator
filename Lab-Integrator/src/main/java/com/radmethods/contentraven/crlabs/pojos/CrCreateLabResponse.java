package com.radmethods.contentraven.crlabs.pojos;

@SuppressWarnings("serial")
public class CrCreateLabResponse extends CrResponse {
	private String orgId;
	private String className;
	private String externalLabId;
	private String senderEmail;
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getExternalLabId() {
		return externalLabId;
	}
	public void setExternalLabId(String externalLabId) {
		this.externalLabId = externalLabId;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
}
