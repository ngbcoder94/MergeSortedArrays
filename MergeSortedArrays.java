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
         * Here is my insert function that will allow me to add the new value of nums2 to nums1.
         *
         * int[] nums1 - Array to add the new value to.
         * int index - Where to add the new value in nums1[].
         * int val - Value of nums2 to add to nums1.
         * int L1 - Current length of L1.
         */
        public void insert(int[] nums1, int index, int val, int L1){
               
                //System.out.println("fuck");
                //Need to loop through nums1 and move everything over by one.
                for(int i = (L1-1); i >= index; i--){
                        nums1[i+1] = nums1[i];           //Move each element to the left by one.
                }

                nums1[index] = val;          //Add the new value to nums1.
        }

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
                                        //System.out.println("idk");
                                        insert(nums1, j, nums2[i], L1);     //Insert the new value into nums1.  
                                        L1 +=1;                         //Increment L1 by one since we added a value.
                                        break;
                                }

                                //Now I need to check if current val of nums2 > current val of nums1. 
                                else if((nums2[i] > nums1[j]) && (j == (L1-1))){
                                        nums1[j+1] = nums2[i];          //Add the value in the next place holder. 
                                        L1 += 1;                        //Increment the length of nums1 count after adding.
                                        break;
                                }

                                //Need to check if I am at my last element in each array and nums2[i] > nums1[j]. 
                                else if((i == (L2-1)) && (j == (L1-1)) && (nums2[i] > nums1[j])){
                                        nums1[L1] = nums2[i];           //Add the last value to the array nums1.
                                }

                        }
                }
        }
        public static void main(String[] args){
                
                int[] testArr1 = {1, 3, 5, 0, 0, 0};                        //Create nums1 for testing.
                int[] testArr2 = {0, 2, 4};                           //Create nums2 for testing.

                MergeSortedArrays tmpObj = new MergeSortedArrays();         //Create instance of MergeSortedArrays for testing.

                tmpObj.solution(testArr1, testArr2, 3, 3);                  //Call solution and run test.
                
                //Loop through testArr1 to see if these were merged and sorted correctly.
                for(int i = 0; i < testArr1.length; i ++){
                        System.out.println(testArr1[i]);
                } 
        }
}
