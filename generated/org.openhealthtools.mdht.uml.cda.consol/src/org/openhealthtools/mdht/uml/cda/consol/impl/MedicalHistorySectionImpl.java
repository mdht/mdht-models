/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicalHistorySectionImpl extends SectionImpl implements MedicalHistorySection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicalHistorySectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ConsolPackage.Literals.MEDICAL_HISTORY_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalHistorySectionOperations.validateMedicalHistorySectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalHistorySectionOperations.validateMedicalHistorySectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalHistorySectionOperations.validateMedicalHistorySectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalHistorySectionOperations.validateMedicalHistorySectionTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicalHistorySection init() {
    	CDAUtil.init(this);
    	return this;
  }
} // MedicalHistorySectionImpl
