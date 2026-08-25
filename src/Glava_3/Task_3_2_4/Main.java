package Glava_3.Task_3_2_4;
public class Main {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {

        BankClient bankClient = new BankClient(false, false);
        BankWorker bankWorker = new Bank();
        Bank worker = new Bank();
        worker.getCreditForClient(bankWorker, bankClient);
        worker.checkClientForCredit(bankClient);
    }
}
