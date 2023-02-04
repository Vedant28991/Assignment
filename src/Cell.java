
public class Cell {

	private String cellId;
	private Object value;
	
	public String getCellId() {
		return cellId;
	}
	public void setCellId(String cellId) {
		this.cellId = cellId;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Cell(String cellId, Integer value) {
		super();
		this.cellId = cellId;
		this.value = value;
	}
	public Cell() {
		
	}
	
	public void setCellValue(String cellId, Object value) {
		
			this.cellId=cellId;
			this.value=value;
		
	}
	
	public Object getCellValue(String cellId) {
		return this.value;	
		
	}
	
	

}
