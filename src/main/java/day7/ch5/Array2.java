package day7.ch5;

public class Array2 {
    public static void main(String[] args) {
        int [] arr1={100,200};
        int [] arr2={5,10,15};

        for (int i=0; i< arr1.length; i++){
            System.out.printf("arr[%d]:%d\n",i,arr1[i]);
        }
        arr1 = arr2;//셸로 카피
        System.out.printf("----");
        arr1[1]=44;
        for (int i=0; i< arr1.length; i++){
            System.out.printf("arr[%d]:%d\n",i,arr1[i]);
        }
        for (int i=0; i< arr2.length; i++) {
            System.out.printf("arr[%d]:%d\n", i, arr2[i]);
        }
        System.out.println("arr1==arr2"+(arr1==arr2));
    }

}
