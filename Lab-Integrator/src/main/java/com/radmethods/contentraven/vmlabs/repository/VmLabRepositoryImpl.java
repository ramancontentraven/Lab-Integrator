package com.radmethods.contentraven.vmlabs.repository;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepositoryImpl;
import com.radmethods.contentraven.vmlabs.model.VmLab;

@Repository("vmLabRepository")
public class VmLabRepositoryImpl extends AbstractRepositoryImpl<VmLab> implements VmLabRepository {
	public VmLabRepositoryImpl() {
		setClazz(VmLab.class);
	}
	
	@Transactional
	public List<VmLab> getLabsCreatedAfter(Date lastRefreshedAt) {
		return getSessionFactory().getCurrentSession().createCriteria(VmLab.class)
			.add(Restrictions.ge("createdAt", lastRefreshedAt))
			.list();
	}
}
