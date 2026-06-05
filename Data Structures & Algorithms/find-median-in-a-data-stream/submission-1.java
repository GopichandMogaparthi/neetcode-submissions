class MedianFinder {

    //Decalre List to access within whole class
    private List<Integer> list;

    public MedianFinder() {

        //initializes the object
        list = new ArrayList<>();
        
    }
    
    public void addNum(int num) {
        //Adding elements to the list
        list.add(num);

        //Sorting numbers
        Collections.sort(list);
    }
    
    public double findMedian() {
        //calculate the size of list
        int n = list.size();

        //if the size is odd the median is the middle value
        if(n%2==1){
            return list.get(n/2);
        }

        //If the size is even the median is average of two middle values

        int mid1 = list.get(n/2-1);
        int mid2 = list.get(n/2);

        return (mid1+mid2)/2.0;
        
    }
}
