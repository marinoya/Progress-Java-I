package com.progress.java; 
 
public class Main { 
 
    public static void main(String[] args) { 
 
 
        //1. - make one of each primitive variables & 2. - Assign correct numeral values 
 
        byte by = 127; 
 
        short sh = 32767; 
 
        int in = 5; 
 
        double dou = 25.17; 
 
        boolean bo = true; 
        //boolean b02 = 1; 
 
        char ch= 'Ю'; 
 
        char ch2 = 32769; 
 
System.out.println(ch2); 
 
//3. Try to assign the values of each variable to every other variable 
        //byte assignment 
        by = sh; 
        by = in; 
        by = dou; 
        by = bo; 
        by = ch; 
        by = ch2; 
 
         
        //short assignment 
        sh = by; 
        sh = in; 
        sh = dou; 
        sh = bo; 
        sh = ch; 
        sh = ch2; 
 
    
        //int assignment 
        in = by; 
        in = sh; 
        in = dou; 
        in = bo; 
        in = ch; 
        in = ch2; 
 
    
        //double assignment 
        dou = by; 
        dou = sh; 
        dou = in; 
        dou = bo; 
        dou = ch; 
        dou = ch2; 
 
    
        //boolean assignment 
        bo = by; 
        bo = sh; 
        bo = in; 
        bo = dou; 
        bo = ch; 
        bo = ch2; 
 
 
        //char assignment 
        ch = by; 
        ch = sh; 
        ch = in; 
        ch = dou; 
        ch = bo; 
 

 

//3.1 Casting variables to force assign them & 3.2 indicate loss of precision 

 

//byte casting 
        by = (byte)sh; 
        by = (byte)in; 
        by = (byte)dou; 
        by = (byte)bo; 
        by = (byte)ch; 
        by = (byte)ch2; 

 
 

     //short casting 
        sh = (short)by; 
        sh = (short)in; 
        sh = (short)dou; 
        sh = (short)bo; 
        sh = (short)ch; 
        sh = (short)ch2; 

 
 

     //int casting 
        in = (int)by; 
        in = (int)sh; 
        in = (int)dou; 
        in = (int)bo; 
        in = (int)ch; 
        in = (int)ch2; 

 
 

     //double casting 
        dou = (double)by; 
        dou = (double)sh; 
        dou = (double)in; 
        dou = (double)bo; 
        dou = (double)ch; 
        dou = (double)ch2; 

 
 

//boolean casting 
        bo = (boolean)by; 
        bo = (boolean)sh; 
        bo = (boolean)in; 
        bo = (boolean)dou; 
        bo = (boolean)ch; 
        bo = (boolean)ch2; 

 

 

     //char casting 
        ch = (char)by; 
        ch = (char)sh; 
        ch = (char)in; 
        ch = (char)dou; 
        ch = (char)bo; 

 

//check which variables accept the "++" incremental operator and how they work, both as prefix and postfix 
     

byte by = 10; 
 
System.out.println(by);   //10 
System.out.println(by++); //10 
System.out.println(by);   //11 
System.out.println(++by); //12 
System.out.println(by);   //12 

 

 

short sh = 32; 

 
System.out.println(sh);   //32 
System.out.println(sh++); //32 
System.out.println(sh);   //33 
System.out.println(++sh); //34 
System.out.println(sh);   //34 

 

 

int in = 5; 
 
System.out.println(in);   //5 
System.out.println(in++); //5 
System.out.println(in);   //6 
System.out.println(++in); //7 
System.out.println(in);   //7 

 

 

double dou = 25.17; 
 
System.out.println(dou);   //25.17 
System.out.println(dou++); //25.17 
System.out.println(dou);   //26.17 
System.out.println(++dou); //27.17 
System.out.println(dou);   //27.17 
 

 

boolean bo = true; 
 
System.out.println(bo); 
System.out.println(bo++); //Operator '++' cannot be applied to variable 'boolean' 
System.out.println(bo); 
System.out.println(++bo); //Operator '++' cannot be applied to variable 'boolean' 
System.out.println(bo); 

 

 

char ch= 'Ю'; 

 
System.out.println(ch);   //Ю 
System.out.println(ch++); //Ю 
System.out.println(ch);   //Я 
System.out.println(++ch); //а 
System.out.println(ch);   //а 
 

 
char ch2 = 32769; 

 
System.out.println(ch2);   //老 
System.out.println(ch2++); //老 
System.out.println(ch2);   //耂 
System.out.println(++ch2); //考 
System.out.println(ch2);   //考 
 

 

 

 

 

 

 

 

} 

} 
 
