import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/main/resources/";

    public void analyze(String filename, BankStatementParser parser) throws IOException {
        Path path = Paths.get(RESOURCES + filename);
        List<String> lines = Files.readAllLines(path);

        List<BankTransaction> transactions = parser.parseLinesFromCsv(lines);
        BankStatementProcessor processor = new BankStatementProcessor(transactions);


        collectSummary(processor);
    }

    public static void collectSummary(BankStatementProcessor bankStatementProcessor) {
        System.out.println("Total = " + bankStatementProcessor.calculateTotal());
        System.out.println("January Total = " + bankStatementProcessor.calculateTotalForMonth(Month.JANUARY));
        System.out.println("January Total = " + bankStatementProcessor.calculateTotalForMonth(Month.FEBRUARY));

        System.out.println("Total salary received is " + bankStatementProcessor.calculateForCategory("Salary"));

    }
}
