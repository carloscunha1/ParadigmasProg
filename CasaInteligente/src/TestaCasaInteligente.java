public class TestaCasaInteligente {
    public static void main(String[] args) {
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");
        Autenticavel autenticavel = fechadura;
        DispositivoLigavel dispositivoFechadura = fechadura;

        autenticavel.validarAcesso("1234");
        dispositivoFechadura.ligar();
        dispositivoFechadura.desligar();

        System.out.println();

        TermostatoSmart termostato = new TermostatoSmart();
        DispositivoLigavel dispositivoTermostato = termostato;
        SensorTemperatura sensorTemperatura = termostato;

        dispositivoTermostato.ligar();
        System.out.println("Temperatura atual: " + sensorTemperatura.lerTemperatura());
        dispositivoTermostato.desligar();
    }
}
