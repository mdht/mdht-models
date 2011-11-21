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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveStatusObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveStatusObservationImpl extends ObservationImpl implements AdvanceDirectiveStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationTargetOfEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationTargetOfEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationNoAdditionalParticipants(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationNoAdditionalParticipants(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationNoAdditionalRelationships(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationNoAdditionalRelationships(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveStatusObservationOperations.validateAdvanceDirectiveStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveStatusObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AdvanceDirectiveStatusObservationImpl
