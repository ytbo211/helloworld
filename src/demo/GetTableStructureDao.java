package demo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GetTableStructureDao {
	public void inserttablestructure(GetTableStructureTest gtst) throws SQLException {
		Connection conn=DbUtil.getConnection();
		String sql=""+
				   "insert into yt_test "+
				   "(TableId," + 
				   "TableName," + 
				   "TableDesc," + 
				   "ColumnId," + 
				   "ColumnName," + 
				   "ColumnType," + 
				   "ColumnDesc," + 
				   "ParentTableId," + 
				   "ParentTableName," + 
				   "ParentTableDesc," + 
				   "WhereCondition) "+
				   "values("+
				   "?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		ptmt.setString(1, gtst.getTableId());
		ptmt.setString(2, gtst.getTableName());
		ptmt.setString(3, gtst.getTableDesc());
		ptmt.setString(4, gtst.getColumnId());
		ptmt.setString(5, gtst.getColumnName());
		ptmt.setString(6, gtst.getColumnDesc());
		ptmt.setString(7, gtst.getParentTableId());
		ptmt.setString(8, gtst.getParentTableName());
		ptmt.setString(9, gtst.getParentTableDesc());
		ptmt.setString(10, gtst.getWhereCondition());
		
		ptmt.execute();
		System.out.println("GetTableStructure方法获取完毕");
		
	}
}
