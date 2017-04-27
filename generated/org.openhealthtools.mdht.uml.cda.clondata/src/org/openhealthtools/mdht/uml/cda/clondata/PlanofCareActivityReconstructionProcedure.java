/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planof Care Activity Reconstruction Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getPlanofCareActivityReconstructionProcedure()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Plan of Care Activity Reconstruction Procedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Plan of Care Activity Reconstruction ProcedureTemplateId Plan of Care Activity Reconstruction ProcedureCode Plan of Care Activity Reconstruction ProcedureEffectiveTime' templateId.root='2.16.840.1.113883.10.20.30.3.31'"
 * @generated
 */
public interface PlanofCareActivityReconstructionProcedure extends PlanOfCareActivityProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Plan of Care Activity Reconstruction ProcedureCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePlanofCareActivityReconstructionProcedureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Plan of Care Activity Reconstruction ProcedureEffectiveTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePlanofCareActivityReconstructionProcedureEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareActivityReconstructionProcedure init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareActivityReconstructionProcedure init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlanofCareActivityReconstructionProcedure
