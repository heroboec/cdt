/*******************************************************************************
 * Copyright (c) 2004, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM - Initial API and implementation
 *     Markus Schorn (Wind River Systems)
 *     Sergey Prigogin (Google)
 *******************************************************************************/
package org.eclipse.cdt.core.dom.ast.cpp;

import org.eclipse.cdt.core.dom.IName;
import org.eclipse.cdt.core.dom.ast.IBinding;
import org.eclipse.cdt.core.dom.ast.IType;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCompositeTypeSpecifier.ICPPASTBaseSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.ICPPUnknownType;

/**
 * Represents the relationship between a class and one of its base classes.
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ICPPBase extends Cloneable {
	public static final ICPPBase[] EMPTY_BASE_ARRAY = {};

	public static final int v_private = ICPPASTBaseSpecifier.v_private;
	public static final int v_protected = ICPPASTBaseSpecifier.v_protected;
	public static final int v_public = ICPPASTBaseSpecifier.v_public;

	/**
	 * The base class.  Generally a ICPPClassType, but may be a ICPPTemplateParameter.
	 * In the case of typedefs, the target type will be returned instead of the typedef itself.
	 */
	public IBinding getBaseClass();

	/**
	 * The base class. Generally a ICPPClassType, but may be an {@link ICPPUnknownType}.
	 * In the case of typedefs, the target type will be returned instead of the typedef itself.
	 * @since 5.5
	 */
	public IType getBaseClassType();

	/**
	 * @deprecated Don't use it, a base class may be specified without the use of a name.
	 */
	@Deprecated
	public IName getBaseClassSpecifierName();

	/**
	 * Returns the name of the class definition that originally declares the base.
	 * @since 5.5
	 */
	public IName getClassDefinitionName();

	/**
	 * The visibility qualifier applied to the base class.
	 */
	public int getVisibility();

	/**
	 * Whether this is a virtual base class.
	 */
	public boolean isVirtual();

	/**
	 * The base class is a source of inherited constructors if the class definition that declares
	 * this base contains a using declaration naming the constructors of the base class.
	 * @since 5.7
	 */
	public boolean isInheritedConstructorsSource();

	/**
	 * @since 5.1
	 */
	public ICPPBase clone();

	/**
	 * Used internally to change cloned bases.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setBaseClass(IBinding baseClass);

	/**
	 * Used internally to change cloned bases.
	 * @noreference This method is not intended to be referenced by clients.
	 */
	public void setBaseClass(IType baseClass);
}
