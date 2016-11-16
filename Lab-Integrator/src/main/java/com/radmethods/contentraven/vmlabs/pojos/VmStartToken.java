package com.radmethods.contentraven.vmlabs.pojos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class VmStartToken implements Serializable {
	private String neeToken;

	public String getNeeToken() {
		return neeToken;
	}

	public void setNeeToken(String neeToken) {
		this.neeToken = neeToken;
	}
}

