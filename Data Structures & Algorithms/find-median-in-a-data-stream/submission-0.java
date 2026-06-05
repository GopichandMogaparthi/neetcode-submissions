class MedianFinder {

    private List<Integer> list;
    public MedianFinder() {
        //Declare datastructure list to store the values from the input
    list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        //Adding numbers to the list
        list.add(num);

        //Sorting the numbers to the list
        Collections.sort(list);
        
    }
    public double findMedian() {
        //Size of the list
        int n = list.size();

        //If the list size is odd the median is the middle value
        if(n%2==1){
           return  list.get(n/2);
        }

        //Id the list size is even the median is the average of two middle values
        int mid1 = list.get(n/2-1);
        int mid2 = list.get(n/2);

        return (mid1+mid2)/2.0;
    }
}
