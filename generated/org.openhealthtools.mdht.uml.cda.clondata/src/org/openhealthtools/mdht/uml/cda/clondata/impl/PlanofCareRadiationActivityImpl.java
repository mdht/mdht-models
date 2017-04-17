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
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareRadiationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.operations.PlanofCareRadiationActivityOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planof Care Radiation Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlanofCareRadiationActivityImpl extends PlanOfCareActivityActImpl implements PlanofCareRadiationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanofCareRadiationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getPlanofCareRadiationActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareRadiationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanofCareRadiationActivityOperations.validatePlanofCareRadiationActivityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareRadiationActivityMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanofCareRadiationActivityOperations.validatePlanofCareRadiationActivityMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanofCareRadiationActivityOperations.validatePlanOfCareActivityActTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanofCareRadiationActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanofCareRadiationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlanofCareRadiationActivityImpl
