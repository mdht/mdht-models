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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WnvPhcrRelevantDxTestsSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WnvPhcrRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements WnvPhcrRelevantDxTestsSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WnvPhcrRelevantDxTestsSectionImpl()
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
    return WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return WnvPhcrRelevantDxTestsSectionOperations.validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return WnvPhcrRelevantDxTestsSectionOperations.validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<WnvResultObservation> getWnvResultObservations() {
    return WnvPhcrRelevantDxTestsSectionOperations.getWnvResultObservations(this);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<WnvResultOrganizer> getWnvResultOrganizers() {
    return WnvPhcrRelevantDxTestsSectionOperations.getWnvResultOrganizers(this);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return WnvPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WnvPhcrRelevantDxTestsSection init() {
      return Initializer.Util.init(this);
  }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WnvPhcrRelevantDxTestsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //WnvPhcrRelevantDxTestsSectionImpl
