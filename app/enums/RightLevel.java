/**
* Copyright (c) 2015 Mustafa DUMLUPINAR, mdumlupinar@gmail.com
*
* This file is part of seyhan project.
*
* seyhan is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package enums;

import com.avaje.ebean.annotation.EnumValue;

public enum RightLevel {

	@EnumValue("Disable")
	Disable,

	@EnumValue("Enable")
	Enable,

	@EnumValue("Insert")
	Insert,

	@EnumValue("Update")
	Update,

	@EnumValue("Delete")
	Delete;

	public String key = "enum." + name();

	public static RightLevel findLevel(String name) {
		if (name != null) {
			return valueOf(name);
		}

		return Disable;
	}

}
