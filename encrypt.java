public class encrypt {
    public static void main(String args[]){
        String S="aaaa";
        String res="";
        int cnt;
        char ch;
        char c='@';
        // code here
         for(int i=0;i<S.length();i++){
             cnt=0;
             ch=S.charAt(i);
             if(c==ch){
                break;
             }
             for(int j=0;j<S.length();j++){
                 
                 if(S.charAt(i)==S.charAt(j)){
                     cnt++;
                 }
             }
             c=S.charAt(i);
             res=res+S.charAt(i)+Integer.toHexString(cnt);
         }
         
         System.out.println(res);
         
    }
}
