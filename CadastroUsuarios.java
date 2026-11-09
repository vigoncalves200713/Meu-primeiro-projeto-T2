import java.util.Scanner;

public class CadastroUsuarios {

    static final int MAX_USUARIOS = 50;
    static final int COLUNAS = 3; // 0 = nome, 1 = idade, 2 = email

    static String[][] usuarios = new String[MAX_USUARIOS][COLUNAS];
    static int total = 0;
    static Scanner entrada = new Scanner(System.in);

    // ---------- Menu ----------
    public static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE CADASTRO =====");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Consultar usuários");
        System.out.println("3 - Atualizar usuário");
        System.out.println("4 - Deletar usuário");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // ---------- Funções reutilizáveis ----------
    public static int lerInteiro() {
        while (true) {
            String texto = entrada.nextLine().trim();
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Digite um número: ");
            }
        }
    }

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine().trim();
    }

    // Pede um número de usuário (1 a total) e devolve o índice na matriz, ou -1 se inválido
    public static int escolherUsuario(String acao) {
        if (total == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return -1;
        }
        consultarUsuarios();
        System.out.print("Digite o número do usuário que deseja " + acao + ": ");
        int numero = lerInteiro();
        if (numero < 1 || numero > total) {
            System.out.println("Número inválido.");
            return -1;
        }
        return numero - 1;
    }

    // ---------- Opções do menu ----------
    public static void cadastrarUsuario() {
        if (total >= MAX_USUARIOS) {
            System.out.println("Limite de usuários atingido.");
            return;
        }
        usuarios[total][0] = lerTexto("Nome: ");
        usuarios[total][1] = lerTexto("Idade: ");
        usuarios[total][2] = lerTexto("Email: ");
        total++;
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void consultarUsuarios() {
        if (total == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        System.out.println();
        System.out.printf("%-4s | %-20s | %-5s | %-25s%n", "Nº", "Nome", "Idade", "Email");
        System.out.println("-----+----------------------+-------+--------------------------");
        for (int i = 0; i < total; i++) {
            System.out.printf("%-4d | %-20s | %-5s | %-25s%n",
                    i + 1, usuarios[i][0], usuarios[i][1], usuarios[i][2]);
        }
    }

    public static void atualizarUsuario() {
        int i = escolherUsuario("atualizar");
        if (i == -1) {
            return;
        }
        System.out.println("(Deixe em branco para manter o valor atual)");
        String nome = lerTexto("Novo nome [" + usuarios[i][0] + "]: ");
        String idade = lerTexto("Nova idade [" + usuarios[i][1] + "]: ");
        String email = lerTexto("Novo email [" + usuarios[i][2] + "]: ");

        if (!nome.isEmpty()) usuarios[i][0] = nome;
        if (!idade.isEmpty()) usuarios[i][1] = idade;
        if (!email.isEmpty()) usuarios[i][2] = email;
        System.out.println("Usuário atualizado com sucesso!");
    }

    public static void deletarUsuario() {
        int i = escolherUsuario("deletar");
        if (i == -1) {
            return;
        }
        // Puxa os usuários seguintes uma posição para cima
        for (int j = i; j < total - 1; j++) {
            usuarios[j] = usuarios[j + 1];
        }
        usuarios[total - 1] = new String[COLUNAS];
        total--;
        System.out.println("Usuário removido com sucesso!");
    }

    // ---------- Programa principal ----------
    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro();
            switch (opcao) {
                case 1: cadastrarUsuario(); break;
                case 2: consultarUsuarios(); break;
                case 3: atualizarUsuario(); break;
                case 4: deletarUsuario(); break;
                case 0: System.out.println("Encerrando o sistema. Até logo!"); break;
                default: System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
