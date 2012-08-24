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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisPossibleExposureLocationAndTypeActOperations;
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
public class SilicosisPossibleExposureLocationAndTypeActImpl extends ActImpl implements SilicosisPossibleExposureLocationAndTypeAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisPossibleExposureLocationAndTypeActImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SilicosisPackage.Literals.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPossibleExposureLocationAndTypeActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActStatusCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisPossibleExposureLocationAndTypeAct init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SilicosisPossibleExposureLocationAndTypeAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //SilicosisPossibleExposureLocationAndTypeActImpl
