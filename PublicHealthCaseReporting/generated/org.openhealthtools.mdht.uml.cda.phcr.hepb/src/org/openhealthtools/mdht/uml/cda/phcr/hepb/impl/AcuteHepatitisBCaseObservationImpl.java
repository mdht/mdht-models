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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBCaseObservationOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BCase Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBCaseObservationImpl extends CaseObservationImpl implements AcuteHepatitisBCaseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBCaseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBCaseObservationOperations.validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcuteHepatitisBSignsAndSymptomsObservation> getAcuteHepatitisBSignsAndSymptomsObservations() {
		return AcuteHepatitisBCaseObservationOperations.getAcuteHepatitisBSignsAndSymptomsObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBCaseObservationOperations.validateCaseObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBCaseObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AcuteHepatitisBCaseObservationImpl
