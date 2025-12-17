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
			dataset.put("2", new Object[] {"01","Jeremíass","Medellín"});
			dataset.put("3", new Object[] {"02","Joel","Medellín"});
			dataset.put("4", new Object[] {"03","Judith","Medellín"});
			dataset.put("5", new Object[] {"04","Carlos","Riohacha"});
			dataset.put("6", new Object[] {"05","Carmen","Planeta Rica"});
			dataset.put("7", new Object[] {"06","Paula","Montería"});
			
			//Se obtiene el conjunto de claves del mapa
			Set<String> set=dataset.keySet();
			int rownum=0;
			
			//Se itera sobre cada fila de datos
			for(String key : set) {
				//Se crea una nueva fila en la hoja
				Row row =sampleSheet.createRow(rownum++);
				
				//Se obtienen los datos correspondientes a la fila
				Object[]data=dataset.get(key);
				int cellNum=0;
				
				//Se itera sobre los valores de la fila para crear celdas
				for (Object value : data) {
					//Se crea una nueva celda
					Cell cell=row.createCell(cellNum++);
					
					//Se verifica el tipo de dato y se asigna el valor de la celda
					if(value instanceof String) {
						cell.setCellValue((String)value);
					}
					else if(value instanceof Integer){
						cell.setCellValue((Integer)value);
					}
					
				}
			}
			
			//Se escribe el archivo de Excel en el disco duro
			try {
				//Define la ruta y nombre del archivo de salida
				FileOutputStream writeFile=new FileOutputStream("sampleTest.xlsx");
				
				//Escribe el contenido del workbook en el archivo
				wordbook.write(writeFile);
				
				//Cierra el flujo del archivo
				writeFile.close();
				System.out.println("El archivo se creó exitosamente");
			}
			//Manejo de error si el archivo no se puede crear o encontrar
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			//Manejo de error de entrada/salida general
			catch(IOException e) {
				e.printStackTrace();
			
		}
		
	}
		//Manejo de error si el woerdbook no puede ser creado o cerrado
		catch(IOException io) {
		io.printStackTrace();
	}

}
}
