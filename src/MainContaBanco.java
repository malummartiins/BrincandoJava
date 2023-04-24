public class MainContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Malú");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(5678);
        p2.setDono("Murilo");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p1.estadoAtual();
        p2.estadoAtual();
        
    }
}
