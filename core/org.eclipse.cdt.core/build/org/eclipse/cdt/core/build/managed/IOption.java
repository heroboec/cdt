/**********************************************************************
 * Copyright (c) 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 * IBM - Initial API and implementation
 **********************************************************************/
package org.eclipse.cdt.core.build.managed;

/**
 * 
 */
public interface IOption extends IBuildObject {
	// Type for the value of the option
	public static final int BOOLEAN = 0;
	public static final int ENUMERATED = 1;
	public static final int STRING = 2;
	public static final int STRING_LIST = 3;
	public static final int INCLUDE_PATH = 4;
	public static final int PREPROCESSOR_SYMBOLS = 5;
	public static final int LIBRARIES = 6;
	
	// Schema attribute names for option elements
	public static final String CATEGORY = "category";
	public static final String COMMAND = "command";
	public static final String DEFAULT_VALUE = "defaultValue";
	public static final String ENUM_VALUE = "enumeratedOptionValue";
	public static final String IS_DEFAULT = "isDefault";
	public static final String LIST_VALUE = "listOptionValue";
	public static final String TYPE_BOOL = "boolean";
	public static final String TYPE_ENUM = "enumerated";
	public static final String TYPE_INC_PATH = "includePath";
	public static final String TYPE_LIB = "libs";
	public static final String TYPE_STRING = "string";
	public static final String TYPE_STR_LIST = "stringList";
	public static final String VALUE_TYPE = "valueType";

	// Schema attribute names for listOptionValue elements
	public static final String LIST_ITEM_VALUE = "value";
	public static final String LIST_ITEM_BUILTIN = "builtIn";

	
	/**
	 * If this option is defined as an enumeration, this function returns
	 * the list of possible values for that enum.
	 * 
	 * If this option is not defined as an enumeration, it returns <code>null</code>.
	 * @return
	 */
	public String [] getApplicableValues();

	/**
	 * Answers the value for a boolean option.
	 * 
	 * @return 
	 * @throws BuildException
	 */
	public boolean getBooleanValue() throws BuildException;
	
	/**
	 * Answers an array of strings containing the built-in values 
	 * defined for a stringList, includePaths, definedSymbols, or libs
	 * option. If none have been defined, the array will be empty but
	 * never <code>null</code>.
	 * 
	 * @return
	 */
	public String[] getBuiltIns();
		
	/**
	 * Returns the category for this option.
	 * 
	 * @return
	 */
	public IOptionCategory getCategory();
	
	/**
	 * Answers a <code>String</code> containing the actual command line 
	 * option associated with the option
	 * 
	 * @return  
	 */
	public String getCommand();
	
	/**
	 * @return
	 * @throws BuildException
	 */
	public String[] getDefinedSymbols() throws BuildException;

	/**
	 * Answers the command associated with the enumeration name. For
	 * example, if the enumeration name was 'Default' for the debug 
	 * level option of the Gnu compiler, and the plugin manifest defined
	 * that as -g, then the return value would be a String containing "-g"  
	 *  
	 * @return 
	 */
	public String getEnumCommand (String name);

	/**
	 * Answers an array of <code>String</code> containing the includes paths
	 * defined in the build model.
	 * 
	 * @return
	 * @throws BuildException
	 */
	public String[] getIncludePaths() throws BuildException;
		

	/**
	 * Answers an array or <code>String</code>s containing the libraries
	 * that must be linked into the project.
	 * @return
	 */
	public String[] getLibraries() throws BuildException ;

	/**
	 * Answers a <code>String</code> containing the selected enumeration in an
	 * enumerated option. For an option that has not been changed by the user, 
	 * the receiver will answer with the default defined in the plugin manifest.
	 * If the user has modified the selection, the receiver will answer with the
	 * overridden selection.
	 * 
	 * @return 
	 * @throws BuildException
	 */
	public String getSelectedEnum () throws BuildException;	

	/**
	 * Returns the current value for this option if it is a List of Strings.
	 * 
	 * @return
	 * @throws BuildException
	 */
	public String [] getStringListValue() throws BuildException;
	
	/**
	 * Returns the current value for this option if it is a String
	 * 
	 * @return
	 * @throws BuildException
	 */
	public String getStringValue() throws BuildException;
	
	/**
	 * Returns the tool defining this option.
	 * 
	 * @return
	 */
	public ITool getTool();
	
	/**
	 * Get the type for the value of the option.
	 * 
	 * @return
	 */
	public int getValueType();

}
