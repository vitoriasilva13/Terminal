# Terminal Linux em Java

Este projeto é um simulador de terminal Linux, desenvolvido em Java, que permite a execução de comandos básicos como `pwd`, `ls`, `cd`, `mkdir`, `touch`, `rm`, `cat`, `echo`, `history`, `help` e `exit`.

## Desenvolvedores

- [:octocat: Ana Luiza](https://github.com/nalusantana)
- [:octocat: Vitória Silva](https://github.com/vitoriasilva13)

## Instruções de Uso

1. Execute o programa pelo arquivo principal `Terminal.java`.
2. Escreva um dos comandos que estejam na lista na seção abaixo (Comandos) no terminal e pressione Enter.
3. Repita o passo 2 o quanto desejar.
4. Para sair do terminal, use o comando `exit`.

## Comandos
| Comando                 | Descrição |
|-------------------------|-------------|
| `pwd`                  | Exibe o diretório atual |
| `ls`                   | Lista os arquivos do diretório atual |
| `cd <diretório>`       | Acessa um diretório |
| `cd ..`                | Volta um nível no diretório |
| `mkdir <nome>`         | Cria um novo diretório |
| `touch <arquivo>`      | Cria um arquivo vazio |
| `rm <arquivo/diretório>` | Remove um arquivo ou diretório |
| `cat <arquivo>`        | Exibe o conteúdo de um arquivo |
| `echo <texto> > <arquivo>` | Escreve texto em um arquivo |
| `history`              | Exibe o histórico de comandos |
| `history clear`         | Limpa o histórico de comandos |
| `help`                 | Mostra a lista de comandos disponíveis |
| `exit`                 | Encerra o terminal |

## Exemplos de Uso

### Criando e navegando entre diretórios
```sh
u@p:~/diretorioatual$ mkdir projetos
u@p:~/diretorioatual$ cd projetos
u@p:~/projetos$ pwd
# C:/Users/user/diretorioatual/projetos
```

### Criando e manipulando arquivos
```sh
u@p:~/diretorioatual$ touch arquivo.txt
u@p:~/diretorioatual$ echo Hello World > arquivo.txt
u@p:~/diretorioatual$ cat arquivo.txt
# Hello World
```

### Excluindo arquivos e diretórios
```sh
u@p:~/projetos$ rm arquivo.txt
u@p:~/projetos$ cd ..
u@p:~/diretorioatual$ rm projetos
```

### Exibindo e limpando o histórico
```sh
u@p:~/diretorioatual$ history
# Apresenta todo conteúdo em history.txt
u@p:~/diretorioatual$ history clear
```

### Saindo do terminal
```sh
u@p:~/diretorioatual$ exit
```
