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
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPHCRClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPHCRClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements ChlamydiatrachomatisPHCRClinicalInformationSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ChlamydiatrachomatisPHCRClinicalInformationSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRClinicalInformationSectionOperations.validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChlamydiatrachomatisCaseObservation getChlamydiatrachomatisCaseObservation() {
    return ChlamydiatrachomatisPHCRClinicalInformationSectionOperations.getChlamydiatrachomatisCaseObservation(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ChlamydiatrachomatisPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
  }
} //ChlamydiatrachomatisPHCRClinicalInformationSectionImpl
