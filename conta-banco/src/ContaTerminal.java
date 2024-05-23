public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobreNome = args[1];
        int numero = Integer.valueOf(args[2]);
        String agencia = args [3];
        double saldo = 237.48;

        System.out.println("Olá" +" " + nome + " " + sobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo" + saldo + " já está dosponível para saque.");
        
        
        //TODO: conhecer e importar a classe scanner

        // exibir as mensagens para nosso usuário

        //obter pela classe scanner os valores digitados no terminal
        // exibir a mensagem final da conta criada.
    }
}
