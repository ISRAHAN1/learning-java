package Glava_3.Task_3_2_4;

public class BankClient  {
     boolean BadCreditHistory;
     boolean ProblemWithLaw;

    BankClient(boolean  BadCreditHistory, boolean ProblemWithLaw){
        this.BadCreditHistory=BadCreditHistory;
        this.ProblemWithLaw=ProblemWithLaw;
    }

    public boolean isBadCreditHistory() {
        return BadCreditHistory;
    }

    public boolean isProblemWithLaw() {
        return ProblemWithLaw;
    }


}



