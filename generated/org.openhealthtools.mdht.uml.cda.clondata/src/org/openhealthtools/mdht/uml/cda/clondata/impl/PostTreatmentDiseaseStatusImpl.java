/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus;
import org.openhealthtools.mdht.uml.cda.clondata.operations.PostTreatmentDiseaseStatusOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Treatment Disease Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PostTreatmentDiseaseStatusImpl extends ObservationImpl implements PostTreatmentDiseaseStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostTreatmentDiseaseStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getPostTreatmentDiseaseStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatusValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostTreatmentDiseaseStatusOperations.validatePostTreatmentDiseaseStatusValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTreatmentDiseaseStatus init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTreatmentDiseaseStatus init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PostTreatmentDiseaseStatusImpl
