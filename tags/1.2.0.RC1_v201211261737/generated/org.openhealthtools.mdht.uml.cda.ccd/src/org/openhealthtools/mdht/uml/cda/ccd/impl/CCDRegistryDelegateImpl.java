/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CCDRegistryDelegateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Delegate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CCDRegistryDelegateImpl extends EObjectImpl implements CCDRegistryDelegate {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CCDRegistryDelegateImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.CCD_REGISTRY_DELEGATE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EClass getEClass(String templateId, Object context) {
		return CCDRegistryDelegateOperations.getEClass(this, templateId, context);
	}

} // CCDRegistryDelegateImpl
