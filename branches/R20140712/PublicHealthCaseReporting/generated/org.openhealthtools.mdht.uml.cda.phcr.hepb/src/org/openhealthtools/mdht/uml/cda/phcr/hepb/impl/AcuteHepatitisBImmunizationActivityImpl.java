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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.MedicationActivityImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBImmunizationActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BImmunization Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBImmunizationActivityImpl extends MedicationActivityImpl implements AcuteHepatitisBImmunizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBImmunizationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBImmunizationActivityOperations.validateMedicationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcuteHepatitisBImmunizationActivity init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public AcuteHepatitisBImmunizationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AcuteHepatitisBImmunizationActivityImpl
