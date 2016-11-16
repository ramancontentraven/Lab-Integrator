package com.radmethods.contentraven.vmlabs.repository;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepositoryImpl;
import com.radmethods.contentraven.vmlabs.model.VmEntitlement;

@Repository("vmEntitlementRepository")
public class VmEntitlementRepositoryImpl extends AbstractRepositoryImpl<VmEntitlement> implements VmEntitlementRepository{

	public VmEntitlementRepositoryImpl() {
		setClazz(VmEntitlement.class);
	}
	
	@Transactional
	public VmEntitlement getEntitlement(String username, String sku) {
		try {
			return (VmEntitlement) getSessionFactory().getCurrentSession().createCriteria(VmEntitlement.class)
				.add(Restrictions.eq("username", username))
				.add(Restrictions.eq("sku", sku))
				.list().get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		
	}
}
