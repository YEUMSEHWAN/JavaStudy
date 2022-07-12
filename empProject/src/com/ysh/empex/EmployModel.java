package com.ysh.empex;

import java.util.*;
import javax.swing.table.*;

//사원 전체를 보기 위한 객체
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;

	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVO;
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;

	public EmployModel() {

		/*
		 * 열의 개수와 행의 개수를 알아야 2차원 배열을 선언함. 테이블에서 컬럼의 이름을 얻어와서 1차배열로 선언.
		 */

		title = emDao.getColumnName();
		columnName = title.toArray();

		int columnCount = title.size();// 열
		list = emDao.getEmployeetotal();

		int rowCount = list.size();// 행

		data = new Object[rowCount][columnCount];

		for (int index = 0; index < rowCount; index++) {

			emVO = list.get(index);

			data[index][0] = emVO.getNo();
			data[index][1] = emVO.getName();
			data[index][2] = emVO.getJobGrade();
			data[index][3] = emVO.getDepartment();
			data[index][4] = emVO.getEmail();

		}

	}

	@Override
	public int getRowCount() {
		if (data == null)
			return 0;
		else
			return data.length;
	}

	@Override
	public int getColumnCount() {
		if (columnName == null)

			return 0;
		else
			return columnName.length;
	}

	@Override
	public String getColumnName(int column) {

		return (String) columnName[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return data[rowIndex][columnIndex];
	}

}
