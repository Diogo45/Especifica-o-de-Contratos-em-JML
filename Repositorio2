import java.util.*;
public class Repositorio{
    private /*@ spec_public nullable @*/ArrayList<Integer> moedas;
    //@invariant moedas != null;
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
    moedas.get(i) == \old(moedas.get(i)));
    ensures moedas.get(moedas.size()-1) == m;
    ensures moedas.size() == \old(moedas.size()+1);
    @*/
    public void add(int m){
        moedas.add(m);
    }

    /*@
    ensures \result == moedas.size();
    @*/
    public /*@ pure @*/ int getMoedas(){
        return moedas.size();
    }

    /*@
    ensures \result == (\sum int i; 0 <= i && i < moedas.size(); moedas.get(i));
    @*/
    public /*@ pure @*/ int getTotal(){
        int r=0;
        for(int i=0;i<getMoedas();i++){
            r += moedas.get(i);
        }
        return r;
    }

    /*@
    requires m>0;
    requires m<getTotal();
    ensures getTotal() >= \old( getTotal()-m);
    ensures (\forall int i; 0<=i && i< \result.size(); \old(moedas).contains(\result.get(i)));
    ensures (\forall int i; 0<=i && i< \old(moedas.size()); m<moedas.get(i)+(\sum int j; 0 <= j && j < \result.size(); \result.get(j)));
    ensures \old(moedas.getMoedas()) == moedas.getMoedas() + \result.size();
    ensures (\forall int i; 0<=i && i< moedas.size(); \old(moedas).contains(moedas.get(i)) && !(\result.contains(moedas.get(i))));
    ensures moedas.size() == (\old(moedas.size()) - \result.size());
    @*/
    public ArrayList<Integer> remove(int m){

        ArrayList<Integer> result=new ArrayList<Integer>();
        ArrayList<Integer> temp=new ArrayList<Integer>(moedas);
        for(int k=0;k<=moedas.size();k++){
            while(true){
                ArrayList<Integer> r=new ArrayList<Integer>();
                int a=0;
                for(int i=0;i<temp.size();i++){
                    if(a<temp.get(i)&&temp.get(i)<=m){a=temp.get(i);}
                }
                if(a==0){int cont=0;int contRes=0;
                    for(int j=0;j<r.size();j++){cont +=r.get(j);}
                    for(int j=0;j<result.size();j++){contRes +=r.get(j);}
                    if(cont>contRes)result=r;
                    break;
                }
                r.add(a);
                temp.remove((Integer)a);
                m-=a;
            }

            int maior=0;    
            for(int i =0;i<temp.size();i++){
                if(maior<temp.get(i))maior=temp.get(i);

            }   
            temp.remove(temp.indexOf(maior));
        }
        for(int i=0;i<result.size();i++){moedas.remove(moedas.indexOf(result.get(i)));}
        return result;
    }

    /*@
    ensures moedas.size() == 0;
    @*/
    public void reset(){
        moedas.clear();
    }
}
