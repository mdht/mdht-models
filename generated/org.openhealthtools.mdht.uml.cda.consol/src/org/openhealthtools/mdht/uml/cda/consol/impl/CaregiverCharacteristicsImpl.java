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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.CaregiverCharacteristicsOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caregiver Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CaregiverCharacteristicsImpl extends ObservationImpl implements CaregiverCharacteristics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaregiverCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CAREGIVER_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsValueCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsValueCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipantTimeLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTimeLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipantTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTimeHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipantTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaregiverCharacteristicsParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CaregiverCharacteristicsOperations.validateCaregiverCharacteristicsParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaregiverCharacteristics init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaregiverCharacteristics init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CaregiverCharacteristicsImpl
