package com.senai.relacionamentos.dtos.res;

import java.util.List;

public class BankAccountsByClientRES {
    private String name;
    private List<String> numbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }
}
