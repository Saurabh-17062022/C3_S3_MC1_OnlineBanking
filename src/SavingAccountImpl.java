import data.SavingAccount;

public class SavingAccountImpl extends SavingAccount {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountHolderName("Sam");
        savingAccount.setAccountNumber(401303);
        savingAccount.setAccountOpeningDate("20/07/2022");
        savingAccount.setAccountStatus("Active");
        savingAccount.setInternetOrMobileBankingEnable("Yes");
        savingAccount.setModeOfOperation("self");
        savingAccount.setAvailableBalance(50000);
        savingAccount.setInterestRateInPercent(2.0);
        savingAccount.setTotalBalance((int) ((savingAccount.getAvailableBalance() * savingAccount.getInterestRateInPercent() / 100) + savingAccount.getAvailableBalance()));
        savingAccount.displayAccountDetails();
        System.out.println("Available balance after debit : "+savingAccount.debitBalance((int) savingAccount.getTotalBalance(), 25000));
        System.out.println("Available Balance after deposit : "+savingAccount.creditBalance( (int) savingAccount.getTotalBalance(), 25000));
        System.out.println("Available Balance : "+savingAccount.retrieveBalance(savingAccount.getTotalBalance(),savingAccount.creditBalance((int) savingAccount.getTotalBalance(),25000)));
    }
}