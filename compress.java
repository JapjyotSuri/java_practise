public class compress {
    public static void main(String args[]){
        String s="aabbccc";
        String res="";
        for(int i=0;i<s.length();i++){
          int count=1;
          while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
            count++;
            i++;
          }
          res=res+s.charAt(i);
          if(count>1){
            res=res+String.valueOf(count);
          }
        }
        System.out.println(res);
    }
}
