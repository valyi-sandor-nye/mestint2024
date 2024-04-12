package csuszkaguigrid;
import java.util.HashSet;
import java.util.Set;
import search.AbstractState;
import search.State;
import java.lang.Math;

import static java.lang.Math.abs;

public class CsuszkaAllapot extends AbstractState
{
    int[][] tabla = {{1,2,5},{7,0,4},{3,6,8}};
    static int N = 3;
    
    public CsuszkaAllapot(){super();}
    public CsuszkaAllapot(CsuszkaAllapot cs)
    {
        super(cs);
    }
    public CsuszkaAllapot(int t[][])
    {
        super();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                tabla[i][j]=t[i][j];
    }
    @Override
    public Iterable<State> getPossibleMoves()
    {
       Set<State> moves = new HashSet<State>(); 
       int nullasora = 0, nullaoszlopa = 0;
       for (int sor = 0; sor<N; sor++)
           for (int oszlop=0; oszlop<N; oszlop++)
               if (tabla[sor][oszlop]==0) {nullasora=sor; nullaoszlopa=oszlop;}
       if (nullasora>0)
       { //felfelé tolás
           CsuszkaAllapot ujAllapot = new CsuszkaAllapot(this);
           for (int sor = 0; sor<N; sor++)
              for (int oszlop=0; oszlop<N; oszlop++)
               ujAllapot.tabla[sor][oszlop] = tabla[sor][oszlop];
           ujAllapot.tabla[nullasora][nullaoszlopa] = tabla[nullasora-1][nullaoszlopa];
           ujAllapot.tabla[nullasora-1][nullaoszlopa] = 0;
           moves.add(ujAllapot);
       }
       if (nullaoszlopa>0)
       { //balra tolás
           CsuszkaAllapot ujAllapot = new CsuszkaAllapot(this);
           for (int sor = 0; sor<N; sor++)
              for (int oszlop=0; oszlop<N; oszlop++)
               ujAllapot.tabla[sor][oszlop] = tabla[sor][oszlop];
           ujAllapot.tabla[nullasora][nullaoszlopa] = tabla[nullasora][nullaoszlopa-1];
           ujAllapot.tabla[nullasora][nullaoszlopa-1] = 0;
           moves.add(ujAllapot);
       }
       if (nullaoszlopa<N-1)
       { //jobbra tolás
           CsuszkaAllapot ujAllapot = new CsuszkaAllapot(this);
           for (int sor = 0; sor<N; sor++)
              for (int oszlop=0; oszlop<N; oszlop++)
               ujAllapot.tabla[sor][oszlop] = tabla[sor][oszlop];
           ujAllapot.tabla[nullasora][nullaoszlopa] = tabla[nullasora][nullaoszlopa+1];
           ujAllapot.tabla[nullasora][nullaoszlopa+1] = 0;
           moves.add(ujAllapot);
       }
       if (nullasora<N-1)
       { //lefelé tolás
           CsuszkaAllapot ujAllapot = new CsuszkaAllapot(this);
           for (int sor = 0; sor<N; sor++)
              for (int oszlop=0; oszlop<N; oszlop++)
               ujAllapot.tabla[sor][oszlop] = tabla[sor][oszlop];
           ujAllapot.tabla[nullasora][nullaoszlopa] = tabla[nullasora+1][nullaoszlopa];
           ujAllapot.tabla[nullasora+1][nullaoszlopa] = 0;
           moves.add(ujAllapot);
       }
       return moves;
    }
    @Override
    public boolean isSolution()
    {
        boolean talaltElterest = false;
        for(int sor=0;sor<N;sor++)
        {
            for(int oszlop=0;oszlop<N;oszlop++)
            {
                if(tabla[sor][oszlop]!=N*sor+oszlop)
                    talaltElterest = true;
            }
        }
        return !talaltElterest;
    }
    @Override
    public double getHeuristic()
    {   double valasz = 0.0;
        for(int sor=0;sor<N;sor++)
        {
            for(int oszlop=0;oszlop<N;oszlop++)
            {
                int celsor = tabla[sor][oszlop]/N;
                valasz += abs(celsor-sor);
                int celoszlop = tabla[sor][oszlop]%N;
                valasz += abs(celoszlop-oszlop);

            }
        }
        return valasz;

    }
    @Override
    public boolean equals(Object o)
    {
        if(o==null || !(o instanceof CsuszkaAllapot))
            return false;
        else
        {
            CsuszkaAllapot cs = (CsuszkaAllapot)o;
            boolean talaltElterest = false;
            for(int sor=0;sor<N;sor++)
            {
                for(int oszlop=0;oszlop<N;oszlop++)
                {
                    if(tabla[sor][oszlop]!=cs.tabla[sor][oszlop])
                        talaltElterest = true;
                }
            }
            return !talaltElterest;
        }
    }
    
     @Override 
     public int hashCode()
     {
        int sum = 0; int factor=1;
        for (int i=0; i<N;i++) for (int j=0; j<N;j++) {
            sum += tabla[i][j]*factor; 
            factor *= N;
        }
        return sum;
     }
     @Override
     public String toString()
     {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
            sb.append('-');
        for(int i=0;i<N;i++)
        {
            sb.append("\n");
            for (int j=0;j<N;j++)
            {
                sb.append(tabla[i][j]);
            }
        }
        return sb.toString();
     }
}