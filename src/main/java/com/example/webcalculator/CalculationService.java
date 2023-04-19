package com.example.webcalculator;

public interface CalculationService {
    public void saveDTO(CalculationDTO calcDTO);
    public void delete(Long id);
    public long count();
}
