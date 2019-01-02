package com.company;

/**
 * 十进制转其他进制 与后位移
 */
public class BinaryConversion {

    private int num;
    private int binary;

    public BinaryConversion(int num,int binary) {
        this.num = num;
        this.binary = binary;
    }

    public String convert(){

        if(num == 0){
            System.out.println("0");
            return "";
        }

        int base=1,offset=1;
        switch (binary){
            case 16 :
                base=15;
                offset=4;
                break;
            case 8 :
                base=7;
                offset=3;
                break;
            case 2 :
                base=1;
                offset=1;
                break;
            default:
                break;
        }

        char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        char[] arr = new char[32];
        int pos = arr.length;

        while (num!=0){
            int temp = num & base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }

        String str = "";
        for(int x=pos;x<arr.length;x++){
            str += arr[x];
        }

        return  str;

    }
}
