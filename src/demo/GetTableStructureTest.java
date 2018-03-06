package demo;

public class GetTableStructureTest {
	private String TableId;
	private String TableName;
	private String TableDesc;
	private String ColumnId;
	private String ColumnName;
	private String ColumnType;
	private String ColumnDesc;
	private String ParentTableId;
	private String ParentTableName;
	private String ParentTableDesc;
	private String WhereCondition;

	public GetTableStructureTest(String tableId, String tableName, String tableDesc, String columnId, String columnName,
			String columnType, String columnDesc, String parentTableId, String parentTableName, String parentTableDesc,
			String whereCondition) {
		super();
		TableId = tableId;
		TableName = tableName;
		TableDesc = tableDesc;
		ColumnId = columnId;
		ColumnName = columnName;
		ColumnType = columnType;
		ColumnDesc = columnDesc;
		ParentTableId = parentTableId;
		ParentTableName = parentTableName;
		ParentTableDesc = parentTableDesc;
		WhereCondition = whereCondition;
	}

	@Override
	public String toString() {
		return "GetTableStructureTest [TableId=" + TableId + ", TableName=" + TableName + ", TableDesc=" + TableDesc
				+ ", ColumnId=" + ColumnId + ", ColumnName=" + ColumnName + ", ColumnType=" + ColumnType
				+ ", ColumnDesc=" + ColumnDesc + ", ParentTableId=" + ParentTableId + ", ParentTableName="
				+ ParentTableName + ", ParentTableDesc=" + ParentTableDesc + ", WhereCondition=" + WhereCondition + "]";
	}

	public String getTableId() {
		return TableId;
	}
	public void setTableId(String tableId) {
		TableId = tableId;
	}
	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public String getTableDesc() {
		return TableDesc;
	}
	public void setTableDesc(String tableDesc) {
		TableDesc = tableDesc;
	}
	public String getColumnId() {
		return ColumnId;
	}
	public void setColumnId(String columnId) {
		ColumnId = columnId;
	}
	public String getColumnName() {
		return ColumnName;
	}
	public void setColumnName(String columnName) {
		ColumnName = columnName;
	}
	public String getColumnType() {
		return ColumnType;
	}
	public void setColumnType(String columnType) {
		ColumnType = columnType;
	}
	public String getColumnDesc() {
		return ColumnDesc;
	}
	public void setColumnDesc(String columnDesc) {
		ColumnDesc = columnDesc;
	}
	public String getParentTableId() {
		return ParentTableId;
	}
	public void setParentTableId(String parentTableId) {
		ParentTableId = parentTableId;
	}
	public String getParentTableName() {
		return ParentTableName;
	}
	public void setParentTableName(String parentTableName) {
		ParentTableName = parentTableName;
	}
	public String getParentTableDesc() {
		return ParentTableDesc;
	}
	public void setParentTableDesc(String parentTableDesc) {
		ParentTableDesc = parentTableDesc;
	}
	public String getWhereCondition() {
		return WhereCondition;
	}
	public void setWhereCondition(String whereCondition) {
		WhereCondition = whereCondition;
	}
	
	
}
