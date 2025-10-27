public class removingDuplicate {
    public static void  duplicate(String name){
        // name.toCharArray();
        StringBuilder sb = new StringBuilder(name);
          for(int i=0; i<sb.length(); i++){
            for(int j=i+1; j<sb.length(); j++){
                if(sb.charAt(i) == sb.charAt(j)){
                   sb.deleteCharAt(j);
                   j--;
                }
            }
          }
          System.out.println(sb);
    }
    public static void duplicate1(String name , int ind , StringBuilder newStr, boolean map[]){
      if(ind>= name.length()){
        System.out.println(newStr);
        return;
      }
      char curchar = name.charAt(ind);
      if(map[curchar - 'a'] == true){
          // dublicate
        duplicate1(name, ind+1, newStr, map);
         
      }
      else{
          map[curchar - 'a'] = true;
        duplicate1(name, ind+1, newStr.append(name.charAt(ind)), map);
      }
    }
    public static void main(String[] args) {
        String target = "appnacollege";
        duplicate1(target, 0, new StringBuilder(""), new boolean[26]);
    }
}
