class Array{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        int[] arr2 = {1,2,3,4,5};
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        int[][] arr3 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}