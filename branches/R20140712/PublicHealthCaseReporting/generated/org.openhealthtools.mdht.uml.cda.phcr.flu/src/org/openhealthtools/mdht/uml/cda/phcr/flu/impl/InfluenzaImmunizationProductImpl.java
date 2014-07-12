/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProductImpl;

import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaImmunizationProductOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza Immunization Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaImmunizationProductImpl extends ProductImpl implements InfluenzaImmunizationProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaImmunizationProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_IMMUNIZATION_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProductTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaImmunizationProductOperations.validateProductTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenzaImmunizationProduct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public InfluenzaImmunizationProduct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InfluenzaImmunizationProductImpl
