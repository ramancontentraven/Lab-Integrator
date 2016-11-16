package com.radmethods.contentraven.crlabs.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.radmethods.contentraven.labintegrator.model.Endpoint;

@SuppressWarnings("serial")
@Table(name="cr_endpoint")
@Entity
public class CrEndpoint extends Endpoint {
	private String orgDetailsUrl;
	private String createLabUrl;
	public String getOrgDetailsUrl() {
		return orgDetailsUrl;
	}
	public void setOrgDetailsUrl(String orgDetailsUrl) {
		this.orgDetailsUrl = orgDetailsUrl;
	}
	public String getCreateLabUrl() {
		return createLabUrl;
	}
	public void setCreateLabUrl(String createLabUrl) {
		this.createLabUrl = createLabUrl;
	}
}
