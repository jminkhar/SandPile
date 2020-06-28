package nexeo;
//import java.util.Arrays;
//import java.util.List;


public class SandPileNexeo {
//	static int[][] pile = {{3,2,1},{3,3,2},{1,3,1}};
//	public static void main(String... dots) {
//		//int[][] pile = {{3,2,1},{3,3,2},{1,3,1}};
//		List<int[]> list1 = Arrays.asList(pile);
//		list1.forEach(SandPileNexeo::read);
//		System.out.println("----------------------");
//		List<int[]> list = Arrays.asList(addSand(pile,5));
//		list.forEach(SandPileNexeo::read);
//		
//		}
//
//	static void read(int[] t) {
//		System.out.println( Arrays.toString(t));
//	}
	
	public static int[][] addSand(int[][] pile, int n) {
		n=n-1;
		distribute(pile,(pile.length-1)/2,(pile.length-1)/2);
		if(n==0) return pile;
		else return addSand(pile,n);
	}
	private static void distribute(int[][] pile, int i, int j) {
		pile[i][j]++;
		if(pile[i][j]==4) {
			pile[i][j] = 0;
			if(i-1>=0)
				distribute(pile,i-1,j);
			if(j-1>=0)
				distribute(pile,i,j-1);	
			if(i+1<=pile.length-1)
				distribute(pile,i+1,j);
			if(j+1<=pile.length-1)
				distribute(pile,i,j+1);
					
		}
	}
}
