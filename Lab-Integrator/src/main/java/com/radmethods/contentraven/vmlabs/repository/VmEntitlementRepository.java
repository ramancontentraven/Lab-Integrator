package com.radmethods.contentraven.vmlabs.repository;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepository;
import com.radmethods.contentraven.vmlabs.model.VmEntitlement;

public interface VmEntitlementRepository extends AbstractRepository<VmEntitlement> {
	VmEntitlement getEntitlement(String username, String sku);
}
