package com.andver00.vacationpaycalculator.controller;

import com.andver00.vacationpaycalculator.dto.RequestDto;
import com.andver00.vacationpaycalculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {
    @InjectMocks
    CalculatorController underTest;

    @Mock
    CalculatorService calculatorService;

    @Test
    public void calcTest() throws Exception {
        Long salaryTest = 1000L;
        Long restDaysNumTest = 10L;
        var expectedAnswer = (salaryTest / 29.3) * restDaysNumTest;

        RequestDto newRequest = new RequestDto(salaryTest, restDaysNumTest);
        Mockito.when(calculatorService.calculate(newRequest)).thenReturn(expectedAnswer);
        var answer = underTest.calculate(newRequest);

        assertEquals(answer, expectedAnswer);
    }
}
