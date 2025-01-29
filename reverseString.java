public class reverseString {
    public static void main(String args[] ) {
        StringBuilder sb= new StringBuilder("Jaiky");

        for(int i=0; i<sb.length()/2; i++) {
            int frant = i;
            int back = sb.length()-i-1; // 5-1= 4
            //storing value in charecter
            char frantchar= sb.charAt(frant);
            char backchar = sb.charAt(back);
            //here replacing with char
            sb.setCharAt(frant, backchar);
            sb.setCharAt(back,frantchar);

        }
        System.out.println(sb);
    }
}
