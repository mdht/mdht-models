/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;

import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOrganizer2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Organizer2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizer2Impl extends FamilyHistoryOrganizerImpl implements FamilyHistoryOrganizer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizer2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizer2Operations.validateFamilyHistoryOrganizer2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyHistoryObservation2> getConsolFamilyHistoryObservation2s() {
		return FamilyHistoryOrganizer2Operations.getConsolFamilyHistoryObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizer2Operations.validateFamilyHistoryOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizer2Operations.validateFamilyHistoryOrganizerFamilyHistoryObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryOrganizer2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryOrganizer2Impl
