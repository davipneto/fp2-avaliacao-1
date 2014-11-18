
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao1 {

    public static void main(String[] args) {
        Complexo a,b,c;
        Complexo[] raizes;
        a = new Complexo(1,0);
        b = new Complexo(5,0);
        c = new Complexo(4,0);
        raizes=raizesEquacao(a,b,c);
        
        System.out.println("x1=" + raizes[0].toString());
        System.out.println("x2=" + raizes[1].toString());
       
        b = new Complexo(2,0);
        c = new Complexo(5,0);
        raizes=raizesEquacao(a,b,c);
        
        System.out.println("y1=" + raizes[0].toString());
        System.out.println("y2=" + raizes[1].toString());
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo raizes[] = new Complexo [2];
        Complexo delta, raiz1, raiz2;
        delta = (b.prod(b)).sub(((a.prod(c)).prod(4)));
        raiz1 = ((b.prod(-1)).soma(delta.sqrt()[0])).div(a.prod(2));
        raiz2 = ((b.prod(-1)).soma(delta.sqrt()[1])).div(a.prod(2));
        raizes[0]=raiz1;
        raizes[1]=raiz2;
        return raizes;
    }
    
}
