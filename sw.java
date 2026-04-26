import java.io.File;                              // Line 1
import jxl.Workbook;                              // Line 2
import jxl.write.*;                               // Line 3
import jxl.format.UnderlineStyle;                 // Line 4

public class sample {                             // Line 5

    public static void main(String[] args) throws Exception { // Line 6

        // Create Excel file
        WritableWorkbook workbook = Workbook.createWorkbook(new File("C:/sam.xls")); // Line 7
        WritableSheet sheet = workbook.createSheet("Report", 0);                     // Line 8

        // Header font (BOLD + UNDERLINE)
        WritableFont boldFont = new WritableFont(  // Line 9
                WritableFont.TIMES,                // Line 10
                12,                                // Line 11
                WritableFont.BOLD,                 // Line 12
                false,                             // Line 13
                UnderlineStyle.SINGLE              // Line 14
        );                                         // Line 15

        WritableCellFormat boldFormat = new WritableCellFormat(boldFont); // Line 16

        // Normal font
        WritableFont normalFont = new WritableFont(WritableFont.TIMES, 10); // Line 17
        WritableCellFormat normalFormat = new WritableCellFormat(normalFont); // Line 18

        // Headers
        sheet.addCell(new Label(0, 0, "Student Name", boldFormat)); // Line 19
        sheet.addCell(new Label(1, 0, "Subject 1", boldFormat));    // Line 20
        sheet.addCell(new Label(2, 0, "Subject 2", boldFormat));    // Line 21
        sheet.addCell(new Label(3, 0, "Subject 3", boldFormat));    // Line 22

        // Data
        for (int i = 1; i <= 10; i++) {                                              // Line 23
            sheet.addCell(new Label(0, i, "Student " + i, normalFormat));            // Line 24
            sheet.addCell(new jxl.write.Number(1, i, (i * i) + 10, normalFormat));  // Line 25
            sheet.addCell(new jxl.write.Number(2, i, (i * i) + 4, normalFormat));   // Line 26
            sheet.addCell(new jxl.write.Number(3, i, (i * i) + 3, normalFormat));   // Line 27
        }                                                                             // Line 28

        // Save file
        workbook.write();                          // Line 29
        workbook.close();                          // Line 30

        System.out.println("File generated: C:/sam.xls"); // Line 31
    }                                              // Line 32
}                                                  // Line 33
