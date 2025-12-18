#include<Stdio.h>
int main(){
    int arr[] = {6,5,3,1,8,7,2};
    int n = sizeof(arr)/sizeof(arr[0]);
    for(int i =0; i<n-1; i++ ){
        for(int j =i+1; j>0; j-- ){
            if(arr[j] < arr[j-1] ){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
            }
            else continue;
        }
    }
    for(int i=0; i< n; i++){
        printf("%d \t",arr[i] );
    }
}