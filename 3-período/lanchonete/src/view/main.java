package view;
import  model.*;
public class main {

public static void main(String[] args) {
    
    caixa cx = new caixa("pix", 5 , 3.22);
    produto pro= new produto("coxinha", 1, 3.99, 2.00);
    estoque es = new estoque("coxinha","2,00" , 15);
    cliente cl= new cliente("roberta", (float) 3.99, "21/02/2023","coxinha");
    System.out.println(cx);
    System.out.println(pro);
    System.out.println(es);
    System.out.println(cl);
}
}
