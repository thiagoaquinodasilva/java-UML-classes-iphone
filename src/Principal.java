import pacotes.phone.Iphone;


public class Principal {
    public static void main(String[] args) {
        // cria um objeto da classe Iphone
        Iphone iphone = new Iphone();

        // chama os métodos da classe Iphone
        System.out.println(iphone.tocar());
        System.out.println(iphone.pausar());
        System.out.println(iphone.selecionarMusica());
        System.out.println(iphone.ligar());
        System.out.println(iphone.atender());
        System.out.println(iphone.iniciarCorreioVoz());
        System.out.println(iphone.exibirPagina());
        System.out.println(iphone.adicionarNovaAba());
        System.out.println(iphone.atualizarPagina());
    }
}
