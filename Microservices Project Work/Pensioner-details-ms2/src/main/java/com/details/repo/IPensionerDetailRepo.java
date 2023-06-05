package com.details.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.details.entity.PensionerDetail;

@Repository
public interface IPensionerDetailRepo extends JpaRepository<PensionerDetail, String> {

}
