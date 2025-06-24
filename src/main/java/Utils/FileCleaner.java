package Utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;


public class FileCleaner {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		
		Path inputPath = Paths.get("src/main/java/com/vaultify/vaultify_platform/Property_management.java");
        Path outputPath = Paths.get("Clean_Property_management.java");
        String content = new String(Files.readAllBytes(inputPath), "UTF-8");
        // Remove null, replacement chars and other invisible control characters
        byte[] rawBytes = Files.readAllBytes(inputPath);
        StringBuilder cleaned = new StringBuilder();

        for (byte b : rawBytes) {
            char ch = (char) (b & 0xFF);
            if (isSafeCharacter(ch)) {
                cleaned.append(ch);
            }
        }

        Files.write(outputPath, cleaned.toString().getBytes(StandardCharsets.UTF_8));
        System.out.println("✅ Cleaned file created: " + outputPath.toAbsolutePath());
		
		
		
		
		
		
	}

	private static boolean isSafeCharacter(char ch) {
        // Allow printable characters and standard newlines
        return (ch >= 32 && ch <= 126) || ch == '\n' || ch == '\r' || ch == '\t';
    }
	
	
	
	
	
	
}
