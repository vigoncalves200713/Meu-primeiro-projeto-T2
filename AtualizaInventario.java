import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class AtualizaInventario {

    public static void main(String[] args) {

        // Desafio 4: data em que o relatório está sendo gerado (aaaa-mm-dd)
        String dataAuditoria = LocalDate.now().toString();

        // Desafio 2: contadores de sistemas operacionais
        int totalWindows = 0;
        int totalLinux = 0;
        int totalMac = 0;

        // try-with-resources fecha os 3 arquivos sozinho, mesmo se der erro
        try (BufferedReader leitor = new BufferedReader(new FileReader("hosts.csv"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("inventario_atualizado.csv"));
             BufferedWriter escritorCriticos = new BufferedWriter(new FileWriter("hosts_criticos.csv"))) {

            // Cabeçalho original + novas colunas (Desafios 1, 4 e 5)
            String linha = leitor.readLine();
            String novoCabecalho = linha + ",criticidade,status,data_auditoria,risco";

            escritor.write(novoCabecalho);
            escritor.newLine();

            // Desafio 3: o arquivo de críticos também começa com o cabeçalho
            escritorCriticos.write(novoCabecalho);
            escritorCriticos.newLine();

            while ((linha = leitor.readLine()) != null) {

                if (linha.trim().isEmpty()) {
                    continue; // ignora linhas em branco
                }

                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                // Classificação de criticidade (igual ao slide)
                // + Desafio 5: risco de 1 a 10 conforme a criticidade
                String criticidade;
                int risco;

                if (so.contains("Kali")) {
                    criticidade = "Alta";
                    risco = 9;
                } else if (so.contains("Ubuntu") || so.contains("Debian") || so.contains("Rocky")) {
                    criticidade = "Baixa";
                    risco = 2;
                } else {
                    criticidade = "Media";
                    risco = 5;
                }

                // Desafio 1 + Desafio 2: status e contagem por família de SO
                String status;

                if (so.contains("Windows")) {
                    status = "Online";
                    totalWindows++;
                } else if (so.contains("mac")) {
                    status = "Nao classificado";
                    totalMac++;
                } else {
                    // Kali, Ubuntu, Debian, Rocky... são todos Linux
                    status = "Em Monitoramento";
                    totalLinux++;
                }

                String registro = host + "," + ip + "," + so + ","
                        + criticidade + "," + status + ","
                        + dataAuditoria + "," + risco;

                escritor.write(registro);
                escritor.newLine();

                // Desafio 3: só criticidade Alta vai para o segundo arquivo
                if (criticidade.equals("Alta")) {
                    escritorCriticos.write(registro);
                    escritorCriticos.newLine();
                }
            }

            System.out.println("Relatorio gerado com sucesso!");
            System.out.println("Windows: " + totalWindows);
            System.out.println("Linux: " + totalLinux);
            System.out.println("macOS: " + totalMac);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
