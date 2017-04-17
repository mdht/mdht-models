/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastCancerDiagnosisObservationOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ProblemObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast Cancer Diagnosis Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastCancerDiagnosisObservationImpl extends ProblemObservationImpl
		implements BreastCancerDiagnosisObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastCancerDiagnosisObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationTargetSiteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateBreastCancerDiagnosisObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastCancerDiagnosisObservationOperations.validateProblemObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreastCancerDiagnosisObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreastCancerDiagnosisObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastCancerDiagnosisObservationImpl
