package com.upcatt.upcatt_test;

/**
 * Created by StefanV on 12/5/2016.
 */

public class Transactions {

        public class Init_Transaction{
            public String codeTransaction = "1";
            public String init(String auth, String amount){
                this.codeTransaction = "500";
                return this.codeTransaction;
            }
        }


        public class Get_Amount{
            public String amount = "";
            public int getAmount(String auth, String code_transaction){
                this.amount = "100";
                if(this.amount.length() > 0){
                    return 1;   // returnare corecta de suma
                } else {
                    return 0;   // returnare incorecta
                }
            }
        }


        public class Confirm_Transaction{
            public String tr_code;
            public String status;
            public String balance;

            public int confirm_transaction(String auth, String status, String tr_code){
                    this.tr_code = tr_code;
                    this.status = status;
                    this.balance = "800";
                    if(tr_code.length() > 0){
                        return 1;       // cu succes
                    } else {
                        return 0;       // fara succes, din diverse motive
                    }
            }
        }


}
