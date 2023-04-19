package com.example.webcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {
    private final ICalculationRepository calculationRepository;

    public CalculationServiceImpl(ICalculationRepository calculationRepository) {
        this.calculationRepository = calculationRepository;
    }

    public void saveDTO(CalculationDTO calcDTO) {
        calculationRepository.save(Calculation.fromDTO(calcDTO));
    }
    public void delete(Long id) {
        calculationRepository.deleteById(id);
    }

    public long count() {
        return calculationRepository.count();
    }
}
