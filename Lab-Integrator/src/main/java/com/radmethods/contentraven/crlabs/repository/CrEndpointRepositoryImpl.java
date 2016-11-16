package com.radmethods.contentraven.crlabs.repository;

import org.springframework.stereotype.Repository;

import com.radmethods.contentraven.crlabs.model.CrEndpoint;
import com.radmethods.contentraven.labintegrator.repository.AbstractRepositoryImpl;

@Repository("crEndpointRepository")
public class CrEndpointRepositoryImpl extends AbstractRepositoryImpl<CrEndpoint> implements CrEndpointRepository {
	public CrEndpointRepositoryImpl() {
		setClazz(CrEndpoint.class);
	}
}
