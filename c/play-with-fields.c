#include <stdio.h>
#include <stdbool.h>

int main(){
  int field_widths[10] = { 3, 4, 4, 3, 3, 4, 4, 3, 2, 2 };
  unsigned int cafebabe = 0xCAFEBABE;
  int previous_field_width = 0;
  int output[10] = {};

  for(int i = 0; i < 10; i++){
    int field_width = field_widths[i];
    output[i] = (cafebabe << previous_field_width) >> (32 - field_width);
    previous_field_width = previous_field_width + field_width;
    printf("%d", output[i]);
  }
  printf("\n");
  int answer[10] = { 6, 5, 7, 7, 5, 7, 5, 3, 3, 2};
  bool match = true;
  for(int i = 0; i < 10; i++){
    if(answer[i] != output[i]){
      match = false;
      break;
    }
  }
  printf("Does the answer match my output?");
  printf("\n");
  printf(match ? "true" : "false");
  printf("\n");
}
