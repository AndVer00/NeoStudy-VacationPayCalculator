package com.andver00.vacationpaycalculator.service;

import com.andver00.vacationpaycalculator.dto.RequestDto;
import com.andver00.vacationpaycalculator.tools.CustomException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    public CalculatorService(){}

    @Override
    public Double calculate(RequestDto requestDto) throws CustomException {
        if (requestDto.getSalary() == null || requestDto.getRestDaysNum() == null) {
            throw new CustomException("Incorrect input");
        }

        return (requestDto.getSalary() / 29.3) * requestDto.getRestDaysNum();
    }
}