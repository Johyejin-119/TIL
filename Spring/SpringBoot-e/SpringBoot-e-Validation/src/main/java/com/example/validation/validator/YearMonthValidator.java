package com.example.validation.validator;

import com.example.validation.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        // 초기화했을 때 패턴 값 = 어노테이션의 패턴 값
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 패턴에 값이 잘 들어갔는 지 value 값으로 확인
        // yyyyMM01
        try {
            LocalDate localDate = LocalDate.parse(value + "01", DateTimeFormatter.ofPattern(this.pattern));

        } catch (Exception e) {
            return false; // 파싱이 안되면, false
        }
        return true; // 파싱이 잘되면, true
    }
}
