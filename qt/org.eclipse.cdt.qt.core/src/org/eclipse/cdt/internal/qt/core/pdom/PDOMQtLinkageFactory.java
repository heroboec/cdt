/*
 * Copyright (c) 2013 QNX Software Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.cdt.internal.qt.core.pdom;

import org.eclipse.cdt.internal.core.pdom.PDOM;
import org.eclipse.cdt.internal.core.pdom.dom.IPDOMLinkageFactory;
import org.eclipse.cdt.internal.core.pdom.dom.PDOMLinkage;
import org.eclipse.cdt.internal.qt.core.Activator;
import org.eclipse.core.runtime.CoreException;

@SuppressWarnings("restriction")
public class PDOMQtLinkageFactory implements IPDOMLinkageFactory {

	@Override
	public PDOMLinkage getLinkage(PDOM pdom, long record) {
		try {
			return new QtPDOMLinkage(pdom, record);
		} catch(CoreException e) {
			Activator.log(e);
		}
		return null;
	}

	@Override
	public PDOMLinkage createLinkage(PDOM pdom) throws CoreException {
		return new QtPDOMLinkage(pdom);
	}
}
