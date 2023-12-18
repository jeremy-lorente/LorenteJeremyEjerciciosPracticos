package modelos;

public class Ave extends Animal {

    Double envergaduraAlas;
    String tipoVuelo;
    String colorPlumaje;
    String tipoPico;

    public Ave() {
    }

    public Ave(Double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public Double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(Double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }

}
