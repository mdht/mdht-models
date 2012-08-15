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
import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisResultOrganizerImpl extends ResultOrganizerImpl implements SalmonellosisResultOrganizer {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SalmonellosisResultOrganizerImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_ORGANIZER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisResultOrganizerSalmonellosisResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisResultOrganizerOperations.validateSalmonellosisResultOrganizerSalmonellosisResultObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SalmonellosisResultObservation> getSalmonellosisResultObservations() {
    return SalmonellosisResultOrganizerOperations.getSalmonellosisResultObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisResultOrganizer init() {
    	CDAUtil.init(this);
    	return this;
  }

} //SalmonellosisResultOrganizerImpl
