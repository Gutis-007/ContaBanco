import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o numero da conta:");
        int Numero = Ler.nextInt();
        System.out.println("Digite o numero Agencia: Ex(XXX-X)");
        String Agencia = Ler.next();
        System.out.println("Digite o nome do cliente:");
        String NomeCliente = Ler.next();
        System.out.println("Digite o saldo:"); 
        float Saldo = Ler.nextFloat();

        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+Numero+" e seu saldo "+ Saldo +" já está disponível para saque tenha um bom dia");
    }
}
