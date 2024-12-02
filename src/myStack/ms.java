package myStack;

public class ms {
    private int[] items;
    private int top;
    private int size;

//    constructor
    public ms(int size){
        this.size=size;
        this.items=new int[size];
        this.top=0;
    }

//    push function
    public void push(int value){
        if(top==size){
            throw new StackOverflowError();
        }
        this.items[this.top]=value;
        this.top++;
    }

//    toString
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=top-1;i>=0;i--){
            sb.append(items[i]).append("\n");
        }
        return sb.toString();
    }
}
