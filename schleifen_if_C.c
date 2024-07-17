#include <stdio.h>
//"%d" = Integer (Dezimal)
//"%s" = String

int main(){
    //for-schleife
    int i;
    char *s = "Hello World!";

    for (i=1; i<=10; i++){
        printf("%d\n", i);
    }


     //while-schleife
    while(i<=10){
        printf("%d\n", i);
        i++;
    }


    //if-statement
    if (1==1){
        printf("%s", s);
    }

    return 0;

}