public class Practice {
    public static void repeatingIndex(int array[] , int index , int target){
        if(index>=array.length){
            return;
        }
      if(index < array.length && array[index] == target){
        System.out.print(index + "\t");
           
      }
       repeatingIndex(array, index+1, target);

    }
    public static void englishConverter(int n , String eng , int index){
        String result = String.valueOf(n);
        if(index == result.length()){
            System.out.println(eng);
            return;
        }
         
        switch (result.charAt(index)) {
            case '0':
                eng +="zero ";
                break;
            case '1':
                eng +="one ";
                break;
            case '2':
                eng +="two ";
                break;
            case '3':
                eng +="three ";
                break;
            case '4':
                eng +="four ";
                break;
            case '5':
                eng +="five ";
                break;
            case '6':
                eng +="six ";
                break;
            case '7':
                eng +="seven ";
                break;
            case '8':
                eng +="eight ";
                break;
            case '9':
                eng +="nine ";
                break;
        }
        englishConverter(n, eng, index+1);
    }

    // finding length of a string using recursion
         public static int stringLength(String name){
            if(name.length() ==0){
                return 0;
            }
             return stringLength(name.substring(1))+1;
         }
         //todo Ye wala program thoda galat hai par logic khud se lagaya hoon so i can proud on myself smjhe bache.
         // findthecountofallcontiguoussubstringsstarting and ending with the same character.
         public static int sameEndingSubstring(String name , int index , boolean map[]){
            // if(index == name.length()){
            if (index == name.length()){
                // System.out.println(count);
                return 0 + name.length() ;
            }
            char currchar = name.charAt(index);
            if(map[currchar - 'a'] != true ){
                map[currchar - 'a'] = true;
               return sameEndingSubstring(name, index+1, map);
            }
            else{
               return sameEndingSubstring(name, index+1, map) +1;
            }
         }
    public static void main(String[] args) {
        int list[] = { 2, 5, 3,5, 2,5, 7, 6, 5};
    //    System.out.println(repeatingIndex(list, 0, 5)); 
    // repeatingIndex(list, 0, 5);
    // englishConverter(1683, "", 0);
    // System.out.println(stringLength("English"));
    System.out.println(sameEndingSubstring("abcadba", 0, new boolean[26]));
           }
}
