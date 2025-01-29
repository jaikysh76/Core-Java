public class stringBuilderIndexing {
    public static void  main(String [] args) {
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
// index change print
        sb.setCharAt(0,'P');
        System.out.println(sb);
//insertion
        sb.insert(0,'J');
        System.out.println(sb);
//deletion
        sb.delete(1, 2);
        System.out.println(sb);


    }
}
