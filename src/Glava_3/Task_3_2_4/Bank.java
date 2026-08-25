package Glava_3.Task_3_2_4;
public class Bank implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if(bankClient.isBadCreditHistory()){
            throw new BadCreditHistoryException();
        }else if(bankClient.isProblemWithLaw()){
            throw new ProblemWithLawException();
        }else{
            return true;
        }
    }

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("problem with history");
        } catch (ProblemWithLawException e) {
            System.out.println();
        }
        return true;
    }
}





