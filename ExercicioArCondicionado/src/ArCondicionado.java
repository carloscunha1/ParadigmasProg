public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){
        this.marca = "Indefinido";
        this.modelo = "Indefinido";
        this.temperatura = 0;
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }

    public void setMarca(String marca) {
        if(marca.length() > 3){
            this.marca = marca;
        }
        else {
            System.out.println("Nome da marca inválido");
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura < 16 || temperatura > 30) {
            System.out.println("Temperatura fora da faixa");
        } else {
            this.temperatura = temperatura;
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligarModoTurbo(){
        if (verificarCompressor()) {
            this.setTemperatura(16);
            System.out.println("Modo turbo ligado!");
        }
        else {
            System.out.println("Impossível ativar modo turbo, compressor com problemas");
        }
    }

    private boolean verificarCompressor(){
        int randomico = (int) (Math.random() * 10); // gera número entre 0 e 9
        System.out.println("Número sorteado: " + randomico);
        return randomico > 2;
    }

    public String toString(){
        return "Marca: " + this.marca +
               " Modelo " + this.modelo +
               " Volume: " + this.temperatura +
               " Ligado: " + this.ligado;
    }
}