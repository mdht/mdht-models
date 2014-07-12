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
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPHCRClinicalInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tularemia PHCR Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements TularemiaPHCRClinicalInformationSection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaPHCRClinicalInformationSectionImpl()
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
		return TularemiaPackage.Literals.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRClinicalInformationSectionOperations.validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaCaseObservation getTularemiaCaseObservation()
  {
		return TularemiaPHCRClinicalInformationSectionOperations.getTularemiaCaseObservation(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TularemiaPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TularemiaPHCRClinicalInformationSection init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TularemiaPHCRClinicalInformationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TularemiaPHCRClinicalInformationSectionImpl
