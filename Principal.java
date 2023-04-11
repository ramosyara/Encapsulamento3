public class Principal {

    public static void main (String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(500);
        conta.setTitular("Yara Fernanda Ramos");
        conta.setSaldo(500);

        System.out.println("saldo atual: " +conta.getSaldo());

        conta.setDepositaValor(500);

        System.out.println("saldo atual: " +conta.getSaldo());


        conta.sacaValor(200);
        System.out.println("saldo atual: " +conta.getSaldo());

    }
    
}
