/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;

import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterDiagnosis2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterDiagnosis2Impl extends EncounterDiagnosisImpl implements EncounterDiagnosis2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterDiagnosis2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterDiagnosisProblemObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterDiagnosis2Operations.validateEncounterDiagnosisProblemObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return EncounterDiagnosis2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterDiagnosisTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterDiagnosis2Operations.validateEncounterDiagnosisTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterDiagnosisCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterDiagnosis2Operations.validateEncounterDiagnosisCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterDiagnosis2Operations.validateEncounterDiagnosisCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EncounterDiagnosis2Impl
