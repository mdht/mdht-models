/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastCancerProceduresOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureActivityProcedureImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast Cancer Procedures</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastCancerProceduresImpl extends ProcedureActivityProcedureImpl implements BreastCancerProcedures {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastCancerProceduresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastCancerProcedures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProceduresCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastCancerProceduresOperations.validateBreastCancerProceduresCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProceduresCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastCancerProceduresOperations.validateBreastCancerProceduresCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProceduresEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerProceduresOperations.validateBreastCancerProceduresEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastCancerProceduresOperations.validateProcedureActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreastCancerProcedures init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreastCancerProcedures init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastCancerProceduresImpl
