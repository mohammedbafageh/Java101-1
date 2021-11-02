public class Assignment1 {
    public static void main(String[] args) {
        String name = "your name goes here";
        // (a,e,i,o,u) => _
        for(int index = 0; index < name.length(); ++index){
            char letter = name.charAt(index);
            if(letter == 'a' || letter == 'e' ||
            letter == 'i' || letter == 'o' ||
            letter == 'u'){
                System.out.print('_');
            }else {
                System.out.print(letter);
            }
        }
    }
}
