public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    // Construtor Completo
    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.codigo = codigo;
        this.altura = altura;
        this.setBateria(bateria); // Usa o setter para validar os 0-100%
        this.emVoo = emVoo;
    }

    public void setAltura(float altura){
        if (altura > 0 && altura < 120) {
            this.altura = altura;
        }
        else {
            System.out.println("Altura deve ser entre 0 e 120");
        }
    }

    public void setBateria(int valor) {
        int resultado = this.bateria + valor;
        if (resultado >= 0 && resultado <= 100) {
            this.bateria = resultado;
        } else {
            System.out.println("Erro: Carga de bateria fora dos limites!");
        }
    }

    public void decolar(){
        if(testarMotores() && this.bateria > 20){
            this.emVoo = true;
            this.altura = 2;
        }
    }

    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10); // gera número entre 0 e 9
        System.out.println("Número sorteado: " + randomico);
        return randomico < 8;
    }

    public void subir(float metros) {
        this.setAltura(this.altura + metros);
    }

    public void descer(float metros) {
        this.setAltura(this.altura - metros);
    }

    public String toString() {
        return "Drone [Código=" + codigo + ", Altura=" + altura +
                "m, Bateria=" + bateria + "%, Em Voo=" + emVoo + "]";
    }
}