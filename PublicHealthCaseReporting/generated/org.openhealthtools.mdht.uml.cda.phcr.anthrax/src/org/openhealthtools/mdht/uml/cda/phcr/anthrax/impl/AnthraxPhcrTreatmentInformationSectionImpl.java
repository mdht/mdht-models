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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrTreatmentInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxPhcrTreatmentInformationSectionImpl extends PhcrTreatmentInformationSectionImpl implements AnthraxPhcrTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnthraxPhcrTreatmentInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnthraxPackage.Literals.ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrTreatmentInformationSectionOperations.validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthraxTherapeuticRegimenAct getAnthraxTherapeuticRegimenAct() {
		return AnthraxPhcrTreatmentInformationSectionOperations.getAnthraxTherapeuticRegimenAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnthraxPhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthraxPhcrTreatmentInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AnthraxPhcrTreatmentInformationSectionImpl
