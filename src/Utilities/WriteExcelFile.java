package Utilities;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) {
		try (XSSFWorkbook wordbook =new XSSFWorkbook()){
			XSSFSheet sampleSheet=wordbook.createSheet("SampleSheet");
			
			//Se define un conjunto de datos usando TreMap
			Map<String,Object[]> dataset=new TreeMap<String,Object[]>();
			
			//Se agregan los datos al mapa (Cada fila es un arreglo de objetos)
			dataset.put("1", new Object[] {"ID","NOMBRE","CIUDAD"});
			
			
		}
		catch(IOException io) {
			
		}
	}

}
