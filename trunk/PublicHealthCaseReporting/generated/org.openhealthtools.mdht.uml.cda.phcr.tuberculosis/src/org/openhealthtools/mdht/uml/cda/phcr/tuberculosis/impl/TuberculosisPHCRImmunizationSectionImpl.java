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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ImmunizationsSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPHCRImmunizationSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Immunization Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRImmunizationSectionImpl extends ImmunizationsSectionImpl implements TuberculosisPHCRImmunizationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisPHCRImmunizationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisPHCRImmunizationSectionOperations.validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TuberculosisImmunizationActivitySubstanceAdministration> getTuberculosisImmunizationActivitySubstanceAdministrations()
  {
		return TuberculosisPHCRImmunizationSectionOperations.getTuberculosisImmunizationActivitySubstanceAdministrations(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateImmunizationsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisPHCRImmunizationSectionOperations.validateImmunizationsSectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisPHCRImmunizationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TuberculosisPHCRImmunizationSectionImpl
