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
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone;
import org.openhealthtools.mdht.uml.cda.clondata.operations.FamilyHistoryofCancerNoneOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Historyof Cancer None</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FamilyHistoryofCancerNoneImpl extends ObservationImpl implements FamilyHistoryofCancerNone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryofCancerNoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getFamilyHistoryofCancerNone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneNegationInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneNegationInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNoneText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryofCancerNoneOperations.validateFamilyHistoryofCancerNoneText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryofCancerNone init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryofCancerNone init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryofCancerNoneImpl
