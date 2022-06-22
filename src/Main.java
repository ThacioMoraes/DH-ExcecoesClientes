public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", "Silva", "123456-0", 500);

        try{
            cliente.comprar(100);
        } catch(ClientException exception){
            System.err.println(exception.getMessage());
        }

        try {
            cliente.pagarDivida(600);
        } catch(ClientException exception){
            System.err.println(exception.getMessage());
        }
    }
}
