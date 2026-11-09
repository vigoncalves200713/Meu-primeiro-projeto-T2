# LOPAL em Java - Dia 30: Escrita de Arquivos (BufferedWriter)

Resolução dos 5 desafios em `AtualizaInventario.java`.

| Desafio | O que faz |
|---|---|
| 1 | Coluna `status`: Windows = Online, Linux = Em Monitoramento (macOS = Nao classificado) |
| 2 | Conta e imprime quantos hosts são Windows, Linux e macOS |
| 3 | Gera `hosts_criticos.csv` só com criticidade Alta |
| 4 | Coluna `data_auditoria` com a data de geração |
| 5 | Coluna `risco` (Alta = 9, Media = 5, Baixa = 2) |

## Como rodar
```
javac AtualizaInventario.java
java AtualizaInventario
```
Arquivos gerados: `inventario_atualizado.csv` e `hosts_criticos.csv`.
