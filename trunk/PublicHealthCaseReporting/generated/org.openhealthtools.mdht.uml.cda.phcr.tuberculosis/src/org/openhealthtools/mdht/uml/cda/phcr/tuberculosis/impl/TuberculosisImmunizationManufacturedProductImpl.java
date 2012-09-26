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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProductImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisImmunizationManufacturedProductOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Manufactured Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisImmunizationManufacturedProductImpl extends ProductImpl implements TuberculosisImmunizationManufacturedProduct
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TuberculosisImmunizationManufacturedProductImpl()
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
		return TuberculosisPackage.Literals.TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateProductTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisImmunizationManufacturedProductOperations.validateProductTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public TuberculosisImmunizationManufacturedProduct init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TuberculosisImmunizationManufacturedProduct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TuberculosisImmunizationManufacturedProductImpl
