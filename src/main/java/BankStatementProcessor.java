import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double calculateTotal() {
        double total = 0d;
        for (BankTransaction transaction : bankTransactions) {
            total += transaction.getAmount();
        }
        return total;
    }

    public double calculateTotalForMonth(Month month) {
        double total = 0d;
        for (BankTransaction transaction : bankTransactions) {
            if (transaction.getDate().getMonth() == month) {
                total += transaction.getAmount();
            }

        }
        return total;
    }

    public double calculateForCategory(String category) {
        double total = 0d;
        for (BankTransaction transaction : bankTransactions) {
            if (transaction.getDescription().equals(category)) {
                total += transaction.getAmount();
            }

        }
        return total;
    }

}
