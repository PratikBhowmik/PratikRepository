package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFTableColumn;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilGuru {

	public static final int WAIT_TIME = 30;
	public static final String BASE_URL = "http://www.demo.guru99.com/";
	public static final String USER_NAME = "impratikbhowmik@gmail.com";
	public static final String PASSWORD = "Patrick@97";
	public static final String VALID = "valid";
	public static final String INVALID = "invalid";
	public static final String EXPECTED_TITLE = "Guru99 Bank Home Page";
	public static final String EXPECTED_ERROR = "User or Password is not valid";
	public static final String FILE_PATH = "C://Users//DIS//Documents//testData.xlsx"; // File Path
	public static final String SHEET_NAME = "Sheet"; // Sheet name
	public static final String TABLE_NAME = "testData"; // Name of data table

	public static String[][] getDataFromExcel(String xlFilePath, String sheetName, String tableName) throws Exception {

		// Declare a 2 dimensions array to store all the test data read from
		// excel

		String[][] tabArray = null;

		// get the workbook file. Provide the path of excel file

		FileInputStream file = new FileInputStream(FILE_PATH);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// get the sheet name

		XSSFSheet sheet = workbook.getSheet(SHEET_NAME);

		int startRow, startCol, endRow, endCol, ci, cj;

		// find cell position which contain first appear table name

		CellAddress tableStart = sheet.getActiveCell();

		// Row position of FIRST appear table name

		startRow = tableStart.getRow();

		// Col position of FIRST appear table name

		startCol = tableStart.getColumn();

		// find cell position which contain last appear table name

		// CellAddress tableEnd = sheet.get(tableName, startCol + 1, startRow + 1, 100,
		// 64000, false);

		// Row position of LAST appear table name

		// endRow = tableEnd.getRow();

		// Col position of LAST appear table name

		// endCol = tableEnd.getColumn();

		// tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		// ci = 0;

		// Store all data in an array

		// for (int i = startRow + 1; i < endRow; i++, ci++) {
		// cj = 0;
		// for (int j = startCol + 1; j < endCol; j++, cj++) {
		// Get content of each cell and store to each array element.
		// tabArray[ci][cj] = sheet.getCell(j, i).getContents();
		// }
		// }

		return (tabArray);

	}
}
