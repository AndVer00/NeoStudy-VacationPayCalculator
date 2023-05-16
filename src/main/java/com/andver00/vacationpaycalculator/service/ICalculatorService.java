package com.andver00.vacationpaycalculator.service;

import com.andver00.vacationpaycalculator.dto.RequestDto;
import com.andver00.vacationpaycalculator.tools.CustomException;

public interface ICalculatorService {
    Double calculate(RequestDto requestDto) throws CustomException;
}
