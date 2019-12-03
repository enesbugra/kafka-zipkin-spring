package com.agaoglu.test.kafkazipkinservice2.repository;

import com.agaoglu.test.kafkazipkinservice2.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
