import java.util.ArrayList;

public class SortColumns{
	private boolean order = true;

	ArrayList<Integer> minDeletionSize(String [] A){
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for (int i = 0; i<A.length-1; i++){
			if (A[i].length() != A[i+1].length()){
				indices.add(-1);
				return indices;
			}
		}
		for (int j = 0; j<A[0].length(); j++){
			for(int k = 0; k<A.length-1; k++){
				if (A[k].charAt(j)>A[k+1].charAt(j)){
					indices.add(j);
					order = false;
					break;
				}
			}
		}
		if (order){
			return new ArrayList<Integer>();
		}
		return indices;
	}
	public static void main(String args[]){
		SortColumns test = new SortColumns();
		String[] a = {"cba", "daf", "ghi"};
		String[] b = {"Captain", "Marvel", "saved", "the", "Avengers"};
		String[] c = {"zyx", "wvu", "tsr"};
		String[] d = {"a", "b"};
		System.out.println(test.minDeletionSize(a));
		System.out.println(test.minDeletionSize(b));
		System.out.println(test.minDeletionSize(c));
		System.out.println(test.minDeletionSize(d));
	}
}