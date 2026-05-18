package CanalNotificacao;

public class Whatsapp extends CanalNotificacao{
    private String statusLeitura;

    @Override
    public String toString() {
        return "Whatsapp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }

    @Override
    public void enviar(){
        System.out.println("Enviando whatsapp para: " + this.destinatario + " Mensagem: " + this.mensagem + " " + this.statusLeitura);
    }

    public Whatsapp() {
        super();
    }

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }
}
