# Terminal Simulado em Java

## 📌 Descrição
Este projeto é um **terminal de linha de comando** simulado, desenvolvido em **Java**, que suporta comandos semelhantes aos de um terminal Linux. Ele permite navegar entre diretórios, criar arquivos e diretórios, manipular arquivos e manter um histórico de comandos.

## 📂 Funcionalidades
- **Navegação entre diretórios** (`cd`, `pwd`, `ls`)
- **Manipulação de arquivos e diretórios** (`mkdir`, `touch`, `rm`, `cat`, `echo`)
- **Histórico de comandos** (`history`)
- **Ajuda com lista de comandos** (`help`)
- **Encerramento do terminal** (`exit`)

## 📖 Uso dos Comandos
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

## 🏗 Estrutura do Projeto
```
Terminal/
│── src/terminal
│   ├── Terminal.java
│   ├── SystemInfo.java
│   ├── CommandHandler.java
│   ├── commands/
│   │   ├── Command.java
│   │   ├── PwdCommand.java
│   │   ├── LsCommand.java
│   │   ├── CdCommand.java
│   │   ├── MkdirCommand.java
│   │   ├── TouchCommand.java
│   │   ├── RmCommand.java
│   │   ├── CatCommand.java
│   │   ├── EchoCommand.java
│   │   ├── HistoryCommand.java
│   │   ├── HelpCommand.java
│   │   ├── ExitCommand.java
│   ├── managers/
│   │   ├── FileManager.java
│   │   ├── DirectoryManager.java
│   │   ├── HistoryManager.java
```

## 🎨 Interface do Terminal
O terminal exibe o prompt no formato:
```
usuario@computador:~/diretorioatual$
```
Exemplo de uso:
```
usuario@pc:~/user$ mkdir projetos
usuario@pc:~/user$ cd projetos
usuario@pc:~/projetos$ touch arquivo.txt
usuario@pc:~/projetos$ echo Hello World > arquivo.txt
usuario@pc:~/projetos$ cat arquivo.txt
Hello World
usuario@pc:~/projetos$ exit
Encerrando terminal...
```

## 🛠 Tecnologias Utilizadas
- **Java 11+**
- **POO (Programação Orientada a Objetos)**
- **Manipulação de Arquivos**
- **ANSI Escape Codes** (para cores no terminal)

## 📜 Licença
Este projeto é de uso livre e pode ser modificado conforme necessário.
