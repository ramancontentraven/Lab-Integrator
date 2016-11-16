package com.radmethods.contentraven.vmlabs.repository;

import java.util.Date;
import java.util.List;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepository;
import com.radmethods.contentraven.vmlabs.model.VmLab;

public interface VmLabRepository extends AbstractRepository<VmLab> {
	List<VmLab> getLabsCreatedAfter(Date lastRefreshedAt);
}
