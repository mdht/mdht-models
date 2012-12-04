/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Medicinal Supply Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonMedicinalSupplyActivityImpl extends SupplyImpl implements NonMedicinalSupplyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonMedicinalSupplyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityEffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityProductInstanceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityProductInstanceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityProductInstance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivityOperations.validateNonMedicinalSupplyActivityProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance getProductInstance() {
		return NonMedicinalSupplyActivityOperations.getProductInstance(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	public NonMedicinalSupplyActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NonMedicinalSupplyActivityImpl
