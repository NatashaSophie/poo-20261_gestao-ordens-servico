package model;

import exception.BusinessException;

// DiagnosticService: especializacao de ServiceItem com valor fixo.
// Polimorfismo: a chamada calculateValue() usa a versao desta classe.
public class DiagnosticService extends ServiceItem {
    private double fixedValue;

    public DiagnosticService(String description, double fixedValue) {
        super(description);
        setFixedValue(fixedValue);
    }

    public double getFixedValue() {
        return fixedValue;
    }

    public void setFixedValue(double fixedValue) {
        if (fixedValue < 0) {
            throw new BusinessException("Valor do diagnostico nao pode ser negativo.");
        }
        this.fixedValue = fixedValue;
    }

    @Override
    public double calculateValue() {
        return fixedValue;
    }
}
