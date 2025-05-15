package org.json.junit.data;

import java.lang.reflect.Field;

public abstract class Record {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getSimpleName());
		sb.append('[');
		Field[] fields = getClass().getDeclaredFields();
		boolean first = true;
		for (Field field : fields) {
			if (first) {
				first = false;
			} else {
				sb.append(", ");
			}
			String name = field.getName();
			sb.append(name);
			sb.append('=');
			field.setAccessible(true);
			try {
				sb.append(field.get(this));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		sb.append(']');
		return sb.toString();
	}
}