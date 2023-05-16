package com.andver00.vacationpaycalculator.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    private Long salary;
    private Long restDaysNum;
}
