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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl extends PhcrRelevantDxTestsSectionImpl implements InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenzaResultObservation> getInfluenzaResultObservations() {
		return InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.getInfluenzaResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenzaImagingObservation> getInfluenzaImagingObservations() {
		return InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.getInfluenzaImagingObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
