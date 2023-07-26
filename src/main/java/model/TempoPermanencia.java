package model;

public enum TempoPermanencia {
        UMA_HORA(10.00),
        TRINTA_MINUTOS(2.00),
        MEIO_PERIODO(90.00);

        private Double valor;

        TempoPermanencia(Double valor) {

            this.valor = valor;

        }

        public Double getValor() {
            return valor;
        }

}
