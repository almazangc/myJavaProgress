package com.almazan.Section11.Scope.ScopeCheck;

public class Main {

    //Declared out globally it can be accessed by all methods
    static int x;

    public static void main(String[] args) {
        x = 10;
        int y;
        int param = 0;
        DoSomething(param);


        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }

    static void DoSomething(int param){
        x = 5;

        //Y variable is not declared as global so y var cannot be used in this method but on specific in method it was called
        //y = 10;

        //param is a passed variable
        param = 10;
    }
}
