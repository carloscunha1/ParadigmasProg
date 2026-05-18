package CanalNotificacao;

public class Sms extends CanalNotificacao{
    private int numTelefone;

    public Sms(){
        super();
    }

    public Sms(String destinatario, String mensagem, int numTelefone) {
        super(destinatario, mensagem);
        this.numTelefone = numTelefone;
    }

    @Override
    public String toString() {
        return "Sms{" +
                super.toString() +
                "numTelefone=" + numTelefone +
                '}';
    }

    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número: " + this.numTelefone + " : " + this.mensagem);
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }
}
