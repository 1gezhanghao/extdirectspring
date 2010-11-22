/**
 * Copyright 2010 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ralscha.extdirectspring.demo.filter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.BeanUtils;

import com.google.common.collect.Ordering;

public class PropertyOrdering extends Ordering<Object> {

	private Method readMethod;

	public PropertyOrdering(Class<?> clazz, String propertyName) {
		readMethod = BeanUtils.getPropertyDescriptor(clazz, propertyName).getReadMethod();
	}

	@SuppressWarnings("unchecked")
	@Override
	public int compare(Object o1, Object o2) {
		try {
			Object value1 = readMethod.invoke(o1);
			Object value2 = readMethod.invoke(o2);
			return ((Comparable<Object>) value1).compareTo(value2);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return 0;

	}

}
