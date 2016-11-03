package com.mockito.TestQueryMock;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class DatabaseOprTest {

	
//	@Test
//	public void test3() throws SQLException, IOException {
//
//	    Connection jdbcConnection = Mockito.mock(Connection.class);
//	    ResultSet resultSet = Mockito.mock(ResultSet.class);
//
//	    Mockito.when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(true).thenReturn(false);
//	    Mockito.when(resultSet.getString(1)).thenReturn("table_r3").thenReturn("table_r1").thenReturn("table_r2");
//	    Mockito.when(jdbcConnection
//	            .createStatement()
//	            .executeQuery("SELECT * FROM EMP"))
//	            .thenReturn(resultSet);
//	    
//	    Statement statement = Mockito.mock(Statement.class);
//	    Mockito.when(statement.executeQuery("SELECT name FROM tables")).thenReturn(resultSet);
//
//	    
//	    Mockito.when(jdbcConnection.createStatement()).thenReturn(statement);
//
//	   
//
//	    //then
//	    Assert.assertEquals(nameOfTablesList.size(), 3);
//	}

}
