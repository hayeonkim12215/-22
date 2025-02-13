package hayeon;

import java.util.Random;

public class array {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] m1 = new int[3][3], m2 = new int[3][3], m3 = new int[3][3];
		Random rnd = new Random();
		for (int i = 0; i < m1.length; i++)// 행렬 초기화
		{
			for (int j = 0; j < m1.length; j++) 
			{
				m1[i][j] = rnd.nextInt(100);
				m2[i][j] = rnd.nextInt(100);
			}
		}
		
		for (int i = 0; i < m3.length; i++) // 행렬 덧셈
		{
			for (int j = 0; j < m3[i].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		OutFunc(m1);
		System.out.print("\n");
		OutFunc(m2);
		System.out.print("====================\n");
		OutFunc(m3);
		

	}

	public static void OutFunc(int[][] m1)
	{

		for (int i = 0; i < m1.length; i++) // 행렬 출력
		{
			for (int j = 0; j < m1[i].length; j++) 
			{
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
	}

}


