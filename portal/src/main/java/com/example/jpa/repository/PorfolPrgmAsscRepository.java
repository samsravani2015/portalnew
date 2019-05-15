package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.PorfolPrgmAssc;

/**
 * Created by sambasiva on 05/12/2019.
 */
@Repository
public interface PorfolPrgmAsscRepository extends JpaRepository<PorfolPrgmAssc, Long> {

}
