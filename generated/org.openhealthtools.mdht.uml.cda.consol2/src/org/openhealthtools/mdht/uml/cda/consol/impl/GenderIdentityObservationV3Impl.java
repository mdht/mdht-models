/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.GenderIdentityObservationV3Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gender Identity Observation V3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenderIdentityObservationV3Impl extends SocialHistoryObservation2Impl
		implements GenderIdentityObservationV3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenderIdentityObservationV3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENDER_IDENTITY_OBSERVATION_V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3ValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3ValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3ClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3MoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3IVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderIdentityObservationV3IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3IVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateSocialHistoryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateSocialHistoryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateSocialHistoryObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GenderIdentityObservationV3Operations.validateSocialHistoryObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 *
	 * <!-- end-user-doc -->
	 * @TODO - Initialization needs to be updated to not override
	 * Social History is setting code system as part of the init to snomed versus loinc which is the code for gender identity
	 * @generated NOT
	 *
	 */
	@Override
	public GenderIdentityObservationV3 init() {
		GenderIdentityObservationV3 genderIdentityObservationV3 = Initializer.Util.init(this);
		genderIdentityObservationV3.getCode().setCodeSystem("2.16.840.1.113883.6.1");
		return genderIdentityObservationV3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenderIdentityObservationV3 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GenderIdentityObservationV3Impl
