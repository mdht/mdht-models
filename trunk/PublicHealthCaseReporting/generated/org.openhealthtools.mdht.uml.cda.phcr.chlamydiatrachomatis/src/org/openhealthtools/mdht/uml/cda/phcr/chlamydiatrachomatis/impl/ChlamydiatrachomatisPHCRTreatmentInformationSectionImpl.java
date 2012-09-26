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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl extends PhcrTreatmentInformationSectionImpl implements ChlamydiatrachomatisPHCRTreatmentInformationSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations.validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChlamydiatrachomatisTherapeuticRegimenAct getChlamydiatrachomatisTherapeuticRegimenAct() {
    return ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations.getChlamydiatrachomatisTherapeuticRegimenAct(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
  }
} //ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl
