package model;

public class Carro {
    private Integer id;
    private String nomeDono;
    private String marcaCarro;

    private String placa;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", proprietário='" + nomeDono + '\'' +
                ", marca do veículo='" + marcaCarro + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
