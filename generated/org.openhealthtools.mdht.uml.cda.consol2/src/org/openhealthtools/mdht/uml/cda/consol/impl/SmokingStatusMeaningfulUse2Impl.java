/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusMeaningfulUse2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smoking Status Meaningful Use2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SmokingStatusMeaningfulUse2Impl extends SmokingStatusObservationImpl
		implements SmokingStatusMeaningfulUse2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmokingStatusMeaningfulUse2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusMeaningfulUse2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusMeaningfulUse2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusMeaningfulUse2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationIVLTSCenter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationIVLTSCenter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSmokingStatusObservationIVLTSWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationIVLTSWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmokingStatusMeaningfulUse2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SmokingStatusMeaningfulUse2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SmokingStatusMeaningfulUse2Impl
