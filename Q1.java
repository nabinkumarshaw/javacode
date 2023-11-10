public class Q1 {
    public static void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int arr1[],int arr2[]){
        int ans[]=new int[arr1.length+arr2.length];
        int k=0;int i=0;int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i< arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j< arr2.length){
            ans[k++]=arr2[j++];
        }
        print(ans);
    }
    public static void main(String[] args) {
        int arr1[]={1,5,9,10,15,20};
        int arr2[]={2,3,8,13};
        merge(arr1,arr2);
    }
}
