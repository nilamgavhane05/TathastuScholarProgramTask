
public class MirrorInverse {
    public static void main(String[] args) {
        int flag = 0;
       
        int arr[] = {3,4,5,0,1,2};

        for(int i = 0; i < arr.length; i++) {
            if(arr[arr[i]]==i) {
                flag = 1;
            }
        }
        if(flag == 1) {
            System.out.println("Given array is Mirror Inverse");
        }
        else{
            System.out.println("Given array is not a Mirror Inverse");
        }
    }
    
}
