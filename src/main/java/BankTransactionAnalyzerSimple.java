import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        BankStatementAnalyzer analyzer = new BankStatementAnalyzer();

        BankStatementParser bankStatementCSVParser = new BankStatementCSVParser();

        String fileName = "data.csv";

        analyzer.analyze(fileName, bankStatementCSVParser);
    }



}
