package oops;

import java.util.Scanner;
public class PhoneBill {

int callduration;
double callCharges;
double callTime;

public PhoneBill(){

Scanner s = new Scanner(System.in);
System.out.println(“Enter the time of the day a call was made by the customer in 24hr format: ”);
callTime = s.nextInt();

Scanner t = new Scanner(System.in);
System.out.println(“Enter the time duration of the call: ”);
callduration = t.nextInt();

}

public double billing(){
if(callTime <= 0600 && callTime <= 1800)
callCharges = 0.16*(callduration*4.00);

else
if(callTime >= 1800 && callTime >= 0600)
callCharges = 0.16*(callduration*3.00);

return callCharges;
}
public static void main(String[] args) {

    PhoneBill p = new PhoneBill();
System.out.println(“Bill generated by Calls made by the customer = ” + p.billing());
}
}