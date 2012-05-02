/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhcrTreatmentInformationSectionImpl extends SectionImpl implements PhcrTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrTreatmentInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PHCR_TREATMENT_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrTreatmentInformationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrTreatmentInformationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrTreatmentInformationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TherapeuticRegimenAct getTherapeuticRegimenAct() {
		return PhcrTreatmentInformationSectionOperations.getTherapeuticRegimenAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhcrTreatmentInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
	
	  
} //PhcrTreatmentInformationSectionImpl
