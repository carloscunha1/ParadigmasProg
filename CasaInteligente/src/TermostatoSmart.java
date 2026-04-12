public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado;
    private double temperaturaAmbiente;

    public TermostatoSmart() {
        this.ligado = false;
        this.temperaturaAmbiente = 22.0;
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Termostato ligado");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Termostato desligado");
    }

    @Override
    public double lerTemperatura() {
        double variacao = (Math.random() * 4.0) - 2.0;
        this.temperaturaAmbiente = 22.0 + variacao;

        if (this.ligado) {
            System.out.println("Temperatura do ambiente lida com sucesso");
        } else {
            System.out.println("Termostato desligado, leitura feita em modo de espera");
        }

        return this.temperaturaAmbiente;
    }
}
