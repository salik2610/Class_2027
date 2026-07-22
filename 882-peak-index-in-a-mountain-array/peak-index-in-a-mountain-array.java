class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                // yaha pe hua kch yun ki mera mid ki value choti aai mtlb kie mai left side mai hun aur badi value right mai milegi
                s=mid+1;// isliye yaha pe mai right side shift hua
            }
            else{
                ans = mid;// agr mujhe potential solution mil rha hai toh mai usse store krwa diya hai aagr dkhte kya hota
                e=mid-1;// ab mujhe potential soluntion mil chuka hai so ek baar peeche jake check krrhe taqi left side se match ho skte
            }
        }
        return ans;
    }
}