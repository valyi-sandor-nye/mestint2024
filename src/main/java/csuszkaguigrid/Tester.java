/**
 * 
 */
package csuszkaguigrid;





import java.util.List;
import search.AbstractSolver;
import search.AstarSolver;
import search.BreadthFirstSolver;
import search.State;

public class Tester {
	
	private static void trySolver(State initialState, AbstractSolver solver) {
		System.out.println("Solving with "+solver);
		List<State> solution = solver.solve(initialState);
		System.out.println("  States visited: "+solver.getVisitedStateCount());
		System.out.println("  Solution:");
		if (solution == null) {
			System.out.println("    None found.");
		} else {
			for (State s : solution)
				System.out.println("    "+s);
			System.out.println("   "+solution.size()+" states(s)");
		}
	}
	private static void trySolvers(State initialState) {
		trySolver(initialState, new AstarSolver());
	}
	public static void main(String[] args) {
		System.out.println("Csuszkaprobléma megoldása kezdődik");
		System.out.println();
		trySolvers(new CsuszkaAllapot());
		System.out.println("---------------------------------------------------------------");
	}
}
