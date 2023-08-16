package array;

public class array4 {

	public static void main(String[] args) {
		int[][] b=new int[4][];
		b[0]=new int[1];
		b[1]=new int[2];
		b[2]=new int[3];
		b[3]=new int[4];
        b[0][0]=10;
        b[1][0]=20;
        b[1][1]=30;
        b[2][0]=40;
        b[2][1]=50;
        b[2][2]=60;
        b[3][0]=70;
        b[3][1]=80;
        b[3][2]=90;
        b[3][3]=100;
        int i,j,k=0;
		for(i=0;i<4;i++);
			for(j=0;j<i+1;j++);{
				b[i][j]=k;
				k++;
			}
			for(i=0;i<4;i++) {
				for(j=0;j<i+1;j++) {
					System.out.print(b[i][j]+" ");
				System.out.println();
			}
}
}
}
		
		
		// TODO Auto-generated method stub

	


