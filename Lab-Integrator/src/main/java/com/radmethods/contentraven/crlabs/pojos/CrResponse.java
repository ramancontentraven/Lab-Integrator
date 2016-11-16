package com.radmethods.contentraven.crlabs.pojos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CrResponse implements Serializable {
	private String errorCode;
	private String status;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
