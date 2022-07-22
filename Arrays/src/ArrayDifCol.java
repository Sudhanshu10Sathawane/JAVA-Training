
public class ArrayDifCol {
	public static void main(String[] args)

	 {

	 int sub[][];

	 sub=new int[3][];

	 sub[0]=new int[6];

	 sub[1]=new int[2];

	 sub[2]=new int[4];

	 sub[0][0]=67;

	 sub[0][1]=66;

	 sub[0][2]=16;

	 sub[0][3]=96;

	 sub[0][4]=77;

	 sub[0][5]=78;

	 sub[1][0]=5;

	 sub[1][1]=89;

	 sub[2][0]=6;

	 sub[2][1]=7;

	     sub[2][2]=89;

	  sub[2][3]=78;

	  for(int i=0;i<sub.length;++i)

	 {

	  

	  for(int j=0;j<sub[i].length;++j)

	  {

	   System.out.print(sub[i][j]+" ");

	  }
	  System.out.println();

	 }

	 }
}
