package com.bhagya.expense_tracker.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhagya.expense_tracker.entity.NewRegisterEntity;

@Repository

public interface NewUserRepository extends JpaRepository<NewRegisterEntity, String> {

	Set<String> findByEmail(String email);
	List<String> findByUserName(String name);
}


