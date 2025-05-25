/* prog arrange element given array int all negative after all posative integers apper
left counter if negative go and stop when positive upper arr[i] == negative continue
right counter if positive go and stop when negative upper arr[i] == positive continue
*/
#include<iostream>
using namespace std;

main(){
	int arr[7]={-4, 4, -2, -5, -8, 9, 10};
	int left= 0, right=6;
	
	for(int i=0; i<6; i++){
		if(arr[left] > 0 && left > right){
			left++;
		}
		if(arr[right] < 0 && left < right){
			right--;
		}
		if(arr[left] < right ){
			int temp  = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		left++;
		right--;
	}
		
		for(int j=0; j<7; j++){
			cout<<"\n "<<arr[j];	
		}
}