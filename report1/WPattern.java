package Report01;

public class WPattern {

	public static void main(String[] args) {
		int i, j, x;
		
		for(j=0;j<5;j++) { //w�� �� 5��
			for(i=0;i<3;i++) { //w�� 3�� �ݺ�
				if(j==0) {
					System.out.print("w");
					
					for(x=0;x<13;x++)
						System.out.print(" ");
					
					System.out.print("w");
				}//ù��
				else if(j==1) {
					System.out.print(" " + "w");
					
					for(x=0;x<5;x++)
						System.out.print(" ");
					
					System.out.print("w");
					
					for(x=0;x<5;x++)
						System.out.print(" ");
					
					System.out.print("w" + " ");
				}//�ι�° ��
				else if(j==2) {
					System.out.print("  " + "w");
					
					System.out.print("   ");
					
					System.out.print("w w");
					
					System.out.print("   ");
					
					System.out.print("w" + "  ");
				}//����° ��
				else if(j==3) {
					System.out.print("   " + "w");
					
					System.out.print(" " + "w");
					
					System.out.print("   ");
					
					System.out.print("w w");
					
					System.out.print("   ");
				}//�׹�° ��
				else if(j==4) {
					for(x=0;x<4;x++)
						System.out.print(" ");
					
					System.out.print("w");
					
					for(x=0;x<5;x++)
						System.out.print(" ");
					
					System.out.print("w");
					
					for(x=0;x<4;x++)
						System.out.print(" ");
				}//�ټ���° ��
			}//w ������ 3�� �ݺ� -> ��ü ���� �ϼ�
			System.out.println();
		}//�� ���� ��

	}

}
