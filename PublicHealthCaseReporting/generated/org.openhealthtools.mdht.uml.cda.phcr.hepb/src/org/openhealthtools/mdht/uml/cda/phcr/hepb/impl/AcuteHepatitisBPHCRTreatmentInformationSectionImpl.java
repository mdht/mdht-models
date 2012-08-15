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
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPHCRTreatmentInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BPHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPHCRTreatmentInformationSectionImpl extends PhcrTreatmentInformationSectionImpl implements AcuteHepatitisBPHCRTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBPHCRTreatmentInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRTreatmentInformationSectionOperations.validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBTherapeuticRegimenAct getAcuteHepatitisBTherapeuticRegimenAct() {
		return AcuteHepatitisBPHCRTreatmentInformationSectionOperations.getAcuteHepatitisBTherapeuticRegimenAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AcuteHepatitisBPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBPHCRTreatmentInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AcuteHepatitisBPHCRTreatmentInformationSectionImpl
