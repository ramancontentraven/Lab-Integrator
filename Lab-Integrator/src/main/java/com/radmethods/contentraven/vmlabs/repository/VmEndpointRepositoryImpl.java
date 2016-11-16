package com.radmethods.contentraven.vmlabs.repository;

import org.springframework.stereotype.Repository;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepositoryImpl;
import com.radmethods.contentraven.vmlabs.model.VmEndpoint;

@Repository("vmEndpointRepository")
public class VmEndpointRepositoryImpl extends AbstractRepositoryImpl<VmEndpoint> implements VmEndpointRepository{
	public VmEndpointRepositoryImpl() {
		setClazz(VmEndpoint.class);
	}
}
