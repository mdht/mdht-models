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
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPHCRRelevantDxTestsSectionOperations;
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
public class SalmonellosisPHCRRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements SalmonellosisPHCRRelevantDxTestsSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SalmonellosisPHCRRelevantDxTestsSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SalmonellosisResultOrganizer> getSalmonellosisResultOrganizers() {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.getSalmonellosisResultOrganizers(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SalmonellosisResultObservation> getSalmonellosisResultObservations() {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.getSalmonellosisResultObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRRelevantDxTestsSection init() {
    	CDAUtil.init(this);
    	return this;
  }

} //SalmonellosisPHCRRelevantDxTestsSectionImpl
