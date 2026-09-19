public class ClassNew {
    public static void main(String[] args) {
        String clienteNome = "João Silva";
        String novocliente = "Maria Santos";
        int clienteIdade = 25;
        int novoclidade = 278;
        double clienteSaldo = 3200.00;
        double novoclisaldo = 200.00;
        boolean clienteAtivo = true;
        boolean novocliativo = true;

        System.out.println("+ + + BANCO DIGITAL + + +");
        System.out.printf("Nome: %s%n", clienteNome);
        System.out.printf("Saldo: %.2f€%n", clienteSaldo);
        System.out.printf("Ativo: %b%n", clienteAtivo);

        System.out.println("Outros clientes");
        System.out.printf("Nome: %s%n", novocliente);
        System.out.println("Idade: "+ novoclidade);
        System.out.printf("Saldo: %.2f€%n", novoclisaldo);
        System.out.printf("Ativo: %b&n", novocliativo);
    }

}
