package com.process.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.process.entity.ProcessPensionInput;

public interface ProcessPensionRepo extends JpaRepository<ProcessPensionInput, String>{

}
