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
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPossibleExposureLocationAndTypeActOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Exposure Location And Type Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPossibleExposureLocationAndTypeActImpl extends ActImpl implements SalmonellosisPossibleExposureLocationAndTypeAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SalmonellosisPossibleExposureLocationAndTypeActImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisPossibleExposureLocationAndTypeActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPossibleExposureLocationAndTypeActOperations.validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPossibleExposureLocationAndTypeAct init() {
    	CDAUtil.init(this);
    	return this;
  }

} //SalmonellosisPossibleExposureLocationAndTypeActImpl
