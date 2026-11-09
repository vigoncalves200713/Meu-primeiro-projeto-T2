<<<<<<< HEAD
# LOPAL em Java - Funções (Aula 08)

## Exercícios 1 a 10 - `Exercicios.java`
| Nº | Função | O que faz |
|---|---|---|
| 1 | `imprimirSaudacao()` | Imprime "Bem-vindo ao sistema!" |
| 2 | `somar(a, b)` | Retorna a soma de dois inteiros |
| 3 | `dobrar(n)` | Retorna o dobro |
| 4 | `converterCelsiusParaFahrenheit(c)` | F = C * 1.8 + 32 |
| 5 | `calcularMedia(n1, n2, n3)` | Média de três notas |
| 6 | `verificarPar(n)` | true se par, false se ímpar |
| 7 | `maiorNumero(a, b, c)` | Maior de três números |
| 8 | `calcularFatorial(n)` | Fatorial de n |
| 9 | `calcularPotencia(base, exp)` | base elevada ao expoente |
| 10 | `calcularIMC(peso, altura)` | peso / (altura * altura) |

## Desafio - `CadastroUsuarios.java`
Sistema de cadastro com menu (matriz de usuários) e uma função para cada opção:
cadastrar, consultar (tabela com cabeçalho), atualizar e deletar.

## Como rodar
```
javac -encoding UTF-8 Exercicios.java CadastroUsuarios.java
java Exercicios
java CadastroUsuarios
```
=======
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
>>>>>>> fbd2b23e3bac8dc2bed38e921e29378fec11193b
