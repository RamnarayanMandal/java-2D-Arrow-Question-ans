class AntinDiagonal 
{
	public static void main(String[] args) 
	{   int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int das=0;
		int adas=0;
		for(int i=0; i<arr.length; i++)
		{
			das+=arr[i][i];
			adas+=arr[i][arr.length-1-i];
		}
		System.out.println(das);
		System.out.println(adas);
		System.out.println(adas-das);
	}
}
