
public class Main {

	public static void main(String[] args) {
		
		
		Cell cell1,cell2,cell3,cell4;
		
		cell1=new Cell();
		cell1.setCellValue("A1", 13);
		
		System.out.println("A1--"+cell1.getCellValue("A1"));
		
		cell2=new Cell();
		cell2.setCellValue("A2", 14);
		
		System.out.println("A2=="+cell2.getCellValue("A2"));
		
		cell3=new Cell();
		
		cell3.setCellValue("A3", (Integer)cell1.getCellValue("A1")+(Integer)cell2.getCellValue("A2") );
		
		System.out.println("A3--"+cell3.getCellValue("A3"));
		
		cell4=new Cell();
		
		cell4.setCellValue("A4", (Integer)cell1.getCellValue("A1")+(Integer)cell2.getCellValue("A2")+(Integer)cell3.getCellValue("A3"));

		System.out.println("A4--"+cell4.getCellValue(null));
		
	}

}
