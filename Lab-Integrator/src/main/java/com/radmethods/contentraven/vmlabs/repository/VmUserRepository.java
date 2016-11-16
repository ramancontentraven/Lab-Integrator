package com.radmethods.contentraven.vmlabs.repository;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepository;
import com.radmethods.contentraven.vmlabs.model.VmUser;

public interface VmUserRepository extends AbstractRepository<VmUser> {
	VmUser getUserByUsername(String username);
}
