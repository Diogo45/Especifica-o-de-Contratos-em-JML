import java.util*;
public class Repositorio{
    private /*@ spec_public nullable @*/ArrayList<Integer> moedas;
    //@invariant moedas != null 
    /*@
    ensures moedas.size() == 0;
    ensures moedas.instanceOf(ArrayList);
    @*/
    public Repositorio(){
        moedas = new ArrayList<Integer>();
    }
    /*@
    requires m == 100 || m == 50 || m == 25 || m == 10 || m == 5 || m == 1;
    ensures (\forall int i;
                0<=i && i<moedas.size()-1;
                moedas.get(i) == \old moedas.get(i));
    ensures moedas.get(moedas.size()-1) == m;
    ensures moedas.size() == \old moedas.size()+1;
    @*/
    public boolean add(int m){
    
    }
    /*@
    ensures \result == moedas.size();
    @*/
    public /*@ pure @*/ int getMoedas(){
    
    }
    /*@
    ensures \result == (\sum int i; 0 <= i && i < moedas.size(); moedas.get(i));
    @*/
    public /*@ pure @*/ int getTotal(){
    
    }
    /*@
    
    @*/
    public int remove(int m){
    
    }
    /*@
    ensures moedas.size() == 0;
    @*/
    public void reset(){
    
    }
}
