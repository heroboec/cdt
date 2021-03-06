/*******************************************************************************
 * Copyright (c) 2015 QNX Software Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * QNX Software Systems - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.qt.core.qmldir;

import java.util.List;

/**
 * The main entry point into the qmldir AST. This interface contains a list of Commands specified within the qmldir file that it
 * represents.
 */
public interface IQDirAST extends IQDirASTNode {
	/**
	 * Gets the list of commands in the qmldir file that this <code>IQDirAST</code> represents.
	 *
	 * @return the list of all commands in the qmldir file
	 */
	public List<IQDirCommand> getCommands();
}
