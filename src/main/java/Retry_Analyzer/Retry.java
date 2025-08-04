package Retry_Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int attempt = 0;
    int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (attempt < maxRetry) {
            System.out.println("Retrying test: " + result.getName() + " | Attempt #" + (attempt + 1));
            attempt++;
            return true;
        }
        return false;
    }

}
