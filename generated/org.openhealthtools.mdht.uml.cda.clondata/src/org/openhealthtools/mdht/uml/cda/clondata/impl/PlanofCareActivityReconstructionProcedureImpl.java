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
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure;
import org.openhealthtools.mdht.uml.cda.clondata.operations.PlanofCareActivityReconstructionProcedureOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityProcedureImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planof Care Activity Reconstruction Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlanofCareActivityReconstructionProcedureImpl extends PlanOfCareActivityProcedureImpl
		implements PlanofCareActivityReconstructionProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanofCareActivityReconstructionProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getPlanofCareActivityReconstructionProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareActivityReconstructionProcedureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanofCareActivityReconstructionProcedureOperations.validatePlanofCareActivityReconstructionProcedureCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareActivityReconstructionProcedureEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanofCareActivityReconstructionProcedureOperations.validatePlanofCareActivityReconstructionProcedureEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityProcedureTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanofCareActivityReconstructionProcedureOperations.validatePlanOfCareActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanofCareActivityReconstructionProcedure init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanofCareActivityReconstructionProcedure init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlanofCareActivityReconstructionProcedureImpl
