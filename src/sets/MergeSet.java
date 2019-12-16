package sets;
import java.util.*;
public class MergeSet {

		// Function merging two sets using addAll() method
		public static <T> Set<T> mergeSet(Set<T> a, Set<T> b){
			
			// Create an empty set
			Set<T> mergedSet = new TreeSet<T>();
			
			// Add the two sets to be merged into the new set
			mergedSet.addAll(a);
			mergedSet.addAll(b);
			
			// Returning the merged set
			return mergedSet;
		}

		public static void main(String[] args) {
			// Creating the sets to be merged
			
			// First set
			// Set <Integer> a = new HashSet<Integer>();
			Set<Integer> a = new TreeSet<Integer>();
			a.addAll(Arrays.asList(new Integer[] {1,2,3,5,7,9}));
			
			// add() returns true if not in the set and adds to set
			// returns false if already in the set
			boolean ret = a.add(4);
			System.out.println("a.add(1) returns: " + ret);
			
			//Second Set
			Set<Integer> b = new TreeSet<Integer>();
			b.addAll(Arrays.asList(new Integer[] {0,2,4,5,6,8}));
			
			// Printing the sets
			System.out.println("Set a: " + a);
			System.out.println("Set b: " + b);
			
			// Calling mergeSets()
			System.out.println("Merged Set: " + mergeSet(a,b));
	}

}
