// public class action{
// static void substracting(int a,int b){
// int ans=a-b;
// System.out.println("Substraction");
// System.out.println(a+","+b);
// System.out.println(ans);
// }
// }

// public class methods{

// public void adding(int a,int b){
// int ans=a+b;
// System.out.println("Addition");
// System.out.println(a+","+b);
// System.out.println(ans);
// }
// void multipling(int a,int b){
// int ans=a*b;
// System.out.println("Multiplication");
// System.out.println(a+","+b);
// System.out.println(ans);
// }
// public static void main(String[] args) {
// methods rc=new methods();
// action cr=new action();
// int n=16;
// int c=28;
// int ans;
// rc.adding(16,28);
// rc.multipling(5,7);
// action.substracting(n,c);
// // rc.substracting(n,c);
// }
// }
// public class ramya{}
// public class rohi{}
// public class sree{}
// public class sai{}

// public class methods
// {
// public void m1(ramya r1,rohi r2)
// {
// System.out.println("m1 method");
// }
// public static void main(sree r3,sai r4)
// {
// System.out.println("m2 method");
// }
// public static void main(String[]args)
// {
// methods me=new methods();
// ramya r1=new ramya();
// rohi r2=new rohi();
// //sree r3=new sree();
// //sai r4=new sai();
// me.m1(r1, r2);
// }
// }
// public class methods{
// void m1(){
// m2();
// System.out.println("1st method");
// }
// void m2(){
// System.out.println("2st method");
// }
// public static void main(String[] args) {
// methods rc=new methods();
// rc.m1();

// }
// }
// //output:-
// //2st method
// // 1st method

// // public class methods{
// // int a=10;
// // void m1(){
// // m2();

// // System.out.println("1st method");
// // }
// // void m2(){
// // m3(a);
// // System.out.println("2st method");
// // }
// // void m3(int a){
// // System.out.println("3st method");
// // }
// // public static void main(String[] args) {
// // methods rc=new methods();
// // rc.m1();
// // //rc.m3(10);

// // }
// // }
// // output:-
// // 3st method
// // 2st method
// // 1st method
// public class methods{
// int c=16;
// int r=28;
// void add(int c,int r){
// sub(28,16);
// System.out.println("Adding");
// System.out.println(this.c +" , " +this.r);
// System.out.println(this.c+this.r); //to print local varible 16,28
// System.out.println(c +" , " +r);
// System.out.println(c+r);//here it prints global varible
// }
// void sub(int a,int b){
// System.out.println("Substracting");
// System.out.println(a +" , " +b);
// System.out.println(a-b);//this accesses global varible
// }
// public static void main(String[] args) {
// methods rc=new methods();
// int x,y;
// rc.add(25,6);
// rc.sub(28,16);
// }
// }
// Substracting
// 28 , 16
// 12
// Adding
// 16 , 28
// 44
// 25 , 6
// 31
// Substracting
// 28 , 16
// 12

// public class methods{
// int a=28,b=16;
// static void add(int a,int b){
// System.out.println(this.a+this.b);
// }
// public static void main(String[] args) {
// methods rc=new methods();
// rc.add(25,6);

// }
// }
// Exception in thread "main" java.lang.Error: Unresolved compilation
//problems:
// Cannot use this in a static context
// Cannot use this in a static context

// at methods.add(methods.java:142)
// at methods.main(methods.java:146)



// CHECK THE YEAR IS LEAPYEAR OR NOT PROGRAM
// import java.util.Scanner;
// public class methods{
// public static void main(String[] args) {
// Scanner rc=new Scanner(System.in);
// int year=rc.nextInt();
// if(year%400==0){
// System.out.println("Leap year");
// }else if(year%100==0){
// System.out.println(" Not a Leap year");
// }else if(year%4==0){
// System.out.println("Leap year");
// }else{
// System.out.println(" Not a Leap year");
// }
// }
// }
// public class methods{
//     static void greet(){
//         System.out.println("Hello,Good Moring");
//     } 
//     public static void main(String[] args) {
//         methods rc=new methods();
//         rc.greet();
//        // greet();
//     }
// }


// public class methods{
   
//     static void change(int [] arr){
//         arr[0]=98;
//         System.out.println(arr[0]);
//         int sum=0;
//         for (int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         int marks[]={45,76,456,96,77};
//         change(marks);
        
//     }
// }

public class methods {
    static int sum(int ...arr){
        int ans=0;
        for (int a : arr) {
            ans += a;
        }return ans;
    } 
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(56));
        System.out.println(sum(56,45));
        System.out.println(sum(56,45,69));
    }
}