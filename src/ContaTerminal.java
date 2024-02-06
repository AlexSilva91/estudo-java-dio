import java.util.Scanner;
 
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nDigite o número da conta: ");
        numero = teclado.nextInt();
        System.out.println("\nDigite a agência da conta: ");
        agencia = teclado.next();
        System.out.println("\nDigite seu nome: ");
        nome = teclado.next();
        System.out.println("\nDigite o saldo da conta: ");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+" conta "+ numero +" e seu saldo "+ saldo+" já está disponível para saque");



    }
}
