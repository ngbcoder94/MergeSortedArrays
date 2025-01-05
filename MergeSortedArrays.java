/*
 * This is my clas for the Merging of two sorted arrays problem from Leetcode.com. 
 *
 * @Author - Nick Burkett. 
 * @Date - 01/02/2025.
 *
 * Satus - WIP.
 */
public class MergeSortedArrays{
        
        /*
         * Here is my function that will Sort and merge the two arrays.
         *
         * @param int[] nums1, nums2 - Two arrays that contain the arrays I am working with.
         * @param int L1, L2 - The length of of the two arrays above.
         *
         * @return void - Don't return anything
         */
        public void solution(int[] nums1, int[] nums2, int L1, int L2){
                
                //Need to loop through nums2 first
                for(int i = 0; i < L2; i++){

                        //Then I need to loop through nums1 for each iteration of i - aka bubble sort.
                        for(int j = 0; j < L1; j++){
                                
                                //Here I check if the current element of nums2 <= current element of nums1.
                                if(nums2[i] <= nums1[j]){
                                        insert(nums1, j, nums2[i]);     //Insert the new value into nums1.
                                        L1 +=1;                         //Increment L1 by one since we added a value.
                                }
                                //Now I need to check if current val of nums2 > current val of nums1. 
                                else if((nums2[i] > nums1[j]) && (j == (L1-1))){
                                        nums1[j+1] = nums2[i];          //Add the value in the next place holder. 
                                        L1 += 1;                        //Increment the length of nums1 count after adding.
                                }
                                else if(){

                                }

                        }
                }
        }
        public static void main(String[] args){
                
                System.out.println("Hello World");
        }
}
