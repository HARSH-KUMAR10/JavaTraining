package date06032023.stackpractice;

public class BracketCheckingUsingStack
{
    public static void main(String[] args)
    {
        MyStack<Character> bracketBalance = new MyStack<>();
        String bracketString = "[{()}([{[}])]";
        boolean compareBracket = true;
        for(int i=0;i<bracketString.length();i++){
            char checkBracket = bracketString.charAt(i);
            switch (checkBracket){
                case '[','{','(' -> bracketBalance.push(checkBracket);
                case ']' -> {
                    if(bracketBalance.peek()=='['){
                        bracketBalance.pop();
                    }else{
                        compareBracket=false;
                    }
                }
                case ')' -> {
                    if(bracketBalance.peek()=='('){
                        bracketBalance.pop();
                    }else{
                        compareBracket=false;
                    }
                }
                case '}' -> {
                    if(bracketBalance.peek()=='{'){
                        bracketBalance.pop();
                    }else{
                        compareBracket=false;
                    }
                }
            }
            if(!compareBracket){
                break;
            }
        }
        System.out.println(bracketBalance.size()==0 && compareBracket?"Brackets are balanced":"Brackets are not balanced");
    }
}
