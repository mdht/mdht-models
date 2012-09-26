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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection;

import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.TssPhcrClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tss Phcr Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TssPhcrClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements TssPhcrClinicalInformationSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TssPhcrClinicalInformationSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return tssPackage.Literals.TSS_PHCR_CLINICAL_INFORMATION_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrClinicalInformationSectionTssCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TssPhcrClinicalInformationSectionOperations.validateTssPhcrClinicalInformationSectionTssCaseObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssCaseObservation getTssCaseObservation() {
    return TssPhcrClinicalInformationSectionOperations.getTssCaseObservation(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return TssPhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
  }
} //TssPhcrClinicalInformationSectionImpl
