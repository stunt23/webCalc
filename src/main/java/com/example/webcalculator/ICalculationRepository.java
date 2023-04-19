package com.example.webcalculator;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ICalculationRepository extends JpaRepository<Calculation, Long> {

}
