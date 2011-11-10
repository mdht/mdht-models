/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemStatusObservationImpl extends ObservationImpl implements ProblemStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationTargetOfEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationTargetOfEntryRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationNoAdditionalParticipants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationNoAdditionalParticipants(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationNoAdditionalRelationships(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationNoAdditionalRelationships(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationHasTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusObservationOperations.validateProblemStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // ProblemStatusObservationImpl
