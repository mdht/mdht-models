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
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Sign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignImpl extends ObservationImpl implements VitalSign {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.VITAL_SIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignReferenceRangeRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignReferenceRangeRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignNoObservationRangeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignNoObservationRangeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignOperations.validateVitalSignTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSign init() {
		CDAUtil.init(this);
		return this;
	}
} // VitalSignImpl
