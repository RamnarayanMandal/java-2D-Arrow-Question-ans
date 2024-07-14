class SymetricMatrix {
    public static void main(String[] args) {
        int arr[][] = {{0,2,3},{3,0,5},{6,7,8}};
        if(compare(arr))
            System.out.println("Symetric Matrix");
        else
            System.out.println("Not Symetric Matrix");
    }

    static boolean compare(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
