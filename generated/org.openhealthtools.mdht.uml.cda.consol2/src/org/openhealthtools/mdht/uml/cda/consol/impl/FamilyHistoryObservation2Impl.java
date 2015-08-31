/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2;

import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryObservation2Impl extends FamilyHistoryObservationImpl implements FamilyHistoryObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation2CDTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservation2Operations.validateFamilyHistoryObservation2CDTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation2CDTranslationP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservation2Operations.validateFamilyHistoryObservation2CDTranslationP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservation2Operations.validateFamilyHistoryObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservation2Operations.validateFamilyHistoryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservation2Operations.validateFamilyHistoryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryObservation2Impl
