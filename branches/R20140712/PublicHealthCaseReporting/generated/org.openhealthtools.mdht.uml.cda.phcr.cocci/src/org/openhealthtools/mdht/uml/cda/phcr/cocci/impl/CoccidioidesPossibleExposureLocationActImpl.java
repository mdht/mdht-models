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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesPossibleExposureLocationActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coccidioides Possible Exposure Location Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPossibleExposureLocationActImpl extends ActImpl implements CoccidioidesPossibleExposureLocationAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesPossibleExposureLocationActImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesPossibleExposureLocationActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesPossibleExposureLocationActOperations.validateCoccidioidesPossibleExposureLocationActTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesPossibleExposureLocationActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesPossibleExposureLocationActOperations.validateCoccidioidesPossibleExposureLocationActClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesPossibleExposureLocationActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesPossibleExposureLocationActOperations.validateCoccidioidesPossibleExposureLocationActCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesPossibleExposureLocationActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesPossibleExposureLocationActOperations.validateCoccidioidesPossibleExposureLocationActMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoccidioidesPossibleExposureLocationActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CoccidioidesPossibleExposureLocationActOperations.validateCoccidioidesPossibleExposureLocationActStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesPossibleExposureLocationActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesPossibleExposureLocationActOperations.validateCoccidioidesPossibleExposureLocationActStatusCode(this, diagnostics, context);
  }
} //CoccidioidesPossibleExposureLocationActImpl
