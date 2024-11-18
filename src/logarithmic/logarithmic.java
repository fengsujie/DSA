package logarithmic;

public class logarithmic {
    public static void main(String[] args) {
        int[] pages = new int[]{129,134,156,167,190,230,234,345,367,456,476};
        int searchPage = 190;
        int low = 0;
        int high = pages.length -1;
        int found = 0;

        for(int i=0;i<pages.length;i++){
            int mid = (low+high)/2;
            if(pages[mid] == searchPage){
                System.out.println("Search page "+searchPage+" found at position "+mid);
                found = 1;
                break;
            }
            else if(pages[mid]<searchPage){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        if(found == 0){
            System.out.println("Search page "+searchPage+" not found");
        }
    }
}
