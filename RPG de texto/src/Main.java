import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean rodar = true;

        //rodar o programa
        while (rodar) {
            System.out.println("""
                    Bem vindo ao RPG de texto!
                    
                    Escolha a opção que deseja:
                    [ 1 ] - Cadastrar
                    [ 2 ] - Entrar
                    [ 3 ] - Sair
                    """);
            int opcaoEntrada = teclado.nextInt();

            //opções do menu
            switch (opcaoEntrada){
                case 1:
                    Personagem personagem = new Personagem();

                    System.out.print("Digite o nome do seu personagem: ");
                    personagem.nome = teclado.next();
                    break;
                case 2:
                    System.out.println("Opção atualmente indisponivel");
                    break;
                case 3:
                    System.out.println("Você saiu!");
                    rodar = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }

            System.out.println("""
                    Escolha a opção que deseja:
                    
                    [ 1 ] - Mostrar status
                    [ 2 ] - Aventurar
                    """);
            int opcaoAcao = teclado.nextInt();
        }
    }
}
