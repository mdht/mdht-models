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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPossibleExposureLocationAndTypeActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia Possible Exposure Location And Type Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaPossibleExposureLocationAndTypeActImpl extends ActImpl implements TularemiaPossibleExposureLocationAndTypeAct
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaPossibleExposureLocationAndTypeActImpl()
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
		return TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaPossibleExposureLocationAndTypeActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaPossibleExposureLocationAndTypeActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActClassCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActMoodCode(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActCode(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActCodeP(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActStatusCode(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TularemiaPossibleExposureLocationAndTypeActOperations.validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPossibleExposureLocationAndTypeAct init() {
	    return Initializer.Util.init(this);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TularemiaPossibleExposureLocationAndTypeAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TularemiaPossibleExposureLocationAndTypeActImpl
