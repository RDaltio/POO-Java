public class TstPes {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Leitura l = new Leitura();
      
      p1.setCpf(Integer.parseInt(l.entDados("\ninforme o CPF: ")));
      p1.setNome(l.entDados("\ninforme o NOME: "));
      
        System.out.println("\nCPF: "+p1.getCpf());
        System.out.println("\nNOME: "+p1.getNome());
      
    }
 
}
