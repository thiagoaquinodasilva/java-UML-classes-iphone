package pacotes.phone;

import pacotes.ordenacao.AparelhoTelefonico;
import pacotes.ordenacao.NavegadorInternet;
import pacotes.ordenacao.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
   // atributos da classe Iphone
   private ReprodutorMusical reprodutorMusical;
   private AparelhoTelefonico aparelhoTelefonico;
   private NavegadorInternet navegadorInternet;
   
   // construtor da classe
   public Iphone() {
    // inicializa os atributos com objetos das interfaces
        this.reprodutorMusical = new ReprodutorMusical() {
            // implementa os métodos da interface ReprodutorMisical
            public String tocar() {
                return "Tocando";
            }
            public String pausar() {
                return "Pausado";
            }
            public String selecionarMusica() {
                return "Música selecionada";
            }
        };

        this.aparelhoTelefonico = new AparelhoTelefonico() {
            // implementa os métodos da interface AparelhoTelefonico
            public String ligar() {
                return "Ligando";
            }
            public String atender() {
                return "Atendido";
            }
            public String iniciarCorreioVoz() {
                return "Correio de voz iniciado";
            }
        };

        this.navegadorInternet = new NavegadorInternet() {
            // implementa os métodos da interface NavegadorInternet
            public String exibirPagina() {
                return "Página exibida";
            }
            public String adicionarNovaAba() {
                return "Nova aba adicionada";
            }
            public String atualizarPagina() {
                return "Página atualizada";
            }
        };
    // fim do construtor da classe
   }

// métodos da classe

   public String tocar() {
    // chama o método tocar() da interface ReprodutorMusical usando o atributo reprodutorMusical
    return this.reprodutorMusical.tocar();
   }
   public String pausar() {
    // chama o método pausar() da interface ReprodutorMusical usando o atributo reprodutorMusical
    return this.reprodutorMusical.pausar();
   }
      public String selecionarMusica() {
        // chama o método selecionarMusica() da interface ReprodutorMusical usando o atributo reprodutorMusical
    return this.reprodutorMusical.selecionarMusica();
   }

   public String ligar() {
    // chama o método ligar() da interface AparelhoTelefonico usando o atributo aparelhoTelefonico
    return this.aparelhoTelefonico.ligar();
   }
   public String atender() {
    // chama o método atender() da interface AparelhoTelefonico usando o atributo aparelhoTelefonico
    return this.aparelhoTelefonico.atender();
   }
   public String iniciarCorreioVoz() {
    // chama o método iniciarCorreioVoz() da interface AparelhoTelefonico usando o atributo aparelhoTelefonico
    return this.aparelhoTelefonico.iniciarCorreioVoz();
   }

   public String exibirPagina() {
    // chama o método exibirPagina() da interface NavegadorInternet usando o atributo navegadorInternet
    return this.navegadorInternet.exibirPagina();
   }
   public String adicionarNovaAba() {
    // chama o método adicionarNovaAba() da interface NavegadorInternet usando o atributo navegadorInternet
    return this.navegadorInternet.adicionarNovaAba();
   }
   public String atualizarPagina() {
    // chama o método atializarPagina() da interface NavegadorInternet usando o atributo navegadorInternet
    return this.navegadorInternet.atualizarPagina();
   }

// fim da classe Iphone
}
