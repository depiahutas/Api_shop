package com.loparok.repository;

import com.loparok.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository  extends JpaRepository<Enterprise, Integer> {
}
