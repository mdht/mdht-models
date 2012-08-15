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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPHCRSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia PHCR Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRSocialHistorySectionImpl extends PhcrSocialHistorySectionImpl implements TularemiaPHCRSocialHistorySection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaPHCRSocialHistorySectionImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return TularemiaPackage.Literals.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaPHCRSocialHistorySectionOperations.validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TularemiaPossibleExposureLocationAndTypeAct> getTularemiaPossibleExposureLocationAndTypeActs() {
		return TularemiaPHCRSocialHistorySectionOperations.getTularemiaPossibleExposureLocationAndTypeActs(this);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPHCRSocialHistorySection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TularemiaPHCRSocialHistorySectionImpl
