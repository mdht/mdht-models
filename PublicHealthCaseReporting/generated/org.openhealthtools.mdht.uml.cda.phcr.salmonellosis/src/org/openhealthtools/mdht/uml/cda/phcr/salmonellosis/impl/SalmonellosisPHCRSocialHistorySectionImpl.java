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
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPHCRSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPHCRSocialHistorySectionImpl extends PhcrSocialHistorySectionImpl implements SalmonellosisPHCRSocialHistorySection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SalmonellosisPHCRSocialHistorySectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisPHCRSocialHistorySectionOperations.validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisPHCRSocialHistorySectionOperations.validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SalmonellosisPossibleExposureLocationAndTypeAct> getSalmonellosisPossibleExposureLocationAndTypeActs() {
    return SalmonellosisPHCRSocialHistorySectionOperations.getSalmonellosisPossibleExposureLocationAndTypeActs(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HIVStatusObservation getHIVStatusObservation() {
    return SalmonellosisPHCRSocialHistorySectionOperations.getHIVStatusObservation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
  }

} //SalmonellosisPHCRSocialHistorySectionImpl
