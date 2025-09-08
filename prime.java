import java.util.*;
class prime{
public static String isprime(int num){
int c=2;
if(num==1){
return "prime nor composite";
}

while (c*c<=num){
if(num%c==0){
return "not prime";
}
else
 c++;
}
return "prime";
}
     
public static void main(String[]args){
int num=19;

System.out.println(isprime(num));
}


}