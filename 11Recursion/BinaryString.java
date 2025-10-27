public class BinaryString {
    public static void StringWithoutConsOnes(String binary, StringBuilder newstr, int index){
    if(index>=binary.length()){
        System.out.println(newstr);
        return;
    }

    newstr.append(binary.charAt(index));

    while(index+1 <binary.length() && binary.charAt(index) =='1' && binary.charAt(index+1) == '1'){
      index++;
    }
    
      StringWithoutConsOnes(binary, newstr, index+1);
    }
    public static void StringWithoutOnes1(int n, char lastIndex, String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        StringWithoutOnes1(n-1, '0', str+'0');
        if(lastIndex =='0'){
         StringWithoutOnes1(n-1, '1', str+'1');
        }

    }
    public static void main(String[] args) {
        String name ="10011100";
       StringWithoutOnes1(4, '0', "");
    }
}
