package com.mycompany.java_ed;
import java.util.Stack;
import java.util.Scanner;
public class JAVA_ED {
    public static void main(String[] args) {
Stack<String> historico=new Stack<>();        
historico.push("youtube");
historico.push("instagram");
historico.push("linkedln");
Scanner menu=new Scanner(System.in);
System.out.println("funcao:");
int userID=menu.nextInt();
do{
if(userID==1){
    while(!historico.isEmpty()){
    System.out.println(historico);
    historico.pop();
}
    }
if(userID==2){
    System.out.println("qual site você quer visitar");
    String adicionar=menu.nextLine();
    historico.push(adicionar);
}
if(userID==3){
    System.out.println("sistema fechado");
}
}
while(userID != 3);


        }
    } 

