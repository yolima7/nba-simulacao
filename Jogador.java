package mynba;

public class Jogador {
    private String nome;
    private int idade;
    private float altura;
    private int overall = 30;
    private String posicao;
    private String college;

        public Jogador(String nome, int idade, float altura, String posicao, String college) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.posicao = posicao;
            this.college = college;

        }
        public void mostrarDados() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Altura: " + this.altura);
            System.out.println("Posição: " + this.posicao);
            System.out.println("College: " + this.college);
            System.out.println("Overall: " + this.overall);
        }
        public void treinar(){
           if(overall == 99){
               System.out.println("Seu jogador já atingiu o Overall máximo!");
               return;
           } else if (overall==98) {
               overall+=1;
               System.out.println("Parabéns, +1 ponto pro seu overall! Agora o seu overall está em: "+overall);
           }else{
               overall+=2;
               System.out.println("Parabéns, +2 pontos pro seu overall! Agora o seu overall está em: "+overall);
            }


        }
    }

