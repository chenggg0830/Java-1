package eeeeeee;
import java.util.Scanner;
public class ececec {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        ex1_1();
        ex1_2();
        ex1_3();
        ex1_4();
        //關閉scanner
        sc.close();
    }
    static void sop(String s){
    System.out.print(s);
    }
    static void ex1_1(){
        //判斷質數
        sop("100以內的質數");//輸出100以內的質數
        for (int i=1;i<=100;i++){//透過for迴圈跑1~100之間
            boolean prime = true ;//宣告布林prime是真
                for (int j = 2;j<i-1;j++){//透過for迴圈跑0~i之間
                    if (i%j==0){//如果i mod j == 0
                        prime = false;//將布林prime改為假
                    }
                }
            if (prime ==true)//如果prime為真
                sop(i+" ");//輸出[i ]
        }
        sop("\n");//換行
    }
    static void ex1_2(){
        //取可以被a整除或b整除除但不可被a*b整除的數
        sop("請輸入A、B\n");//輸出請輸入A、B，換行
        int a = sc.nextInt(),b=sc.nextInt();
        sop("可以被"+a+"整除或"+b+"整除除但不可被"+a*b+"整除的數\n");//輸出可以被a整除或b整除除但不可被a*b整除的數，換行
        for (int i=1;i<=100;i++){//透過for迴圈跑1~100之間
            if (i%a==0&&i%b==0&&i%(a*b)!=0){//如果i mod a 等於 0且i mod b 等於 0並且i mod (a*b)不等於0
                sop(i+" ");//輸出[i ]
            }
        }
        sop("\n");//換行
    }
    static void ex1_3(){
        //取是X的倍數但不是Y的倍數
        sop("請輸入X、Y\n");//輸出請輸入A、B，換行
        int x = sc.nextInt(),y=sc.nextInt();
        sop("是"+x+"的倍數但不是"+y+"的倍數\n");//輸出是x的倍數但不是y的倍數，換行
        for (int i=1;i<=100;i++){//透過for迴圈跑1~100之間
            if (i%x==0&&i%y!=0){//如果i mod x 等於 0並且i mod y不等於0
                sop(i+" ");//輸出[i ]
            }
        }
        sop("\n");//換行
    }
    static void ex1_4(){
        //取K的倍數
        sop("請輸入K\n");//輸出請輸入A、B，換行
        int k = sc.nextInt();
        sop("可以被"+k+"整除的數\n");//輸出可以被"+k+"整除的數\n，換行
        for (int i=1;i<=100;i++){//透過for迴圈跑1~100之間
            if (i%k==0){//如果i mod k 等於 0
                sop(i+" ");//輸出[i ]
            }
        }
        sop("\n");//換行
    }
}