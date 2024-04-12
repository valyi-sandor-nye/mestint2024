package search;

import java.util.*;

enum Irány {É, K, D, NY};
class Lépegető extends AbstractState {
    int sor=0, oszlop=N-1;
    static int N=4;
    static Irány[][] palya = {{Irány.D, Irány.K, Irány.D,Irány.NY},
        {Irány.K, Irány.É, Irány.D, Irány.É },
        {Irány.K,Irány.D, Irány.K, Irány.NY },
        {Irány.K, Irány.É, Irány.K, null }};
    Lépegető() {}
    Lépegető(int s, int o) {sor=s; oszlop=o;}
    public boolean isSolution() {
    return false; //... TODO
    }

    @Override
    public double getHeuristic() {
        return 8.0-sor-oszlop;
    }

    public Iterable<State> getPossibleMoves(){
        Set<State> moves = new HashSet<>();
        // ___
        return moves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lépegető)) return false;
        Lépegető lépegető = (Lépegető) o;
        return sor == lépegető.sor && oszlop == lépegető.oszlop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sor, oszlop);
    }
}
