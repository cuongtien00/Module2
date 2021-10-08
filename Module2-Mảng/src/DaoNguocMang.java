public class DaoNguoMang {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20} ;
        int first = 0;
        int last = myList.length-1;
        int temp = 0;
        while(first<last) {
            temp = myList[first];
            myList[first] = myList[last];
            myList[last]  = myList[first];
            first++;
            last--;
        }
        for(int a: myList ) {
            System.out.println(a);
        }
    }
}
