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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisCaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SilicosisCaseObservationImpl extends CaseObservationImpl implements SilicosisCaseObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisCaseObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SilicosisPackage.Literals.SILICOSIS_CASE_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisCaseObservationOperations.validateSilicosisCaseObservationValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisCaseObservationOperations.validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SilicosisSignsAndSymptomsObservation> getSilicosisSignsAndSymptomsObservations() {
    return SilicosisCaseObservationOperations.getSilicosisSignsAndSymptomsObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SilicosisCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }

} //SilicosisCaseObservationImpl
