package myArray;

public class myArray {
private int[] items;
int currentIndex;

public myArray(int initialize){
    this.items = new int[initialize];
}

public void insert(int value){
    this.items[currentIndex]=value;
    currentIndex++;
}
}
