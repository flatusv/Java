
public class Stck {

    private StringBuilder str;
    private short countActions;

    //Default Constructor
    public Stck(){
        this.str = new StringBuilder("");
        this.countActions = 0;
    }

    public Stck(String str){
        this(); //inherit from default constructor
        this.str = new StringBuilder(str);
    }

    public void push(char c){
        // Eine Möglichkeit wäre auch gewesen: this.str += 'c'
        this.str.append(c);
        this.countActions++;
    }

    public char pop(){
        char lastChar = this.str.charAt(this.str.length()-1);
        this.str.deleteCharAt(this.str.length()-1);
        this.countActions++;
        return lastChar;
    }

   public int len() {
        return this.str.length();
   }

    public short ops(){
        return this.countActions;
    }

    public void plus(){
        char firstLast = this.str.charAt(this.str.length()-1);
        char secondLast = this.str.charAt(this.str.length()-2);

        if(Character.isDigit(firstLast) && Character.isDigit(secondLast)){
            int sum = Integer.parseInt("" + firstLast) + Integer.parseInt("" + secondLast);


            if (sum >= 10){
                String[] letters = {"a","b","c","d","e","f","g","h","i"};

                for(int i=0; i<9; i++){
                    if (sum == i + 10){
                        String letter = letters[i];

                        this.pop();
                        this.pop();
                        this.str.append(letter);
                        break;
                    }
                }
            }
            else{
                this.pop();
                this.pop();
                this.str.append(sum);
            }
        }else{
            System.out.println("Couldn't find two numbers in Stack");
        }
    }

    public static void main(String[] args) {
        Stck s = new Stck("bla1299");
        System.out.println(s.str);

        s.plus();
        System.out.println(s.str);

        s.push('?');
        System.out.println(s.str);

        s.pop();
        System.out.println(s.str);

        System.out.println(s.len());
        System.out.println(s.ops());
    }


}
