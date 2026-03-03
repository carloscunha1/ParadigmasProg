public class TestaSmartTv {
    public static void main(String[] args) {

        // Teste 1: Objeto vazio (Construtor padrão)
        SmartTv obj1 = new SmartTv();
        System.out.println("TV 1: " + obj1.toString());

        // Teste 2: Objeto com parâmetros (Construtor corrigido)
        SmartTv obj2 = new SmartTv("Samsung", "4K Crystal", 10);
        System.out.println("TV 2: " + obj2.toString());

        // Teste 3: Testando limites de volume
        System.out.println("\n--- Testando Volumes ---");
        obj2.setVolume(150); // Deve dar erro
        obj2.aumentaVolume(20); // 10 + 20 = 30
        System.out.println("Volume após aumento: " + obj2.getVolume());
        obj2.diminuiVolume(10); // 10 + 20 = 30
        System.out.println("Volume após redução: " + obj2.getVolume());

        // Teste 4: Testando validação de marca (Letra minúscula)
        System.out.println("\n--- Testando Marca Inválida ---");
        SmartTv obj3 = new SmartTv("lg", "OLED B3", 15); // 'l' minúsculo
        System.out.println("Resultado TV 3: " + obj3.toString());

        // Teste 5: Internet e YouTube
        System.out.println("\n--- Tentando acessar YouTube ---");
        obj2.entrarYouTube();
    }
}