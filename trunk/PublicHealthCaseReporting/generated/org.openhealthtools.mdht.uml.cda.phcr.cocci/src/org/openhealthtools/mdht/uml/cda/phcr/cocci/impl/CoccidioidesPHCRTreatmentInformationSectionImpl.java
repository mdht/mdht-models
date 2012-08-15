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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesPHCRTreatmentInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coccidioides PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPHCRTreatmentInformationSectionImpl extends PhcrTreatmentInformationSectionImpl implements CoccidioidesPHCRTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoccidioidesPHCRTreatmentInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CocciPackage.Literals.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoccidioidesPHCRTreatmentInformationSectionOperations.validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoccidioidesTherapeuticRegimenAct getCoccidioidesTherapeuticRegimenAct() {
		return CoccidioidesPHCRTreatmentInformationSectionOperations.getCoccidioidesTherapeuticRegimenAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoccidioidesPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoccidioidesPHCRTreatmentInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //CoccidioidesPHCRTreatmentInformationSectionImpl
