package hello;

public class Array 
{

	public static void main(String[] args)
	{
	int arr[][] = new int[5][5];
	arr[0][0]=5;
	arr[0][1]=3;
	arr[0][2]=4;
	arr[0][3]=5;
	arr[0][4]=7;  
    
    float arr2[][] =new float[5][5];
	arr[1][0]=15;
	arr[1][1]=13;
	arr[1][2]=14;
	arr[1][3]=15;
	arr[1][4]=17;
	
	arr[2][0]=52;
	arr[2][1]=31;
	arr[2][2]=44;
	arr[2][3]=56;
	arr[2][4]=72;
	
	arr[3][0]=52;
	arr[3][1]=31;
	arr[3][2]=44;
	arr[3][3]=56;
	arr[3][4]=72;
	
	arr[4][0]=52;
	arr[4][1]=31;
	arr[4][2]=44;
	arr[4][3]=56;
	arr[4][4]=72;

	int i=0;
	int j=0;
	int n=5;
for(i=1;i<arr.length;i++);
{
for(j=1;j<arr.length;j++);
{
	System.out.println(arr[i][j]);
	}
}
	}}
