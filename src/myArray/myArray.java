package myArray;

public class myArray {
private int[] items;
int currentIndex;

public myArray(int initialize){
    this.items = new int[initialize];
}

public void insert(int value){
    if(currentIndex==items.length){
        int[] temp=new int[items.length*2];
        for(int i=0;i<currentIndex;i++){
            temp[i]=items[i];
        }
        items =temp;
    }
    this.items[currentIndex]=value;
    currentIndex++;
}

public String toString() {
    StringBuilder str = new StringBuilder("[");

    for (int i = 0; i < currentIndex; i++) {
        str.append(items[i]);
        if (i < currentIndex-1) {
            str.append(", ");
        }
    }

    str.append("]");
    return str.toString();
}

// function to find the IndexOf value
    public int indexOf(int value){
    for(int i=0;i<currentIndex;i++){
        if(items[i]==value){
            return i;
        }
    }
    return -1;
    }

//    function to remove item using index
public boolean removeAt(int index) {
    if (index >= currentIndex || index < 0) {
        throw new IllegalArgumentException("Invalid index: " + index);
    }

    // Shift elements to the left, overwriting the element at the given index
    for (int i = index; i < currentIndex - 1; i++) {
        items[i] = items[i + 1];
    }

    currentIndex--;
    return true;
}

// maximum item in array
    public int max(){
    int result = items[0];
    for(int i=0;i<currentIndex;i++){
        if(items[i]>result){
            result = items[i];
        }
    }
    return result;

    }

//    minimum item in array
public int min(){
    int result = items[0];
    for(int i=0;i<currentIndex;i++){
        if(items[i]<result){
            result = items[i];
        }
    }
    return result;

}

//reversing the array
    public void reverse(){
    int i=0;
    int j=currentIndex-1;
    while(i<j){
        int temp=items[i];
        items[i]=items[j];
        items[j]=temp;
        i++;
        j--;
    }
    }


}
