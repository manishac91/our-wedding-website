package com.wedding.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wedding.app.entity.AboutUsEntity;

@Repository
public interface WeddingRepository extends JpaRepository<AboutUsEntity, Long>{

}
