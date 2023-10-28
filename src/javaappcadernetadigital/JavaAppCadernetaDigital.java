package javaappcadernetadigital;

import java.time.Instant;
import java.util.Date;
import javaappcadernetadigital.entities.Cliente;
import javaappcadernetadigital.entities.Produto;
import javaappcadernetadigital.entities.Venda;
import javaappcadernetadigital.enums.Categoria;
import javaappcadernetadigital.enums.Status;
import javaappcadernetadigital.enums.TipoCliente;

public class JavaAppCadernetaDigital {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(1L, "Marcos", "123.456.789-78", "(67) 99999-8888", 
                "marcos@gmail.com", TipoCliente.PROFESSOR);
        
        Produto p1 = new Produto(1L, "Café", Categoria.BEBIDA, 1.00);
        Produto p2 = new Produto(2L, "Coxinha", Categoria.LANCHE, 5.00);
        Venda v1 = new Venda(1L, Date.from(Instant.now()) , Status.PAGA, c1);
        
        System.out.println("===============================");
        System.out.println("=========== VENDA =============");
        System.out.println("Data---------: "+v1.getData());  
        System.out.println("Pagamento----: "+v1.getStatus());
        System.out.println("Cliente------: "+v1.getCliente().getNome());  
    }
    
}
