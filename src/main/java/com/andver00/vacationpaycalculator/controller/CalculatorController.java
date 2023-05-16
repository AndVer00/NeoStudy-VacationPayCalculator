package com.andver00.vacationpaycalculator.controller;

import com.andver00.vacationpaycalculator.dto.RequestDto;
import com.andver00.vacationpaycalculator.service.ICalculatorService;
import com.andver00.vacationpaycalculator.tools.CustomException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class CalculatorController {
    private final ICalculatorService mainService;

    public CalculatorController(ICalculatorService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi!";
    }

    @GetMapping("/calculacte")
    public Double calculate(@Valid @RequestBody RequestDto requestDto) {
        try {
            return mainService.calculate(requestDto);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        return (double) 0;
    }
}