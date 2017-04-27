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
import org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.operations.EstrogenReceptorStatusOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estrogen Receptor Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EstrogenReceptorStatusImpl extends ResultObservationImpl implements EstrogenReceptorStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstrogenReceptorStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusInterpretationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusInterpretationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusInterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateEstrogenReceptorStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstrogenReceptorStatusOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EstrogenReceptorStatus init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EstrogenReceptorStatus init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EstrogenReceptorStatusImpl
