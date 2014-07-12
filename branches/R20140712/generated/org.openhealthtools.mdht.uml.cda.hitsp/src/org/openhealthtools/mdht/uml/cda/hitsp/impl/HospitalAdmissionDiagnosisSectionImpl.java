/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.HospitalAdmissionDiagnosisSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Admission Diagnosis Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisSectionImpl extends
		org.openhealthtools.mdht.uml.cda.ihe.impl.HospitalAdmissionDiagnosisSectionImpl implements
		HospitalAdmissionDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionDiagnosisSectionOperations.validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPHospitalAdmissionDiagnosisSectionCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalAdmissionDiagnosisSectionOperations.validateHITSPHospitalAdmissionDiagnosisSectionCondition(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return HospitalAdmissionDiagnosisSectionOperations.getCondition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosisSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosisSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HospitalAdmissionDiagnosisSectionImpl
