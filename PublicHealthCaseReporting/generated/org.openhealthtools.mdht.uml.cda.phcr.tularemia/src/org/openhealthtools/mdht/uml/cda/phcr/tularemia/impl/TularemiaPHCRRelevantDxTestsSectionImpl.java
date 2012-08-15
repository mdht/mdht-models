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
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPHCRRelevantDxTestsSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia PHCR Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements TularemiaPHCRRelevantDxTestsSection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaPHCRRelevantDxTestsSectionImpl()
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
		return TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TularemiaResultOrganizer> getTularemiaResultOrganizers()
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.getTularemiaResultOrganizers(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TularemiaResultObservation> getTularemiaResultObservations()
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.getTularemiaResultObservations(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ImagingObservation> gettularemiaImagingObservations()
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.gettularemiaImagingObservations(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPHCRRelevantDxTestsSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TularemiaPHCRRelevantDxTestsSectionImpl
