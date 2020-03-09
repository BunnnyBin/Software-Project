
public class Array {

	public static void main(String[] args) {
		int ary2d[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		for(int i=0;i<ary2d.length;i++) {
			for(int j=0;j<ary2d[i].length;j++)
			    System.out.print(ary2d[i][j]);
			
			System.out.println();
		}

	}

}
