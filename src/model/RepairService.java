package model;

import exception.BusinessException;

// RepairService: especializacao de ServiceItem com calculo por horas.
// Mesmo metodo calculateValue(), mas comportamento diferente do diagnostico.
public class RepairService extends ServiceItem {
    private double hours;
    private double hourlyRate;

    public RepairService(String description, double hours, double hourlyRate) {
        super(description);
        setHours(hours);
        setHourlyRate(hourlyRate);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours <= 0) {
            throw new BusinessException("Horas devem ser maiores que zero.");
        }
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new BusinessException("Valor da hora nao pode ser negativo.");
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateValue() {
        return hours * hourlyRate;
    }
}
