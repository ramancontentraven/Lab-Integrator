package com.radmethods.contentraven.vmlabs.pojos;

@SuppressWarnings("serial")
public class VmStartEntitlementResponse extends VmResponse {
	private VmStartToken data;

	public VmStartToken getData() {
		return data;
	}

	public void setData(VmStartToken data) {
		this.data = data;
	}
}
