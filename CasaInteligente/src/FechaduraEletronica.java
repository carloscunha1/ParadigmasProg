public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private String senhaCorreta;
    private boolean acessoLiberado;
    private boolean destrancada;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.acessoLiberado = false;
        this.destrancada = false;
    }

    @Override
    public void validarAcesso(String senha) {
        if (this.senhaCorreta.equals(senha)) {
            this.acessoLiberado = true;
            System.out.println("Acesso validado com sucesso");
        } else {
            this.acessoLiberado = false;
            System.out.println("Senha incorreta. Acesso negado");
        }
    }

    @Override
    public void ligar() {
        if (this.acessoLiberado) {
            this.destrancada = true;
            System.out.println("Fechadura destrancada");
        } else {
            System.out.println("Valide o acesso antes de destrancar");
        }
    }

    @Override
    public void desligar() {
        this.destrancada = false;
        this.acessoLiberado = false;
        System.out.println("Fechadura travada");
    }

    public boolean isDestrancada() {
        return this.destrancada;
    }
}
