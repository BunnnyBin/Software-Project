package Report01;

public class WPattern {

	public static void main(String[] args) {
		int i, j, x;
		
		for(j=0;j<5;j++) { //w는 총 5줄
			for(i=0;i<3;i++) { //w를 3번 반복
				if(j==0) {
					System.out.print("w");
					
					for(x=0;x<13;x++)
						System.out.print(" ");
					
					System.out.print("w");
				}//첫줄
				else if(j==1) {
					System.out.print(" " + "w");
					
					for(x=0;x<5;x++)
						System.out.print(" ");
					
					System.out.print("w");
					
					for(x=0;x<5;x++)
						System.out.print(" ");
					
					System.out.print("w" + " ");
				}//두번째 줄
				else if(j==2) {
					System.out.print("  " + "w");
					
					System.out.print("   ");
					
					System.out.print("w w");
					
					System.out.print("   ");
					
					System.out.print("w" + "  ");
				}//세번째 줄
				else if(j==3) {
					System.out.print("   " + "w");
					
					System.out.print(" " + "w");
					
					System.out.print("   ");
					
					System.out.print("w w");
					
					System.out.print("   ");
				}//네번째 줄
				else if(j==4) {
					for(x=0;x<4;x++)
						System.out.print(" ");
					
					System.out.print("w");
					
					for(x=0;x<5;x++)
						System.out.print(" ");
					
					System.out.print("w");
					
					for(x=0;x<4;x++)
						System.out.print(" ");
				}//다섯번째 줄
			}//w 한줄을 3번 반복 -> 전체 한줄 완성
			System.out.println();
		}//그 다음 줄

	}

}
