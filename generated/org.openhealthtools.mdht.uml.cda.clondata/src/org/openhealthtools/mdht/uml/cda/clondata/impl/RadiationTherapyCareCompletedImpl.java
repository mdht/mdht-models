/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted;
import org.openhealthtools.mdht.uml.cda.clondata.operations.RadiationTherapyCareCompletedOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureActivityActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radiation Therapy Care Completed</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RadiationTherapyCareCompletedImpl extends ProcedureActivityActImpl
		implements RadiationTherapyCareCompleted {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadiationTherapyCareCompletedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getRadiationTherapyCareCompleted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompletedCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RadiationTherapyCareCompletedOperations.validateRadiationTherapyCareCompletedCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompletedCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RadiationTherapyCareCompletedOperations.validateRadiationTherapyCareCompletedCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompletedEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RadiationTherapyCareCompletedOperations.validateRadiationTherapyCareCompletedEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompletedNegationInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return RadiationTherapyCareCompletedOperations.validateRadiationTherapyCareCompletedNegationInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RadiationTherapyCareCompletedOperations.validateProcedureActivityActTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadiationTherapyCareCompleted init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadiationTherapyCareCompleted init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // RadiationTherapyCareCompletedImpl
