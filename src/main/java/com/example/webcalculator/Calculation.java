package com.example.webcalculator;

import jakarta.persistence.*;


@Entity
@Table(name = "calculations")
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private Integer x;
    @Column(nullable = false)
    private Integer y;
    @Column(nullable = false)
    private Integer result;

    private Calculation(String type, Integer x, Integer y, Integer result) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.result = result;
    }


    public Calculation() {

    }

    public static Calculation of( String type, Integer x, Integer y, Integer result) {
        return new Calculation(type,x,y,result);
    }
    public CalculationDTO toDTO() {
        return CalculationDTO.of(type,x,y,result);
    }

    public static Calculation fromDTO(CalculationDTO dto) {
        return Calculation.of(dto.getType(), dto.getX(), dto.getY(), dto.getResult());
    }
}
