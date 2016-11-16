package com.radmethods.contentraven.vmlabs.repository;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.radmethods.contentraven.labintegrator.repository.AbstractRepositoryImpl;
import com.radmethods.contentraven.vmlabs.model.VmUser;

@Repository("vmUserRepository")
public class VmUserRepositoryImpl extends AbstractRepositoryImpl<VmUser> implements VmUserRepository {
	public VmUserRepositoryImpl() {
		setClazz(VmUser.class);
	}
	
	@Transactional
	public VmUser getUserByUsername(String username) {
		try {
			return (VmUser) getSessionFactory().getCurrentSession().createCriteria(VmUser.class)
				.add(Restrictions.eq("username", username))
				.list()
				.get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
}
