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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesTherapeuticRegimenActOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coccidioides Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoccidioidesTherapeuticRegimenActImpl extends TherapeuticRegimenActImpl implements CoccidioidesTherapeuticRegimenAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesTherapeuticRegimenActImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return CocciPackage.Literals.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesTherapeuticRegimenActOperations.validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesTherapeuticRegimenActOperations.validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CoccidioidesTreatmentGivenSubstanceAdministration> getCoccidioidesTreatmentGivenSubstanceAdministrations() {
    return CoccidioidesTherapeuticRegimenActOperations.getCoccidioidesTreatmentGivenSubstanceAdministrations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CoccidioidesTreatmentNotGivenSubstanceAdministration> getCoccidioidesTreatmentNotGivenSubstanceAdministrations() {
    return CoccidioidesTherapeuticRegimenActOperations.getCoccidioidesTreatmentNotGivenSubstanceAdministrations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateTherapeuticRegimenActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(this, diagnostics, context);
  }
} //CoccidioidesTherapeuticRegimenActImpl
