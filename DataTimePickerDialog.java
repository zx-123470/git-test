import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataTimePickerDialog {
	private static final DateTimeFormatter FORMATTER =
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入日期和时间（yyyy-MM-dd HH:mm:ss）：");
		String input = scanner.nextLine();

		try {
			LocalDateTime dateTime = LocalDateTime.parse(input, FORMATTER);
			System.out.println("选择的时间是：" + dateTime.format(FORMATTER));
		} catch (Exception e) {
			System.out.println("日期格式错误，请按指定格式输入。");
		}
	}
}
