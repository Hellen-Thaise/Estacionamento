package model;

import java.time.LocalTime;
import java.util.List;

public class Estacionamento {

    private Integer id;
    private LocalTime horaentrada;
    private LocalTime saida;
    private Double permanenciatempo;
    private Double valorPago;
    private List<Carro> carros;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(LocalTime horaentrada) {
        this.horaentrada = horaentrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

    public Double getPermanenciatempo() {
        return permanenciatempo;
    }

    public void setPermanenciatempo(Double permanenciatempo) {
        this.permanenciatempo = permanenciatempo;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Estacionamento{" +
                "id=" + id +
                ", horário de entrada=" + horaentrada +
                ", saida=" + saida +
                ", tempo de permanencia=" + permanenciatempo +
                ", valor Pago=" + valorPago +
                ", carros=" + carros +
                '}';
    }
}
