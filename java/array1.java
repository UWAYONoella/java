public class array1 {
    public static void main(String[] args){
        int[] array1 = {0,9,8,2,5,1};
      for(int i=0;i<array1.length;i++){
                for(int j=i;j<=array1.length-1;j++){
                    int temp=0;
                    if(array1[i]<array1[j]){
                        temp=array1[i];
                        array1[i]=array1[j];
                        array1[j]=temp;
                    }System.out.println("j:"+j);
                }System.out.println("i:"+i);
                    
               }

            for(int k=0;k<array1.length;k++){
                System.out.print(array1[k]);
            }

    }
}
