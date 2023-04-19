package com.example.webcalculator;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculationController {
    CalculationServiceImpl calculationService;

    public CalculationController(CalculationServiceImpl calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/calc")
    public CalculationDTO onLogin(Model model,
                                  @RequestParam String type,
                                  @RequestParam Integer x,
                                  @RequestParam Integer y) {

        if(type.equals("sum")){
            CalculationDTO calcDto = CalculationDTO.of(type,x,y,x+y);

            calculationService.saveDTO(calcDto);
            return calcDto;
        } else if (type.equals("mult")) {
            CalculationDTO calcDto = CalculationDTO.of(type,x,y,x*y);
            calculationService.saveDTO(calcDto);
            return calcDto;
        }
        throw new IllegalArgumentException("Type sum or mult");
    }

    @GetMapping("/countDB")
    public Long counter() {
        return calculationService.count();
    }
}
