package terminal.commands;

public class HelpCommand implements Command {

	@Override
	public boolean execute(Object object) {
		System.out.println("Comandos disponíveis:");
        System.out.println("pwd                    - Exibe o diretório atual.");
        System.out.println("ls                     - Lista arquivos e diretórios do diretório atual.");
        System.out.println("cd <dir>               - Navega para um diretório específico.");
        System.out.println("mkdir <nome>           - Cria um novo diretório.");
        System.out.println("touch <arquivo>        - Cria um novo arquivo vazio.");
        System.out.println("rm <arquivo>           - Remove um arquivo ou diretório.");
        System.out.println("cat <arquivo>          - Exibe o conteúdo de um arquivo.");
        System.out.println("echo <txt> > <arquivo> - Escreve texto em um arquivo.");
        System.out.println("history                - Mostra o histórico de comandos digitados.");
        System.out.println("help                   - Exibe esta mensagem de ajuda.");
        System.out.println("exit                   - Encerra o terminal.");
        return true;
	}
}
