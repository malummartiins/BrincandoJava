public class Livro{
    private String titulo, autor;
    private int anoPublicacao, quantPaginas;
    private double preco;
    
    public Livro(String titulo, String autor, int anoPublicacao, int quantPaginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantPaginas = quantPaginas;
        this.preco = preco;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public void setQuantPaginas(int quantPaginas){
        this.quantPaginas = quantPaginas;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    
    public int getQuantPaginas(){
        return quantPaginas;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public double calcularPrecoPorPagina(){
        return preco / quantPaginas;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicação: "+anoPublicacao);
        System.out.println("Quantidade de páginas: "+quantPaginas);
        System.out.println("Preço: R$"+preco);
    }
}