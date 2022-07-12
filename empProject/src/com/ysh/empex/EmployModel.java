package com.ysh.empex;

import java.util.*;
import javax.swing.table.*;

//��� ��ü�� ���� ���� ��ü
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;

	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVO;
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;

	public EmployModel() {

		/*
		 * ���� ������ ���� ������ �˾ƾ� 2���� �迭�� ������. ���̺��� �÷��� �̸��� ���ͼ� 1���迭�� ����.
		 */

		title = emDao.getColumnName();
		columnName = title.toArray();

		int columnCount = title.size();// ��
		list = emDao.getEmployeetotal();

		int rowCount = list.size();// ��

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
