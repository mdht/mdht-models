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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl extends PhcrRelevantDxTestsSectionImpl implements AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcuteHepatitisBResultObservation> getAcuteHepatitisBResultObservations() {
		return AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.getAcuteHepatitisBResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
