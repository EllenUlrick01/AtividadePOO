public class Produto {

    String Nome;
    String marca;
    float Valor;

    String modelo;
    Produto(){

    }
   Produto(String nome, String marca, float valor, String modelo){
        this.Nome=nome;
        this.marca=marca;
        this.Valor=valor;
        this.modelo=modelo;

}
    public static void main(String[] args){
        Produto p1 = new Produto("Computador","Del",5.450f,"xw1435" );

}


}