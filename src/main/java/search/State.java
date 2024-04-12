package search;

import java.lang.Iterable;


public interface State {

	public Iterable<State> getPossibleMoves();
	
	public boolean isSolution();
	
	public double getHeuristic();
	
	public double getDistance();
	
	public State getParent();
}
