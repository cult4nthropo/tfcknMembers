package gui;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class DateComboBoxRenderer extends DefaultListCellRenderer {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		Object item = value;
		if (item instanceof Date) {
			item = dateFormat.format((Date) item);
		}
		return super.getListCellRendererComponent(list, item, index, isSelected, cellHasFocus);
	}

}
