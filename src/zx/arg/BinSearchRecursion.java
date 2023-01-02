package zx.arg;

public class BinSearchRecursion {

    public static void main(String[] args) {
        int[] a ={3,4,5,6,7,8,9,12,14};
        int result = binSearch(a,0,a.length-1,9);
        System.out.println(result);
    }

    private static int binSearch(int[] a, int start, int end, int key) {

        int mid = (end-start)/2+start;

        if (a[mid] == key){
            return mid;
        }
        if (start>=end){
            return -1;
        }else if (key>a[mid]){
            return binSearch(a,mid+1,end,key);
        } else if (key<a[mid]) {
            return binSearch(a,start,mid-1,key);

        }

        return -1;
    }
}
