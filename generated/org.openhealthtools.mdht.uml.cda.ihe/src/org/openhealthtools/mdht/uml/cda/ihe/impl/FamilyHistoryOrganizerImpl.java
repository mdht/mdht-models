/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizerImpl extends org.openhealthtools.mdht.uml.cda.ccd.impl.FamilyHistoryOrganizerImpl
		implements FamilyHistoryOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.FAMILY_HISTORY_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHEFamilyHistoryOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHEFamilyHistoryOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyHistoryObservation> getFamilyHistoryObservations() {
		return FamilyHistoryOrganizerOperations.getFamilyHistoryObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryOrganizer init() {
		CDAUtil.init(this);
		return this;
	}
} // FamilyHistoryOrganizerImpl
