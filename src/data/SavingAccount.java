package data;

public class SavingAccount {
    private String accountHolderName;
    private int accountNumber;
    private int availableBalance;
    private int totalBalance;
    private String accountStatus;
    private String internetOrMobileBankingEnable;
    private String accountOpeningDate;
    private double interestRateInPercent;
    private String modeOfOperation;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    public long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getInternetOrMobileBankingEnable() {
        return internetOrMobileBankingEnable;
    }

    public void setInternetOrMobileBankingEnable(String internetOrMobileBankingEnable) {
        this.internetOrMobileBankingEnable = internetOrMobileBankingEnable;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public double getInterestRateInPercent() {
        return interestRateInPercent;
    }

    public void setInterestRateInPercent(double interestRateInPercent) {
        this.interestRateInPercent = interestRateInPercent;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public int retrieveBalance(long totalBalance, int availableBalance) {
        return availableBalance;
    }

    public int debitBalance(int availableBalance, int withdrawalAmount) {
        return availableBalance - withdrawalAmount;
    }

    public int creditBalance(int availableBalance, int amountDeposited) {
        return availableBalance + amountDeposited;
    }

    public void displayAccountDetails() {
        System.out.println("Account holder name : " + getAccountHolderName());
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Account Opening Date : " + getAccountOpeningDate());
        System.out.println("Account Status : " + getAccountStatus());
        System.out.println("Internet or Mobile banking enabled : " + getInternetOrMobileBankingEnable());
        System.out.println("Mode of Operation : " + getModeOfOperation());
        System.out.println("Available balance : " + getAvailableBalance());
        System.out.println("Interest rate : " + getInterestRateInPercent() + "%");
        System.out.println("Total balance :" + getTotalBalance());
    }
}
