import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFromCsv(String line);

    List<BankTransaction> parseLinesFromCsv(List<String> lines);
}
