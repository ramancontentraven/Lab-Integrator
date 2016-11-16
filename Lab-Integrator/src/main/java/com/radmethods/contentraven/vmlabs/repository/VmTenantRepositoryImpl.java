package com.radmethods.contentraven.vmlabs.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepositoryImpl;
import com.radmethods.contentraven.vmlabs.model.VmTenant;

@Repository("vmTenantRepository")
public class VmTenantRepositoryImpl extends AbstractRepositoryImpl<VmTenant> implements VmTenantRepository {
	public VmTenantRepositoryImpl() {
		setClazz(VmTenant.class);
	}
}
