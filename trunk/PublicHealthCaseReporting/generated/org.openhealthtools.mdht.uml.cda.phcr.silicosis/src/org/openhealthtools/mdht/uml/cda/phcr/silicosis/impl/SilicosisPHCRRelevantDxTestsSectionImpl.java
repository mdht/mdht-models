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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisPHCRRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SilicosisPHCRRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements SilicosisPHCRRelevantDxTestsSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SilicosisPHCRRelevantDxTestsSectionImpl()
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
    return SilicosisPackage.Literals.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SilicosisPHCRRelevantDxTestsSectionOperations.validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SilicosisImagingObservation> getSilicosisImagingObservations()
  {
    return SilicosisPHCRRelevantDxTestsSectionOperations.getSilicosisImagingObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SilicosisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SilicosisPHCRRelevantDxTestsSection init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SilicosisPHCRRelevantDxTestsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SilicosisPHCRRelevantDxTestsSectionImpl
