public class ClassNew {
    public static void main(String[] args) {
        String clienteNome = "João Silva";
        int clienteIdade = 25;
        double clienteSaldo = 3200.00;
        boolean clienteAtivo = true;

        System.out.println("+ + + BANCO DIGITAL + + +");
        System.out.printf("Nome: %s%n", clienteNome);
        System.out.printf("Saldo: %.2f€%n", clienteSaldo);
        System.out.printf("Ativo: %b%n", clienteAtivo);
    }

}
