/**********************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 * IBM - Initial API and implementation
 **********************************************************************/
package org.eclipse.cdt.core.dom.ast;

import java.util.List;

/**
 * The translation unit represents a compilable unit of source.
 *
 * @author Doug Schaefer
 */
public interface IASTTranslationUnit extends IASTNode {

	ASTNodeProperty OWNED_DECLARATION = new ASTNodeProperty( "OWNED" ); //$NON-NLS-1$

    /**
	 * A translation unit contains an ordered sequence of declarations.
	 * 
	 * @return List of IASTDeclaration
	 */
	public List getDeclarations();
	
	public void addDeclaration( IASTDeclaration declaration );
	
	/**
	 * This returns the global scope for the translation unit.
	 * 
	 * @return the global scope
	 */
	public IScope getScope();
	
	/**
	 * Returns the list of declarations in this translation unit for the given
	 * binding. The list contains the IASTName nodes that declare the binding.
	 * 
	 * @param binding 
	 * @return List of IASTName nodes for the binding's declaration
	 */
	public List getDeclarations(IBinding binding);

	/**
	 * Returns the list of references in this translation unit to the given
	 * binding. This list contains the IASTName nodes that represent a use of
	 * the binding.
	 * 
	 * @param binding
	 * @return List of IASTName nodes representing uses of the binding
	 */
	public List getReferences(IBinding binding);
	
}
