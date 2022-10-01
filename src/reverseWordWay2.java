public class reverseWordWay2 {
    public static void main(String[] args) {
        System.out.println("ANOTHER WAY!!!");
        String str1="This is sentence i want to reverse";
        String[] arr1=str1.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            String word=arr1[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            arr1[i]=stringBuilder.toString();
            st.append(arr1[i]).append(" ");
        }
        System.out.println(st);
    }
}
