package code;

public class Box_Sum {
	
	public static void main(String[] args)
	{
		final int SIZE = 20;
		int[][] box = new int [SIZE][SIZE]; //square box
		int max = 100;
		int min =0;
		int sum =0; //wanted output
		int temp = 0;
		int counterX =0;
		int counterY = 0;
		for (int y =0;  y < box.length ; y++)//populate
		{
//			box[x][x] = (int)(Math.random()*(max-min +1)+ min);
			for (int x =0;  x < box.length ; x++)
			{
				box[x][y] = (int)(Math.random()*(max-min +1)+ min); //random	
//				counter ++;//for counting purpose
				if(x % 20 == 0) // organize display
					System.out.println("");
				System.out.print(box[x][y]+" ");
			}	
		}
		System.out.println("");
		for (int y =0;  y < box.length - 3 ; y++) //-3  - adding 9 boxes
		{
			for (int x =0;  x < box.length - 3 ; x++)
			{	
				temp = box[x][y] + box[x][y+1]+ box[x][y+2] + box[x+1][y]+ box[x+1][y+1] + box[x+1][y+2] + box[x+2][y]+ box[x+2][y+1]+ box[x+2][y+2];
				if (temp > sum) //store largest sum
					{
						sum = temp;
						counterX = x ;
						counterY = y;
					}
			}	
		}
//		System.out.println("Counter:"+ counter); //check quantity
		System.out.println("The sum is: " + sum); //display
		System.out.println("Coordinate of sum's corner: (" + counterX +  "," + counterY +")");
	}
}
