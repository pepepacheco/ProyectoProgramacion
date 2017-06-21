package com.proyectogestioncitas.controler;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import com.proyectogestioncitas.model.dao.AppointmentDAO;
import com.proyectogestioncitas.model.pojo.Appointment;
import com.proyectogestioncitas.model.pojo.Client;

@SuppressWarnings("serial")
public class AppointmentTableModel extends AbstractTableModel implements TableModelListener, ListSelectionListener{

	//new Appointment(day, time, associatedCenter, doctorName)	
	private static String[] columnNames = {
			"Day",
			"Hour",
			"Associated center"
	};
	private static Client client = null;
	
	private static Object[][] tableData = new AppointmentTableModel().addAppointmentsToTableData(new AppointmentDAO(), client);
	
	//new ClientTableModel().addClientsToTableData(new ClientDAO());
	
	public AppointmentTableModel() {
		addTableModelListener(this);
	}
	
	
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		tableData[rowIndex][columnIndex] = aValue;
		fireTableCellUpdated(rowIndex, columnIndex);
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}



	@Override
	public int getRowCount() {
		
		return tableData.length;
	}

	@Override
	public int getColumnCount() {
		
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	
		return tableData[rowIndex][columnIndex];
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		System.out.println(e.getFirstIndex() + e.getLastIndex());
		
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Object[][] addAppointmentsToTableData(AppointmentDAO appDao, Client client) {
		this.client = client;
		
		List<Appointment> appList = appDao.getAppointmentsForClient(client);
		
		List<Appointment> clientAppList = new ArrayList<>();
		
		for (Appointment appointment : appList) {
			clientAppList.add(appointment);
			
		}
		
		int rows = appList.size();
		int columns = columnNames.length;
		
		Object dataTable[][] = new Object[rows][columns];
		
		for(int i = 0; i < rows ; i++){
			Appointment appointment = appList.get(i);
			dataTable[i] = new Object[]{appointment.getDay(), appointment.getTime(), appointment.getAssociatedCenter()};
		}
		
		return dataTable; 
	}

}
